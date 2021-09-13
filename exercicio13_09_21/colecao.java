package exercicio13_09_21;

import java.util.ArrayList;
import java.util.Scanner;

public class colecao {

	public static void main(String[] args) {
		int op; 

		Scanner ler = new Scanner(System.in); 
		ArrayList <String> estoque = new ArrayList(); 
		
		do 
		{ 
		System.out.println("\n\t\tEstoque"); 
		System.out.println("\n(1) Adiciona produtos ao estoque"); 
		System.out.println("\n(2) Remove produtos do estoque?"); 
		System.out.println("\n(3) Atualiza produtos do estoque?"); 
		System.out.println("\n(4) Mostrar todos os produtos do estoque"); 
		System.out.println("\n(0) Deseja encerrar o programa?"); 
		op = ler.nextInt();  

		switch(op) 
		{ 
		case 1: 
		ler.nextLine(); 
		System.out.println("\nDigite o produto para adicionar ao estoque: "); 
		String produto = ler.nextLine(); 
		estoque.add(produto); 
		break; 
		case 2: 
		ler.nextLine(); 
		System.out.println("\nDigite o produto para remover do estoque: "); 
		String remove = ler.nextLine(); 
		if(estoque.contains(remove)) 
		{ 
		estoque.remove(remove); 
		} 
		else 
		{ 
		System.out.println("\nProduto não encontrado"); 
		} 
		System.out.println(estoque); 
		break; 
		case 3: 
		ler.nextLine(); 
		System.out.println("\nQue produto quer atualizar? "); 
		String verifica = ler.nextLine(); 
		System.out.println("\nDigite o nome do produto que entrará no lugar do produto: "+verifica+": "); 
		String novo = ler.nextLine(); 
		if(estoque.contains(verifica)) 
		{ 
		estoque.remove(verifica); 
		estoque.add(novo); 
		} 
		else 
		{ 
		System.out.println("\nProduto não existe!!!"); 
		} 
		System.out.println(estoque); 
		break; 
		case 4: 
		System.out.println("\nOs produtos do estoque são: "); 
		System.out.println(estoque); 
		break; 
		default: 
		System.out.println("\nfim!!!"); 
		} 
		}while(op!=0); 
		

		
	}

}
