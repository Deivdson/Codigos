package TAD_Vetor;

public class LDE {
	
	public Object value;
	public LDE next, prev;
	
	public LDE() {
		
	}
	
	public LDE(Object value, LDE next, LDE prev) {
		this.value=value;
		this.next=next;
		this.prev=prev;
		
	}
	
}
