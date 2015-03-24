import greenfoot.*;

/**
 * Ini adalah merupakan Actor kumbang.
 * 
 * @author (Summon Agus) 
 * @blog (bloggersmart.net)
 * @version (V.1.0)
 */
public class kumbang extends Actor
{
    /**
     * Act - do whatever the ikan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {        
        move(2);
        jalanrandom();
        kendali();
        makan();
        //sembunyi();
        nabrak_dinding();
    }
    
    //kondisi apabila menyentuh dinding
    public void nabrak_dinding() {
        if(isAtEdge()) {
            //move(2);
            //ini untuk belok
            //turn(13);
            
            //ini untuk ketika muncul
            setLocation(Greenfoot.getRandomNumber(500), 20);
            //setLocation(getX(), getY());
            
            //ini untuk remove object ketika nabrak dinding
            //getWorld().removeObject(this);
        }
    }
    
    //kondisi apabila menyentuh dinding dan hilang
    /**
    public void sembunyi() {
        if(isAtEdge()) {
            //getWorld().removeObject(this);
            turn(13);
        } 
    }
    **/
    
    //untuk jalan random jadi nampak seperti kanan kiri
    public void jalanrandom() {
        if (Greenfoot.getRandomNumber(100)<10) {
            turn(Greenfoot.getRandomNumber(40)-20);
        }
    }
    
    //ini untuk kendali keyboard navigation right and left
    //and Actor get move
    public void kendali() {
        if(Greenfoot.isKeyDown("left")) {
            move(1);
            turn(-12);
        }
        if(Greenfoot.isKeyDown("right")) {
            move(1);
            turn(12);
        }
    }
        
    //kondisi untuk memakan grass (tumbuhan)
    //file:///usr/share/doc/Greenfoot/API/greenfoot/Actor.html#isTouching(java.lang.Class)
    public void makan() {
          if (isTouching(grass.class)) {
            removeTouching(grass.class);
            //counter += 1;
            
            //Counter counter = new Counter();
            //counter.addScore();
            //Counter counter = (Counter)getWorld().getObjects(Counter.class);
            
            //membuat score nilai
            World myWorld = getWorld();
            bg bgbaru = (bg)myWorld;  //bg merupakan nama background
            Counter counter = bgbaru.getCounter();
            counter.addScore();
        }
    }
}
