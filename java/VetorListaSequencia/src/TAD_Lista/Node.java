package TAD_Lista;

public class Node {
	public Object value;
	public Node next, prev;
	
	public Node() {}
	public Node(Object value) {
		this.value=value;
	}
	
	public Node(Object value, Node next, Node prev) {
		this.value=value;
		this.next=next;
		this.prev=prev;
		
	}
}
