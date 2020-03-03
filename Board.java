import javax.swing.*;
import java.awt.*;

public class Board
{
    public static void main( String[] args )
    {
        JFrame Hoppers = new JFrame("Hoppers");
        JPanel panel = new JPanel();
        GridLayout Layout = new GridLayout(5, 5);
        panel.setLayout(Layout);
        Hoppers.setSize(700, 700);
        Hoppers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hoppers.setResizable(false);
        Square Square1 = new Square(1, 1, "Water");
        Square Square2 = new Square(2, 1, "Water");
        Square Square3 = new Square(3, 1, "Water");
        Square Square4 = new Square(4, 1, "Water");
        Square Square5 = new Square(5, 1, "Water");
        Square Square6 = new Square(1, 2, "Water");
        Square Square7 = new Square(2, 2, "Water");
        Square Square8 = new Square(3, 2, "Water");
        Square Square9 = new Square(4, 2, "Water");
        Square Square10 = new Square(5, 2, "Water");
        Square Square11 = new Square(1, 3, "Water");
        Square Square12 = new Square(2, 3, "Water");
        Square Square13 = new Square(3, 3, "Water");
        Square Square14 = new Square(1, 3, "Water");
        Square Square15 = new Square(1, 3, "Water");
        Square Square16 = new Square(1, 3, "Water");
        Square Square17 = new Square(1, 3, "Water");
        Square Square18 = new Square(1, 3, "Water");
        Square Square19 = new Square(1, 3, "Water");
        Square Square20 = new Square(1, 3, "Water");
        Square Square21 = new Square(1, 3, "Water");
        Square Square22 = new Square(1, 3, "Water");
        Square Square23 = new Square(1, 3, "Water");
        Square Square24 = new Square(1, 3, "Water");
        Square Square25 = new Square(1, 3, "Water");
        Square[] water = new Square[25];
        water[0] = Square1;
        water[1] = Square2;
        water[2] = Square3;
        water[3] = Square4;
        water[4] = Square5;
        water[5] = Square6;
        water[6] = Square7;
        water[7] = Square8;
        water[8] = Square9;
        water[9] = Square10;
        water[10] = Square11;
        water[11] = Square12;
        water[12] = Square13;
        water[13] = Square14;
        water[14] = Square15;
        water[15] = Square16;
        water[16] = Square17;
        water[17] = Square18;
        water[18] = Square19;
        water[19] = Square20;
        water[20] = Square21;
        water[21] = Square22;
        water[22] = Square23;
        water[23] = Square24;
        water[24] = Square25;

        panel.add(Square1.getButton());
        for(int i = 0; i < 25; i++)
        {
            panel.add(water[i].getButton());
        }
        Hoppers.setContentPane(panel);
        Hoppers.setVisible(true);





    }
}