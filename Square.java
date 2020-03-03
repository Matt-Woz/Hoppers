import javax.swing.*;

public class Square
{
    private int x,y;
    private JButton Button;

    public JButton getButton() {
        return Button;
    }

    public Square(int x, int y, String image) {
        this.x = x;
        this.y = y;
        ImageIcon I = new ImageIcon(image+".png");
        Button = new JButton(I);
        Button.setIcon(I);

    }
}