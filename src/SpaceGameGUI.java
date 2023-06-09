/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Krish
 */
public class SpaceGameGUI extends JFrame {
    JFrame main;
    JPanel shipPanel;
    int enemynum = 4;
    JPanel [] enemyPanel = new JPanel[enemynum];
    JPanel gameoverPanel;
    final int SPEED = 7;
    ShipMovement hnd;
    
    public SpaceGameGUI(){
        hnd = new ShipMovement(this);
        initGUI();
    }
    
    public Component AddImage(JPanel x){
        JLabel asteroid = new JLabel (new ImageIcon("asteroid.png"));
        return (x.add(asteroid));
    }

    public void initGUI() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        main = new JFrame("The Space Race");
        main.setLayout(null);
        main.setContentPane(new JLabel(new ImageIcon("background.png")));
        //main.getContentPane().setBackground(Color.black);
        
        
        shipPanel = new JPanel();
        shipPanel.setSize(100, 100);
        JLabel ship = new JLabel(new ImageIcon("playerrocket.png"));
        shipPanel.add(ship);
        shipPanel.setLocation(190, 578);
        shipPanel.setOpaque(false);
        
        gameoverPanel = new JPanel();
        gameoverPanel.setSize(500, 700);
        JLabel over = new JLabel(new ImageIcon("gameover.jpg"));
        gameoverPanel.add(over);
        gameoverPanel.setVisible(false);
        
        main.add(shipPanel, gameoverPanel);
        main.setSize(500, 700);
        main.setVisible(true);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.addKeyListener(hnd);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
