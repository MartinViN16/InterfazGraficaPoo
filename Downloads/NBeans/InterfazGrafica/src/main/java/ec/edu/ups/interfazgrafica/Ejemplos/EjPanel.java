package ec.edu.ups.interfazgrafica.Ejemplos;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjPanel implements MouseListener {
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        Button botonArea = new Button("Calcular área");
        Button botonPerimetro = new Button("Calcular Perimetro");
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botones");
        miVentana.setVisible(true);
        miVentana.add(miPanel);
        miPanel.add(botonArea);
        miPanel.add(botonPerimetro);
    }    

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}