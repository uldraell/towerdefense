import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    
    private String name;
    private double ehp;
    private int hp;
    private String color;
    private double movespd;
    private GreenfootImage EnemyIcon;
    private float Bounty;
    
    
    
    /**
     * Act - do whatever the Enemys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy()
    {
        EnemyIcon = new GreenfootImage("test.png");
        setImage(EnemyIcon);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
