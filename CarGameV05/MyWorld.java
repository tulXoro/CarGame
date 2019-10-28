import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     *  
     */
  
   private int xPos;
   private int yPos;
   Health hp1;
 
    public MyWorld()
    {    
         
    
       super(700, 700, 1); 
       //makes square playing feild(700x700)
       
      
       Player P1= new Player(5, 5, false); 
       
       hp1= new Health(P1.getLives(), P1);
       
       Border b = new Border();
       Border b2 = new Border(); 
       addObject(b, 350, 270);
       addObject(b2, 850, 270);
       
       addObject(P1, 390, 250);
       addObject(hp1, 170, 580);
      
       Car c1 = new Car(false);
       addObject(c1, 300, 90);
      
       Car c2 = new Car(false);
       addObject(c2, 300, 140);
       
       Car c3 = new Car(false);
       addObject(c3, 300, 190);
       
       Car c4 = new Car(false);
       addObject(c4, 300, 240);
       
       Car c5 = new Car(true);
       addObject(c5, 500, 300);
       
       Car c6 = new Car(true);
       addObject(c6, 500, 350);
       
       Car c7 = new Car(true);
       addObject(c7, 500, 400);
       
       Car c8 = new Car(true);
       addObject(c8, 500, 450);
       
       timer t = new timer();
       addObject(t, 350, 580);
       
           

    }
   
}




