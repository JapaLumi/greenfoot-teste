import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musiquinha.mp3");
    
    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Mario mario = new Mario();
        addObject(mario,386,492);
        Counter counter = new Counter();
        addObject(counter,383,368);
        Counter2 counter2 = new Counter2();
        addObject(counter2,648,360);
        counter.setLocation(199,70);
        mario.setLocation(186,464);
        counter2.setLocation(649,85);
        luigi luigi = new luigi();
        addObject(luigi,644,462);
    }
}
