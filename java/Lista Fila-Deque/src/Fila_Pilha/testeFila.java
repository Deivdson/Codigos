package Fila_Pilha;

import Pilha.PilhaVaziaException;

public class testeFila {

	public static void main(String[] args) throws PilhaVaziaException {
		// TODO Auto-generated method stub
		FilaPilha f=new FilaPilha();
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		System.out.println("tamanho: "+f.size());
		System.out.println("Está vazia? "+f.isEmpty());
		try{
			System.out.println(f.first());
			System.out.println("tamanho: "+f.size());
			f.dequeue();
			System.out.println(f.first());
			System.out.println("tamanho: "+f.size());
			f.dequeue();
			System.out.println(f.first());
			System.out.println("tamanho: "+f.size());
			f.dequeue();
			System.out.println(f.first());
			System.out.println("tamanho: "+f.size());
			f.dequeue();
			System.out.println("Está vazia? "+f.isEmpty());
			System.out.println(f.first());
			f.dequeue();
		}catch(FilaVaziaException erro){
			System.out.println(erro.getMessage());
			
		}
	}

}
