import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ambulance extends Actor
{
    int score = 0;
    public void act()
    {
        getWorld().showText("Score : " + score, 70, 30);
        checkKey();
        end();
        addscore();
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 215){
                setLocation(getX() -2, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 398){
                setLocation(getX() +2, getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() -2);
        }
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() +2);
        }
    }

    public void end(){
        if(isTouching(whitecar.class)||isTouching(redcar.class)){
            getWorld().showText("Game Over \n Score : " + score, 300, 300);
            Greenfoot.stop();}
        }
        
        public void addscore(){
        if(isTouching(coin.class)){
            score = score + 20;
            removeTouching(coin.class);
        }
    }
    
    
}
