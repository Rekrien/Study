package matriz;
import java.util.Scanner;
public class exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inv[][] = new int[4][3], qt[] = new int[3];
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Armazen "+(i+1)+" produto "+(j+1)+": ");
				inv[i][j]=Integer.parseInt(sc.next());
			}
		}
		for (int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				qt[i]+=inv[j][i];
			}
		}
		for (int i=0; i<3; i++) {
			System.out.println((i+1)+"º produto: "+qt[i]);
		}
		sc.close();
	}
}
