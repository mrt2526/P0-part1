import java.util.*;
public class P73{
	public static void main (String [] args){
		Scanner entrada;
		int x, y, z = 0;
		entrada = new Scanner (System.in);
		System.out.println("Introdueix un nombre enter");
		x = entrada.nextInt();
		System.out.println("Introdueix un nombre enter");
		z = entrada.nextInt();
		y = x / z;
		System.out.println("El resultat de l’operació és: " + y);
	}
}
