package Fila;

import java.util.Vector;

public class FilaVector implements IFila{
	Vector<Object> vetor= new Vector<Object>();
	@Override
	public void enqueue(Object o) {
		vetor.add(o);
	}

	@Override
	public Object dequeue() {
		Object obj = vetor.firstElement();
		vetor.removeElement(obj);
		return obj;
	}

	@Override
	public Object first() {
		return vetor.firstElement();
	}

	@Override
	public int size() {
		return vetor.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return vetor.isEmpty();
	}

}
