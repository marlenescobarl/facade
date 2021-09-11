
package ejemplo_facade;


public class Impresora {
    //declaracion de atributos
    private String tipoDocumento;
    private String hoja;
    private String texto;
    private boolean color;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    
    //metodo de intenraccion con el facade
    
    public void imprimirDocumento(){
        System.out.println("Imprimiendo... " + texto + " color: " + color + " tipo: " 
        + tipoDocumento + " hoja: " + hoja);
    }
}
