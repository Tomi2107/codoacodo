/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here//
    
    String Nombre ="";
    int Edad = 0;
    String Hobbi="";
    String Editordecodigo="";
    String Sistemaoperativo="";
    Scanner entrada = new Scanner(System.in);
   System.out.println("ingrese su nombre:");
   Nombre = entrada.next();
   System.out.println("ingrese su edad:");
   Edad = entrada.nextInt();
   System.out.println("ingrese su hobbi:");
   Hobbi = entrada.next();
   System.out.println("ingrese su editor de codigo favorito:");
   Editordecodigo = entrada.next();
   System.out.println("ingrese elsistema operativo que utiliza:");
   Sistemaoperativo = entrada.next();
   System.out.println("");
   System.out.println("");
   System.out.println("su nombre es:" +Nombre);
   System.out.println("su edad es:" +Edad);
   System.out.println("su Hobbi es:" +Hobbi);
   System.out.println("su editor favorito es:" +Editordecodigo);
   System.out.println("Su sistema operativo es:" +Sistemaoperativo);
   
           
    }
    
}
