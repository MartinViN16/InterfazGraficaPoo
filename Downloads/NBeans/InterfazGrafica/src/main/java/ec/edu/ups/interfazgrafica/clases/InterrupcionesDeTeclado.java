package ec.edu.ups.interfazgrafica.clases;
import java.awt.event.*;
public class InterrupcionesDeTeclado extends KeyAdapter{
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print(e.getKeyChar());
        if(e.getKeyChar() == '*') {
        System.exit(0);
        }
    }
}