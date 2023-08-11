package com.tienda.service;

import com.tienda.entities.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface IRegisterService {
    public Model activar(Model model, String usuario, String clave);
    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
    // public void activar(UserApp usuario, MultipartFile imagenFile);
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}
