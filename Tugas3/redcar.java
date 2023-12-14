import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class redcar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redcar extends parent
{
    int speed = -5;
    public void act()
    {
        redcar a = new redcar();
        Actor i = getOneIntersectingObject(whitecar.class);
        move(speed);
        checkdouble(i);
        end();
    
    }
    
}
