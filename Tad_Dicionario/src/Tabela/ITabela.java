package Tabela;

import java.util.ArrayList;

public interface ITabela {
	public abstract Object findElement(int k) throws TabelaVaziaException;
	public abstract void inserirItem (int k, Object o) throws TabelaCheiaException, TabelaVaziaException;
	public abstract Object removeElement(int k) throws TabelaVaziaException;
	public abstract int size();
	public abstract boolean isEmpty();
	public abstract ArrayList<Object> keys() throws TabelaVaziaException;
	public abstract ArrayList<Object> elements() throws TabelaVaziaException;
}
