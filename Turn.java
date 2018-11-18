import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turn extends TDWorld
{

    private int x;
    private int y;
    
    public Turn(int x, int y)
    {
        this.x=x;
        this.y=y; 
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    
}
