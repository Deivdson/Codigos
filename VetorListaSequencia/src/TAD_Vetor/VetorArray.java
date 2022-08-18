package TAD_Vetor;

public class VetorArray implements IVetor{
	private Object[] a;
	private int inicio;
	private int fim;
	private int capacidade;
	
	
	public VetorArray(int capacidade) {
		this.capacidade=capacidade;
		a= new Object[capacidade];
		inicio=0;
		fim=-1;
		
	}

	@Override
	public Object elementAtRank(int r) {	
		if(isEmpty()) throw new VetorVazioException("Vetor Vazio!");
		if(r>fim || r<inicio) throw new IndexOutException("Index out!");
		return a[r];
	}

	@Override
	public Object replaceAtRank(int r, Object o){
		if(isEmpty()) throw new VetorVazioException("Vetor Vazio!");
		if(r>fim || r<inicio) throw new IndexOutException("Index out!");
		Object x = a[r];
		a[r]=o;
		return x;
	}

	@Override
	public void insertAtRank(int r, Object o) {
		fim++;
		if(r>fim || r<inicio) throw new IndexOutException("Index out!");
		
		if(size()>=capacidade) {
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int i =0;i<r;i++) {
				b[i]=a[i];
			}
			for(int i=r+1; i<size() ;i++) {
				b[i]=a[i-1];
			}
			a=b;
		}else {
			for(int i=size();i>r;i--) {
				a[i]=a[i-1];
			}
		}
		
		a[r]=o;
	}

	@Override
	public Object removeAtRank(int r) {
		if(r>fim || r<inicio) throw new IndexOutException("Index out!");
		if(isEmpty()) throw new VetorVazioException("Vetor Vazio!");
		Object x = a[r];
		for(int i=r;i<fim;i++) {
			a[i]=a[i+1];
		}
		fim--;
		return x;
	}

	@Override
	public int size() {
		return fim+1;
	}

	@Override
	public boolean isEmpty() {
		return fim==-1;
	}
	
	
}
