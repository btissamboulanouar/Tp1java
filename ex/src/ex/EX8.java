package ex;
   import java.util.Scanner;
   import java.lang.Math;
public class EX8 {
          public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer le premier entier : ");
		        int a = l.nextInt();
                System.out.print("Veuillez entrer le deuxième entier : ");
		        int b = l.nextInt();
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        System.out.println("Le PGCD des deux entiers est : " + Math.abs(a));
		      l.close();
		    }
		
}

