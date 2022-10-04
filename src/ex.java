import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro código");
		int codigo = sc.nextInt(); 
		
		System.out.println("Digite o segundo código");
		int codigo2 =sc.nextInt();
		
		int preco = 4;
		int preco2 = 5;

		int soma = preco + preco2;
		
		if (codigo ==1 && codigo2 == 2) {
			System.out.println("Total: R$ " + soma );
			}
		else {
			System.out.println("Digite um código válido");
		}
		
		sc.close();
	}

}
