import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This class holds the different levels and the logic of the game
 * @author Mateusz Wozakowski
 * @version 1.0
 */
public class Board implements ActionListener {
    /**Creates the JFrame used for the game*/
    JFrame Hoppers = new JFrame("Hoppers");
    /**List of the green frogs*/
    private ArrayList<Square> greenFrogs = new ArrayList<>();
    /** Creates the panel used for the game*/
    public JPanel panel = new JPanel();
    /**Creates an array for the red frog*/
    Square[] redFrog = new Square[1];
    /**Creates an array for the lily pads*/
    Square[] lilyPads = new Square[13];
    /**Used to check whether a green frog is selected*/
    boolean redFrogSelected = false;
    /**Used to check whether a green frog is selected*/
    boolean greenFrogSelected = false;
    /**Used to check whether ia lily pad is selected*/
    boolean lilyPadSelected = false;
    /**Creates a button for the selected green frog*/
    JButton selectedFrog = new JButton();
    /**Creates a button for the selected lilypad*/
    JButton selectedLilyPad = new JButton();
    /**Used to store the number of lily pads*/
    int lilyPadCount;
    /**Used to store the number of green frogs*/
    int greenFrogCount;
    /**Creates an array of Squares*/
    Square[] grid = new Square[25];
    /**Used to check whether user is in menu or in game*/
    boolean Menu = true;
    /**Button used to select level 1*/
    JButton Level1 = new JButton();
    /**Button used to select level 2*/
    JButton Level2 = new JButton();
    /**Button used to select level 3*/
    JButton Level3 = new JButton();
    /**Button used to select level 4*/
    JButton Level4 = new JButton();

    /**
     * This creates a Board, holding the menu of the game
     */
    public Board() {
        Hoppers.setSize(750, 750); //Setting up Jframe and buttons
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
        panel.add(Level1); //Add buttons to panel
        panel.add(Level2);
        panel.add(Level3);
        panel.add(Level4);
        Level1.addActionListener(this); //For ActionEvent functions
        Level2.addActionListener(this);
        Level3.addActionListener(this);
        Level4.addActionListener(this);
        Hoppers.setContentPane(panel); //Set panel to JFrame
        Hoppers.setVisible(true);
    }

    /**
     * This method creates and renders in the first level
     */
    private void renderLevel1() {
        panel.remove(Level1); //Remove menu buttons
        panel.remove(Level2);
        panel.remove(Level3);
        panel.remove(Level4);
        lilyPadCount = 7;
        greenFrogCount = 5;
        GridLayout Layout = new GridLayout(5, 5); //Create grid layout
        panel.setLayout(Layout); //set layout to panel
        Square Square1 = new Square(1, 1, "LilyPad", this); //Create squares to represent game entities
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
        grid[0] = Square1; //Add Squares into an array
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
        greenFrogs.add(0, Square7); //Add green frogs into list
        greenFrogs.add(1, Square9);
        greenFrogs.add(2, Square13);
        greenFrogs.add(3, Square21);
        greenFrogs.add(4, Square25);
        redFrog[0] = Square23; //Add the red frog into an array
        lilyPads[0] = Square1; //Add lily pads into an array
        lilyPads[1] = Square3;
        lilyPads[2] = Square5;
        lilyPads[3] = Square11;
        lilyPads[4] = Square15;
        lilyPads[5] = Square17;
        lilyPads[6] = Square19;
        for (int i = 0; i < 25; i++) {
            panel.add(grid[i].getButton()); //Add All buttons into the panel
        }
        Hoppers.setVisible(true);
    }
    /**
     * This method creates and renders in the second level
     */
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
    /**
     * This method creates and renders in the third level
     */
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
    /**
     * This method creates and renders in the fourth level
     */
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


    /**
     * This method allows the red frog to be selected
     * @param I Image of highlighted red frog
     */
    private void redFrogSelected(ImageIcon I) {
        if (greenFrogSelected) {
            greenFrogUnselected(); //Unselect any frogs already selected
        }
        redFrog[0].getButton().setIcon(I); //Highlight selected icon
        redFrogSelected = true;
    }

    /**
     * This method allows the red frog to be deselected when another frog is pressed
     */
    private void redFrogUnselected() {
        ImageIcon C = new ImageIcon("RedFrog.png");
        redFrogSelected = false;
        redFrog[0].getButton().setIcon(C); //Unhighlight selected icon
    }

    /**
     * This method allows a green frog to be selected
     * @param A Image of the selected green frog
     * @param e Allows the method to use the action event
     */
    private void greenFrogSelected(ImageIcon A, ActionEvent e) {
        JButton button = (JButton) e.getSource(); //Store the recently clicked button
        if (redFrogSelected) {
            redFrogUnselected(); //Unselect the red frog if it is selected
        } else if (selectedFrog != button) {
            greenFrogUnselected(); //If the frog clicked is not the same as one already selected, deselect that frog
        }

        for (Square greenFrog : greenFrogs) { //For all green frogs in the array
            if (button == greenFrog.getButton()) {
                selectedFrog = button; //Assign "selectedFrog" to the pressed button
                break;
            }
        }
        selectedFrog.setIcon(A); //highlight selected icon
        greenFrogSelected = true;
    }

    /**
     * This method allows the selected frog to be deselected when another frog is pressed
     */
    private void greenFrogUnselected() {
        ImageIcon B = new ImageIcon("GreenFrog.png");
        selectedFrog.setIcon(B); //Unhighlight the frog
        greenFrogSelected = false;

    }

    /**
     * This method stores the lily pad which has been pressed
     * @param e Allows the method to use the action event
     */
    private void lilyPadClicked(ActionEvent e) {
        if (redFrogSelected || greenFrogSelected) {
            for (int i = 0; i < lilyPadCount; i++) {
                if (e.getSource() == lilyPads[i].getButton()) {
                    selectedLilyPad = (JButton) e.getSource(); //If selected button is lily pad, store it in selectedLilyPad
                }
            }
            lilyPadSelected = true;
        }
    }

    /**
     * This method moves the green frog to a valid lily pad
     * @param e ALlows the method to use the action event
     */
    private void greenMoveTo(ActionEvent e) {
        JButton button = (JButton) e.getSource(); //Store pressed button
        int x = 0; //For looping through lily pads
        int y = 0; //For looping through green frogs

        while (button != lilyPads[x].getButton()) {
            x++; //Stores the index of pressed lilyPad
        }

        while (selectedFrog != greenFrogs.get(y).getButton()) {
            y++; //Stores index of pressed green frog
        }

        ImageIcon B = new ImageIcon("GreenFrog.png");
        ImageIcon C = new ImageIcon("LilyPad.png");
        JButton reset = new JButton();
        lilyPads[x].getButton().setIcon(B); //Lily pad becomes a green frog
        greenFrogs.get(y).getButton().setIcon(C); //Green frog becomes a lily pad
        Square tempGreenFrog = greenFrogs.get(y); //Store green frog temporarily
        greenFrogs.set(y, lilyPads[x]); //Changes the green frog into selected lily pad
        lilyPads[x] = tempGreenFrog; //Changes the lily pad into selected green frog, making them "swap"
        greenFrogSelected = false;
        lilyPadSelected = false;
        redFrogSelected = false;
        selectedFrog = reset; //Reset the selected frog
    }

    /**
     * This method moves the red frog to a valid lily pad
     */
    private void redMoveTo() {
        int x = 0;
        while (selectedLilyPad != lilyPads[x].getButton()) {
            x++; //Stores index of selected lily pad
        }
        ImageIcon C = new ImageIcon("RedFrog.png");
        ImageIcon D = new ImageIcon("LilyPad.png");
        ImageIcon E = new ImageIcon("Victory.png");

        redFrog[0].getButton().setIcon(D); //red frog becomes a lily pad
        selectedLilyPad.setIcon(C);  //Lilypad becomes a red frog
        Square tempRedFrog = redFrog[0]; //Stores the red frog temporarily
        redFrog[0] = lilyPads[x]; //Changes the red frog into selected lily pad
        lilyPads[x] = tempRedFrog; //Changes the lily pad into the red frog
        redFrogSelected = false;
        lilyPadSelected = false;
        greenFrogSelected = false;
        if (greenFrogCount == 0) { //If game is won
            for (int i = 0; i < 25; i++) {
                grid[i].getButton().setIcon(E); //Set victory icons
            }
        }
    }

    /**
     * This method ensures that the move of a green frog to a lily pad is legal, according to the rules of the game
     * @param e Allows the method to use the action event
     * @param B Image of the lily pad
     * @return Returns a boolean of whether the move is legal or not
     */
    private boolean greenLegalMove(ActionEvent e, ImageIcon B) {
        int z = 0;
        int p = 0;
        selectedLilyPad = (JButton) e.getSource(); //Store lily pad as button just pressed
        while (selectedLilyPad != lilyPads[p].getButton() && p < lilyPadCount) {
            p++; //Finds index of selected lily pad
        }
        while (selectedFrog != greenFrogs.get(z).getButton()) {
            z++; //Finds index of selected green frog
        }
        double avgX = (double) (greenFrogs.get(z).getX() + lilyPads[p].getX()) / 2; //Finds middle of frog and lily pad
        double avgY = (double) (greenFrogs.get(z).getY() + lilyPads[p].getY()) / 2;
        boolean legal = false; //Assume illegal move
        for (int i = 0; i < greenFrogCount; i++) {
            if (greenFrogs.get(i).getX() == avgX && greenFrogs.get(i).getY() == avgY) { //If there is a green frog between the source frog and destination lily pad
                legal = true;
                greenFrogs.get(i).getButton().setIcon(B); //Set icon of jumped over frog to a lily pad
                lilyPads[lilyPadCount] = greenFrogs.get(i); //Adds the frog square into the lily pads
                lilyPadCount++;
                greenFrogs.remove(i); //Removes the green frog from the array
                greenFrogCount--;
                break;
            }
        }
        return legal;
    }

    /**
     * This method ensures the move of a red frog to a lily pad is legal, according to the rules of the game
     * @param e Allows the method to use action event
     * @param B Image of lily pad
     * @return Returns a boolean of whether the move is legal or not
     */
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

    /**
     * This method allows user interaction with the game, for both the menu and the while in a level
     * @param e Allows use of action event
     */
    public void actionPerformed(ActionEvent e) {
        if (Menu) {
            if (e.getSource() == Level1) { //if level 1 is pressed
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
                if (e.getSource() == greenFrogs.get(i).getButton()) { //If green frog is pressed
                    greenFrogSelected = true;
                }
            }
            for (int x = 0; x < lilyPadCount; x++) {
                if (e.getSource() == lilyPads[x].getButton()) { //If lily pad is pressed
                    lilyPadSelected = true;
                }
            }
            if (e.getSource() == redFrog[0].getButton()) { //If red frog is pressed
                redFrogSelected(I);
            } else if (greenFrogSelected) {
                greenFrogSelected(A, e);
            } else if (lilyPadSelected) {
                lilyPadClicked(e);
            }
            if (greenFrogSelected && lilyPadSelected && greenLegalMove(e, B)) {
                greenMoveTo(e); //Move frog if the move is legal
            } else if (redFrogSelected && lilyPadSelected && redLegalMove(e, B)) {
                redMoveTo();
            }
            if (greenFrogCount == 0) { //If game is won
                lilyPads[0].getButton().setIcon(F); //Set menu button
                if (e.getSource() == lilyPads[0].getButton()) {
                    new Board(); //Create new board, returning to menu
                }
            }
        }
    }
}