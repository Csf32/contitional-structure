import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a hora");
		int hora;
		
		System.out.println("Quantas horas?");
		
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}

		else{
			if(hora <= 17) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}

		sc.close();
		
	}

}
