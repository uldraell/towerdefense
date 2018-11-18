import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.Object;

/**
 * Write a description of class TDWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TDWorld extends World
{

    private GreenfootImage Background;
    //private Time TimerTilNextWave; //für Nord=1 Süd=2 West=3 Ost=4
    private Path weg;
    public static int[][] Area = {
    {1,0,1,1,1,1,1,1,2,2,2,2,2,2,2,1},
    {1,0,1,0,0,0,0,0,2,0,0,0,0,0,2,1},
    {1,0,3,3,3,3,3,0,0,0,0,0,0,0,2,1},
    {1,0,3,0,0,0,3,0,2,0,0,0,0,0,2,1},
    {1,0,3,0,0,0,3,0,2,2,2,0,2,2,2,1},
    {1,0,3,0,0,0,3,0,2,0,0,0,0,0,2,1},
    {1,0,3,3,0,3,3,0,2,0,0,0,0,0,2,1},
    {1,0,0,0,0,0,0,0,2,0,0,0,0,0,2,1},
    {1,1,1,1,1,1,1,1,4,4,4,0,4,4,4,1}
    };
    
    
    
    public TDWorld()
    {    
        super(1600, 900, 1); 
        Greenfoot.setSpeed(60); // Geschwindigkeit festlegen
        setBackground("backgrounddetailed1.png"); //Hintergrund festlegen
        
        HashMap<Turn, Integer> weg = new HashMap<>(); 
        //weg = new Path(new Turn[]{ createPath() });
            
        System.out.println();
        
    }
    
    public Turn createPath()
    {
        
        int index;
        for ( int i = 0; i <= 15; i ++ ){
            for ( int j = 0; j <= 8; j ++ ){
                if (Area[i][j] == 0)
                {
                int x= i*100/2;
                int y=j*100/2;
                
                weg.put(Turn(x,y), index); 
                
                index++;
                
            }
                
        }
        }
        
      
    }
      
}

