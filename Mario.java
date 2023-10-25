
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    GreenfootSound hadouken = new GreenfootSound("hadouken.mp3");
    public int speed = 5;
    public int vida = 10;
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            movimento();
            acertarAlvo();
    }
    
    public void movimento (){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        
        else if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        
        else if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        
        else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        
        else if (Greenfoot.isKeyDown("f")){
            getWorld().addObject(new hadouken(),getX()+27,getY()+5);
            hadouken.play();
        }
    }
    public void acertarAlvo()
    {
        Actor b = getOneIntersectingObject(luigi.class);
        Actor hadu = getOneIntersectingObject(hadouken.class);
        if (b != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            
        }
    
        if (vida >= 0){
            getWorld().removeObject(b);
            getWorld().removeObject(hadu);
        }
  }
}
