import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HUD extends Actor
{
    private int width, height, units, changePer;
    Color C;
    public HUD(int width, int height,int units, Color C)
    {
        this.width=width;
        this.height=height;
        this.units = units;
        this.C=C;
        changePer=(int)width/units;
    }
    
    public void update()
    {
        setImage(new GreenfootImage(width+2, height+2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, width+1, height+1);
        myImage.setColor(C); 
        myImage.fillRect(1,1, units*changePer, height);
        
    }

    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setUnits(int units)
    {
        this.units=units;
    }
}
