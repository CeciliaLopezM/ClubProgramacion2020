/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Club2020;

/**
 *
 * @author cecy
 */
import java.util.Scanner;
public class ejercicio3{
    public static void main(String[] args) {
        int a = pedirnumero();
        int b = pedirnumero();
            int res=a*b;
            System.out.println("multiplicacion " +a+" X "+b+" = "+res);
            for(int i = 1; i<=10; i++) {
            for(int j = 1; j <= 10; j++)  {
                int mul=i*j;
                if (res==mul) {
                   System.out.println(i + " X " + j + " = " + i*j); 
                }
            }
        }
        }
    public static int pedirnumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce numero: ");
       return sc.nextInt();
    }
}
