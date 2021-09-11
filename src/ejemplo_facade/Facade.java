
package ejemplo_facade;


public class Facade {
    private Impresora impresion;
    //constructor para cargar el texto
    public Facade(String texto){
        super();
        //instancia
        impresion = new Impresora();
        impresion.setColor(true);
        impresion.setHoja("carta");
        impresion.setTipoDocumento("word");
        impresion.setTexto(texto);
    }
    public void imprimir(){
        impresion.imprimirDocumento();
    }
}
