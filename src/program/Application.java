package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	try {
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Tax payer #%d data: \n", i);
			System.out.print("Individual or Company (i/c): ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			if(answer == 'i') {
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Anual income: ");
				Double pjRendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, pjRendaAnual, funcionarios));
			}
		}
		System.out.println("TAXES PAID:");
		double sum = 0;
		for(Pessoa p: list) {
			System.out.println(p.getName() + ": " + "$ " + p.tax());
			sum += p.tax();
			System.out.println("TOTAL TAXES: " + sum);
		}
	}
	catch(RuntimeException e) {
		System.out.println("ERROR: Start the program again.");
	}
	}
}
