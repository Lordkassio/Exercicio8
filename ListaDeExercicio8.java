package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		  System.out.println("Digite o valor da sua hora de trabalho: ");
		  float valordahora = entrada.nextFloat();
		 
		  System.out.println("Digite quantas horas voce trabalha por dia: ");
		  
		  int horastrabalhadas = entrada.nextInt();
		  int quantidadededias = 22; //estimativa de dias úteis em um mês
		  System.out.printf("O seu salario, em um mes, eh de: R$%.2f",
				  (valordahora * horastrabalhadas) * quantidadededias);
		
		entrada.close();
	}

}
