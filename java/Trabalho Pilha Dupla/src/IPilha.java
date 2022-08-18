
public interface IPilha {

	void push(Object o);

	public Object pop() throws PilhaVaziaException;

	public Object top() throws PilhaVaziaException;

	public boolean isEmpty();

	public int size();
	
	public void mostrav();
	
	void pushp(Object o);

	public Object popp() throws PilhaVaziaException;

	public Object topp() throws PilhaVaziaException;

	public boolean isEmptyp();

	public int sizep();
	
	public void mostrap();

}