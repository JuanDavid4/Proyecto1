package MallApp2;
/**
    * Este campo es para importar las librerias utilizadas en el proyecto
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
    * Metodo para contar los nodos de la lista
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    */
public class LoginFrame extends JFrame {

    JLabel labelBienvenido;
    JLabel labelCorreo;
    JLabel labelContrasena;
    JLabel labelRegistrar;
    JTextField textoCorreo;
    JPasswordField textoContrasena;
    JButton botonIngresar;
    JButton botonUsuarioNoRegistrado;
    JButton botonadministracion;
    ImageIcon icoIngresar, Fondo;
    JLabel img;
    /**
    * Este espacio del codigo es para dar las caracteristicas a la ventana
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    */
    
    public LoginFrame() {

        setTitle("Acceso al sistema");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que hacer cuando se presiona el boton cerrar

        setIconImage(new ImageIcon(getClass().getResource("/MallApp2/imagenSw1.jpg")).getImage());

        JPanel contenidoPanel = new PanelImagen();
        Border padding = BorderFactory.createEmptyBorder(0, 100, 0, 100);
        contenidoPanel.setBorder(padding);
        setContentPane(contenidoPanel);
        setLayout(new GridLayout(10, 1, 0, 15));

        Font fuentearial = new Font("Arial", Font.BOLD, 16);
        Map atributos = fuentearial.getAttributes();

        labelBienvenido = new JLabel("Bienvenido a MallApps");
        labelBienvenido.setHorizontalAlignment(JTextField.CENTER);
        labelBienvenido.setFont(fuentearial.deriveFont(atributos));
        add(labelBienvenido);

        labelCorreo = new JLabel("Correo");
        labelCorreo.setHorizontalAlignment(JTextField.CENTER);
        add(labelCorreo);

        textoCorreo = new JTextField();
        add(textoCorreo);

        labelContrasena = new JLabel("Contraseña");
        labelContrasena.setHorizontalAlignment(JTextField.CENTER);
        add(labelContrasena);

        textoContrasena = new JPasswordField();
        add(textoContrasena);

        labelRegistrar = new JLabel("<HTML><U>Registrarse<U></HTML>");
        labelRegistrar.setHorizontalAlignment(JTextField.CENTER);
        labelRegistrar.setForeground(Color.BLUE);
        labelRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        labelRegistrar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new CrearUsuario(false);
                dispose();
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
        add(labelRegistrar);
        /**
          * Este campo le damos funcionalidad al boton ingresar
          *
          * @author Juan David Zapata
          * @version 09/07/2015
          **/

        botonIngresar = new JButton("Ingresar");
        add(botonIngresar);
        botonIngresar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                ingresar();
            }
        });
        /**
        *En este campo agregamos la funcionalidad del botonUsuarioNoRegistrar
        *
        * @author Juan David Zapata
        * @version 09/07/2015
        **/

        botonUsuarioNoRegistrado = new JButton("Usuarios no registrados");
        add(botonUsuarioNoRegistrado);

        botonUsuarioNoRegistrado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                new ClienteRegistrado(false);
                dispose();

            }
        });

        textoContrasena.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    ingresar();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setSize(500, 400);
        setLocationRelativeTo(null); //Centra el jframe en la pantalla
        setVisible(true);
    }
    /**
    * Metodo nos permite ingresar ala sistema
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
    void ingresar() {

        String correo = textoCorreo.getText();
        String pass = textoContrasena.getText();
        if (correo.equals(Administrador.admin.user) && pass.equals(Administrador.admin.password)) {
            new Menuppaladministracion();
            dispose();
        } else if (Usuario.loguearUsuario(correo, pass)) {
            new ClienteRegistrado(true);
        } else {
            JOptionPane.showMessageDialog(null, "No coincide el usuario y la contraseña",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] arg) {
        Administrador.admin = new Administrador("1", "1");
        new LoginFrame();
    }
}
