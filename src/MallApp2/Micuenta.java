package MallApp2;
/**
    * Este campo es para importar las librerias utilizadas en el proyecto
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Micuenta extends JFrame {

    JLabel labelNombre;
    JLabel labelApellido;
    JComboBox<String> comboTipodocumento;
    JLabel labelDocumento;
    JLabel labelTelefono;
    JLabel labelCelular;
    JLabel labelGenero;
    JLabel labelCorreo;
    JLabel labelpass;
    JLabel labelconfirmarpass;
    
    JTextField textoNombre;
    JTextField textoApellido;
    JComboBox combo1;
    JTextField textoDocumento;
    JTextField textoTelefono;
    JTextField textoCelular;
    JTextField textoGenero;
    JTextField textoCorreo;
    JTextField textoPass;       
    JTextField textoConfirmarpass;
    JButton botoncrearusuario;
    JButton botonModificar;
    

    public Micuenta() {
        setTitle("Mi Cuenta");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que hacer cuando se presiona el boton cerrar

        JPanel contenidoPanelMC = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(40, 150, 40, 150);
        contenidoPanelMC.setBorder(padding);
        setContentPane(contenidoPanelMC);

        setLayout(new GridLayout(12, 2, 0, 10));

        labelNombre = new JLabel("Nombre");
        add(labelNombre);

        textoNombre = new JTextField();
        add(textoNombre);

        labelApellido = new JLabel("Apellido");
        add(labelApellido);

        textoApellido = new JTextField();
        add(textoApellido);

        labelDocumento = new JLabel("Tipo de documento");
        add(labelDocumento);


        comboTipodocumento = new JComboBox<>();
        comboTipodocumento.addItem("CC");
        comboTipodocumento.addItem("TI");
        comboTipodocumento.addItem("Pasaporte");
        add(comboTipodocumento);
        
        
        labelDocumento =new JLabel("Documento");
        add(labelDocumento);
        
        
        textoDocumento = new JTextField();
        add(textoDocumento);
               

        labelTelefono = new JLabel("Telefono");
        add(labelTelefono);

        textoTelefono = new JTextField();
        add(textoTelefono);

        labelCelular = new JLabel("Celular");
        add(labelCelular);

        textoCelular = new JTextField();
        add(textoCelular);

        labelGenero = new JLabel("Sexo");
        add(labelGenero);

                
        comboTipodocumento = new JComboBox<>();
        comboTipodocumento.addItem("Masculino");
        comboTipodocumento.addItem("Femenino");
        add(comboTipodocumento);

        labelCorreo = new JLabel("Correo");
        add(labelCorreo);

        textoCorreo =new JTextField();
        add(textoCorreo);

        labelpass = new JLabel("Contraseña");
        add(labelpass);

        textoPass = new JPasswordField();
        add(textoPass);

        labelconfirmarpass = new JLabel("Confirmar Contraseña");
        add(labelconfirmarpass);

        botoncrearusuario = new JButton("Crear Usuario");
        add(botoncrearusuario);
        botoncrearusuario.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String tipoDocumento = (String) comboTipodocumento.getSelectedItem();
                String documento = textoDocumento.getText();
                String apellido = textoApellido.getText();
                String nombre = textoNombre.getText();
                int telefono = Integer.parseInt(textoTelefono.getText());
                int celular = Integer.parseInt(textoCelular.getText());
                String correo = textoCorreo.getText();
                String genero = textoGenero.getText();
                String contrasena = textoPass.getText();
                String confirmarpass = textoConfirmarpass.getText();
                if (!contrasena.equals(confirmarpass)) {
                    JOptionPane.showMessageDialog(null, "No coinciden las contraseñas",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    Usuario us = new Usuario(tipoDocumento, documento, apellido,
                            nombre, telefono, celular, correo, genero, contrasena);
                    Usuario.usuarios.insertarAlfinal(us); //Agregar al array
                    JOptionPane.showMessageDialog(null, "Usuario agregado",
                            "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    new LoginFrame();
                    dispose(); //Me cierro yo
                }
            }
        });
        /**
    * Este campo creamos un Jframe Menuppaladministracion
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
        botonModificar= new JButton("Modificar");
        add(botonModificar);
        botonModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                textoNombre.setText("");
                textoApellido.setText("");
                comboTipodocumento.setSelectedIndex(0);
                textoDocumento.setText("");
                textoTelefono.setText("");
                textoCelular.setText("");
                textoGenero.setText("");
                textoCorreo.setText("");
                textoPass.setText("");
                textoConfirmarpass.setText("");

            }
        });

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] arg) {
//        new CrearUsuario();
    }

}
