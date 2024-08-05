import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] tabuleiro = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        showTable(tabuleiro);

        boolean endGame = false;
        int turn = 0;
        while (!endGame) {


            int choose = 0;

            if (turn == 0) {
                System.out.println("Vez do jogador X");
                choose = sc.nextInt();
            } else if (turn == 1) {
                System.out.println("Vez do jogador O");
                choose = sc.nextInt();
            }

            tabuleiro = setMove(choose, turn, tabuleiro);

            showTable(tabuleiro);
            endGame = verifyWinner(tabuleiro, choose);

            if (endGame) {
                if (turn == 0) {
                    System.out.println("JOGADOR X GANHOU");
                } else if (turn == 1) {
                    System.out.println("JOGADOR O GANHOU");
                } else {
                    System.out.println("TIVEMOS UM EMPATE");
                }
            }

            if (!endGame) {
                boolean v = false;
                for (int i = 0; i < tabuleiro.length; i++) {
                    for (int j = 0; j < tabuleiro[i].length; j++) {
                        if (tabuleiro[i][j] != "X" && tabuleiro[i][j] != "O") {
                            v = true;
                        }
                    }
                }

                if (!v) {
                    endGame = true;
                    turn = -1;
                }

            }



            turn = turn == 0 ? 1 : 0;
        }

        sc.close();

    }

    public static boolean verifyWinner(String[][] table, int move) {

        switch (move) {
            case 1:
                if (table[0][0] == table[0][1]) {
                    if (table[0][0] == table[0][2]) {
                        return true;
                    }
                } else if (table[0][0] == table[1][0]) {
                    if (table[0][0] == table[2][0]) {
                        return true;
                    }
                } else if (table[0][0] == table[1][1]) {
                    if (table[0][0] == table[2][2]) {
                        return true;
                    }
                }
                break;
            case 2:
                if (table[0][0] == table[0][1]) {
                    if (table[0][0] == table[0][2]) {
                        return true;
                    }
                } else if (table[0][1] == table[1][1]) {
                    if (table[0][1] == table[2][1]) {
                        return true;
                    }
                }
                break;
            case 3:
                if (table[0][0] == table[0][1]) {
                    if (table[0][0] == table[0][2]) {
                        return true;
                    }
                } else if (table[0][2] == table[1][2]) {
                    if (table[0][2] == table[2][2]) {
                        return true;
                    }
                } else if (table[0][2] == table[1][1]) {
                    if (table[0][2] == table[2][0]) {
                        return true;
                    }
                }
                break;
            case 4:
                if (table[1][0] == table[1][1]) {
                    if (table[1][0] == table[1][2]) {
                        return true;
                    }
                } else if (table[0][0] == table[1][0]) {
                    if (table[0][0] == table[2][0]) {
                        return true;
                    }
                }
                break;
            case 5:
                if (table[1][0] == table[1][1]) {
                    if (table[1][0] == table[1][2]) {
                        return true;
                    }
                } else if (table[0][1] == table[1][1]) {
                    if (table[0][1] == table[2][1]) {
                        return true;
                    }
                } else if (table[0][0] == table[1][1]) {
                    if (table[0][0] == table[2][2]) {
                        return true;
                    }
                } else if (table[0][2] == table[1][1]) {
                    if (table[0][2] == table[2][0]) {
                        return true;
                    }
                }
                break;
            case 6:
                if (table[1][0] == table[1][1]) {
                    if (table[1][0] == table[1][2]) {
                        return true;
                    }
                } else if (table[0][2] == table[1][2]) {
                    if (table[0][2] == table[2][2]) {
                        return true;
                    }
                }
                break;
            case 7:
                if (table[2][0] == table[2][1]) {
                    if (table[2][0] == table[2][2]) {
                        return true;
                    }
                } else if (table[0][0] == table[1][0]) {
                    if (table[0][0] == table[2][0]) {
                        return true;
                    }
                } else if (table[0][2] == table[1][1]) {
                    if (table[0][2] == table[2][0]) {
                        return true;
                    }
                }
                break;
            case 8:
                if (table[2][0] == table[2][1]) {
                    if (table[2][0] == table[2][2]) {
                        return true;
                    }
                } else if (table[0][1] == table[1][1]) {
                    if (table[0][1] == table[2][1]) {
                        return true;
                    }
                }
                break;
            case 9:
                if (table[2][0] == table[2][1]) {
                    if (table[2][0] == table[2][2]) {
                        return true;
                    }
                } else if (table[0][2] == table[1][2]) {
                    if (table[0][2] == table[2][2]) {
                        return true;
                    }
                } else if (table[0][0] == table[1][1]) {
                    if (table[0][0] == table[2][2]) {
                        return true;
                    }
                }
                break;

        }

        return false;
    }

    public static String[][] setMove(int choose, int turn, String[][] table) {
        String player;

        switch (turn) {
            case 0:
                player = "X";
                break;
            case 1:
                player = "O";
                break;
            default:
                return table;
        }

        switch (choose) {
            case 1:
                table[0][0] = table[0][0] == "1" ? player : null;
                break;
            case 2:
                table[0][1] = table[0][1] == "2" ? player : null;
                break;
            case 3:
                table[0][2] = table[0][2] == "3" ? player : null;
                break;
            case 4:
                table[1][0] = table[1][0] == "4" ? player : null;
                break;
            case 5:
                table[1][1] = table[1][1] == "5" ? player : null;
                break;
            case 6:
                table[1][2] = table[1][2] == "6" ? player : null;
                break;
            case 7:
                table[2][0] = table[2][0] == "7" ? player : null;
                break;
            case 8:
                table[2][1] = table[2][1] == "8" ? player : null;
                break;
            case 9:
                table[2][2] = table[2][2] == "9" ? player : null;
                break;

        }

        return table;
    }


    public static void showTable(String[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {

                if (j == 1 || j == 2) {
                    System.out.print("|");
                }

                System.out.print(tabuleiro[i][j]);

            }
            System.out.println();
        }
    }


}