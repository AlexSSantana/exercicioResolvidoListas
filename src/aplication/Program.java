package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Funcionario> listaFunc = new ArrayList<>();
		Funcionario func;

		System.out.print("Quantos funcionários serão resgistrados? ");
		Integer n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = input.nextInt();
			input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Salario: ");
			Double salario = input.nextDouble();
			func = new Funcionario(id, nome, salario);
			listaFunc.add(func);
		}

		System.out.print("Entre com Id do funcionário: ");
		Integer id = input.nextInt();
		Boolean encontrado = false; // indica que o id não foi encontrado

		for (int i = 0; i < listaFunc.size(); i++) {
			if (id == listaFunc.get(i).getId()) {
				System.out.print("Entre com porcentagem para aumentar o salario: ");
				Double porcentagem = input.nextDouble();
				listaFunc.get(i).aumentarSalario(porcentagem);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Esse Id não existe");
		}

		System.out.println();
		System.out.println("Lista de funcionários:");

		for (int i = 0; i < listaFunc.size(); i++) {
			System.out.println(listaFunc.get(i).toString());
		}
		input.close();
	}

}
