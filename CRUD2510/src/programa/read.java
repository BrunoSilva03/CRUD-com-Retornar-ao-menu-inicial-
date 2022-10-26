package programa;

import java.util.ArrayList;

public class read {

	public void exibir(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento");
			
		} else {
			for(int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		}
	}
}
