package main;

import java.awt.*;
import javax.swing.JPanel;

/**
 * This panel displays copies of a message.  The color and 
 * position of each message is selected at random.  The font
 * of each message is randomly chosen from among five possible
 * fonts.  The messages are displayed on a black background.
 * Note:  The style of drawing used here is poor, because every
 * time the paintComponent() method is called, new random values are
 * used.  This means that a different picture will be drawn each time.
 */
public class RandomStringsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private String message;

    private Font font1, font2, font3, font4, font5;  // The five fonts.

    public RandomStringsPanel(String messageString) {

        message = messageString;

        font1 = new Font("Serif", Font.BOLD, 14);
        font2 = new Font("SansSerif", Font.BOLD + Font.ITALIC, 24);
        font3 = new Font("Monospaced", Font.PLAIN, 30);
        font4 = new Font("Dialog", Font.PLAIN, 36);
        font5 = new Font("Serif", Font.ITALIC, 48);

        setBackground(Color.BLACK);

    }

    /**
     * The paintComponent method is responsible for drawing the content of the panel.
     * It draws 25 copies of the message string, using a random color, font, and
     * position for each string.
     */
    public void paintComponent(Graphics g) {

        super.paintComponent(g);  // Call the paintComponent method from the
                                  // superclass, JPanel.  This simply fills the
                                  // entire panel with the background color, black.

        Graphics2D g2 = (Graphics2D)g;  // (To make the text smoother.)
        g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

        int width = getWidth();
        int height = getHeight();

        for (int i = 0; i < 50; i++) {

            // Draw one string.  First, set the font to be one of the five
            // available fonts, at random.

            int fontNum = (int)(5*Math.random()) + 1;
            switch (fontNum) {
            case 1:
                g.setFont(font1);
                break;
            case 2:
                g.setFont(font2);
                break;
            case 3:
                g.setFont(font3);
                break;
            case 4:
                g.setFont(font4);
                break;
            case 5:
                g.setFont(font5);
                break;
            }

            // Set the color to a bright, saturated color, with random hue.
            float hue = (float)Math.random();
            g.setColor( Color.getHSBColor(hue, 1.0F, 1.0F) );

            // Select the position of the string, at random.
            int x,y;
            x = -50 + (int)(Math.random()*(width+40));
            y = (int)(Math.random()*(height+20));

            g.drawString(message,x,y);
        }
    }
}
