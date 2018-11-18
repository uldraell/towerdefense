import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pathfinding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pathfinding extends TDWorld
{

    private Path weg;
    private int TurnNummer;
    private Turn ziel;
    private Turn letzter;
    
    
    public Pathfinding(Path weg)
    {
        this.weg = weg; //Weg festlegen
        this.TurnNummer=0; // den Ziel-Turn festlegen
        this.ziel = weg.getTurns()[TurnNummer]; //Ersten punkt als Ziel Turn festlegen 
        this.letzter = weg.getTurns()[TurnNummer];//Ersten punkt als letzter Turn festlegen 
        
    }
    
    public Turn next()
    {
        if(letzter.equals(ziel)){
            TurnNummer++;
            if (TurnNummer == weg.getTurns().length)
            {
                return null;
            }
            ziel = weg.getTurns()[TurnNummer];
        }
        int x = letzter.getX();
        int y = letzter.getY();
        
        if(ziel.getX() > letzter.getX())
             x++;
        if(ziel.getX() < letzter.getX())
             x++;     
        if(ziel.getY() > letzter.getY())
             y++;    
        if(ziel.getY() < letzter.getY())
             y++;  
            
        return (letzter = new Turn(x, y));     
    }
}
