/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author User
 */
public class Email {
    private String emisor;
    private String asunto;
    private String contenido;
    private boolean leido;

    public Email(String emisor, String asunto, String contenido) {
        this.emisor = emisor;
        this.asunto = asunto;
        this.contenido = contenido;
        this.leido = false; // Por defecto es falso
    }

    public String getEmisor() { return emisor; }
    public String getAsunto() { return asunto; }
    public String getContenido() { return contenido; }
    public boolean isLeido() { return leido; }

    public void marcarComoLeido() {
        this.leido = true;
    }

    public void imprimir() {
        System.out.println("DE: " + emisor);
        System.out.println("ASUNTO: " + asunto);
        System.out.println(contenido);
    }
}