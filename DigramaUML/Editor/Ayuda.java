import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{

    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        BtAtras bt = new BtAtras();
        addObject(bt, super.getWidth()/2, super.getHeight()/8*7);
    }
}
