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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Clase crear usuario en esta se Gestionan todod los usuarios
 *
 * @author Juan David Zapata
 * @version 09/07/2015
 **/
public class CrearUsuario extends JFrame {

    // Declaracion de variables
    JLabel labelNombre;
    JLabel labelApellido;
    JLabel labelTipodocumento;
    JLabel labelDocumento;
    JLabel labelTelefono;
    JLabel labelCelular;
    JLabel labelGenero;
    JLabel labelCorreo;
    JLabel labelpass;
    JLabel labelconfirmarpass;
    JComboBox<String> comboTipodocumento;
    JTextField textonombre;
    JTextField textoTipodoc;
    JTextField textoApellido;
    JTextField textodocumento;
    JTextField textoTelefono;
    JTextField textoCorreo;
    JTextField textoGenero;
    JTextField textoCelular;
    JComboBox<String> comboGenero;
    JPasswordField textoPass;
    JPasswordField textoConfirmarpass;
    JButton botoncrearusuario;
    JButton botonBuscar;
    JButton botonAtras;
    JButton botonEliminar;
    JComboBox combo1;
    boolean editando;

    //Metodo para crear los usuarios
    public CrearUsuario(boolean editando) {
        if (editando == true) {
            setTitle("Modificar mis Datos");
        } else {
            setTitle("Registrar Usuario");
        }
        //setTitle("Registrar Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que hacer cuando se presiona el boton cerrar
        this.editando = editando;
        // Estes campo es para las caracteristicas del panel
        JPanel contenidoPanelCU = new PanelImagen();
        Border padding = BorderFactory.createEmptyBorder(40, 150, 40, 150);
        contenidoPanelCU.setBorder(padding);
        setContentPane(contenidoPanelCU);
        //Ubicamos el icono de la ventana
        setLayout(new GridLayout(12, 2, 0, 10));
        ImageIcon icono = new ImageIcon("../Ressources/icon.png");
        this.setIconImage(icono.getImage());
        // se crean los objetos
        labelNombre = new JLabel("Nombre");
        add(labelNombre);

        textonombre = new JTextField();
        add(textonombre);

        labelApellido = new JLabel("Apellido");
        add(labelApellido);

        textoApellido = new JTextField();
        add(textoApellido);

        labelTipodocumento = new JLabel("Tipo de documento");
        add(labelTipodocumento);


        comboTipodocumento = new JComboBox<>();
        comboTipodocumento.addItem("CC");
        comboTipodocumento.addItem("TI");
        comboTipodocumento.addItem("Pasaporte");
        add(comboTipodocumento);
        
        
        labelDocumento =new JLabel("Documento");
        add(labelDocumento);
        
        
        textodocumento = new JTextField();
        add(textodocumento);
               

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

                
        comboGenero = new JComboBox<>();
        comboGenero.addItem("Masculino");
        comboGenero.addItem("Femenino");
        add(comboGenero);

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

        textoConfirmarpass = new JPasswordField();
        add(textoConfirmarpass);
        // Creamos el objeto y le damos accion
        botoncrearusuario = new JButton("Crear Usuario");
        add(botoncrearusuario);
        botoncrearusuario.addActionListener(new ActionListener() {
        /**
        * En este metodo le da las acciones a los usuarios
        *
        * @author Juan David Zapata
        * @version 09/07/2015
        **/    
            public void actionPerformed(ActionEvent e) {
                String nombre = textonombre.getText();
                String apellido = textoApellido.getText();
                String tipoDocumento = (String) comboTipodocumento.getSelectedItem();
                String documento = textodocumento.getText();
                int telefono = Integer.parseInt(textoTelefono.getText());
                long celular = Long.parseLong(textoCelular.getText());
                String genero = (String) comboGenero.getSelectedItem();
                String correo = textoCorreo.getText();                
                String contrasena = textoPass.getText();
                String confirmarpass = textoConfirmarpass.getText();
                //Condiccional para editar usuario
                if (!contrasena.equals(confirmarpass)) {
                    JOptionPane.showMessageDialog(null, "No coinciden las contraseñas",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!editando) {
                        Usuario us = new Usuario(nombre, apellido, tipoDocumento, documento, telefono, celular, genero, correo, contrasena);
                        Usuario.usuarios.insertarAlfinal(us); //Agregar al array
                        JOptionPane.showMessageDialog(null, "Usuario agregado",
                                "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        new LoginFrame();
                        dispose(); //Me cierro yo
                    } else {
                        Usuario.usuarioLogueado.nombre = nombre;
                        Usuario.usuarioLogueado.apellido = apellido;
                        Usuario.usuarioLogueado.tipodocumento = tipoDocumento;
                        Usuario.usuarioLogueado.documento = documento;                       
                        Usuario.usuarioLogueado.telefono = telefono;
                        Usuario.usuarioLogueado.celular = celular;
                        Usuario.usuarioLogueado.genero = genero;
                        Usuario.usuarioLogueado.correo = correo;
                        Usuario.usuarioLogueado.contrasena = contrasena;

                        //Cambiar todos
                        JOptionPane.showMessageDialog(null, "Usuario modificado",
                                "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        //Creamos un nuevo objeto y adiccionamos a la ventana con su respectiva opción
        botonBuscar = new JButton("Buscar");
        add(botonBuscar);
        botonBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                textonombre.setText("");
                textoApellido.setText("");
                comboTipodocumento.setSelectedIndex(0);
                textodocumento.setText("");
                textoTelefono.setText("");
                textoCelular.setText("");
                textoGenero.setText("");
                comboGenero.setSelectedIndex(0);
                textoPass.setText("");
                textoConfirmarpass.setText("");

            }
        });
        //Creamos un nuevo objeto y adiccionamos a la ventana
        botonAtras = new JButton("Atras");
        add(botonAtras);
        botonAtras.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent ev) {
                new LoginFrame();

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
        botonEliminar = new JButton("Eliminar");
        add(botonEliminar);

        botonEliminar = new JButton("Eliminar cuenta");
        if (editando == true) {
            add(botonEliminar);
        }
        botonEliminar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent ev) {
                eliminarusuario();

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

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        if (editando) {
            cargarDatos();
            botoncrearusuario.setText("Editar");
        }
    }
    // metodo para cargar los datos
    void cargarDatos() {
        for (int i = 0; i < comboTipodocumento.getItemCount(); i++) { //buscar entre los items del combobox 
            if (((String) comboTipodocumento.getItemAt(i)).equals(Usuario.usuarioLogueado.tipodocumento)) {
                comboTipodocumento.setSelectedIndex(i);
                break;
            }
        }

        textonombre.setText(Usuario.usuarioLogueado.documento); //Obtener los datos del usuario logueado
        textoTipodoc.setText(Usuario.usuarioLogueado.apellido);
        textoApellido.setText(Usuario.usuarioLogueado.nombre);
        textoTelefono.setText(Integer.toString(Usuario.usuarioLogueado.telefono));
        textoCorreo.setText(Long.toString(Usuario.usuarioLogueado.celular));
        textoGenero.setText(Usuario.usuarioLogueado.correo);
        labelpass.setText("Cambiar Contraseña");
        for (int i = 0; i < comboGenero.getItemCount(); i++) { //buscar entre los items del combobox 
            if (((String) comboGenero.getItemAt(i)).equals(Usuario.usuarioLogueado.genero)) {
                comboGenero.setSelectedIndex(i);
                break;
            }
        }

    }
    // Metodo para eliminar los usuarios

    void eliminarusuario() {

        String removerusuario = JOptionPane.showInputDialog("Introduzca su contraseña");

        if (removerusuario.equals(Usuario.usuarioLogueado.contrasena)) {

            for (int i = 0; i < Usuario.usuarios.contarnodos(); i++) {
                Usuario usr = Usuario.usuarios.infoEnPosicion(i);
                if (Usuario.usuarioLogueado.documento == usr.documento) {
                    Usuario.usuarios.borrar(i);
                    JOptionPane.showMessageDialog(null, "Su cuenta ha sido eliminada",
                            "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    break;

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta",
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void main(String[] arg) {
        new CrearUsuario(false);
    }
}
