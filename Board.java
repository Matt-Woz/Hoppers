import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board implements ActionListener {
    JFrame Hoppers = new JFrame("Hoppers");
    private ArrayList<Square> greenFrogs = new ArrayList<>();
    public JPanel panel = new JPanel();
    Square[] redFrog = new Square[1];
    Square[] lilyPads = new Square[13];
    boolean redFrogSelected = false;
    boolean greenFrogSelected = false;
    boolean lilyPadSelected = false;
    JButton selectedFrog = new JButton();
    JButton selectedLilyPad = new JButton();
    int lilyPadCount;
    int greenFrogCount;
    Square[] grid = new Square[25];
    boolean Menu = true;
    JButton Level1 = new JButton();
    JButton Level2 = new JButton();
    JButton Level3 = new JButton();
    JButton Level4 = new JButton();

    public Board() {
        Hoppers.setSize(750, 750);
        Hoppers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hoppers.setResizable(false);
        Level1.setVisible(true);
        Level2.setVisible(true);
        Level3.setVisible(true);
        Level4.setVisible(true);
        Level1.setText("Level 1");
        Level2.setText("Level 2");
        Level3.setText("Level 3");
        Level4.setText("Level 4");
        Level1.setPreferredSize(new Dimension(300, 300));
        Level2.setPreferredSize(new Dimension(300, 300));
        Level3.setPreferredSize(new Dimension(300, 300));
        Level4.setPreferredSize(new Dimension(300, 300));
        panel.add(Level1);
        panel.add(Level2);
        panel.add(Level3);
        panel.add(Level4);
        Level1.addActionListener(this);
        Level2.addActionListener(this);
        Level3.addActionListener(this);
        Level4.addActionListener(this);
        Hoppers.setContentPane(panel);
        Hoppers.setVisible(true);
    }

    private void renderLevel1() {
        panel.remove(Level1);
        panel.remove(Level2);
        panel.remove(Level3);
        panel.remove(Level4);
        lilyPadCount = 7;
        greenFrogCount = 5;
        GridLayout Layout = new GridLayout(5, 5);
        panel.setLayout(Layout);
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
        Square Square14 = new Square(4, 3, "Water", this);
        Square Square15 = new Square(5, 3, "LilyPad", this);
        Square Square16 = new Square(1, 4, "Water", this);
        Square Square17 = new Square(2, 4, "LilyPad", this);
        Square Square18 = new Square(3, 4, "Water", this);
        Square Square19 = new Square(4, 4, "LilyPad", this);
        Square Square20 = new Square(5, 4, "Water", this);
        Square Square21 = new Square(1, 5, "GreenFrog", this);
        Square Square22 = new Square(2, 5, "Water", this);
        Square Square23 = new Square(3, 5, "RedFrog", this);
        Square Square24 = new Square(4, 5, "Water", this);
        Square Square25 = new Square(5, 5, "GreenFrog", this);
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
        greenFrogs.add(0, Square7);
        greenFrogs.add(1, Square9);
        greenFrogs.add(2, Square13);
        greenFrogs.add(3, Square21);
        greenFrogs.add(4, Square25);
        redFrog[0] = Square23;
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
        Hoppers.setVisible(true);
    }

    private void renderLevel2(){
        panel.remove(Level1);
        panel.remove(Level2);
        panel.remove(Level3);
        panel.remove(Level4);
        lilyPadCount = 6;
        greenFrogCount = 6;
        GridLayout Layout = new GridLayout(5, 5);
        panel.setLayout(Layout);
        Square Square1 = new Square(1, 1, "LilyPad", this);
        Square Square2 = new Square(2, 1, "Water", this);
        Square Square3 = new Square(3, 1, "LilyPad", this);
        Square Square4 = new Square(4, 1, "Water", this);
        Square Square5 = new Square(5, 1, "GreenFrog", this);
        Square Square6 = new Square(1, 2, "Water", this);
        Square Square7 = new Square(2, 2, "GreenFrog", this);
        Square Square8 = new Square(3, 2, "Water", this);
        Square Square9 = new Square(4, 2, "GreenFrog", this);
        Square Square10 = new Square(5, 2, "Water", this);
        Square Square11 = new Square(1, 3, "LilyPad", this);
        Square Square12 = new Square(2, 3, "Water", this);
        Square Square13 = new Square(3, 3, "GreenFrog", this);
        Square Square14 = new Square(4, 3, "Water", this);
        Square Square15 = new Square(5, 3, "LilyPad", this);
        Square Square16 = new Square(1, 4, "Water", this);
        Square Square17 = new Square(2, 4, "GreenFrog", this);
        Square Square18 = new Square(3, 4, "Water", this);
        Square Square19 = new Square(4, 4, "LilyPad", this);
        Square Square20 = new Square(5, 4, "Water", this);
        Square Square21 = new Square(1, 5, "GreenFrog", this);
        Square Square22 = new Square(2, 5, "Water", this);
        Square Square23 = new Square(3, 5, "LilyPad", this);
        Square Square24 = new Square(4, 5, "Water", this);
        Square Square25 = new Square(5, 5, "RedFrog", this);
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
        greenFrogs.add(0, Square5);
        greenFrogs.add(1, Square7);
        greenFrogs.add(2, Square9);
        greenFrogs.add(3, Square13);
        greenFrogs.add(4, Square17);
        greenFrogs.add(5, Square21);
        redFrog[0] = Square25;
        lilyPads[0] = Square1;
        lilyPads[1] = Square3;
        lilyPads[2] = Square11;
        lilyPads[3] = Square15;
        lilyPads[4] = Square19;
        lilyPads[5] = Square23;
        for (int i = 0; i < 25; i++) {
            panel.add(grid[i].getButton());
        }
        Hoppers.setVisible(true);
    }
    private void renderLevel3()
    {
        panel.remove(Level1);
        panel.remove(Level2);
        panel.remove(Level3);
        panel.remove(Level4);
        lilyPadCount = 6;
        greenFrogCount = 6;
        GridLayout Layout = new GridLayout(5, 5);
        panel.setLayout(Layout);
        Square Square1 = new Square(1, 1, "LilyPad", this);
        Square Square2 = new Square(2, 1, "Water", this);
        Square Square3 = new Square(3, 1, "GreenFrog", this);
        Square Square4 = new Square(4, 1, "Water", this);
        Square Square5 = new Square(5, 1, "LilyPad", this);
        Square Square6 = new Square(1, 2, "Water", this);
        Square Square7 = new Square(2, 2, "GreenFrog", this);
        Square Square8 = new Square(3, 2, "Water", this);
        Square Square9 = new Square(4, 2, "GreenFrog", this);
        Square Square10 = new Square(5, 2, "Water", this);
        Square Square11 = new Square(1, 3, "GreenFrog", this);
        Square Square12 = new Square(2, 3, "Water", this);
        Square Square13 = new Square(3, 3, "GreenFrog", this);
        Square Square14 = new Square(4, 3, "Water", this);
        Square Square15 = new Square(5, 3, "LilyPad", this);
        Square Square16 = new Square(1, 4, "Water", this);
        Square Square17 = new Square(2, 4, "GreenFrog", this);
        Square Square18 = new Square(3, 4, "Water", this);
        Square Square19 = new Square(4, 4, "LilyPad", this);
        Square Square20 = new Square(5, 4, "Water", this);
        Square Square21 = new Square(1, 5, "LilyPad", this);
        Square Square22 = new Square(2, 5, "Water", this);
        Square Square23 = new Square(3, 5, "LilyPad", this);
        Square Square24 = new Square(4, 5, "Water", this);
        Square Square25 = new Square(5, 5, "RedFrog", this);
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
        greenFrogs.add(0, Square3);
        greenFrogs.add(1, Square7);
        greenFrogs.add(2, Square9);
        greenFrogs.add(3, Square11);
        greenFrogs.add(4, Square13);
        greenFrogs.add(5, Square17);
        redFrog[0] = Square25;
        lilyPads[0] = Square1;
        lilyPads[1] = Square5;
        lilyPads[2] = Square15;
        lilyPads[3] = Square19;
        lilyPads[4] = Square21;
        lilyPads[5] = Square23;
        for (int i = 0; i < 25; i++) {
            panel.add(grid[i].getButton());
        }
        Hoppers.setVisible(true);
    }

    private void renderLevel4()
    {
        panel.remove(Level1);
        panel.remove(Level2);
        panel.remove(Level3);
        panel.remove(Level4);
        lilyPadCount = 7;
        greenFrogCount = 5;
        GridLayout Layout = new GridLayout(5, 5);
        panel.setLayout(Layout);
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
        Square Square13 = new Square(3, 3, "LilyPad", this);
        Square Square14 = new Square(4, 3, "Water", this);
        Square Square15 = new Square(5, 3, "GreenFrog", this);
        Square Square16 = new Square(1, 4, "Water", this);
        Square Square17 = new Square(2, 4, "GreenFrog", this);
        Square Square18 = new Square(3, 4, "Water", this);
        Square Square19 = new Square(4, 4, "LilyPad", this);
        Square Square20 = new Square(5, 4, "Water", this);
        Square Square21 = new Square(1, 5, "GreenFrog", this);
        Square Square22 = new Square(2, 5, "Water", this);
        Square Square23 = new Square(3, 5, "LilyPad", this);
        Square Square24 = new Square(4, 5, "Water", this);
        Square Square25 = new Square(5, 5, "RedFrog", this);
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
        greenFrogs.add(0, Square7);
        greenFrogs.add(1, Square9);
        greenFrogs.add(2, Square15);
        greenFrogs.add(3, Square17);
        greenFrogs.add(4, Square21);
        redFrog[0] = Square25;
        lilyPads[0] = Square1;
        lilyPads[1] = Square3;
        lilyPads[2] = Square5;
        lilyPads[3] = Square11;
        lilyPads[4] = Square13;
        lilyPads[5] = Square19;
        lilyPads[6] = Square23;
        for (int i = 0; i < 25; i++) {
            panel.add(grid[i].getButton());
        }
        Hoppers.setVisible(true);
    }




    private void redFrogSelected(ImageIcon I) {
        if (greenFrogSelected) {
            greenFrogUnselected();
        }
        redFrog[0].getButton().setIcon(I);
        redFrogSelected = true;
    }

    private void redFrogUnselected() {
        ImageIcon C = new ImageIcon("RedFrog.png");
        redFrogSelected = false;
        redFrog[0].getButton().setIcon(C);
    }

    private void greenFrogSelected(ImageIcon A, ActionEvent e) {
        JButton button = (JButton) e.getSource();


        if (redFrogSelected) {
            redFrogUnselected();
        } else if (selectedFrog != button) {
            greenFrogUnselected();
        }

        for (Square greenFrog : greenFrogs) {
            if (button == greenFrog.getButton()) {
                selectedFrog = button;
                break;
            }
        }
        selectedFrog.setIcon(A);
        greenFrogSelected = true;
    }

    private void greenFrogUnselected() {
        ImageIcon B = new ImageIcon("GreenFrog.png");
        selectedFrog.setIcon(B);
        greenFrogSelected = false;

    }

    private void lilyPadClicked(ActionEvent e) {
        if (redFrogSelected || greenFrogSelected) {
            for (int i = 0; i < lilyPadCount; i++) {
                if (e.getSource() == lilyPads[i].getButton()) {
                    selectedLilyPad = (JButton) e.getSource();
                }
            }
            lilyPadSelected = true;
            System.out.println("Test");
        }
    }

    private void greenMoveTo(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        int x = 0;
        int y = 0;

        while (button != lilyPads[x].getButton()) {
            x++;
        }

        while (selectedFrog != greenFrogs.get(y).getButton()) {
            y++;
        }

        ImageIcon B = new ImageIcon("GreenFrog.png");
        ImageIcon C = new ImageIcon("LilyPad.png");
        JButton reset = new JButton();
        lilyPads[x].getButton().setIcon(B);
        greenFrogs.get(y).getButton().setIcon(C);
        Square tempGreenFrog = greenFrogs.get(y);
        greenFrogs.set(y, lilyPads[x]);
        lilyPads[x] = tempGreenFrog;
        greenFrogSelected = false;
        lilyPadSelected = false;
        redFrogSelected = false;
        selectedFrog = reset;
    }

    private void redMoveTo() {
        int x = 0;
        while (selectedLilyPad != lilyPads[x].getButton()) {
            x++;
        }
        ImageIcon C = new ImageIcon("RedFrog.png");
        ImageIcon D = new ImageIcon("LilyPad.png");
        ImageIcon E = new ImageIcon("Victory.png");

        redFrog[0].getButton().setIcon(D);
        selectedLilyPad.setIcon(C);
        Square tempRedFrog = redFrog[0];
        redFrog[0] = lilyPads[x];
        lilyPads[x] = tempRedFrog;
        redFrogSelected = false;
        lilyPadSelected = false;
        greenFrogSelected = false;
        if (greenFrogCount == 0) {
            for (int i = 0; i < 25; i++) {
                grid[i].getButton().setIcon(E);
            }
        }
    }

    private boolean greenLegalMove(ActionEvent e, ImageIcon B) {
        int z = 0;
        int p = 0;
        selectedLilyPad = (JButton) e.getSource();
        while (selectedLilyPad != lilyPads[p].getButton() && p < lilyPadCount) {
            p++;
        }
        while (selectedFrog != greenFrogs.get(z).getButton()) {
            z++;
        }
        double avgX = (double) (greenFrogs.get(z).getX() + lilyPads[p].getX()) / 2;
        double avgY = (double) (greenFrogs.get(z).getY() + lilyPads[p].getY()) / 2;
        boolean legal = false;
        for (int i = 0; i < greenFrogCount; i++) {
            if (greenFrogs.get(i).getX() == avgX && greenFrogs.get(i).getY() == avgY) {
                legal = true;
                greenFrogs.get(i).getButton().setIcon(B);
                lilyPads[lilyPadCount] = greenFrogs.get(i);
                lilyPadCount++;
                greenFrogs.remove(i);
                greenFrogCount--;
                break;
            }
        }
        return legal;
    }

    private boolean redLegalMove(ActionEvent e, ImageIcon B) {
        int p = 0;
        selectedLilyPad = (JButton) e.getSource();

        while (selectedLilyPad != lilyPads[p].getButton() && p < lilyPadCount) {
            p++;
        }
        double avgX = (double) (redFrog[0].getX() + lilyPads[p].getX()) / 2;
        double avgY = (double) (redFrog[0].getY() + lilyPads[p].getY()) / 2;
        boolean legal = false;
        for (int i = 0; i < greenFrogCount; i++) {
            if (greenFrogs.get(i).getX() == avgX && greenFrogs.get(i).getY() == avgY) {
                legal = true;
                greenFrogs.get(i).getButton().setIcon(B);
                lilyPads[lilyPadCount] = greenFrogs.get(i);
                lilyPadCount++;
                greenFrogs.remove(i);
                greenFrogCount--;
                break;
            }
        }
        return legal;
    }

    public void actionPerformed(ActionEvent e) {
        if (Menu) {
            if (e.getSource() == Level1) {
                Menu = false;
                renderLevel1();
            }
            else if (e.getSource() == Level2){
                Menu = false;
                renderLevel2();
            }
            else if (e.getSource() == Level3){
                Menu = false;
                renderLevel3();
            }
            else if (e.getSource() == Level4){
                Menu = false;
                renderLevel4();
            }

        } else {

            ImageIcon I = new ImageIcon("RedFrog2.png");
            ImageIcon A = new ImageIcon("GreenFrog2.png");
            ImageIcon B = new ImageIcon("LilyPad.png");
            ImageIcon F = new ImageIcon("Menu.png");
            for (int i = 0; i < greenFrogCount; i++) {
                if (e.getSource() == greenFrogs.get(i).getButton()) {
                    greenFrogSelected = true;
                }
            }
            for (int x = 0; x < lilyPadCount; x++) {
                if (e.getSource() == lilyPads[x].getButton()) {
                    lilyPadSelected = true;
                }
            }
            if (e.getSource() == redFrog[0].getButton()) {
                redFrogSelected(I);
            } else if (greenFrogSelected) {
                greenFrogSelected(A, e);
            } else if (lilyPadSelected) {
                lilyPadClicked(e);
            }
            if (greenFrogSelected && lilyPadSelected && greenLegalMove(e, B)) {
                greenMoveTo(e);
            } else if (redFrogSelected && lilyPadSelected && redLegalMove(e, B)) {
                redMoveTo();
            }
            if (greenFrogCount == 0) {
                lilyPads[0].getButton().setIcon(F);
                if (e.getSource() == lilyPads[0].getButton()) {
                    new Board();
                }
            }
        }
    }
}