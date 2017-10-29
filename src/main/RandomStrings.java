package main;

import javax.swing.JFrame;

/**
 * This was a personal project I completed as I was teaching myself more and
 * more about computer graphics over the summer of 2017. I spent the summer in
 * Spain, hence I wanted to display my love for the country in this program. This
 * is the main method that creates and displays the main frame. 
**/
public class RandomStrings {

    public static void main(String[] args) {
        JFrame window = new JFrame("Java!");
        RandomStringsPanel content = new RandomStringsPanel("Spain");
        RepaintOnClick click = new RepaintOnClick();
        content.addMouseListener(click);
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(700,550);
        window.setVisible(true);
    }

}
