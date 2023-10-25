import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class luigi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class luigi extends Actor
{
    GreenfootSound hadouken = new GreenfootSound("hadouken.mp3");
    public int speed = 5;
    public int vida = 10;
    /**
     * Act - do whatever the luigi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            movimento();
    }
    
    public void movimento (){
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        
        else if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        
        else if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        
        else if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        
        else if (Greenfoot.isKeyDown("space")){
            getWorld().addObject(new hadouken(),getX()+27,getY()+5);
            hadouken.play();
        }
    }
    
}
