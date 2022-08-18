package ArvoreSimples;

import java.util.ArrayList;
import java.util.Iterator;

import ArvoreSimples.ArvoreSimples.No;

public class Main {

	public static void main(String[] args) {
		
		ArvoreSimples v = new ArvoreSimples(1);
		v.addChild(v.root(),2);
		v.addChild(v.root(),3);
		Iterator i = v.elements();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("------------------------");
		
		No raiz = v.root();
		
		i = raiz.children();
		int cont = 4;
		while(i.hasNext()) {
			v.addChild((No) i.next(),cont);
			cont++;
		}
		
		i = v.elements();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(v.height(raiz));
		
		i = v.Nos();
		No o = null;
		while(i.hasNext()) {
			System.out.println(o=(No) i.next());
		}
		
		System.out.println("----------------------------");
		
		v.swapElements(raiz,o);
		
		System.out.println(raiz.element()+" - "+o.element());
		
		v.replace(raiz,1);
		
		System.out.println(raiz.element());

	}

}
