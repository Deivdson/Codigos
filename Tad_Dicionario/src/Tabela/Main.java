package Tabela;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws TabelaCheiaException, TabelaVaziaException {
		TabelaHash tab = new TabelaHash();
		
		for(int i=0 ; i<5 ; i++) {
			tab.inserirItem(0,i+23+(i%7));
			System.out.println("Tamanho: "+tab.size()+"\n");
		}
		
		
		tab.inserirItem(3,1+23+(1%7));
		
		for(int i=0;i<13;i++) {
			Object o = tab.findElement(i);
			System.out.println(o);
		}
		
			
		System.out.println("Elementos na tabela:");
		tab.print();
		System.out.println("Removendo...");
		tab.removeElement(0);
		System.out.println("Elementos na tabela:");
		tab.print2();
		
		System.out.println(((Node)tab.findElement(0)).element);
		
		
		
		/*
		if(o != "No_Such_key") {
			Node no = (Node) o;
			System.out.println(no.element);	
		}*/

	}

}
