//package Java_Snake_Game;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;

public class Graphics 
extends JPanel 
implements ActionListener {
    private Timer t = new Timer(100, this);
    public String state;

    private Snake s;
    private Food f;
    private Game game;
    
    public Graphics(Game g) {
        t.start();
        state = "START";
        
        game = g;
        s = g.getPlayer();
        f = g.getFood();
        

        this.addKeyListener((KeyListener) g);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);


    }
    
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
    }

    public void actionPerformed(ActionEvent e) {

    }
}
