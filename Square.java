import javax.swing.*;

/**
 * This Class holds the square constructor and some accessor methods
 */

public class Square
{
    /**Used for the positions of squares*/
    private int x,y;
    /**Creates button for squares*/
    private JButton Button;

    /**
     * Accessor method for buttons
     * @return Button
     */
    public JButton getButton() 
    {
        return Button;
    }

    /**
     *Constructor for squares
     * @param x x location of square
     * @param y y location of square
     * @param image Image icon of the square
     * @param board Specifies the board the square is on
     */
    public Square(int x, int y, String image, Board board) {
        this.x = x;
        this.y = y;
        ImageIcon I = new ImageIcon(image+".png");
        Button = new JButton(I);
        Button.setIcon(I);
        Button.addActionListener(board);
    }

    /**
     * Accessor method for the x 'coordinate'
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Accessor method for the y 'coordinate'
     * @return x
     */
    public int getY() {
        return y;
    }
}