package matriz;
import java.util.Scanner;
public class exer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome[] = new String[4];
		int venda[][] = new int[4][4], prod[] = new int[4], semana[] = new int[4];
		for (int i=0; i<4; i++) {
			System.out.print("Digite o nome do "+(i+1)+" produto: ");
			nome[i]=sc.next();
			for (int j=0; j<4; j++) {
				System.out.print("Digite a quantidade de vendas do "+(i+1)+" produto na semana "+(j+1)+": ");
				venda[i][j]=Integer.parseInt(sc.next());
				prod[i]+=venda[i][j];
			}
		}
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				semana[i]+=venda[j][i];
			}
		}
		for (int i=0; i<4; i++) {
			System.out.println("Semana "+(i+1)+" foram vendidos "+semana[i]+" produtos");
			System.out.println("Produto: "+ nome[i]+" foram vendidos: "+prod[i]);
		}
		sc.close();	
	}
}