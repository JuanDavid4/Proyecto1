package MallApp2;

public class Propietario {

    private String cedula;
    private String nombre;
    private Long celular;
    private String local1;
    private Local local;

    public static ListaPropietario propietarios = new ListaPropietario();

    public Propietario(String cedula, String nombre, Long celular, String local1, Local local) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.celular = celular;
        this.local = local;
        this.local1 = local1;
    }

    public String toString() {
        return getNombre();
    }
    
//    public static Propietario getPropietario(Local localAbuscar) {
//        for (int i = 0; i < propietarios.contarnodos(); i++) {
//            if(propietarios.infoEnPosicion(i).local.numerodelocal == localAbuscar.numerodelocal) {
//                return propietarios.infoEnPosicion(i);
//            }
//        }
//        return null;
//    }
    
    public Propietario getPropietario(){
        Propietario propietarios = null;
        return propietarios;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getLocal1() {
        return local1;
    }

    public void setLocal1(String local1) {
        this.local1 = local1;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
