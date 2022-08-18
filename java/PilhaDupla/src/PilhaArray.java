
public class PilhaArray implements IPilha{
	private int capacidade;
	private Object[] a;
	private int tv;
	private int tp;
	
	public PilhaArray(int capacidade) {
		this.capacidade = capacidade;
		tv=-1;
		tp=capacidade-1;
		a= new Object[capacidade];
	}
	
	@Override
	public void mostra() {
		for(int i=0; i<tv;i++) {
			System.out.println(a[i]);
		}
		
	}

	@Override
	public void pushv(Object o) {
		if(tv+tp==capacidade-1) {
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int f=0;f<tv;f++)
				b[f] = a[f];
			int cont=0;
			for(int f=capacidade-1;cont<tp;f--) {
				b[f]=a[a.length-cont-1];
				cont++;
			}
			a=b;
		}
		a[++tv]=o;
		
	}

	@Override
	public Object popv() throws PilhaVaziaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object topv() throws PilhaVaziaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmptyv() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int sizev() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mostrav() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pushp(Object o) {
		if(tv+tp==capacidade) {
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int f=0;f<tv;f++)
				b[f] = a[f];
			int cont=0;
			for(int f=capacidade-1;cont<tp;f--) {
				b[f]=a[a.length-cont];
				cont++;
			}
			a=b;
		}
		a[++tp]=o;
		
	}

	@Override
	public Object popp() throws PilhaVaziaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object topp() throws PilhaVaziaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmptyp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int sizep() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
