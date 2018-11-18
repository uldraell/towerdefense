import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class TDWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TDWorld extends World
{

    private GreenfootImage Background;
    //private Time TimerTilNextWave;
    public static int[][] Area = {
        {1,0,1,1,1,1,1,1,2,2,2,2,2,2,2},
	{1,0,1,0,0,0,0,0,2,0,0,0,0,0,2},
	{1,0,3,3,3,3,3,0,0,0,0,0,0,0,2},
	{1,0,3,0,0,0,3,0,2,0,0,0,0,0,2},
	{1,0,3,0,0,0,3,0,2,2,2,0,2,2,2},
	{1,0,3,0,0,0,3,0,2,0,0,0,0,0,2},
	{1,0,3,3,0,3,3,0,2,0,0,0,0,0,2},
	{1,0,0,0,0,0,0,0,2,0,0,0,0,0,2},
	{1,1,1,1,1,1,1,1,4,4,4,0,4,4,4},
	{1,0,0,0,0,0,1,4,0,0,0,0,0,0,4},
	{1,0,0,0,0,0,1,4,0,0,0,0,0,0,4},
	{1,0,0,0,0,0,1,4,0,3,3,3,3,0,4},
	{1,0,0,0,0,0,1,4,0,3,3,3,3,0,4},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,4},
	{1,1,1,1,1,1,1,4,4,4,4,4,4,4,4}
    };
    
    public TDWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
    }
}
