package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class update {

	public void alterar(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento");
		} else {
			Scanner sc = new Scanner(System.in);
			String antigoElement = new String();
			String novoElement = new String();
			
			System.out.println("Digite o elemento a ser substituído na lista:");
			antigoElement = sc.nextLine();
			
			if(lista.contains(antigoElement)) {
				System.out.println("Digite o novo elemento:");
				novoElement = sc.nextLine();
				
				for(int i = 0; i < lista.size(); i++) {
					if(lista.get(i).equals(antigoElement)) {
						lista.set(i, novoElement);
						System.out.println("Alteração " + antigoElement + " para " + novoElement + " feita na lista Com Sucesso!!!");
					}
				}
				
			} else {
				int opcao = 1;
				update u = new update();
				System.out.println("A lista não contêm " + antigoElement);
				System.out.println("Escolha uma opção:");
				System.out.println("1 - Digite outro elemento");
				System.out.println("2 - Retorne ao menu inicial");
				opcao = sc.nextInt();
				
				switch(opcao) {
				
				case 1: {
					u.alterar(lista);
					opcao = 0;
				}break;
				
				default: {
					System.out.println("Retornando ao menu inicial...");
					
				}
				
				}
			}
		}
	}
}
