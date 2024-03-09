package ex;
   import java.util.Scanner;
   import java.lang.Math;

public class EX4 {

	public static void main(String[] args) {
		Scanner l= new Scanner(System.in);
        System.out.println("saisir un reel:");
		double x = l.nextInt();
		System.out.println("saisir un entier:");
		int n = l.nextInt();
		l.close();
		double c=Math.pow(x,n);
		System.out.println(+c);
	}
}
