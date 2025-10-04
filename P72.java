import java.util.*;
public class P72{
	public static void main (String [] args){
		int x, y, z, dobleDez;
		Scanner entrada;
		entrada = new Scanner (System.in);
		System.out.println("Introdueix un nombre enter");
		x = entrada.nextInt();
		y = 2*(x+100);
    	  	z = 5;
		dobleDez = 2*z*x+y;
		System.out.println("x=" + x + " y=" + y + " z=" + z);
	}
}
