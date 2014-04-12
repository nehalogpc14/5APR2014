import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2BkgDesert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2BkgDesert extends World
{
    public int AvailDarts = 100;
    /**
     * Constructor for objects of class Lvl2BkgDesert.
     * 
     */
    public Lvl2BkgDesert()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        
        // Create the demon object
        BlueDemon bluedemon = new BlueDemon();
        
        // Put Blue Demon in our world
        addObject(bluedemon,650, getHeight() - getHeight()/3);
        
        //adds Launcher into World
        Launcher myLauncher = new Launcher(AvailDarts);
        addObject(myLauncher,getWidth()/2,getHeight()+5);
            Rocks myRocks = new Rocks(1, 100 + Greenfoot.getRandomNumber(75));
        int x = getWidth() - getWidth()/5;
        int y = getHeight()- getHeight()/3;
        addObject(myRocks,  x, y);
        //addObject(myRocks, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
//         Rocks myRocks1 = new Rocks(2, 100  + Greenfoot.getRandomNumber(75));
//         addObject(myRocks1, getWidth() - getWidth()/2 + Greenfoot.getRandomNumber(30) , getHeight()- getHeight()/3 + Greenfoot.getRandomNumber(60));
//         //addObject(myRocks1, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100); 
         
        Rocks myRocks2 = new Rocks(3, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks2, getWidth()/2 - getWidth()/3 + Greenfoot.getRandomNumber(30) , getHeight()- getHeight()/3 + Greenfoot.getRandomNumber(60));
         //addObject(myRocks2, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);         
        Rocks myRocks3 = new Rocks(4, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks3, getWidth()/2 - getWidth()/5 + Greenfoot.getRandomNumber(30) , getHeight()/2- getHeight()/4 + Greenfoot.getRandomNumber(60));
         //addObject(myRocks3, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        Rocks myRocks4 = new Rocks(5, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks4, getWidth() - getWidth()/3 + Greenfoot.getRandomNumber(30) , getHeight()/2- getHeight()/4 + Greenfoot.getRandomNumber(60));
        //addObject(myRocks4, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        AvailableDarts myAD = new AvailableDarts();
        addObject(myAD, 100, 100);
    }
    public void IncrementDarts(int num)
    {
       AvailDarts = AvailDarts + num; 
    }
    public void DecrememntDarts(int num)
    {
       AvailDarts = AvailDarts - num;
       if(AvailDarts < 1)
       {
           System.out.println("Game Over");
       }
    }
    public int GetAvailDarts()
    {
        return AvailDarts;
    }
}
