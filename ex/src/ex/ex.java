


		package ex;
          import java.util.Scanner;
         import java.lang.Math;

         public class ex {
        	 public static void main(String[] args) {
	System.out.println("saisir la valeur de premier entier:");
		Scanner l= new Scanner(System.in);
		int a = l.nextInt();
		System.out.println("saisir la valeur de deuxieme entier:");
		int b = l.nextInt();
		l.close();
		System.out.println("la somme des deux est:"+(a+b));
		System.out.println("la difference des deux est:"+(a-b));
		if(b!=0) {
		System.out.println("la division des deux est:"+(a/b));}
		else {
			System.out.println("impossible de diviser sur 0");}
		System.out.println("la multiplication des deux est:"+(a*b));
        	}   
        } 