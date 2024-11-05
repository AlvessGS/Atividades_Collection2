package atividadeCollection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

	public class CollectionFila {
	public static void main(String[] args) {
				
		Queue<String> fila = new LinkedList<>();
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		while (true) {
		
		System.out.println("\n1 - Adicionar cliente na fila ");
		System.out.println("2 - Listar todos os clientes ");
		System.out.println("3 - Remover cliente da fila");
		System.out.println("0 - Sair\n");
		
		System.out.println("Escolha uma opção: \n");
		opcao = ler.nextInt();
		ler.nextLine();
		
		switch(opcao) {
			case 1:
				System.out.println("Digite o nome para adicionar a fila: ");
				String nomeFila = ler.nextLine();
				fila.add(nomeFila);
				System.out.println("\nO nome " +nomeFila+" foi adicionado a fila!\n");
				break;
			
			case 2:
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				}else {
					for(String clientesFila : fila) {
						System.out.println(clientesFila);
					}
				}
				break;
				
			case 3:
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				}else {
				String clienteRemover = fila.poll();
				System.out.println("Cliente "+clienteRemover+" removido da fila");
				}
				break;
				
			case 0:
				System.out.println("Programa finalizado!");
				ler.close();
				return;
				
			default:
				System.out.println("Opção inválida!");
				break;
				}	
			}
		}
	}
