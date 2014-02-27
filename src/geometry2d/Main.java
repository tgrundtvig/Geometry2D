/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometry2d;

/**
 *
 * @author tog
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Vector2D v = new Vector2D(0, 10);
        
        float dir = v.direction();
        System.out.println("Direction: " + dir);
    }
    
}
