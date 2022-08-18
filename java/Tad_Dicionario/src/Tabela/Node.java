package Tabela;

public class Node {
	public Object element;
	public Node next, prev;
	public int key;
	
	public Node() {}
	public Node(int k, Object value) {
		this.element=value;
		this.key=k;
	}
}
