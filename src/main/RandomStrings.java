package main;

import javax.swing.JFrame;

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