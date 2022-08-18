
public class Main {

	public static void main(String[] args) throws PilhaVaziaException {
		FilaEncadeada fe = new FilaEncadeada();
		
		fe.enqueue(1);
		System.out.println("primeiro: "+fe.first());
		fe.enqueue(2);
		System.out.println("primeiro: "+fe.first());
		fe.enqueue(3);
		System.out.println("primeiro: "+fe.first());
		fe.enqueue(4);
		System.out.println("primeiro: "+fe.first());
		fe.enqueue(5);
		System.out.println("primeiro: "+fe.first());
		
		System.out.println("pop: "+fe.dequeue());
		System.out.println("pop: "+fe.dequeue());
		System.out.println("pop: "+fe.dequeue());
		System.out.println("pop: "+fe.dequeue());
		System.out.println("pop: "+fe.dequeue());
		
		
		//System.out.println("Primeiro elemento: "+fe.first()+"\n----------\n");
		
		System.out.println("\nPilha encadeada:");
		PilhaEncadeada pe = new PilhaEncadeada();
		
		pe.push(1);
		System.out.println(pe.top());
		pe.push(2);
		System.out.println(pe.top());
		pe.push(3);
		System.out.println(pe.top());
		pe.push(4);
		System.out.println(pe.top());
		pe.push(5);
		System.out.println(pe.top());
		
		System.out.println(pe.pop());
		System.out.println(pe.pop());
		System.out.println(pe.pop());
		System.out.println(pe.pop());
		System.out.println(pe.pop());

		
		System.out.println("\nFila encadeada:");
		FilaE f = new FilaE();
		f.enqueue(10);
		System.out.println("primeiro: "+f.first());
		f.enqueue(9);
		System.out.println("primeiro: "+f.first());
		f.enqueue(8);
		System.out.println("primeiro: "+f.first());
		f.enqueue(7);
		System.out.println("primeiro: "+f.first());
		f.enqueue(6);
		System.out.println("primeiro: "+f.first());
		
		System.out.println("pop: "+f.dequeue());
		System.out.println("pop: "+f.dequeue());
		System.out.println("pop: "+f.dequeue());
		System.out.println("pop: "+f.dequeue());
		System.out.println("pop: "+f.dequeue());
		

	}

}
