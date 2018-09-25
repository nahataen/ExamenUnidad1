import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
int cont=0;
do {
	boolean bool=false;
	Scanner in= new Scanner(System.in);
	long m =0,s=0;
	System.out.println("ingrese el numero");
	long a=in.nextLong();
	long b =a;
	while (a>=10) {m=a%10;
		s=m+s*10;
		a=a/10;
		
	}
	long x= s*10+a;

	 if (x==b) {bool=true;}
	 if (bool==true) {System.out.println("Es un palindromo");}
	 else {System.out.println("No es un palindromo");
	 
	 System.out.println("\n¿Desea volver a capturar los datos? 1.-SI 2.- Salir");
	 cont=in.nextInt();
	 }
} while (cont!=2);

	}

}
