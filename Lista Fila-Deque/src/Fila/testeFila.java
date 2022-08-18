package Fila;

public class testeFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaArray f=new FilaArray(10); //criando fila tamnho 1 e duplicação~
		FilaVector fv = new FilaVector();
		
		fv.enqueue(1);
		fv.enqueue(2);
		fv.enqueue(3);
		fv.enqueue(4);
		
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		try{
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			//f.dequeue();
			
			System.out.println("Fila Vector: "+fv.first());
			fv.dequeue();
			System.out.println("Fila Vector: "+fv.first());
			fv.dequeue();
			System.out.println("Fila Vector: "+fv.first());
			fv.dequeue();
			System.out.println("Fila Vector: "+fv.first());
			fv.dequeue();
			System.out.println("Fila Vector: "+fv.first());
			fv.dequeue();
		
		}catch(FilaVaziaException erro){
			System.out.println(erro.getMessage());
			
		}
	}

}
