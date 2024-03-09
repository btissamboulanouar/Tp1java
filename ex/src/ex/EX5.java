package ex;
   import java.util.Scanner;
   import java.lang.Math;
public class EX5 {

	public static void main(String[] args) {
		Scanner l= new Scanner(System.in);
        System.out.println("veuillez entrer un nombre positif:");
		int n = l.nextInt();
		int p=1;
		if(n==0) {
			System.out.println("la factorielle est: 0");
		}
		else
		{
		for(int i=1;i<=n;i++) {
			p=p*i;
		}
		System.out.println("la factorielle est:"+p);
		}
		l.close();
	}

}
