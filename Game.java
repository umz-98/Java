//package Java_Snake_Game;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Game 
implements KeyListener{
    private Snake player;
    private Food food;
    private Graphics graphics;

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
    public void keyTyped(KeyEvent e) {    }
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_W){
            player.up();
        }
        else if(keyCode == KeyEvent.VK_S){
            player.down();
        }
        else if(keyCode == KeyEvent.VK_A){
            player.left();
        }
        else {
            player.right();
        }
    }
    public void keyReleased(KeyEvent e) {  }
}
