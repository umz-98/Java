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

    public boolean check_wall_collision() {
        if(player.getX() < 0 || player.getX() >= width * dimension 
            || player.getY() < 0 || player.getY() >= height * dimension) {
            return true;

        }
        return false;
    }

    public boolean check_food_collision() {
        if(player.getX() == food.getX() * dimension && player.getY() == food.getY() * dimension) {
            return true;
        }
        return false;
    }

    public boolean check_self_collision() {
        for(int i = 1; i < player.getBody().size(); i++) {
            if(player.getX() == player.getBody().get(i).x &&
                   player.getY() == player.getBody().get(i).y) {
                       return true;
                   }
        }
        return false;
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

    public Snake getPlayer() {
        return player;
    }

    public void setPlayer(Snake player) {
        this.player = player;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
}
