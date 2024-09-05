package vetor;
import java.util.Scanner;
public class exer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lista[] = new String[8];
		for (int i=0; i<8; i++) {
			System.out.print("Digite o "+(i+1)+" item da lista: ");
			lista[i] = sc.next();
		}
		for (int i=0; i<8; i++) {
			System.out.println("Item "+(i+1)+": "+lista[i]);
		}
		sc.close();
	}
}
