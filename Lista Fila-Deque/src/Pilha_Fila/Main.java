package Pilha_Fila;

import Pilha.PilhaVaziaException;

public class Main {

	public static void main(String[] args) throws PilhaVaziaException {
		// TODO Auto-generated method stub
		PilhaFila P1= new PilhaFila();
		//PilhaVector P1=new PilhaVector();
	
		P1.push(1);
		System.out.println("Ultimo elemento: "+P1.top());
		P1.mostra();
		
		P1.push(2);
		System.out.println("Ultimo elemento: "+P1.top());
		P1.mostra();
		
		P1.push(3);
		System.out.println("Ultimo elemento: "+P1.top());
		P1.mostra();
		
		P1.push(4);
		System.out.println("Ultimo elemento: "+P1.top());
		P1.mostra();
		
		P1.mostra();
		
		System.out.println("------------Huera de los POP's-------------\n");
		
		P1.mostra();
		System.out.println("Tamanho: "+P1.size());
		//System.err.println("Ultima com first: "+ P1.top());
		
		//System.out.println("POP: "+ P1.pop());
		//P1.mostra();
		//System.err.println("Ultima com first: "+ P1.top());
		
		//System.out.println("POP: "+P1.pop());
		//P1.mostra();
		//System.err.println("Ultima com first: "+ P1.top());
		
		//System.out.println("POP: "+P1.pop());
		//P1.mostra();
		//System.err.println("Ultima com first: "+ P1.top());
		
		//System.out.println("POP: "+P1.pop());
		//P1.mostra();
		//System.err.println("Ultima com first: "+ P1.top());
		
		System.out.println(P1.top());
		P1.pop();
		System.out.println(P1.top());
		P1.pop();
		System.out.println(P1.top());
		P1.pop();
		System.out.println(P1.top());
		P1.pop();

	}

}
