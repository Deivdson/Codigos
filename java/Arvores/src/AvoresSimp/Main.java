package AvoresSimp;

import java.util.Iterator;

import AvoresSimp.ArvoreSimples.No;

public class Main {

	public static void main(String[] args) {
		ArvoreSimples v = new ArvoreSimples(1);
		
		v.addChild(v.root(),1);
		v.addChild(v.root(),2);
		Iterator i = v.Nos();
		
		while(i.hasNext())v.addChild((No) i.next(),3);
		
		i = v.elements();
		
		while(i.hasNext()) System.out.println(i.next());
		

	}

}
