package MallApp2;
/**
    * Este campo es para importar las librerias utilizadas en el proyecto
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.Border;
    /**
    * Este campo creamos un Jframe Menuppaladministracion
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
public class Menuppaladministracion extends JFrame {
    // Declaramos las variables
    JLabel labelBienvenido;
    JLabel labelGestionarlocales;
    JLabel labelAdministrarpropietarios;
    JLabel labelcambiarpassword;
    JButton botonAtras;
    /**
    * Este campo damos las caracteristicas al JFrame
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
    public Menuppaladministracion() {

        setTitle("Menu Principal Administración");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         setIconImage(new ImageIcon(getClass().getResource("/MallApp2/fondo.jpg")).getImage());
        JPanel contenidoPanelMPA = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(70, 50, 50,70);
        contenidoPanelMPA.setBorder(padding);
        setContentPane(contenidoPanelMPA);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(8, 1, 0, 8));
        ImageIcon icono = new ImageIcon("../fondoUsuario.png");
        this.setIconImage(icono.getImage());

        Font fuentearial = new Font("Arial", Font.BOLD, 18);
        Map atributos = fuentearial.getAttributes();
        //atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);

        Font arial18 = new Font("Arial", Font.BOLD, 13);
        Map atributos2 = arial18.getAttributes();
        atributos2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);

        labelBienvenido = new JLabel("Bienvenido Administrador");
        labelBienvenido.setHorizontalAlignment(CENTER);
        labelBienvenido.setFont(fuentearial.deriveFont(atributos));
        add(labelBienvenido);

        labelAdministrarpropietarios = new JLabel("Administrar Propietarios");
        labelAdministrarpropietarios.setHorizontalAlignment(CENTER);
        labelAdministrarpropietarios.setForeground(Color.BLUE);
        labelAdministrarpropietarios.setFont(arial18.deriveFont(atributos2));
        labelAdministrarpropietarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        labelAdministrarpropietarios.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new GestionarPropietarios();
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
        /**
        * Este campo adiccionamos los objetos al formulario
        * @author Juan David Zapata
        * @version 09/07/2015
        **/
        add(labelAdministrarpropietarios);

        labelGestionarlocales = new JLabel("Gestionar Locales");
        labelGestionarlocales.setHorizontalAlignment(CENTER);
        labelGestionarlocales.setForeground(Color.BLUE);
        labelGestionarlocales.setFont(arial18.deriveFont(atributos2));
        labelGestionarlocales.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));      
        add(labelGestionarlocales);

        labelcambiarpassword = new JLabel("Cambiar contraseña");
        labelcambiarpassword.setHorizontalAlignment(CENTER);
        labelcambiarpassword.setFont(arial18.deriveFont(atributos2));
        labelcambiarpassword.setForeground(Color.BLUE);
        labelcambiarpassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(labelcambiarpassword);

        labelcambiarpassword.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                String passA = JOptionPane.showInputDialog("Ingrese la contraseña anterior");
                if (passA.equals(Administrador.admin.password)) {
                    String passN = JOptionPane.showInputDialog("Ingrese la nueva contraseña");
                    String passN1 = JOptionPane.showInputDialog("Repíta la nueva contraseña");
                    if (passN.equals(passN1)) {
                        Administrador.admin.password = passN;
                        JOptionPane.showMessageDialog(null, "Contraseña cambiada correctamente",
                                "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "No coincide las contraseñas",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta",
                    "Error", JOptionPane.ERROR_MESSAGE);
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
        
        /**
        * Este campo damos accion al boton atras
        *
        * @author Juan David Zapata
        * @version 09/07/2015
        **/
        botonAtras = new JButton("Atras");
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
        add(botonAtras);

    }

    public static void main(String[] arg) {
        new Menuppaladministracion();
    }

}
