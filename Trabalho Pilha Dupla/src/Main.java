
public class Main {

	public static void main(String[] args) throws PilhaVaziaException {
		// TODO Auto-generated method stub
		PilhaArray P1= new PilhaArray(2);
		//P1.mostrav();
		P1.push(1);
		P1.mostrav();
		P1.push(2);
		P1.mostrav();
		P1.push(3);
		P1.mostrav();
		P1.push(4);
		P1.push(5);
		P1.mostrav();
		P1.pushp(9);
		P1.pushp(8);
		P1.pushp(7);
		P1.mostrap();
		P1.mostrav();
		
		System.out.println("topo rubro: {"+P1.top());
		
		System.out.println("\ntopo negro: {"+P1.topp());
		
		System.out.println("Pilha vermelha pop()'s");
		System.out.println(P1.pop());
		System.out.println(P1.pop());
		System.out.println(P1.pop());
		System.out.println(P1.pop());
		System.out.println(P1.pop());
		
		P1.mostrap();
		P1.mostrav();
		
		System.out.println("Pilha preta popp()'s");
		System.out.println(P1.popp());
		System.out.println(P1.popp());
		System.out.println(P1.popp());
	}
}
