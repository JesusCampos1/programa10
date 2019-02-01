package programa10;

import java.util.Scanner;

public class programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=0, incr=0, suma=0;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el precio del primer producto: ");
		double pr1 = leer.nextDouble();
		System.out.print("Ingrese el precio del segundo producto: ");
		double pr2 = leer.nextDouble();
		System.out.print("Ingrese el precio del tercer producto: ");
		double pr3 = leer.nextDouble();
		suma=pr1+pr2+pr3;
		if (suma>=1500) {
			incr=suma*.11;
		}else {
			incr=suma*.10;
		}
		System.out.println("El monto es: "+suma);
		System.out.println("El total es: "+(suma+incr));
		
	}

}
