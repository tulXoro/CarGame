import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    /**
     * Act - do whatever the border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Border()
    {
        GreenfootImage border = getImage();
        border.scale(700, 550);
        setImage(border);
        
    }
    public void act() 
    {
        move(-8);
        if(getX()<1)
        {
            setLocation(700, getY());
        }
    }    
}




