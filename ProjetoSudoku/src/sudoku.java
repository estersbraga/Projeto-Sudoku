import java.util.Scanner;

class sudoku {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("         JOGO SUDOKU     \n");
		System.out.println("Criado por: Ester Braga \n");
		
		int jogarNovamente, nivelDificuldade, linha, coluna, num;
		
		System.out.println("Qual seu nome?");
		String nome = scan.nextLine();
			
		do {
			System.out.printf("\n%s, o jogo possui três níveis de dificuldade. Em qual nível você deseja jogar? \n", nome);
	
			do {
				System.out.println("1. Facil");
				System.out.println("2. Médio");
				System.out.println("3. Difícil");
				nivelDificuldade = scan.nextInt();
	
				scan.nextLine();
	
				if (nivelDificuldade == 1) {
					System.out.println("\nVocê escolheu o nível fácil.\n");
	
					int[][] matrizFacil = { { 1, 0, 0 }, { 0, 2, 0 }, { 0, 0, 3 } };
	
					int[][] espelhoFacil = { { 1, 0, 0 }, { 0, 2, 0 }, { 0, 0, 3 } };
	
					do {
						System.out.println("     C1  C2  C3");
						exibirMatrizFacil(matrizFacil);
	
						System.out.println("\nQual linha deseja preencher? (Ex: 1)");
						linha = scan.nextInt();
	
						System.out.println("Qual coluna deseja preencher? (Ex: 1)");
						coluna = scan.nextInt();
	
						System.out.println("Informe um número de 1 à 9 para preencher: ");
						num = scan.nextInt();
						
						PosicaoValidaFacil(matrizFacil, espelhoFacil, linha, coluna, num);
						
					} while (continuarPreenchendo(matrizFacil));
					
					exibirMatrizFacil(matrizFacil);
					System.out.println("Parabéns, você finalizou! \n");
	
				} else if (nivelDificuldade == 2) {
					System.out.println("\nVocê escolheu o nível moderado. \n");
	
					int[][] matrizModerado = { { 0, 1, 0, 0, 5, 0 }, { 5, 0, 4, 2, 0, 0 }, { 0, 2, 0, 5, 0, 4 },
							{ 1, 0, 0, 0, 2, 0 }, { 0, 0, 1, 6, 0, 0 }, { 2, 0, 3, 0, 4, 5 } };
	
					int[][] espelhoModerado = { { 0, 1, 0, 0, 5, 0 }, { 5, 0, 4, 2, 0, 0 }, { 0, 2, 0, 5, 0, 4 },
							{ 1, 0, 0, 0, 2, 0 }, { 0, 0, 1, 6, 0, 0 }, { 2, 0, 3, 0, 4, 5 } };
					
					do {
						System.out.println("     C1  C2  C3     C4  C5  C6  ");
						exibirMatrizModerada(matrizModerado);
	
						System.out.println("\nQual linha deseja preencher? (Ex: 1)");
						linha = scan.nextInt();
	
						System.out.println("Qual coluna deseja preencher? (Ex: 1)");
						coluna = scan.nextInt();
	
						System.out.println("Informe um número de 1 à 9 para preencher:");
						num = scan.nextInt();
						
						PosicaoValida(matrizModerado, espelhoModerado, linha, coluna, num);
						
					
	
					} while (continuarPreenchendo(matrizModerado));
					
					exibirMatrizModerada(matrizModerado);
					System.out.println("Parabéns, você finalizou! \n");
	
				} else if (nivelDificuldade == 3) {
					System.out.println("\nVocê escolheu o nível difícil.");
	
					int[][] matrizDificil = { { 4, 5, 0, 9, 0, 0, 0, 0, 1 }, { 0, 0, 1, 4, 0, 0, 0, 0, 0 },
							{ 6, 0, 0, 0, 1, 0, 0, 0, 4 }, { 0, 0, 6, 7, 0, 0, 0, 0, 0 }, { 5, 0, 0, 0, 0, 0, 0, 0, 0 },
							{ 1, 0, 0, 0, 2, 4, 0, 6, 0 }, { 0, 0, 2, 0, 0, 0, 0, 3, 0 }, { 0, 0, 0, 0, 6, 2, 4, 0, 0 },
							{ 0, 4, 0, 0, 0, 5, 7, 0, 0 } };
	
					int[][] espelhoDificil = { { 4, 5, 0, 9, 0, 0, 0, 0, 1 }, { 0, 0, 1, 4, 0, 0, 0, 0, 0 },
							{ 6, 0, 0, 0, 1, 0, 0, 0, 4 }, { 0, 0, 6, 7, 0, 0, 0, 0, 0 }, { 5, 0, 0, 0, 0, 0, 0, 0, 0 },
							{ 1, 0, 0, 0, 2, 4, 0, 6, 0 }, { 0, 0, 2, 0, 0, 0, 0, 3, 0 }, { 0, 0, 0, 0, 6, 2, 4, 0, 0 },
							{ 0, 4, 0, 0, 0, 5, 7, 0, 0 } };
					
					do {
						System.out.println("     C1  C2  C3     C4  C5  C6     C7  C8  C9");
						exibirMatrizDificil(matrizDificil);
	
						System.out.println("Qual linha deseja preencher? (Ex: 1)");
						linha = scan.nextInt();
	
						System.out.println("Qual coluna deseja preencher? (Ex: 1)");
						coluna = scan.nextInt();
	
						System.out.println("Informe um número de 1 à 9 para preencher: ");
						num = scan.nextInt();
						
						PosicaoValida(matrizDificil, espelhoDificil, linha, coluna, num);
							
	
					} while (continuarPreenchendo(matrizDificil));
					
					exibirMatrizDificil(matrizDificil);
					System.out.println("Parabéns, você finalizou! \n");
	
				} else {
					System.out.println("\nNível selecionado inválido, escolha novamente.");
				}
	

	
			} while (nivelDificuldade != 1 && nivelDificuldade != 2 && nivelDificuldade != 3);
		
		System.out.println("Você deseja jogar novamente?");
		System.out.println("1. Sim \n2. Não");
		jogarNovamente = scan.nextInt();
		
		if(jogarNovamente == 1) {
			System.out.println("Que legal, vamos lá! \n");
		} else {
			System.out.println("Obrigada por jogar, até mais!");
		}
		
		} while(jogarNovamente == 1);
	}

	

	// MÉTODOS PARA EXIBIR O TABULEIRO:
	
	public static void exibirMatrizFacil(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("L%d - ", i + 1);
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public static void exibirMatrizModerada(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("L%d - ", i + 1);
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "   ");
				if (j == 2) {
					System.out.print("|  ");
				}
			}
			System.out.println();
			if (i == 2)
                System.out.print("     ------------------------\n");
		}
	}
	
	public static void exibirMatrizDificil(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("L%d - ", i + 1);
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "   ");
				if (j == 2 || j == 5) System.out.print("|  ");
	            }
	            System.out.println();
	            if (i == 2 || i == 5) {
	                System.out.print("     -------------------------------------\n");
	            }
	        }
	}
	//=======================================================================================================
	
	
	
	// MÉTODOS UTILIZADOS EM TODOS OS NÍVEIS: 
	
	
		// Verifica se a posição que o usuário quer preencher já estava pré-definido
		public static boolean verificarPosicao(int[][] e, int l, int c) {
			if (e[l - 1][c - 1] == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		// Verifica se existe o número que o usuário deseja colocar na mesma linha
		public static boolean verificarLinha(int [][]m, int l, int n) {
			for(int i = 0; i < m[l-1].length; i++) {
				if(m[l - 1][i] == n) {
					return true;
				}
			}
			return false;
		}
		
		// Verifica se existe o número que o usuário deseja colocar na mesma coluna
		public static boolean verificarColuna(int [][]m, int c, int n) {
			for(int i = 0; i < m.length; i++) {
				if(m[i][c - 1] == n) {
					return true;
				}
			}
			return false;
		}
		
		// Verifica se ainda há números zeros dentro do tabuleiro
		public static boolean continuarPreenchendo(int[][] m) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if (m[i][j] == 0) {
						return true;
					}
				}
			}
			return false;
		}
		
		//=====================================================================================
	
	
	
	// MÉTODOS ESPECIFICOS PARA O TABULEIRO FÁCIL: 
	
	// Verifica se existe o número que o usuário deseja colocar no quadrante
	public static boolean verificarQuadranteFacil(int[][] m, int n) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == n) {
					return false;
				}
			}
		}
		return true;
	}
	
	// Verifica todas as condições, informando se o local é válido e caso não, qual o problema encontrado
	public static void PosicaoValidaFacil(int [][]m, int [][]e, int l, int c, int n) {
		if(verificarPosicao(e,l,c) && !verificarLinha(m,l,n) && !verificarColuna(m,c,n) && verificarQuadranteFacil(m,n)) {
			m[l-1][c-1] = n;
		} else if (!verificarPosicao(e,l,c)){
			System.out.println("Essa posição já estava pré-definido, escolha outro número.\n");
		} else if (verificarLinha(m,l,n)) {
			System.out.println("Esse número já existe nessa linha, escolha outro número.\n");
		} else if (verificarColuna(m,c,n)) {
			System.out.println("Esse número já existe nessa coluna, escolha outro número.\n");
		} else if (!verificarQuadranteFacil(m,n)) {
			System.out.println("Esse número já existe no quadrante, escolha outro número.\n");
		}
		
	}
	//=======================================================================================================================

	
	
	
	// MÉTODOS ESPECIFICOS PARA OS TABULEIROS DE NÍVEIS MODERADO E DIFÍCIL:
	
	// Verifica todas as condições, informando se o local é válido e caso não, qual o problema encontrado
	public static void PosicaoValida(int [][]m, int [][] e, int l, int c, int n) {
		if(verificarPosicao(e,l,c) && !verificarLinha(m,l,n) && !verificarColuna(m,c,n) && !verificarQuadrante(m,l,c,n)) {
			m[l-1][c-1] = n;
		} else if (!verificarPosicao(e,l,c)){
			System.out.println("Esse posição já estava pré-definido, escolha outro número.\n");
		} else if (verificarLinha(m,l,n)) {
			System.out.println("Esse número já existe nessa linha, escolha outro número.\n");
		} else if (verificarColuna(m,c,n)) {
			System.out.println("Esse número já existe nessa coluna, escolha outro número.\n");
		} else if (verificarQuadrante(m,l,c,n)) {
			System.out.println("Esse número já existe no quadrante, escolha outro número.\n");
		}
		
	}
	
	// Verifica se existe o número que o usuário deseja colocar no quadrante
	public static boolean verificarQuadrante(int [][]m, int l, int c, int n) {
		int tamanhoMatriz = m.length;
        int raizMatriz = (int) Math.sqrt(tamanhoMatriz);

        int inicioLinha = raizMatriz * (l / raizMatriz);
        int inicioColuna = raizMatriz * (c / raizMatriz);
        
        int fimLinha = inicioLinha + raizMatriz;
        int fimColuna = inicioColuna + raizMatriz;

        for (int i = inicioLinha; i < fimLinha; i++) {
            for (int j = inicioColuna; j < fimColuna; j++) {
            	if(m[i][j] == n) {
            		return true;
            	}
            }
        }
        return false;
	}
}

	//=======================================================================================================
	