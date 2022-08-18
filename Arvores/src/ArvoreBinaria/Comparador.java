package ArvoreBinaria;

public class Comparador {
	public int comparar(Object a, Object b) {
		int a1 = (int) a;
		int b1 = (int) b;
		if(a1>b1)return 1;
		if(a1<b1)return -1;
		return 0;
	}
}
