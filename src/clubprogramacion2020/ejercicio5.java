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
public class ejercicio5 {

    public static void main(String[] args) {
        String cadena = "Maria Duran Leon";
        System.out.print("--->    "+ cadena  + "  NIP:   ");
        digito1(cadena);
        digito2(cadena);
        digito3(cadena);
        digito4(cadena);
        
    }

    public static void digito1(String cadena) {
        String dato[] = cadena.split(" ");
        System.out.print( dato[0].length());
    }

    public static void digito2(String cadena) {
        String dato[] = cadena.split(" ");
        char letra = dato[dato.length - 2].charAt(0);
        int i = 0;
        for (char car = 'A'; car <= 'Z'; car++) {
            i++;
            if (letra == car) {
                System.out.print(i);
            }
        }
    }

    public static void digito3(String cadena) {
        String dato[] = cadena.split(" ");
        System.out.print(dato[dato.length - 1].length());
    }
    public static void digito4(String cadena) {
        int contador = 1, pos;
        cadena = cadena.trim();
        if (cadena.isEmpty()) {
            contador = 0;
        } else {
            pos = cadena.indexOf(" ");
            while (pos != -1) {
                contador++;
                pos = cadena.indexOf(" ", pos + 1);
            }
        }
        System.out.print(contador+"\n");
    }


}
