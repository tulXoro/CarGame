
 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends HUD
{
    /**
     * Act - do whatever the healthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.A
     */
    int hp;
    int changePer;
    
    Player p;
    public Health(int hp, Player p)
    {
        super(200, 20,hp, Color.GREEN);
        this.p=p;
        this.hp=hp;
    }
    
    public void setUnit(int units)
    {
        setUnits(units);
    }
    
    public void act() 
    {
        setUnit(p.lives);
        update();
    }    
    
}
