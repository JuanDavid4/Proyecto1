package MallApp2;

import java.util.ArrayList;

class Propietario {

    String cedula;
    String nombre;
    Long celular;
    String local1;
    Local local;

    public static ListaPropietario usuarios = new ListaPropietario();

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
    
    public static Propietario getPropietario(Local localAbuscar) {
        for (int i = 0; i < Propietario.(); i++) {
            if(Propietario.get(i).local.numerodelocal == localAbuscar.numerodelocal) {
                return Propietario.get(i);
            }
        }
        return null;
    }
}
