import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  double a,b,c;
  System.out.println("ingresa un numero en A");
  a=s.nextDouble();
  System.out.println("ingresa un numero en B");
  b=s.nextDouble();
  System.out.println("ingresa un numero en C");
  c=s.nextDouble();
  if(a>b &&a>c) {
	  System.out.println("el valor mayor es: "+a);
  }else if(b>a &&b>c) {
	  System.out.println("el valor mayor es: "+b);
  } else if (c>b &&c>a) {
	  System.out.println("el valor mayor es: "+c);
  }
  
		
	}

}
