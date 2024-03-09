package ex;
       import java.util.Scanner;
       import java.lang.Math;
       public class EX7 {
  public static void main(String[] args) {
		Scanner l= new Scanner(System.in);
        System.out.println("veuillez entrer la valeur de a:");
		int a = l.nextInt();
		System.out.println("veuillez entrer la valeur de b:");
		int b = l.nextInt();
		System.out.println("veuillez entrer la valeur de :");
		int c = l.nextInt();
		double delta =Math.pow(b, 2)-4*a*c;
		l.close();
		if(delta<0) {
			System.out.println("l'equation n a pas de solution ");
		}else {
			if(delta==0) {
				if(a!=0) {
				System.out.println("l equation admet une seule solution est:"+(-b/2*a));}
			}
				else {
				System.out.println("l equation admet deux solutions sont x1=:"+(-b-Math.sqrt(delta))/(2*a));
				System.out.println("l equation admet deux solutions sont x2=:"+(-b+Math.sqrt(delta))/(2*a));
			}
				
			}

	}


}
