/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  boolean ban;
int op;
float x,y,z;
String aux;
do
{
ban=false;
do
{
op=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n5.-Sen\n6.-cos\n7-tan\n8-Raiz\n9-Potencia\n10-IVA\n11-Fin\nDame una Opcion"));
if((op>=1)&&(op<=10))
ban=true;
else
System.out.println("Error");
}
while(ban==false);
switch(op)
{
case 1:
{
System.out.println("Suma dos Numeros");
aux=JOptionPane.showInputDialog("Dame el primer numero");
x=Float.parseFloat(aux);
aux=JOptionPane.showInputDialog("Dame el segundo numero");
y=Float.parseFloat(aux);
z=x+y;
System.out.println("Resultado "+z);
break;
}
case 2:
{
System.out.println("Resta dos Numeros");
aux=JOptionPane.showInputDialog("Dame el primer numero");
x=Float.parseFloat(aux);
aux=JOptionPane.showInputDialog("Dame el segundo numero");
y=Float.parseFloat(aux);
z=x-y; System.out.println("Resultado "+z);

break;
}
case 3:
{
System.out.println("Multiplica dos Numeros");
aux=JOptionPane.showInputDialog("Dame el primer numero");
x=Float.parseFloat(aux);
aux=JOptionPane.showInputDialog("Dame el segundo numero");
y=Float.parseFloat(aux);
z=x*y;
System.out.println("Resultado "+z);
break;


}
case 4:
{
System.out.println("Divide dos Numeros");
aux=JOptionPane.showInputDialog("Dame el primer numero");
x=Float.parseFloat(aux);

aux=JOptionPane.showInputDialog("Dame el segundo numero");
y=Float.parseFloat(aux);

z=x/y;
System.out.println("Resultado "+z);

break;
}
case 5:
{
System.out.println("Seno de un numero");
aux=JOptionPane.showInputDialog("Dame el numero");
x=Float.parseFloat(aux);

z=(float)Math.sin(x);
System.out.println("Resultado "+z);
break;
}
case 6:
{
System.out.println("coseno de un numero");
aux=JOptionPane.showInputDialog("Dame el numero");
x=Float.parseFloat(aux);

z=(float) Math.cos(x);
System.out.println("Resultado "+z);
break;
}
case 7:
{
System.out.println("tangente de un numero");
aux=JOptionPane.showInputDialog("Dame el numero");
x=Float.parseFloat(aux);

z=(float) Math.tan(x);
System.out.println("Resultado "+z);
break;
}
case 8:
{
System.out.println("raiz enecima de un num");
aux=JOptionPane.showInputDialog("Dame el indice de la raiz ");
x=Float.parseFloat(aux);
aux=JOptionPane.showInputDialog("Dame el numero al cual le quieres sacar la raiz");
y=Float.parseFloat(aux);
z=(float) Math.pow(y, (1/x));
System.out.println("Resultado "+z);
break;
}
case 9:
{
System.out.println("potencia enecima de un num");
aux=JOptionPane.showInputDialog("Dame el indice de la potencia ");
x=Float.parseFloat(aux);
aux=JOptionPane.showInputDialog("Dame el numero que quieres elevar");
y=Float.parseFloat(aux);
z=(float) Math.pow(y, x);
System.out.println("Resultado "+z);
break;
}
case 10:
{
System.out.println("Sacarle el iva a un numero");
aux=JOptionPane.showInputDialog("Dame el numero");
x=Float.parseFloat(aux);
z=(float) (x*(0.19));
System.out.println("Resultado "+z);
break;


}
}
}while(op!=10);
    }
    
    }
    

