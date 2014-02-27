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
public class Vector2D
{
    private final float x;
    private final float y;

    public Vector2D(float x, float y)
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
    
    public float length()
    {
        return (float)Math.sqrt(x*x + y*y);
    }
    
    public float direction()
    {
        float radians = (float) Math.atan2(y, x);
        float tmp = radians / (float)(Math.PI*2);
        float res = -(tmp-0.25f);
        if(res < 0.0f) res += 1.0f;
        return res;
    }
}
