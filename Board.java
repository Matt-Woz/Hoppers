import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Board implements ActionListener {
    Square[] greenFrogs = new Square[5];
    Square[] redFrog = new Square[1];
    boolean redFrogSelected = false;
    boolean greenFrogSelected = false;
    JButton selectedFrog = new JButton();

    public Board() {
        JFrame Hoppers = new JFrame("Hoppers");
        JPanel panel = new JPanel();
        GridLayout Layout = new GridLayout(5, 5);
        panel.setLayout(Layout);
        Hoppers.setSize(750, 750);
        Hoppers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hoppers.setResizable(false);
        Square Square1 = new Square(1, 1, "LilyPad", this);
        Square Square2 = new Square(2, 1, "Water", this);
        Square Square3 = new Square(3, 1, "LilyPad", this);
        Square Square4 = new Square(4, 1, "Water", this);
        Square Square5 = new Square(5, 1, "LilyPad", this);
        Square Square6 = new Square(1, 2, "Water", this);
        Square Square7 = new Square(2, 2, "GreenFrog", this);
        Square Square8 = new Square(3, 2, "Water", this);
        Square Square9 = new Square(4, 2, "GreenFrog", this);
        Square Square10 = new Square(5, 2, "Water", this);
        Square Square11 = new Square(1, 3, "LilyPad", this);
        Square Square12 = new Square(2, 3, "Water", this);
        Square Square13 = new Square(3, 3, "GreenFrog", this);
        Square Square14 = new Square(1, 3, "Water", this);
        Square Square15 = new Square(1, 3, "LilyPad", this);
        Square Square16 = new Square(1, 3, "Water", this);
        Square Square17 = new Square(1, 3, "LilyPad", this);
        Square Square18 = new Square(1, 3, "Water", this);
        Square Square19 = new Square(1, 3, "LilyPad", this);
        Square Square20 = new Square(1, 3, "Water", this);
        Square Square21 = new Square(1, 3, "GreenFrog", this);
        Square Square22 = new Square(1, 3, "Water", this);
        Square Square23 = new Square(1, 3, "RedFrog", this);
        Square Square24 = new Square(1, 3, "Water", this);
        Square Square25 = new Square(1, 3, "GreenFrog", this);
        Square[] grid = new Square[25];
        grid[0] = Square1;
        grid[1] = Square2;
        grid[2] = Square3;
        grid[3] = Square4;
        grid[4] = Square5;
        grid[5] = Square6;
        grid[6] = Square7;
        grid[7] = Square8;
        grid[8] = Square9;
        grid[9] = Square10;
        grid[10] = Square11;
        grid[11] = Square12;
        grid[12] = Square13;
        grid[13] = Square14;
        grid[14] = Square15;
        grid[15] = Square16;
        grid[16] = Square17;
        grid[17] = Square18;
        grid[18] = Square19;
        grid[19] = Square20;
        grid[20] = Square21;
        grid[21] = Square22;
        grid[22] = Square23;
        grid[23] = Square24;
        grid[24] = Square25;
        greenFrogs[0] = Square7;
        greenFrogs[1] = Square9;
        greenFrogs[2] = Square13;
        greenFrogs[3] = Square21;
        greenFrogs[4] = Square25;
        redFrog[0] = Square23;
        Square[] lilyPads = new Square[13];
        lilyPads[0] = Square1;
        lilyPads[1] = Square3;
        lilyPads[2] = Square5;
        lilyPads[3] = Square11;
        lilyPads[4] = Square15;
        lilyPads[5] = Square17;
        lilyPads[6] = Square19;
        for (int i = 0; i < 25; i++) {
            panel.add(grid[i].getButton());
        }
        Hoppers.setContentPane(panel);
        Hoppers.setVisible(true);
    }

    private boolean redFrogSelected(ImageIcon I) {
        if (greenFrogSelected == true) {
            greenFrogUnselected();
        }
        redFrog[0].getButton().setIcon(I);
        redFrogSelected = true;
        System.out.println("redFrogSelected = true");
        return redFrogSelected;
    }

    private void redFrogUnselected() {
        ImageIcon C = new ImageIcon("RedFrog.png");
        redFrogSelected = false;
        redFrog[0].getButton().setIcon(C);
        System.out.println("redFrogSelected = false");
    }

    private boolean greenFrogSelected(ImageIcon A, ActionEvent e)
    {
        if (redFrogSelected == true || greenFrogSelected == true) {
            redFrogUnselected();
            greenFrogUnselected();
        }
        for (int x = 0; x < 5; x++)
        {
            if (e.getSource() == greenFrogs[x].getButton())
            {
                selectedFrog = (JButton) e.getSource();
            }
        }

        selectedFrog.setIcon(A);
        greenFrogSelected = true;
        System.out.println("greenFrogSelected = true");
        return greenFrogSelected;
    }
    private void greenFrogUnselected()
    {
        ImageIcon B = new ImageIcon("GreenFrog.png");
            {
                selectedFrog.setIcon(B);
                greenFrogSelected = false;
                System.out.println("i hate my life ");
            }
    }

    public void actionPerformed(ActionEvent e)
    {
        ImageIcon I=new ImageIcon("RedFrog2.png");
        ImageIcon A = new ImageIcon("GreenFrog2.png");
        JButton button=(JButton)e.getSource();
        for (int i = 0; i<5; i++)
        {
            if (e.getSource() == greenFrogs[i].getButton())
            {
                greenFrogSelected = true;
            }
        }
        if (e.getSource() == redFrog[0].getButton())
        {
            redFrogSelected(I);
        }
        else if (greenFrogSelected == true)
        {
            greenFrogSelected(A, e);
        }

        }

       

    }