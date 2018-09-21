import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n= leer.nextInt();
        double[] arreglo= new double[n];
   
        for (int i = 0; i < arreglo.length; i++) {
        	System.out.println("ingrese un numero la pocision"+(i+1));
			arreglo[i]=leer.nextDouble();
				}
        double menor,mayor;
        menor=mayor=arreglo[0];
        for (int j = 0; j < arreglo.length; j++) {
			if(arreglo[j]>mayor) {
				mayor=arreglo[j];
			}
			if(arreglo[j]<menor) {
				menor=arreglo[j];
			}
		}
        System.out.println("Elemento mayor:"+mayor);
         System.out.println("Elemento menor"+menor);
       
         
          
	}

}
