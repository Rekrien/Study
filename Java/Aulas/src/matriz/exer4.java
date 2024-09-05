package matriz;
import java.util.Scanner;
public class exer4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int table[][] = new int[3][3], qt[] = new int[3];
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				while(true) {
					System.out.print("Digite o código do terreno: ");
					table[i][j]=Integer.parseInt(sc.next());
					if (table[i][j]==1) {
						qt[0]+=1;
						break;
					}
					else if(table[i][j]==2) {
						qt[1]+=1;
						break;
					}
					else if(table[i][j]==3) {
						qt[2]+=1;
						break;
					}
					else {
						System.out.println("Código inválido");
					}
				}
			}
		}
		System.out.print("Água: "+qt[0]+"\nFloresta: "+qt[1]+"\nMontanha: "+qt[2]);
		sc.close();
	}
}
