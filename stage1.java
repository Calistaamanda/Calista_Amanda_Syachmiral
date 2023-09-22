import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage1 extends formstage
{
    int gravity = 5;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }
    
    /**
     * Constructor for objects of class stage1.
     * 
     */
    public stage1()
    {
        player snake = new player();
        this.addObject(snake, 100, 200);
        this.gravity = 5 ;
        player snake2 = new player();
        this.addObject(snake2, 500,200);
    }
    public void act(){
    List<Character>allChars =this.getObjects(Character.class);
        for (Character chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}
