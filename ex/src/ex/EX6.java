package ex;
      import java.util.Scanner;
        import java.lang.Math;
public class EX6 {

                 public static void main(String[] args) {
      	          Scanner l = new Scanner(System.in);
                  System.out.println("Veuillez entrer la valeur de a:");
      	          int a = l.nextInt();
      	          System.out.println("Veuillez entrer la valeur de b:");
      	          int b = l.nextInt();
                  if (a != 0 && b != 0) {
      	            System.out.println("L'équation admet une seule solution : " + (-b / a));
      	          } else {
      	              if (a == 0 && b != 0) {
      	                  System.out.println("L'équation n'admet pas une solution");
      	              } else {
      	                  if (b == 0) {
      	                      System.out.println("L'équation admet une infinité de solutions");
      	                  }
      	              }
      	          l.close();
	}

                  }
}
