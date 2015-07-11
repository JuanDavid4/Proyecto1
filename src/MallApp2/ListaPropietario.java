package MallApp2;
/**
    * Este campo es para importar las librerias utilizadas en el proyecto
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/

import java.util.Iterator;


public class ListaPropietario {

    public Nodo cab, cola;
    public int nroNodos;

    public ListaPropietario() {
        cab = cola = null;
        nroNodos = 0;
    }
    /**
    * Metodo para Insertar los Propietario
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/

    public void insertarAlfinal(Propietario propietario) {
        Nodo p = new Nodo();

        p.info = propietario;
        p.sig = null;

        if (cab == null) {
            cab = cola = p;
            p.ant = null;
        } else {
            cola.sig = p;
            p.ant = cola;
            cola = p;
        }
        nroNodos++;
    }
    /**
    * Metodo para contar los nodos de los Propietario   *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/

    public int contarnodos() {
        Nodo t = cab;
        int cont = 0;
        while (t != null) {

            cont=cont + 1;
            t = t.sig;
        }
        return cont;
    }
    /**
    * Metodo para retornar la informacion de la posicion en la lista
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
    public Propietario infoEnPosicion(int pos) {
        Nodo t = cab;
        if (pos <= nroNodos) {
            for (int i = 1; i < pos; i++) {
                t = t.sig;
            }
            return t.info;
        } else {
            return null;
        }
    }
    
    
    /**
    * Metodo para borrar los nodos de la lista
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/
    public void borrar(int pos) {
        Nodo t = cab;
        if (pos <= nroNodos) {
            for (int i = 1; i < pos; i++) {
                t = t.sig;
            }
            if (cab == cola) {
                cab = cola = null;
            } else if (cab == t) {
                cab = cab.sig;
                cab.ant = null;
            } else if (cola == t) {
                cola = cola.ant;
                cola.sig = null;
            } else {
                t.ant.sig = t.sig;
                t.sig.ant = t.ant;
            }
        }
    }

    public Iterator<Propietario> iterator() {
        return new IteradorLista();
    }

   

    public class IteradorLista implements Iterator {

        private Nodo actual = cab;

        @Override
        public boolean hasNext() {
            return (actual != null);
        }

        @Override
        public Propietario next() {
            Propietario estudiante = actual.info;
            actual = actual.sig;
            return estudiante;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Nodo {

        private Propietario info;
        private Nodo sig, ant;
    }
}
