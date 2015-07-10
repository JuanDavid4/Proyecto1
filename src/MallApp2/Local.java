package MallApp2;
/**
    * Este campo es para importar las librerias utilizadas en el proyecto
    *
    * @author Juan David Zapata
    * @version 09/07/2015
    **/

import java.util.ArrayList;

public class Local {

    int numerodelocal;
    String tipocontrato;
    String nombredelocal;
    String tipodecontrato;
    public static ArrayList<Local> locales;

    public Local(int numerodelocal, String tipocontrato, String nombredelocal) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iload_1
         * 6: putfield      hungriest/Local.numerodelocal:I
         * 9: aload_0
         * 10: aload_2
         * 11: putfield      hungriest/Local.tipocontrato:Ljava/lang/String;
         * 14: aload_0
         * 15: aload_3
         * 16: putfield      hungriest/Local.nombredelocal:Ljava/lang/String;
         * 19: return
         *  */
        // </editor-fold>
    }

    public String toString() {
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial java/lang/StringBuilder."<init>":()V
         * 7: ldc           Local
         * 9: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 12: aload_0
         * 13: getfield      hungriest/Local.numerodelocal:I
         * 16: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 19: ldc            (
         * 21: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 24: aload_0
         * 25: getfield      hungriest/Local.nombredelocal:Ljava/lang/String;
         * 28: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 31: ldc           )
         * 33: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 36: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 39: areturn
         *  */
        // </editor-fold>
    }
}