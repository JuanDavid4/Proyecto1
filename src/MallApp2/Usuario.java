package MallApp2;

public class Usuario {

    String nombre;
    String apellido;
    String tipodocumento;
    String documento;
    int telefono;
    long celular;
    String genero;
    String correo;
    String contrasena;

    public static ListaUsuario usuarios = new ListaUsuario();

    //Para eliminar, recorrer el array hasta encotrar el que se va a borrar y cuando se necuentre
    //ejecutar el metodo remove: usuarios.remove(Usuario.usuarios.get(i))
    public static Usuario usuarioLogueado;

    public Usuario(String nombre, String apellido, String tipodocumento, String documento, int telefono, long celular, String genero, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodocumento = tipodocumento;
        this.documento = documento;
        this.telefono = telefono;
        this.celular = celular;
        this.genero = genero;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static boolean loguearUsuario(String correo, String contrasena) {

        for (int i = 0; i < usuarios.contarnodos(); i++) {

            if (usuarios.infoEnPosicion(i).correo.equals(correo) && usuarios.infoEnPosicion(i).contrasena.equals(contrasena)) {
                usuarioLogueado = usuarios.infoEnPosicion(i); //Si coincide el correo y pass, se pone como usuario logueado el que coincidió
                return true;
            }
        }
        return false;
    }

}
