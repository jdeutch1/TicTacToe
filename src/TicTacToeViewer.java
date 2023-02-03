import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {

    private  final int START_ROW = 50;
    private final int START_COL = 50;
    private final int BOARD_LENGTH = 300;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private Square[][] tBoard;
    private TicTacToe t;
    public TicTacToeViewer(TicTacToe t){
        this.t = t;
        tBoard = t.getBoard();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // the graphics window.
        this.setTitle("TIC TAC TOE");
        this.setSize(500, 300);
        this.setVisible(true);

    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);

        for(int i = 0; i < tBoard.length; i++){
            for (int j = 0; j < tBoard.length; j++){
                tBoard[i][j].draw(g);
            }
        }

        g.setFont(new Font("Verdana", Font.PLAIN, 18));
        g.setColor(Color.RED);

        for(int i = 0; i < 3; i++)
        {
            g.drawString(String.valueOf(i), START_COL + 70, START_ROW + BOARD_LENGTH/6 + BOARD_LENGTH/3 * (i+1));
        }

        for(int i = 0; i < 3; i++)
        {
            g.drawString(String.valueOf(i),START_COL + BOARD_LENGTH/6 + BOARD_LENGTH/3 * (i+1), START_ROW + 80);
        }

        t.draw(g);
    }
}
