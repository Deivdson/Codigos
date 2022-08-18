package Fila_Pilha;
import Pilha.PilhaArray;
import Pilha.PilhaVaziaException;

public class FilaPilha implements IFila{
	PilhaArray a = new PilhaArray(10);
	PilhaArray b = new PilhaArray(10);
	@Override
	public void enqueue(Object o) throws PilhaVaziaException {
		if(!(a.isEmpty())) {
			for(int i=0;i<b.size();i++)a.push(b.pop());
		}
		
		a.push(o);
		for(int i=0;i<a.size();i++)b.push(a.pop());
	}
	@Override
	public Object dequeue() throws PilhaVaziaException {
		return b.pop();
	}
	@Override
	public Object first() throws PilhaVaziaException {
		// TODO Auto-generated method stub
		return b.top();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return b.size();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return b.isEmpty();
	}
}
