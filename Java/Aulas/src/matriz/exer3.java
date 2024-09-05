package matriz;
import java.util.Scanner;
public class exer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notas[][] = new int[3][4];
		double medias[] = new double[3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print("Insira a "+(j+1)+"ª nota do "+(i+1)+"º aluno:");
				notas[i][j] = Integer.parseInt(sc.next());
				medias[i]+=notas[i][j];
			}
		}
		for (int i=0; i<3; i++) {
			System.out.println("Aluno "+(i+1)+" média: "+(medias[i]/4));
		}
		sc.close();
	}
}
