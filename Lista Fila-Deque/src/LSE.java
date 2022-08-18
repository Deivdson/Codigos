
public class LSE {
	public Object value;
	public LSE next;
	
	public  LSE() {}
	
	public  LSE(Object v, LSE n) {
		value=v;
		next=n;
	}
	
	public void setdNext(LSE n) {
		next=n;
	}
	
	public void setValue(Object v) {
		value=v;
	}
	

}
