package Fila_Pilha;

import Pilha.PilhaVaziaException;

public interface IFila {
	    public abstract void enqueue(Object o) throws PilhaVaziaException;
	    public abstract Object dequeue() throws PilhaVaziaException;
	    public Object first() throws PilhaVaziaException;
	    public abstract int size();
	    public abstract boolean isEmpty();
}
