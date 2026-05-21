package ec.edu.ups.interfazgrafica;


import ec.edu.ups.interfazgrafica.clases.EsquemaRaton;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class InterfazGrafica {

    public static void main(String[] args) {
        Frame MiMarco = new Frame();
        Panel EntradaDeDatos = new Panel(new FlowLayout());

        TextField Nombre = new TextField(15);
        TextField Apellidos = new TextField(60);
        TextField Nacionalidad = new TextField("Española", 15);

        Button botonHola = new Button("Izquierdo");
        Button botonAdios = new Button("Derecho");

        EntradaDeDatos.add(Nombre);
        EntradaDeDatos.add(Apellidos);
        EntradaDeDatos.add(Nacionalidad);
        EntradaDeDatos.add(botonHola);
        EntradaDeDatos.add(botonAdios);

        MiMarco.add(EntradaDeDatos);
        MiMarco.setSize(750, 150);
        MiMarco.setTitle("Ventana con campos de texto y botones");
        MiMarco.setVisible(true);
        
        botonHola.addMouseListener(new EsquemaRaton());
        botonAdios.addMouseListener(new EsquemaRaton());
    }
}