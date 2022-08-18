package ArvoreBinaria;

import java.util.Iterator;

import ArvoreSimples.InvalidNoException;

public class Main {

	public static void main(String[] args) throws InvalidNoException {
		ArvoreBinaria v = new ArvoreBinaria(5);
		v.addChild(6);
		v.addChild(3);
		Iterator x = v.root().children();
		
		
		
		
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		
		Iterator i = v.elements();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("------------------------");
		
		No raiz = v.root();
		
		i = raiz.children();
		int cont = 7;
		while(i.hasNext()) {
			v.addChild(cont);
			cont++;
			i.next();
		}
		v.addChild(2);
		v.addChild(4);
		
		System.out.println((v.busca(raiz,5)).getRight().element()+" <------Direito ------"+"\n Elementos():");
		i = v.elements();
		while(i.hasNext()) {
			System.out.println(i.next()+"-");
		}
		
		System.out.println("Tamanho da árvore"+ v.height(raiz)+"\nNós na árvore:");
		
		i = v.Nos();
		while(i.hasNext()) {
			System.out.println(((No)i.next()).element());
		}
		
		
		
		No n = v.busca(v.root(),3);
		System.out.println("---------------------------------\n");
		System.out.println("Número de folhas: "+v.nFolhas(v.root())+" Externo? "+v.isExternal(n));
		//System.out.println(n.childrenNumber() +"-"+ n.element() + "- Pai:" + n.parent().element());
		System.out.println("Número de filhos: "+n.childrenNumber() +"\n-Elemento: "+ n.element());
		if(n.getLeft()!=null)System.out.println("Filho esquerdo: "+n.getLeft().element());
		if(n.getRight()!=null)System.out.println("Filho direito: "+n.getRight().element());
		if(n.parent()!=null)System.out.println("Pai: " + n.parent().element());
		
		
		
		
		
		System.out.println("\n_______________________________________________\nPrint Árvore binária:\n");
		v.print();
		
		System.out.println("\n_______________________________________________\nPrint Árvore binária inOrder:\n");
		v.printOrder();
		
		n = v.busca(v.root(),3);
		v.remove(n.element());
		n = v.busca(v.root(),4);
		System.out.println("---------------------------------\n");
		System.out.println("Número de folhas: "+v.nFolhas(v.root())+" Externo? "+v.isExternal(n));
		//System.out.println(n.childrenNumber() +"-"+ n.element() + "- Pai:" + n.parent().element());
		System.out.println("Número de filhos: "+n.childrenNumber() +"\n-Elemento: "+ n.element());
		if(n.getLeft()!=null)System.out.println("Filho esquerdo: "+n.getLeft().element());
		if(n.getRight()!=null)System.out.println("Filho direito: "+n.getRight().element());
		if(n.parent()!=null)System.out.println("Pai: " + n.parent().element());
		
		System.out.println("\n_______________________________________________\nPrint Árvore binária inOrder:\n");
		v.printOrder();
		
		/*
		System.out.println("----------------------------");
		
		v.swapElements(raiz,o);
		
		System.out.println(raiz.element()+" - "+o.element());
		
		v.replace(raiz,1);
		
		System.out.println(raiz.element());
		
		
		No novo = v.busca(raiz,3);
		i=novo.children();
		Object e = null,d = null;
		if(novo.getLeft()!=null) {
			e = novo.getLeft().element();
		}
		if(novo.getRight()!=null) {
			d = novo.getRight().element();
		}
		System.out.println("---------------------------------------" +"\n"
							
							+"Elemento do No: "+novo.element() +"\n"
							+ "Filho Esquerdo: " + e +"\n"
							+ "Filho Direito: " + d +"\n"
							+ "---------------------------------------\n"
				);
		
		while(i.hasNext()) {
			System.out.println("(");
			System.out.println(((No)i.next()).element());
		}
		*/

	}

}
