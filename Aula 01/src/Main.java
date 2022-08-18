
public class Main {

	public static void main(String[] args) throws PilhaVaziaException {
		// TODO Auto-generated method stub
		PilhaArray P1= new PilhaArray(1);
		//PilhaVector P1=new PilhaVector();
		P1.mostra();
		P1.push(1);
		P1.mostra();
		P1.push(2);
		P1.mostra();
		P1.push(3);
		P1.mostra();
		
		System.out.println(P1.top());

	}

}
