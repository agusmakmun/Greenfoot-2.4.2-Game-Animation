import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan

/**
 * Ini adalah Counter Nilai ketika kumbang memakan grass/rumput.
 * 
 * @author (Summon Agus) 
 * @blog (bloggersmart.net)
 * @version (V.1.0)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public void act() 
    {
       //System.out.print("Score:" + score);
       setImage(new GreenfootImage("Score: " + score, 24, Color.GREEN, Color.BLACK));
    }  
    
    public void addScore() {
       score++;
    }
    
}
