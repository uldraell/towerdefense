import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Path here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Path extends TDWorld
{

    //private  walkingDirection; vielleicht eher durch de Zahlen ersetzen in  Area 3 für süden, 4 für westen, 5 für osten, 6 für norden    
    private Turn[] turns;
    
    public Path(Turn[] turns)
    {
        this.turns=turns;
        
    }
    
    public Turn[] getTurns()
    {
        return turns;
    }
}
