/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojubilarse;

import java.util.Scanner;

public class ProyectoJubilarse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Edad : ");
        int Edad = sc.nextInt();
        System.out.println("Ingrese su Sexo :");
        String Sexo = sc.next();
        System.out.println();
        System.out.println("*******************");
        mensaje(Edad, Sexo);
        System.out.println("*******************");
    }

    public static void mensaje(int edad, String sexo) {
        if ((edad >= 60 && sexo.equals("femenino")) || (edad >= 65 && sexo.equals("masculino"))) {
            System.out.println("Felicidades!!! Usted ya puede Jubilarse!!!");
        } else {
            System.out.println("Usted No cumple con los requisitos!! NO puede Jubilarse!!!");
        }
    }

}
