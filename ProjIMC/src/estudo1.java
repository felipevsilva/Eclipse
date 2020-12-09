import java.util.Scanner;

public class estudo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Digite idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite peso: ");
		float peso = sc.nextFloat();
		System.out.println("Digite sua altura: ");
		float alt = sc.nextFloat();
		
		float imc = peso/(alt * alt);
		float ResImc = imc;
		
		
		System.out.println(idade);	
		System.out.println(peso);
		System.out.println(alt);
		System.out.println(ResImc);
		
		if (ResImc > 18.5 && ResImc <24.9){
			
			System.out.println("Peso normal");
			
		} else {
			
			System.out.println("Fora do peso ideal");
		}
		
		
	sc.close();
			
		
		
	}
	
	

}
