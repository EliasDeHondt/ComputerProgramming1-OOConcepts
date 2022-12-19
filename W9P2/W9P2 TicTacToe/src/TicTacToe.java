import java.util.Objects;
import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 27/11/2022
 */
public class TicTacToe {
    // Attributen
    private final Scanner key = new Scanner(System.in);
    private final String[][] board;
    private String playerName1;
    private String winnerName;
    private String playerName2;
    // Constructors
    public TicTacToe() {
        board = new String[3][3];
    }
    // Methode
    public void start() {
        System.out.print(
                """
                ╔════════════════════════════╗
                ║ Welcome to 3x3 Tic Tac Toe.║
                ╠════════════════════════════╝
                ╠[1 Play new game⌛]
                ╠[2 Settings🔧]
                ╠[3 Exit❌]
                ║
                """);
        System.out.print("╠➤ ");
        switch (key.nextInt()) {
            case 1 -> this.playNewGame();
            case 2 -> this.settings();
            case 3 -> System.exit(0);
        }
    }
    public void playNewGame() {
        System.out.print("║\n╠[(x) Name of player one]➤ ");
        this.playerName1 = key.next();
        System.out.print("║\n╠[(o) Name of player two]➤ ");
        this.playerName2 = key.next();
        this.createMap();
        this.printMap();
        this.play();
    }
    public void settings() {
        System.out.print("║\n╚[There are no settings it is F*** Tic Tac Toe :-)]");
        System.exit(0);
    }
    public void createMap() {
        this.board[0][0] = "1";
        this.board[0][1] = "2";
        this.board[0][2] = "3";
        this.board[1][0] = "4";
        this.board[1][1] = "5";
        this.board[1][2] = "6";
        this.board[2][0] = "7";
        this.board[2][1] = "8";
        this.board[2][2] = "9";
    }
    public void printMap() {
        System.out.printf(
                """
                ║
                ╠═════╦═════╦═════╗
                ║  %s  ║  %s  ║  %s  ║
                ╠═════╬═════╬═════╣
                ║  %s  ║  %s  ║  %s  ║
                ╠═════╬═════╬═════╣
                ║  %s  ║  %s  ║  %s  ║
                ╠═════╩═════╩═════╝
                 """
                , this.board[0][0], this.board[0][1], this.board[0][2]
                , this.board[1][0], this.board[1][1], this.board[1][2]
                , this.board[2][0], this.board[2][1], this.board[2][2]);
    }
    public void play() {
        // AnswerX
        System.out.print("║\n╠[x]➤ ");
        String answerX = key.next();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Objects.equals(this.board[i][j], answerX)) {
                    this.board[i][j] = "x".toLowerCase();
                }
            }
        }
        if (this.checkWinner()) this.winner();
        this.printMap();
        // AnswerO
        System.out.print("║\n╠[o]➤ ");
        String answerO = key.next();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Objects.equals(this.board[i][j], answerO)) {
                    this.board[i][j] = "o".toLowerCase();
                }
            }
        }
        if (this.checkWinner()) this.winner();
        this.printMap();
        this.play();
    }
    public boolean checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = switch (i) {
                // From left to right, from right to left.
                case 0 -> board[0][0] + board[0][1] + board[0][2];
                case 1 -> board[1][0] + board[1][1] + board[1][2];
                case 2 -> board[2][0] + board[2][1] + board[2][2];
                // From top to bottom from bottom to top.
                case 3 -> board[0][0] + board[1][0] + board[2][0];
                case 4 -> board[0][1] + board[1][1] + board[2][1];
                case 5 -> board[0][2] + board[1][2] + board[2][2];
                // From top right to bottom left from top left to bottom right and vice versa.
                case 6 -> board[0][0] + board[1][1] + board[2][2];
                case 7 -> board[0][2] + board[1][1] + board[2][0];
                default -> "";
            };
            //For X winner
            if (line.equals("xxx")) {
                this.winnerName = this.playerName1;
                return true;
            }
            // For O winner
            else if (line.equals("ooo")) {
                this.winnerName = this.playerName2;
                return true;
            } else if (!Objects.equals(this.board[0][0], "1") && !Objects.equals(this.board[0][1], "2") && !Objects.equals(this.board[0][2], "3") &&
                        !Objects.equals(this.board[1][0], "4") && !Objects.equals(this.board[1][1], "5") && !Objects.equals(this.board[1][2], "6") &&
                        !Objects.equals(this.board[2][0], "7") && !Objects.equals(this.board[2][1], "8") && !Objects.equals(this.board[2][2], "9")) {
                this.draw();
            }
        }
        return false;
    }
    public void winner() {
        this.printMap();
        System.out.printf(
                """
                ║
                ╚[Congratulations %s you have won🤙]
                """, this.winnerName);
        System.exit(0);
    }
    public void draw() {
        this.printMap();
        System.out.printf(
                """
                ║
                ╚[It's a draw between %s and %s]
                """, this.playerName1,this.playerName2);
        System.exit(0);
    }
}