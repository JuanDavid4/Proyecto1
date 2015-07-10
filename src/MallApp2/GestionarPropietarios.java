package MallApp2;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GestionarPropietarios extends JFrame {
    // En este campo declaramos las variables
    JScrollPane panelArriba;
    JPanel panelAbajo;
    JLabel labelNombrePropietario;
    JTextField textoNombrePropietario;
    JLabel labelcedula;
    JTextField textocedula;
    JLabel labelcelular;
    JTextField textocelular;
    JButton botonguardar;
    JButton botoneditar;
    JButton botoneliminar;
    JButton botonBuscar;
    JButton botonatras;
    JButton botonsalir;
    JTable tabla;
    JLabel labellocal;
    JTextField textolocal;
    
    /**
    * Metodo para gestionar los Propietarios
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    */
    public GestionarPropietarios() {
        setTitle("Gestionar Propietarios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        ImageIcon icono = new ImageIcon("../Ressources/icon.png");
        this.setIconImage(icono.getImage());

        Container contentpane = getContentPane();
        contentpane.setLayout(new GridLayout(2, 1));

        panelArriba = new JScrollPane();
        tabla = new JTable();
        panelArriba.setViewportView(tabla);// sirve como punto de vista de la tabla

        add(panelArriba);

        panelArriba.setBackground(Color.red);

        panelAbajo = new JPanel(new GridBagLayout());
        add(panelAbajo);
        //En este campo creamos los nuevos objetos
        labelNombrePropietario = new JLabel("Nombre del Propietario");
        textoNombrePropietario = new JTextField();
        labelcedula = new JLabel("Cédula");
        textocedula = new JTextField();
        labelcelular = new JLabel("Celular");
        textocelular = new JTextField();
        botonguardar = new JButton("Guardar");
        botoneditar = new JButton("editar");
        botoneliminar = new JButton("eliminar");
        botonBuscar = new JButton("Buscar");
        botonatras = new JButton("Atras");
        botonsalir = new JButton("Salir");
        labellocal = new JLabel("Local");
        textolocal = new JTextField();

        GridBagConstraints gbc = new GridBagConstraints();
        // En este campo ubicamos los objetos en el panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 10, 5, 10); //Dar espaciado y margenes
        panelAbajo.add(labelNombrePropietario, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(textoNombrePropietario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(labelcedula, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(textocedula, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(labelcelular, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(textocelular, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(labellocal, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(textolocal, gbc);

        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 2.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(botonguardar, gbc);

        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 2.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(botoneditar, gbc);

        gbc.gridx = 4;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 2.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(botoneliminar, gbc);

        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 2.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(botonBuscar, gbc);

        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(botonatras, gbc);

        gbc.gridx = 4;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAbajo.add(botonsalir, gbc);
        // En este campo le damos funcion al boton atras
        botonatras.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent ev) {
                new Menuppaladministracion();

            }

            @Override
            public void mousePressed(MouseEvent ev) {

            }

            @Override
            public void mouseReleased(MouseEvent ev) {

            }

            @Override
            public void mouseEntered(MouseEvent ev) {

            }

            @Override
            public void mouseExited(MouseEvent ev) {

            }
        });
        // En este campo le damos funcion al boton buscar
        botonBuscar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actualizar();
            }
        });
        // En este campo le damos funcion al boton guardar
        botonguardar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String nombre = textoNombrePropietario.getText();
                String cedula = textocedula.getText();
                long celular = Long.parseLong(textocelular.getText());
                String local1 = textolocal.getText();

                Propietario PR = new Propietario(cedula, nombre, celular, local1, null);
                Propietario.propietario;
                JOptionPane.showMessageDialog(null, "Propietario Agregado Correctamente",
                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
                borrartodo();
                actualizar();
            }
        });
        // En este campo le damos funcion al boton editar
        botoneditar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textoNombrePropietario.getText();
                String cedula = textocedula.getText();
                long celular = Long.parseLong(textocelular.getText());
                
                for (int i = 0; i < Propietario.propietarios.; i++) {
                    if(Propietario.propietarios.get(i).cedula.equals(cedula)) {
                        Propietario.propietarios.get(i).nombre = nombre;
                        Propietario.propietarios.get(i).celular = celular;
                        actualizar();
                        break;
                    }
                }
            }
        });
        // En este campo le damos funcion al boton eliminar
        botoneliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() < 0) {
                    JOptionPane.showMessageDialog(null, "No hay nada seleccionado",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int indice = tabla.getSelectedRow();
                    Propietario.propietarios.remove(indice);
                    actualizar();
                }
            }
        });

        actualizar();
        // En este campo le damos funcion al boton actualizar
        botonsalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                /*JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?",
                 "Confirmacion", JOptionPane.QUESTION_MESSAGE);*/
                new Menuppaladministracion();
                dispose();

            }
        });

        tabla.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (tabla.getSelectedRow() >= 0) {
                    textocedula.setText(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                    textoNombrePropietario.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
                    textocelular.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

    }
    //Metodo que permite actualizar
    void actualizar() {
        String[] encabezados = new String[]{"Cedula", "Nombre", "# local", "tel. local", "celular"};
        String[][] datos = new String[Propietario.propietarios.size()][5];
        for (int i = 0; i < Propietario.propietarios.size(); i++) { //Recorrer todo lso propietarios
            Propietario prop = Propietario.propietarios.get(i);
            if (prop.local != null) { //Si tiene local
                datos[i] = new String[]{prop.cedula,
                    prop.nombre,
                    prop.local1,
                    prop.local.nombredelocal,
                    Long.toString(prop.celular)};
            } else { //Si no tiene local
                datos[i] = new String[]{prop.cedula,
                    prop.nombre, prop.local1, "", Long.toString(prop.celular)};
            }
        }
        tabla.setModel(new DefaultTableModel(datos, encabezados));
    }

    void borrartodo() {
        textoNombrePropietario.setText("");
        textocedula.setText("");
        textocelular.setText("");
    }

    public static void main(String[] arg) {
        new GestionarPropietarios();
    }

}
