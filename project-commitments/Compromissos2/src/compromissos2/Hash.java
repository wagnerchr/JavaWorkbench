/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compromissos2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    
    /*
    private String senha;

    public Hash(String senha) {
        this.senha = senha;
    }*/
    
      
    public String hashSenha(String senha) {
        try {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256"); // Sei lá qual é o melhor
        messageDigest.update(senha.getBytes());
        
        byte[] arrayByte = messageDigest.digest();
        
        StringBuilder sb = new StringBuilder();
        
        for(byte b : arrayByte) {
            sb.append(String.format("%02x", b));
        }
        
        return sb.toString();
                
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        
        return "";
    }
    
}


