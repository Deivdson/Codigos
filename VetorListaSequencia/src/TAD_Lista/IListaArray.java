package TAD_Lista;

public interface IListaArray {
	public Object first();
	public Object last();
	public  Object before(int p);
	public Object after(int p);
	
	public void replaceElement(int n, Object o);
	public void swapElements(int n, int q);
	public void insertBefore(int n, Object o);
	public void insertAfter(int n, Object o);
	public void insertFirst(Object o);
	public void insertLast(Object o);
	
	public Object remove(int n);
	
	public int size();
	public boolean isEmpty();
	
	public boolean isFirst(int n);
	public boolean isLast(int n);
}
