package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface IFirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    // El BucketName es el <id del proyecto> + ".appspot.com
    final String BucketName = "techshop-dd3b8.appspot.com";

    // Esta es la ruta basica de este proyecto TechShop
    final String rutaSuperiorStorage = "Tienda";

    // Ubicacion donde se encuentre el archivo de config json
    final String rutaJsonFile = "firebase";

    // El nombre del archivo json
    final String archivoJsonFile = "techshop-dd3b8-firebase-adminsdk-kh2cc-31f2fd3324.json";
}