package ec.edu.ups.interfazgrafica.clases;
import java.awt.Frame;
public class MiVentana extends Frame{
    public MiVentana(String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }
    public MiVentana (String titulo, int alto , int ancho){
        this(titulo);
        this.setSize(alto, ancho);
    }
    public MiVentana (){
        this("Mi ventana",500,300);
    }
}