package TAD_Vetor;

public class main {

	public static void main(String[] args) {
		VetorArray v = new VetorArray(2);
		
		System.out.println("\n------------[Vetor Array]------------");
		System.out.println("InsertAtRank():");
		for(int i=0; i<5; i++) {
			v.insertAtRank(i,i+1);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(v.elementAtRank(i));
		}
		
		System.out.println("------------------------");
		System.out.println("ReplaceAtRank():");
		
		for(int i=0; i<5; i++) {
			v.replaceAtRank(i,i*2);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(v.elementAtRank(i));
		}
		
		System.out.println("------------------------");
		System.out.println("removeAtRank():");
		
		for(int i=0; i<5; i++) {
			System.out.println(v.removeAtRank(0));
		}
		
		System.out.println("------------------------");
		
		System.out.println("size():"+v.size());
		
		
		System.out.println("\n------------[Vetor LDE]------------");
		System.out.println("InsertAtRank():");
		VetorLDE vl = new VetorLDE();
		
		for(int i=0; i<5; i++) {
			vl.insertAtRank(i,i+1);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(vl.elementAtRank(i));
		}
		
		System.out.println("------------------------");
		System.out.println("ReplaceAtRank():");
		for(int i=0; i<5; i++) {
			vl.replaceAtRank(i,i*2);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(vl.elementAtRank(i));
		}
		
		System.out.println("------------------------");
		System.out.println("ReplaceAtRank():");
		for(int i=0; i<5; i++) {
			System.out.println(vl.removeAtRank(0));
		}
		
		System.out.println("------------------------");
		System.out.println("size():"+vl.size());
		
		
		
		

	}

}
