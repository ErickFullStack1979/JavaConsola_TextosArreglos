/*
Trabajo individual 19 Textos y arreglos
Alumno: Erick Díaz Guerra
*/
package com.company;
import java.util.Scanner;
public class Individual19TextosYArreglos {
   public static void main(String[] args) {

      Scanner ingresar = new Scanner(System.in);

      System.out.println("*** Procesamiento de cadenas de texto ***");
      System.out.println("============================== ==============================");

      System.out.println("Ingrese una cadena de texto para ser analizada:");
      String cadena = ingresar.nextLine();
      while (cadena.length() == 0) {
         System.out.println("Ingreso nulo, escriba una cadena de texto para ser analizada:");
         cadena = ingresar.nextLine();
      }

      System.out.println("============================== ==============================");
      System.out.println("Los caracteres aislados del texto son los siguientes:");
      String [] caracteres = new String[cadena.length()];
      for (int i = 0; i < cadena.length(); i++) {
         caracteres[i] = cadena.substring(i, i + 1);
         if (i > 0 && i%20 == 0) // Para agrupar los caracteres en filas de 20
            System.out.println("");
         System.out.print("["+caracteres[i]+"]");
      }
      System.out.println("");

      int a = 0; int b = 0; int c = 0; int d = 0; int e = 0; int f = 0;
      int g = 0; int h = 0; int i = 0; int j = 0; int k = 0; int l = 0;
      int m = 0; int n = 0; int o = 0; int p = 0; int q = 0; int r = 0;
      int s = 0; int t = 0; int u = 0; int v = 0; int w = 0; int x = 0;
      int y = 0; int z = 0;

      for (int index = 0; index < caracteres.length; index++){
         if       (caracteres[index].matches("[Aa]*")) a++;
         else if  (caracteres[index].matches("[Bb]*")) b++;
         else if  (caracteres[index].matches("[Cc]*")) c++;
         else if  (caracteres[index].matches("[Dd]*")) d++;
         else if  (caracteres[index].matches("[Ee]*")) e++;
         else if  (caracteres[index].matches("[Ff]*")) f++;
         else if  (caracteres[index].matches("[Gg]*")) g++;
         else if  (caracteres[index].matches("[Hh]*")) h++;
         else if  (caracteres[index].matches("[Ii]*")) i++;
         else if  (caracteres[index].matches("[Jj]*")) j++;
         else if  (caracteres[index].matches("[Kk]*")) k++;
         else if  (caracteres[index].matches("[Ll]*")) l++;
         else if  (caracteres[index].matches("[Mm]*")) m++;
         else if  (caracteres[index].matches("[Nn]*")) n++;
         else if  (caracteres[index].matches("[Oo]*")) o++;
         else if  (caracteres[index].matches("[Pp]*")) p++;
         else if  (caracteres[index].matches("[Qq]*")) q++;
         else if  (caracteres[index].matches("[Rr]*")) r++;
         else if  (caracteres[index].matches("[Ss]*")) s++;
         else if  (caracteres[index].matches("[Tt]*")) t++;
         else if  (caracteres[index].matches("[Uu]*")) u++;
         else if  (caracteres[index].matches("[Vv]*")) v++;
         else if  (caracteres[index].matches("[Ww]*")) w++;
         else if  (caracteres[index].matches("[Xx]*")) x++;
         else if  (caracteres[index].matches("[Yy]*")) y++;
         else if  (caracteres[index].matches("[Zz]*")) z++;
      }

      System.out.println("============================== ==============================");
      System.out.println("Y agrupados y contados por abecedario son:");
      System.out.println("A: "+a);
      System.out.println("B: "+b);
      System.out.println("C: "+c);
      System.out.println("D: "+d);
      System.out.println("E: "+e);
      System.out.println("F: "+f);
      System.out.println("G: "+g);
      System.out.println("H: "+h);
      System.out.println("I: "+i);
      System.out.println("J: "+j);
      System.out.println("K: "+k);
      System.out.println("L: "+l);
      System.out.println("M: "+m);
      System.out.println("N: "+n);
      System.out.println("O: "+o);
      System.out.println("P: "+p);
      System.out.println("Q: "+q);
      System.out.println("R: "+r);
      System.out.println("S: "+s);
      System.out.println("T: "+t);
      System.out.println("U: "+u);
      System.out.println("V: "+v);
      System.out.println("W: "+w);
      System.out.println("X: "+x);
      System.out.println("Y: "+y);
      System.out.println("Z: "+z);
      System.out.print("============================== ==============================");
   }
}