package vetor;
import java.util.Scanner;
public class exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ava[] = new int[5];
		double med=0;
		for (int i=0; i<5; i++) {
			System.out.print("Digite a avaliação do "+(i+1)+" produto:");
			ava[i] = Integer.parseInt(sc.next());
			med=med+ava[i];
		}
		System.out.print("Média das avaliações: "+med/5);
		sc.close();
	}
}
