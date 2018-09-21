import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
 Stack pila= new Stack();
 String apellidoM,apellidoP,Primernombre;
 System.out.println("Ingresa tu apellido paterno");
 apellidoP=leer.next();
 System.out.println("Ingresa tu apellido materno");
 apellidoM=leer.next();
 System.out.println("Ingresa tu nombre");
 Primernombre=leer.next();
 pila.push(apellidoM);
 pila.push(apellidoP);
 pila.push(Primernombre);
 
 while (pila.empty()==false) {
 System.out.println(pila.pop());
	
}
 
	}

}
