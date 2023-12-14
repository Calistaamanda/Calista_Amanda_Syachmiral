import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class whitecar extends parent
{
    int speed = 3;
    
    public void act()
    {
        whitecar a = new whitecar();
        Actor i = getOneIntersectingObject(whitecar.class);
        move(speed);
        checkdouble(i);
        end();
        
    }
}
