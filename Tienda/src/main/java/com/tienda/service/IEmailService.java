package com.tienda.service;

import jakarta.mail.MessagingException;

public interface IEmailService {

    public void enviarCorreoHtml(
            String para,
            String asunto,
            String contenidoHtml)
            throws MessagingException;
}
