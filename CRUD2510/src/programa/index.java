package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CRUD BÁSICO EM JAVA FEITO EM MENOS DE 1 HORA POR BRUNO SILVA RODRIGUES!!!!!+............

		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();

		create c = new create();
		read r = new read();
		update u = new update();
		delete d = new delete();

		int opc = 1;

		System.out.println("OLÁ, SEJA BEM VINDO(A)");

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Exibir Lista");
			System.out.println("2 - Inserir");
			System.out.println("3 - excluir");
			System.out.println("4 - Alterar");
			System.out.println("5 - Limpar");
			System.out.println("0 - Fechar o Programa");
			opc = sc.nextInt();

			switch (opc) {

			case 0: {
				System.out.println("Encerrando o programa, obrigado por usar");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				System.exit(0);
			}
				break;

			case 1: {
				r.exibir(lista);
			}
				break;

			case 2: {
				c.inserir(lista);
			}
				break;

			case 3: {
				d.excluir(lista);
			}
				break;

			case 4: {
				u.alterar(lista);
			}
				break;

			case 5: {
				lista.clear();
				System.out.println("Lista limpa e esvaziada com Sucesso!!!");
			}
				break;

			default: {
				System.out.println("Opção Inválida");
			}
				break;

			}
		} while (opc != 0);

	}

}
