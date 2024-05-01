package aplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de Linhas");
		int row = sc.nextInt();
		
		System.out.printf("Digite a quantidade de Colunas: ");
		int column = sc.nextInt();
		
		int[][] mat = new int[row][column];
		
		for(int i = 0; i < mat.length; i++) {
			for(int u = 0; u < mat[i].length; u++) {
				System.out.println("Digite o numero da posição "+ (i+1) + ", "+ (u+1));
				mat[i][u] = sc.nextInt();
			}
		}
		boolean verify = true;
		
		do {
		
			System.out.println("Qual numero deseja procura na matriz? ");
			int numToSearch = sc.nextInt();
			boolean numExist = false;
			
			Integer up, right, down, left = null;
			
			for(int i = 0; i < mat.length; i++) {
				for(int u = 0; u < mat[i].length; u++) {
					
					System.out.print(mat[i][u] + " ");
									
				}
				System.out.println("");
			}
			
			for(int i = 0; i < mat.length; i++) {
				for(int u = 0; u < mat[i].length; u++) {
					if(mat[i][u] == numToSearch) {
						numExist = true;
						up = i - 1 >= 0 ? mat[i - 1][u]: null;
						down = i + 1 < mat.length ? mat[i + 1][u]: null;
						right = u + 1 < mat[i].length ? mat[i][u + 1] : null;
						left = u - 1 >= 0 ? mat[i][u - 1]: null;
						
						System.out.println(" ");
						System.out.println("Position: " + i + ","+u);
						if(left != null) {System.out.println("Left: "+left);}
						if(right != null){System.out.println("Right: " +right);}
						if(up != null) {System.out.println("Up: " +up);}
						if(down != null) {System.out.println("Down: "+down);}
						System.out.println(" ");
					}					
				}
			}
			
			if(!numExist) {
				System.out.println("Numero não existe na matriz");
			}
			
			numExist = false;
			
			
						
			System.out.println("Deseja continuar? "+
								"\n1 - Sim"+
					            "\n2 - Não");
			
			verify = sc.nextInt() == 1 ? true : false;
 		}while(verify);
		sc.close();
	}

}
