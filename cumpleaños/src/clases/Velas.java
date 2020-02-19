/*
 * To change this license header, choose License Headers in Projeveltot Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Velas {

    int edad;
    int May=-1;
    int veltot=0;
    int []tamañovela= new int[100]; 
    Scanner sc=new Scanner(System.in);
  //metodo para pedir los años
    public void Pedad(){
    edad=sc.nextInt();
    }
  //metodo para determinar las velas que se apagan
    public void DeterVelas(){
        for (int j = 0; j < edad; j++) {
                if (tamañovela[j]>=May) {
                May=tamañovela[j];
            }
        }
        for (int i = 0; i < edad; i++) {
            if (tamañovela[i]==May) {
                veltot++;
            }
        }
    }
  //metodo para generar tamaño de las velas
    public void Tamañovelas(){
        for (int i = 0; i < edad; i++) {
            tamañovela[i]=(int)(Math.random()*edad+1);
        }

    }
  //metodo para imprimir resulatos
    public void imprimir(){
        for (int x = 0; x < edad; x++) {
            System.out.println("Tamaño vela "+(x+1)+":"+tamañovela[x]);
        } 
        System.out.println("El numero total de velas que se van a apagar son:"+veltot);
    }
}
