import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    
    public timer()
    {
        
    }
    public void act() {
        timer++;
        getWorld().showText("Score: "+timer, 350, 580); //change the (50|50) to the coordinates where it should appear

    }   
}
