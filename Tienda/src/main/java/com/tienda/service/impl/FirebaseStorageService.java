package com.tienda.service.impl;

import com.google.auth.*;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.*;
import java.io.*;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.tienda.service.IFirebaseStorageService;

@Service
public class FirebaseStorageService implements IFirebaseStorageService {
    @Override
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id) {
        try {
            // El nombre original del archivo local del cliente
            String extension = archivoLocalCliente.getOriginalFilename();

            // Se genera el nombre segun el codigo del articulo
            String filename = "img" + sacaNumero(id) + extension;

            // Se convierte/sube el archivo a un archivo temporal
            File file = this.convertToFile(archivoLocalCliente);

             // Se copia a Firestore y se obtiene el url valido de la imagen por 10 años
            String URL = this.uploadFile(file, carpeta, filename);

            // Se elimina el archivo temporal cargado desde el cliente
            file.delete();

            return URL;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String uploadFile(File file, String carpeta, String filename) throws IOException {
        // Se define el lugar y acceso al archivo .jasper
        ClassPathResource json = new ClassPathResource(rutaJsonFile + File.separator + archivoJsonFile);
        BlobId blobId = BlobId.of(BucketName, rutaSuperiorStorage + "/" + carpeta + filename);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("media").build();
        Credentials credentials = GoogleCredentials.fromStream(json.getInputStream());
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
        storage.create(blobInfo, Files.readAllBytes(file.toPath()));
        return storage.signUrl(blobInfo, 3650, TimeUnit.DAYS, Storage.SignUrlOption.signWith((ServiceAccountSigner) credentials)).toString();
    }

    // Metodo utilitario que convierte el archivo desde el equipo local del usuario a un archivo temporal en el servidor
    private File convertToFile(MultipartFile archivoLocalCliente) throws IOException {
        File tempFile = File.createTempFile("img", null);
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(archivoLocalCliente.getBytes());
            fos.close();
        }
        return tempFile;
    }

    private String sacaNumero(long id) {
        return String.format("%019d", id);
    }
}