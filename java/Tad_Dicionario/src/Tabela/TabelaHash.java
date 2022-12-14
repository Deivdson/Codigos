package Tabela;

import java.util.ArrayList;

public class TabelaHash implements ITabela {
	private Object[] a;
	private int t;
	private int capacidade;
	
	public TabelaHash() {
		capacidade = 13;
		a = new Node[capacidade];
		t=0;
	}
	@Override
	public Object findElement(int k) throws TabelaVaziaException {
		//if(isEmpty()) throw new TabelaVaziaException("Tabela Vazia.");
		
		int i = k%capacidade;
		int p=0;
		while(p<capacidade) {
			Node c = (Node)a[i];
			if(c==null)
				return "No_Such_Key";
			else if(c.key==k)
				return c;
			else {
				i = (i+1) % capacidade;
				p++;
			}
		}
		
		return "No_Such_Key";
	}
	
	public int findIndex(int k) throws TabelaVaziaException {
		int i = k%capacidade;
		int p=0;
		while(p<capacidade) {
			Node c = (Node)a[i];
			if(c==null)
				return -1;
			else if(c.key==k)
				return i;
			else {
				i = (i+1) % capacidade;
				p++;
			}
		}
		
		return -1;
	}

	@Override
	public void inserirItem(int k, Object o) throws TabelaCheiaException, TabelaVaziaException {
		if(t==capacidade/2) {
			Object[] b = new Object[capacidade*2];
			/*
			for(int i=0;i<capacidade;i++) {
				Node no = (Node) a[i];
				if(no!=null) {
					b[findIndex(i)] = no;
				}
			}
			capacidade*=2;
			a=b;
			*/
			
			for(Object obj: a) {
				Node no = (Node) obj;
				int index = no.key%capacidade;
				while(b[index]!=null)
					k++;
				b[index] = no;		
			}
			capacidade*=2;
			a=b;
		}
		int cont = k;
		while(cont<capacidade) {
			int i = cont%capacidade;
			Object obj = findElement(i);
			if(a[i]==null || obj=="AVAILABLE" ) {
				System.out.println("Insert:");
				/*
				System.out.println(obj+"]");
				System.out.println("Index: "+cont + " Elemento: "+o);
				System.out.println("Elemento no array: "+a[i]+" |K: "+k+"\n");*/
				Node no = new Node(k, o); 
				a[i] = no;		
				t++;
				break;
			}
			cont++;			
		}
	}

	@Override
	public Object removeElement(int k) throws TabelaVaziaException {
		Object o = findElement(k);
		int i = findIndex(k);
		if(o.equals("No_Such_Key"))
			throw new TabelaVaziaException("Elemento n??o encontrado");
		else {
			//Node no = (Node) o;
			Object r=((Node) o).element;
			o = "AVAILABLE";
			if(i>=0) {
				a[i] = new Node(i,"AVAILABLE");
			}
			System.out.println(((Node)a[0]).element + " - I= "+i+"\n");
			return r;
		}
	}
	
	public Object buscaBinaria(int k, int min, int max) {
		int m = (max-min)/2;
		Node c =  (Node) a[m];
		if(min>max)
			return "No_Such_Key";
		else if(c.key==k)
			return c.element;
		else if(k<c.key)
			buscaBinaria(k,min,m-1);
		else if(k>c.key)
			buscaBinaria(k,m+1,max);
		return "No_Such_Key";
	}

	@Override
	public int size() {
		return t;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return t==0;
	}

	@Override
	public ArrayList<Object> keys() {
		ArrayList<Object> chaves = new ArrayList<Object>();
		for(Object o:a) {
			Node no = (Node) o;
			chaves.add(no.key);
		}
		return chaves;
	}

	@Override
	public ArrayList<Object> elements() {
		ArrayList<Object> elements = new ArrayList<Object>();
		for(Object o:a) {
			Node no = (Node) o;
			elements.add(no.element);
		}
		return elements;
	}
	
	public void print() {
		for(int i=0;i<capacidade;i++) {
			Node no = (Node) a[i];
			if(no!=null) {
				System.out.println(no.element +" - "+i+"| Chave: "+ no.key);
			}
		}
	}
	
	public void print2() {
		for(int i=0;i<capacidade;i++) {
			Node no = (Node) a[i];
			if(no==null) {
				System.out.println(no +" - "+i+"| Chave: "+ no);
			}else {
				System.out.println(no.element +" - "+i+"| Chave: "+ no.key);
			}
		}
	}

}
