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
public class Point2D
{
    private final float x;
    private final float y;

    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y;
    }
}
