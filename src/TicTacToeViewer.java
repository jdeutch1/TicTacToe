import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {

    //need to edit these
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 300;

    private TicTacToe t;
    // TODO: Complete this class

    //Display winner
    //Draw axis

    public TicTacToeViewer(TicTacToe t){
        this.t = t;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // the graphics window.
        this.setTitle("TIC TAC TOE");
        this.setSize(500, 300);
        this.setVisible(true);

    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);

        Square[][] tBoard = t.getBoard();
        for(int i = 0; i < tBoard.length; i++){
            for (int j = 0; j < tBoard.length; j++){
                tBoard[i][j].draw(g);
            }
        }
    }
}
