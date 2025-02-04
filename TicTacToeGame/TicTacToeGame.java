package TicTacToeGame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Board board;
    Deque<Player> players; //kyuki agar hamare pas n players hai to first wale ko remove karenge
    // aur usko last me daal denge

    public TicTacToeGame(){
        intializeGame();
        // we can make it dynamic
    }

    public void intializeGame(){
        // p1, p2,.. n players create karne hai
        // har player ko ek symbol assign karne honge, i.e, 
        // playingPiece (jiska hamne enum banake rakha hai)
        // board ko intialize karna hoga
        players = new LinkedList<>();
        board = new Board(3);

        PlayingPiece1 cross = new PlayingPiece1();
        Player player1 = new Player("Alice", cross);
        players.add(player1);

        PlayingPiece2 dot = new PlayingPiece2();
        Player player2 = new Player("Bob", dot);
        players.add(player2);
        
    }

    public String startGame(){
        // jabtak winner or sare cells khatm nai ho jate tab tak game chalta rahega
        // har step pe jis player ka turn hai usko ek (row, column) chunna hoga
        // (row, col) agar occupied hai already to error throw karna hoga
        // if (row, col) is not occupied then fill that place 
        // check if the players win, or all columns filled, then move to next player 
        boolean flag = true;
        while(flag)
        {
            Player p1 = players.getfirst();

            int n = board.size;
            boolean[][] vis = new boolean[n][n];
            for(int i=0; i<n; i++){
                for(int j=0;j<n; j++){
                    vis[i][j] = false;
                }
            }
  
            if(!checkEmptyCell()){
                flag = false;
                break;
            }

            Scanner sc = new Scanner(System.in);

            System.out.print(p1.name + ", Please enter the row: ");
            int row = sc.nextInt();
            System.out.println();
            System.out.print("Now, enter the column: ");
            int col = sc.nextInt();
            System.out.println();

            if(Occupied(row, col, p1)){
                
                // throw error 
            }

            // fill the (row, col) with that pieceType

            players.pollFirst();
            players.add(p1);
        }
        return "tie";
    }

    public boolean isTheirWinner(int row, int col, PieceType pieceType){

        return false;
    }

}
