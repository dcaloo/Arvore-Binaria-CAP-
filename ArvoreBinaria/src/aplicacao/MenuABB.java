package aplicacao;

import java.util.Scanner;

import arvores.ABBint;

public class MenuABB {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBint abb = new ABBint();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir 1 valor na ABB");
			System.out.println("2 - Apresenta ABB (em ordem)");
			System.out.println("3 - Apresenta quantidade de nós na ABB");
			System.out.print("Opção: ");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.print("Fechando a execucao");
				break;
			case 1:
				System.out.print("Informe valor a ser inserido: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\t Apresentacao ABB");
				abb.show(abb.root);
				System.out.println();
				break;
				case 3:
					System.out.println("Quantidade de nós: " + abb.contaNos(abb.root, 0));
					break;

			default:
				System.out.println("Opcao Invalida");
			}
			
		} while (opcao!=0);
		
		le.close();

	}

}
