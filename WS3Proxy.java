/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws3proxy;

import ws3dproxy.CommandExecException;
import ws3dproxy.WS3DProxy;
import ws3dproxy.model.Creature;
import ws3dproxy.model.World;
import ws3dproxy.model.WorldPoint;

/**
 *
 * @author wellington
 */
public class WS3Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    WS3DProxy proxy = new WS3DProxy();
    
    try {
    
        World w = World.getInstance();
        w.reset();
        World.createFood(0, 350, 75);
        World.createFood(0, 100, 220);
        World.createFood(0, 250, 210);
        Creature c = proxy.createCreature(100,450,0, 3);
        
        c.start();
        WorldPoint position = c.getPosition();
        double pitch = c.getPitch();
        double fuel = c.getFuel();
        
        c.getLeaflets();
        
        
        
         // the following command will make the agent move straingh foward
        //c.moveto(1, 2, 2);
        c.move(0,0, 0);
        
        
        
    } catch (CommandExecException e) {
     System.out.println("Erro capturado"); 
    }
    
    
    
    }
    
}
