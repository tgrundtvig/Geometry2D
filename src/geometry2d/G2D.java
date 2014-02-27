/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometry2d;

/**
 *
 * @author tog
 */
public class G2D
{
    private static final Vector2D zeroVector = new Vector2D(0,0);
    
    public static Point2D add(Point2D p, Vector2D v)
    {
        return new Point2D(p.getX()+v.getX(), p.getY()+v.getY());
    }
    
    public static Vector2D add(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.getX()+v2.getX(), v1.getY()+v2.getY());
    }
    
    public static Vector2D multiply(Vector2D v, float s)
    {
        return new Vector2D(v.getX()*s, v.getY()*s);
    }
    
    public static Vector2D getZeroVector()
    {
        return zeroVector;
    }
    
    public static Vector2D fromTo(Point2D a, Point2D b)
    {
        return new Vector2D(b.getX() - a.getX(), b.getY() - a.getY());
    }
    
    public static float distance(Point2D a, Point2D b)
    {
        return fromTo(a,b).length();
    }
}
