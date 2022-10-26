package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {

	public void excluir(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String element = new String();

		if (lista.isEmpty()) {
			System.out.println("A lista está vazia");
		} else {
			System.out.println("Digite o elemento que quer excluir da lista:");
			element = sc.nextLine();

			if (lista.contains(element)) {
				lista.remove(element);
				System.out.println(element + " removido da lista com Sucesso!!!");
			} else {
				delete d = new delete();
				int opcao = 1;
				System.out.println(element + " não existe na lista");
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Digite outro elemento.");
				System.out.println("2 - Retornar ao menu principal");
				opcao = sc.nextInt();
				
				switch(opcao) {
				
				case 1: {
					d.excluir(lista);
					opcao = 0;
				}break;
				
				default: {
					System.out.println("Retornando ao menu principal");
					
				}
				
				
				}
			}
		}

	}
}
