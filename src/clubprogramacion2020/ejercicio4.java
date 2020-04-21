/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprogramacion2020;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cecy
 */
public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        int numero;
        do {
            try {
                numero = IngresarNumero();
                lista.add(numero);
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                numero = IngresarNumero();
            }
        } while (numero != 0);
        System.out.println("Arreglo original");
        for (Integer lista1 : lista) {
            System.out.print(lista1 + ",");
            if (lista1 % 2 == 0) {
                par.add(lista1);
            }
        }
        System.out.println("\nArreglo numeros pares");
        ImprimirArreglo(par);
        System.out.println("");
    }
    public static int IngresarNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce: ");
        return sc.nextInt();
    }
    public static void ImprimirArreglo(ArrayList<Integer> Array) {
        for (Integer num : Array) {
            System.out.print(num + ",");
        }
    }
}
