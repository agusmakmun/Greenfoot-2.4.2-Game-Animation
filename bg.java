import greenfoot.*;

/**
 * Background (latar belakang).
 * 
 * @author (Summon Agus) 
 * @blog (bloggersmart.net)
 * @version (V.1.0)
 */
public class bg extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class bg.
     * 
     */
    
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        //playying sound on background
        //Greenfoot.playSound("super_mario.mp3");
    }
    
    public Counter getCounter() {
        return counter;
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //tampilan untuk counter nantinya
        //perhatikan untuk tidak lebih dari 1 object counter
        addObject(counter, 76, 39);
        counter.setLocation(48, 14);

        kumbang kumbang = new kumbang();
        addObject(kumbang, 86, 182);
        grass grass = new grass();
        addObject(grass, 192, 111);
        grass grass2 = new grass();
        addObject(grass2, 334, 133);
        grass grass3 = new grass();
        addObject(grass3, 382, 319);
        grass grass4 = new grass();
        addObject(grass4, 193, 317);
        grass2.setLocation(418, 84);
        grass3.setLocation(448, 309);
        grass.setLocation(209, 126);
        grass.setLocation(198, 87);
        grass.setLocation(234, 117);

        grass grass5 = new grass();
        addObject(grass5, 410, 197);
        grass5.setLocation(346, 195);
        grass grass6 = new grass();
        addObject(grass6, 520, 169);
        grass grass7 = new grass();
        addObject(grass7, 199, 218);
        grass grass8 = new grass();
        addObject(grass8, 108, 85);
        grass grass9 = new grass();
        addObject(grass9, 344, 343);
        grass9.setLocation(334, 317);
        grass3.setLocation(495, 317);
        grass4.setLocation(154, 329);
        kumbang kumbang2 = new kumbang();
        addObject(kumbang2, 92, 294);
        kumbang.setLocation(80, 169);
        kumbang2.setLocation(84, 291);
    }
}
