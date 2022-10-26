package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class create {

	public void inserir(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String novoElement = new String();

		System.out.println("Digite o elemento que deseja inserir na lista");
		novoElement = sc.nextLine();

		if (lista.contains(novoElement)) {
			create c = new create();
			int opcao = 1;
			System.out.println("Este elemento já está presente na lista no momento.");
			while (opcao == 1) {

				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Digite um outro elemento");
				System.out.println("2 - Voltar ao Menu Inicial");
				opcao = sc.nextInt();

				switch (opcao) {

				case 1: {
					c.inserir(lista);
					opcao = 0;
					
				}
					break;

				default: {
					System.out.println("Voltando ao menu inicial...");
				}
				
				
				}
			}

		} else {
			lista.add(novoElement);
			System.out.println("Elemento inserido na lista com Sucesso!!!");
		}
	}

}
