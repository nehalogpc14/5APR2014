import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*; // (Grapohics tools)
/**
 * Write a description of class AvailableDarts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvailableDarts extends Actor
{
    /**
     * Act - do whatever the AvailableDarts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Lvl2BkgDesert myWorld = (Lvl2BkgDesert)getWorld();
        makeImage("Score", ":", myWorld.GetAvailDarts());
    }
   
    
    private void makeImage(String title, String prefix, int score)
    {
        int WIDTH = 100;
        int HEIGHT = 100;
        int FONT_SIZE = 10;
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 10, 10);
        image.drawString(prefix + score, 10, 50);
        setImage(image);
    }
}
