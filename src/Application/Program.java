package Application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();


        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.println("target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.PerformChessMove(source,target);
        }
    }

}
