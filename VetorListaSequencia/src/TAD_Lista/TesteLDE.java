package TAD_Lista;

public class TesteLDE {

	public static void main(String[] args) {
		ListaDE l = new ListaDE();
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		for(int i=0;i<5;i++)l.insertLast(i);
		
		Node x= (Node) l.first();
		System.out.println(x);
		System.out.println(l.after(x));
		System.out.println(l.last());
		
		
		System.out.println("------------------------------");
		l.swapElements(n1,n5);
		System.out.println(l.first());
		System.out.println(n1.value);
		System.out.println(l.last());
		System.out.println(n5.value);

	}

}
