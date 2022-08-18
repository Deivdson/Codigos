package ArvoreBinaria;

import java.util.ArrayList;
import java.util.Iterator;


public class No {
	private Object o;
	private No pai;
	private No filhoesquerdo, filhodireito;
	public No(No pai, Object o)
	{
		this.pai = pai;
		this.o = o;
	}
	public Object element()
	{
		return o;
	}
	public No getLeft() {
		return filhoesquerdo;
	}
	public No getRight() {
		return filhodireito;
	}
	public No parent() {
		return pai;
	}
	public void setParent(No o) {
		pai = o;
	}
	public void setElement(Object o)
	{
		this.o = o;
	}
	public void addLeft(No o)
	{
		filhoesquerdo=o;
	}
	public void removeLeft(No o)
	{
		filhoesquerdo=null;
	}
	public void addRight(No o)
	{
		filhodireito=o;
	}
	public void removeRight(No o)
	{
		filhodireito=null;
	}
	public int childrenNumber()
	{
		int t = filhoesquerdo==null?0:1;
		t+= filhodireito==null?0:1;
		return t;
	}
	public Iterator<No> children(){
		ArrayList<No> filhos = new ArrayList<No>();
		if(filhoesquerdo!=null)filhos.add(filhoesquerdo);
		if(filhodireito!=null)filhos.add(filhodireito);
		return filhos.iterator();
	}

/* Fim da classe aninhada para armazenar o No */

}
