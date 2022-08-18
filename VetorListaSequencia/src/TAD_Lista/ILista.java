package TAD_Lista;

public interface ILista {
	
	public Object first();
	public Object last();
	public  Object before(Node p);
	public Object after(Node p);
	
	public void replaceElement(Node n, Object o);
	public void swapElements(Node n, Node q);
	public void insertBefore(Node n, Object o);
	public void insertAfter(Node n, Object o);
	public void insertFirst(Object o);
	public void insertLast(Object o);
	
	public Object remove(Node n);
	
	public int size();
	public boolean isEmpty();
	
	public boolean isFirst(Node n);
	public boolean isLast(Node n);
	
	
	

}
