/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprogramacion2020;

/**
 *
 * @author cecyl
 */
public class ejercicio6 {
    static String[] unidad = {"uno", "dos", "tres", "cuatro" ,"cinco","seis","siete","ocho","nueve"};
    static String[] unidad2 = {"","once","doce","trece","catorce","quience","dicisesis","dicisiete","diciocho","docinueve"};
    static String[] centenasss = {"diez","veinte","trenta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
    static String[] cen = {"ciento","doscientos","trescientos","custrociento","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
    public static void main(String[] args){
         String n="300";
         String n2="999";
         String n3="40";
         System.out.print(n + " -->  "); conversion(n);
         System.out.print(n2 + " -->  "); conversion(n2);
         System.out.print(n3 + " -->  "); conversion(n3);
    }
    public static void conversion(String numero) {
        char[] aCaracteres = numero.toCharArray();
        if (aCaracteres.length == 1) {
            System.out.println(unidad[Character.getNumericValue(aCaracteres[0]) - 1]);
        }
        if (aCaracteres.length == 2 && Character.getNumericValue(aCaracteres[0])== 1) {
            System.out.println(unidad2[Character.getNumericValue(aCaracteres[1])-1]);
        }
        if (aCaracteres.length == 2 && Character.getNumericValue(aCaracteres[1])== 0){
            System.out.println(centenasss[Character.getNumericValue(aCaracteres[0])-1]);
        }
        if (aCaracteres.length == 3 && Character.getNumericValue(aCaracteres[1])>=1 && 
            Character.getNumericValue(aCaracteres[2])>=1)  {
            System.out.println(cen[Character.getNumericValue(aCaracteres[0]) - 1] + " - " +
            centenasss[Character.getNumericValue(aCaracteres[1]) - 1] + " y " +
            unidad[Character.getNumericValue(aCaracteres[2]) - 1]);
        }
        if (aCaracteres.length == 3 && Character.getNumericValue(aCaracteres[1])== 0 && 
            Character.getNumericValue(aCaracteres[2])== 0) {
            System.out.println(cen[Character.getNumericValue(aCaracteres[0]) - 1] );
        }
    }
}

