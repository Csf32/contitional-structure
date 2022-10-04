import java.util.Scanner;

public class exoperadores {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println("Valor de x");
		x = sc.nextInt();
		System.out.println("Valor de y");
		y = sc.nextInt();
		
		if(x > 50 || y > 100) {
			
			System.out.println("Valor a ser pago: " + (x + 2) + " , Minutos totais: " + (y+2));
			
		}
		
		else {
			if(x <= 50 || y <= 100) {
			System.out.println("Valor a ser pago: " + 50 + " ,sem Minutos excedidos");
			}
		}
		sc.close();
	}

}
