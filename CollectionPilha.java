package atividadeCollection2;

import java.time.chrono.IsoChronology;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class CollectionPilha {
	
	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		
		
		while(true) {
			
			System.out.println("\n1 - Adiciona um novo livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("*****************************************************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = ler.nextInt();
			ler.nextLine();
			
			switch(opcao) {
			case 1: 
				System.out.println("Escreva o livro que deseja adicionar: \n");
				String livro = ler.nextLine();
				pilha.add(livro);
				
				System.out.println("\nO livro "+livro+" adicionado a fila com sucesso!");
				break;
				
			case 2: 
				if(pilha.isEmpty()) {
					System.out.println("A lista está vazia!");
				}else {
					System.out.print(pilha+" ");
					break;
				}
				
			case 3:
				
			if(pilha.isEmpty()) {
				System.out.println("A pilha está vazia!");
			}else {
				System.out.println("O livro "+pilha.pop()+" removido da lista");
			}
				break;
				
			case 0:
				System.out.println("Programa finalizado!");
				ler.close();
				return;
				
			default: {
				System.out.println("Opções inválidas!");
				}
			}	
		}
	}

}
