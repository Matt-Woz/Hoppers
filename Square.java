import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Square
{
    private int x,y;
    private JButton Button;

    public JButton getButton() 
    {
        return Button;
    }
    public Square(int x, int y, String image, Board board) {
        this.x = x;
        this.y = y;
        ImageIcon I = new ImageIcon(image+".png");
        Button = new JButton(I);
        Button.setIcon(I);
        Button.addActionListener(board);

    }
    public void setImageIcon(String image)
    {
        ImageIcon I = new ImageIcon(image+".png");
        Button.setIcon(I);
    }
    
}