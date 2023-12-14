import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class tree extends parent
{
    int speed = 3;
    public void act()
    {
        tree a = new tree();
        Actor i = getOneIntersectingObject(tree.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
