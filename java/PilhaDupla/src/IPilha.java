
public interface IPilha {

	void pushv(Object o);

	Object popv() throws PilhaVaziaException;

	Object topv() throws PilhaVaziaException;

	boolean isEmptyv();

	int sizev();
	
	void mostra();
	
	void mostrav();
	
	void mostrap();
	
	void pushp(Object o);

	Object popp() throws PilhaVaziaException;

	Object topp() throws PilhaVaziaException;

	boolean isEmptyp();

	int sizep();

}