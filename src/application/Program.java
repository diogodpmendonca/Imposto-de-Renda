package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contribuinte;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.println("Informe quantos contribuites: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Contribuinte #"+(i+1));
			System.out.print("Pessoa Juricida ou Física? J/F: ");
			char c = sc.next().charAt(0);
			System.out.print("Nome do Contribuinte: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double renda = sc.nextDouble();
			
			if(c == 'j' || c == 'J') {
				System.out.print("Quantidade de funcionários: ");
				int func = sc.nextInt();
				lista.add(new PessoaJuridica(nome, renda, func));
			}else {
				System.out.print("Gasto com Saúde: ");
				double gast = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, gast));
			}
		}
		
		System.out.println("\nTaxas pagas");
		Double sum = 0.0;
		for(Contribuinte con: lista) {
			sum += con.impostoDevido();
			System.out.println(con.demosntrativo());
		}
		System.out.println("\nTotal de Pago em Imposto de Renda: \n"+sum);
		sc.close();

	}

}
