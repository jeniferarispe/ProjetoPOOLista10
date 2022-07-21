package classeexecutavel;

import java.util.HashMap;
import java.util.Map;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> nomes = new HashMap<Integer, String>();
		nomes.put(1, "Ana");
		nomes.put(2, "Carlos");
		nomes.put(3, "Ricardo");
		nomes.put(4, "Maiara");
		nomes.put(5, "Miguel");
		nomes.put(6, "Silvia");
		nomes.put(7, "Manuel");
		nomes.put(8, "Luna");
		nomes.put(9, "Julie");
		nomes.put(10, "Manuela");

		Integer chaveProcurada = 1;
		if (nomes.containsKey(chaveProcurada)) {

			System.out.println("Valor da Chave: " + chaveProcurada + "--" + nomes.get(chaveProcurada));
		}

		else {
			System.out.println("Chave nao Existe");
		}

		System.out.println(nomes.containsKey(3));
		System.out.println(nomes.containsKey(12));
		System.out.println(nomes.containsKey(1));

		for (String i : nomes.values()) {
			System.out.println(i);

		}
		nomes.remove(1);
		System.out.println("Apos remover o elemento 1: ");
		for (String i : nomes.values()) {
			System.out.println(i);

		}
	}
}
