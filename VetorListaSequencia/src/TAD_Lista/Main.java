package TAD_Lista;

public class Main {

	public static void main(String[] args) {
		ListaArray la = new ListaArray(1); 
		
		for(int i=1;i<=5;i++)la.insertFirst(i);
		
		System.out.println("Tamanho: "+la.size());
		
		//for(int i=4; i>0; i--)System.out.println("remove: "+la.remove(i));
		
		System.out.println("--------------------------");
		
		System.out.println("remove: "+la.remove(0));
		System.out.println("remove: "+la.remove(0));
		System.out.println("remove: "+la.remove(0));
		System.out.println("remove: "+la.remove(0));
		System.out.println("remove: "+la.remove(0));
		
		System.out.println("--------------------------");
		
		for(int i=5;i>0;i--)la.insertFirst(i);
		for(int i=6;i<=10;i++)la.insertLast(i);
		
		System.out.println("--------------------------");
		
		la.swapElements(0,1);
		System.out.println(la.first());
		la.swapElements(0,1);
		System.out.println(la.first());
		System.out.println("--------------------------");
		
		System.out.println(la.before(1));
		System.out.println(la.after(1));
		
		System.out.println("--------------------------");
		
		System.out.println(la.last());
		la.replaceElement(9,11);
		System.out.println(la.last());
		for(int i=0;i<la.size();i++)System.out.println(la.after(i));
		
		System.out.println("--------------------------");
		
		la.insertBefore(9,10);
		System.out.println(la.before(9));
		
		for(int i=0;i<la.size();i++)System.out.println(la.after(i));
		
		System.out.println("Tamanho: "+la.size());
		la.insertAfter(9,10);
		System.out.println("Tamanho: "+la.size());
		
		la.insertAfter(11,11);
		for(int i=0;i<12;i++)System.out.println(la.after(i));
		System.out.println("Tamanho: "+la.size());
		System.out.println(la.last());
		
		System.out.println("----Lista Duplamente Encadeada----");
		
		ListaLDE l = new ListaLDE();
		
		l.insertFirst(0);
		for(int i=1;i<6;i++)l.insertLast(i);
		
		System.out.println(l.first()+" <-Primeiro elemento");
		
		for(int i=0;i<l.size()-1;i++)System.out.println(l.after(i));
		
		l.remove(5);
		l.insertAfter(4,6);
		l.insertBefore(5,5);
		l.swapElements(0,6);
		System.out.println("----------------");
		System.out.println(l.before(1));
		for(int i=0;i<l.size()-1;i++)System.out.println(l.after(i));
		
	}

}
