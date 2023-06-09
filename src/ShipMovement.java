/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Krish
 */
public class ShipMovement implements KeyListener {
    
    SpaceGameGUI g;
    public ShipMovement(SpaceGameGUI ref){
        this.g = ref;
    }
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int code = ke.getKeyCode();
        int x = g.shipPanel.getX();
        int y = g.shipPanel.getY();
        
        if (code == 37)
        {
            //System.out.println("left key pressed");
            //System.out.println(x + "," + y);
            if (x-g.SPEED > 0)
            {
                g.shipPanel.setLocation(x-g.SPEED, y);
            }
        }
        else if (code == 39)
        {
            System.out.println("right key pressed");
            System.out.println(x + "," + y);
            int maxX = g.getWidth();
            int shipWidth = g.shipPanel.getWidth();
            if (x+s.SPEED + shipWidth <= maxX)
            {
                g.shipPanel.setLocation(x+s.SPEED, y);
            }
        }
        
        if (code == 38)
        {
            System.out.println("up key pressed");
            int x = g.shipPanel.getX();
            int y = g.shipPanel.getY();
            System.out.println(x + "," + y);
            if (y-s.SPEED > 0)
            {
                g.shipPanel.setLocation(x, y-s.SPEED);
            }            
            
        }
        else if (code == 40)
        {
            int x = g.shipPanel.getX();
            int y = g.shipPanel.getY();
            System.out.println("down key pressed");
            System.out.println(x + "," + y);
            if (y+s.SPEED <= 578)
            {
                g.shipPanel.setLocation(x, y+s.SPEED);
            }
        }        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
