package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseService {
    public String UploadPics(MultipartFile archivoLocalCliente, String carpeta, Long id);
    final String BucketName = "techshop-1f002.appspot.com";
    final String storagePath= "techshop";
    final String pathJsonFile = "firebase";
    final String fileJsonFile = "techshop-1f002-firebase-adminsdk-p5doh-dfedd1aabd.json";
}