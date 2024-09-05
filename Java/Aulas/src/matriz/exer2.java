package matriz;
import java.util.Scanner;
public class exer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String agenda[][] = new String[5][7];
		for (int i=0; i<5; i++) {
			for (int j=0; j<7; j++) {
				System.out.print("Descrição do "+(j+1)+" horario do "+(i+1)+" dia: ");
				agenda[i][j]=sc.next();
			}
		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<7; j++) {
				System.out.println("Dia "+(i+1)+", "+(j+1)+"º horario: "+agenda[i][j]);
			}
		}
		sc.close();
	}
}
