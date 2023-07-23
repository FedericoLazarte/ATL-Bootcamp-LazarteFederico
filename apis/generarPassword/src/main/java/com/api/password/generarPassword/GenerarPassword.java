package com.api.password.generarPassword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GenerarPassword {
    @GetMapping("/generar-password")
    public static String generarContrasenia() {
        StringBuilder contrasenia = new StringBuilder();
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?0123456789";
        for(int i = 0; i < 8; i++) {
            int caracterRandom = (int) (Math.random() * caracter.length());
            contrasenia.append(caracter.charAt(caracterRandom));
        }
        return contrasenia.toString();
    }
}