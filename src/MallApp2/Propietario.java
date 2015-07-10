package MallApp2;

public class Propietario {

    String cedula;
    String nombre;
    Long celular;
    String local1;
    Local local;

    public static ListaPropietario propietarios = new ListaPropietario();

    public Propietario(String cedula, String nombre, Long celular, String local1, Local local) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.celular = celular;
        this.local = local;
        this.local1 = local1;
    }

    public String toString() {
        return nombre;
    }
    
//    public static Propietario getPropietario(Local localAbuscar) {
//        for (int i = 0; i < propietarios.contarnodos(); i++) {
//            if(propietarios.infoEnPosicion(i).local.numerodelocal == localAbuscar.numerodelocal) {
//                return propietarios.infoEnPosicion(i);
//            }
//        }
//        return null;
//    }
}
