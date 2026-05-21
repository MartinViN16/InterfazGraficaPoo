package ec.edu.ups.interfazgrafica;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeAccion;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeElemento;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeEnfoque;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeRaton;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeTeclado;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeVentana;
import ec.edu.ups.interfazgrafica.clases.MiVentana;
import java.awt.*;
import java.util.Scanner;

public class InterfazGrafica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU DE EJEMPLOS");
            System.out.println("1. Crear ventana");
            System.out.println("2. Ejemplo MouseAdapter");
            System.out.println("3. Ejemplo KeyAdapter");
            System.out.println("4. Ejemplo WindowListener");
            System.out.println("5. Ejemplo ActionListener");
            System.out.println("6. Ejemplo FocusListener");
            System.out.println("7. Ejemplo ItemListener");
            System.out.println("8. Salir");
            System.out.print("\nSeleccione una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    MiVentana ventana = new MiVentana("Mi ventana",600,400);

                    ventana.addWindowListener(
                            new InterrupcionesDeVentana()
                    );

                    ventana.setVisible(true);
                }
                break;
                case 2: {
                    final int NUM_OPCIONES = 12;
                    Label mensaje =
                            new Label("Mensaje asociado al boton pulsado");
                    Button[] botones = new Button[NUM_OPCIONES];
                    for (int i = 0; i < NUM_OPCIONES; i++) {
                        botones[i] = new Button("Opcion " + i);
                        if (i < 10) {
                            botones[i].setName("0" + i);
                        } else {
                            botones[i].setName(String.valueOf(i));
                        }
                    }
                    Frame miVentana =
                            new Frame("Prueba eventos del raton");
                    Panel panelPrincipal =
                            new Panel(
                                    new GridLayout(NUM_OPCIONES + 1, 1)
                            );
                    panelPrincipal.add(mensaje);
                    for (int i = 0; i < NUM_OPCIONES; i++) {
                        panelPrincipal.add(botones[i]);
                    }
                    miVentana.add(panelPrincipal);
                    miVentana.setSize(400, 600);
                    miVentana.setLocation(100, 100);
                    miVentana.setVisible(true);
                    for (int i = 0; i < NUM_OPCIONES; i++) {
                        botones[i].addMouseListener(
                                new InterrupcionesDeRaton(mensaje)
                        );
                    }
                }
                break;
                case 3: {
                    Frame miVentana =
                            new Frame("Prueba eventos de teclado");
                    Panel miPanel = new Panel();
                    Button boton1 = new Button("Silencio");
                    Button boton2 =
                            new Button("Maquina de escribir");
                    miPanel.add(boton1);
                    miPanel.add(boton2);
                    miVentana.add(miPanel);
                    miVentana.setSize(400, 300);
                    miVentana.setLocation(200, 200);
                    miVentana.setVisible(true);
                    boton2.addKeyListener(
                            new InterrupcionesDeTeclado()
                    );
                }
                break;
                case 4: {
                    Frame miVentana =
                            new Frame("Prueba eventos de ventana");
                    miVentana.setSize(300, 200);
                    miVentana.setLocation(300, 200);
                    miVentana.setVisible(true);
                    miVentana.addWindowListener(
                            new InterrupcionesDeVentana()
                    );
                }
                break;
                case 5: {
                    Frame miVentana =
                            new Frame("Prueba eventos de accion");
                    Panel miPanel =
                            new Panel(new GridLayout(3, 1));
                    Button boton =
                            new Button("Etiqueta del boton");
                    boton.setName("Boton");
                    TextField campoDeTexto =
                            new TextField("Texto del campo");
                    campoDeTexto.setName("CampoTexto");
                    List lista = new List(3);
                    lista.setName("Lista");
                    lista.add("Opcion 1");
                    lista.add("Opcion 2");
                    lista.add("Opcion 3");
                    lista.add("Opcion 4");
                    miPanel.add(boton);
                    miPanel.add(campoDeTexto);
                    miPanel.add(lista);
                    boton.addActionListener(
                            new InterrupcionesDeAccion()
                    );
                    campoDeTexto.addActionListener(
                            new InterrupcionesDeAccion()
                    );
                    lista.addActionListener(
                            new InterrupcionesDeAccion()
                    );
                    miVentana.add(miPanel);
                    miVentana.setSize(400, 250);
                    miVentana.setLocation(400, 200);
                    miVentana.setVisible(true);
                }
                break;
                case 6: {
                    Frame miVentana =
                            new Frame("Prueba eventos de enfoque");
                    Panel miPanel = new Panel();
                    Button boton1 =
                            new Button("Componente 1");
                    Button boton2 =
                            new Button("Componente 2");
                    miPanel.add(boton1);
                    miPanel.add(boton2);
                    miVentana.add(miPanel);
                    miVentana.setSize(300, 200);
                    miVentana.setLocation(500, 200);
                    miVentana.setVisible(true);
                    boton2.addFocusListener(
                            new InterrupcionesDeEnfoque()
                    );
                }
                break;
                case 7: {
                    Frame miVentana =
                            new Frame("Prueba eventos de elemento");
                    Panel miPanel =
                            new Panel(new GridLayout(4, 1));
                    Checkbox diesel =
                            new Checkbox("Diesel", true);
                    Checkbox farosXenon =
                            new Checkbox("Faros Xenon", false);
                    Checkbox llantasAleacion =
                            new Checkbox("Llantas Aleacion", false);
                    Checkbox pinturaMetalizada =
                            new Checkbox("Pintura Metalizada", true);
                    miPanel.add(diesel);
                    miPanel.add(farosXenon);
                    miPanel.add(llantasAleacion);
                    miPanel.add(pinturaMetalizada);
                    diesel.addItemListener(
                            new InterrupcionesDeElemento()
                    );
                    farosXenon.addItemListener(
                            new InterrupcionesDeElemento()
                    );
                    llantasAleacion.addItemListener(
                            new InterrupcionesDeElemento()
                    );
                    pinturaMetalizada.addItemListener(
                            new InterrupcionesDeElemento()
                    );
                    miVentana.add(miPanel);
                    miVentana.setSize(400, 250);
                    miVentana.setLocation(600, 200);
                    miVentana.setVisible(true);

                }
                break;
                case 8: {

                    System.out.println("Programa finalizado");
                }
                break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 8);
    }
}