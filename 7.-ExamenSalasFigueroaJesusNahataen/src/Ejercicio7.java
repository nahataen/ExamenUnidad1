import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
        int aux;
        int a[] = new int[100]; 
    	
        System.out.println("no ordenados");
        for (int i = 0; i <a.length; i++) {
        	  a[i]=(int)(Math.random()*15+5);
        	
		 
		}
        
        
        for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
        
        System.out.println("ordenados");
        
        for (int i = 0; i < 100; i++) {
			for (int j = i+1; j < 100; j++) {
				if(a[i]<a[j]) {
					aux=a[i];
					a[i]=a[j];
					a[j]=aux;
				}
			}
		}
        for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
        
        
        
        
        
	}

}
