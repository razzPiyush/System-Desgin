package TicTacToeGame;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Board {
    int size;
    PlayingPiece[][] board; // 2-d array of playingPieces

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){

        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        return freeCells;
    }

    public void printBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(){
                    System.out.print(playingPiece);
                }
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}
