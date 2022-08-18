package TAD_Vetor;

public interface IVetor {
	public Object elementAtRank(int r) throws VetorVazioException;
	public Object replaceAtRank (int r, Object o) throws VetorVazioException;
	public void insertAtRank(int r, Object o);
	public Object removeAtRank(int r) throws VetorVazioException;
	public abstract int size();
    public abstract boolean isEmpty();
}
