<<<<<<< HEAD
package Java_Snake_Game;
=======
package Java;
>>>>>>> 3f408726e90075fa915519b531b46c1e45455216

import javax.swing.JFrame;

public class Game {
    
    private Snake player;
    private Food food;

    private JFrame window;
    public static final int width = 30;
    public static final int height = 30;
    public static final int dimension = 20;

    public Game() {
        window = new JFrame();
        
        window.setTitle("Snake");
        window.setSize(width * dimension, height * dimension);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
