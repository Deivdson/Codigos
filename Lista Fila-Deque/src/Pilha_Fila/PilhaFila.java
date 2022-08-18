package Pilha_Fila;
import Fila.FilaArray;
import Pilha.IPilha;
import Pilha.PilhaVaziaException;

public class PilhaFila implements IPilha{
	FilaArray a = new FilaArray(10);
	FilaArray b = new FilaArray(10);
	Object ultimo;
	@Override
	public void push(Object o) {
		a.enqueue(o);
		ultimo = o;
		
	}
	@Override
	public Object pop() throws PilhaVaziaException {
		int n =a.size();
		for(int i=0; i<n-1;i++) {
			Object x = a.dequeue();
			b.enqueue(x);
			ultimo = x;
			
		}
		Object y = a.dequeue();
		n = b.size();
		for(int i=0;i<n;i++) a.enqueue(b.dequeue());
		return y;
	}
	@Override
	public Object top() throws PilhaVaziaException {	
		return ultimo;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return a.isEmpty();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return a.size();
	}
	@Override
	public void mostra() {
		System.out.println("Fila A:");
		a.mostra();
		System.out.println("Fila B:");
		b.mostra();
		
		
		
	}

	
	

}
