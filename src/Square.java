import javax.swing.*;
import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;

    private  final int START_ROW = 100;
    private final int START_COL = 200;
    private final int BOARD_LENGTH = 600;
    private int row;
    private int col;
    private Image xImage;
    private Image oImage;
    private boolean isWinningSquare;

    private TicTacToeViewer observer;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeViewer observer) {
        this.row = row;
        this.col = col;

        this.observer = observer;

        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;

        xImage = new ImageIcon("Resources/X.png").getImage();
        oImage = new ImageIcon("Resources/O.png").getImage();
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }

    //Starting x and y, width and height
    //Top left corner
    //draw rect
    //imageobserver is view
    int x = START_ROW + (row+1) * BOARD_LENGTH/3;
    int y = START_COL + (col+1) * BOARD_LENGTH/3;
    public void draw(Graphics g){
        if(isWinningSquare)
        {
            g.setColor(Color.GREEN);
            g.fillRect(x, y, BOARD_LENGTH/3, BOARD_LENGTH/3);
        }
        if (marker.equals(TicTacToe.O_MARKER)){
            g.drawImage(oImage, x, y, BOARD_LENGTH/3, BOARD_LENGTH/3, observer);
        }
        else if (marker.equals(TicTacToe.X_MARKER)) {
            g.drawImage(xImage, x, y, BOARD_LENGTH/3, BOARD_LENGTH/3, observer);
        }


    }
}
