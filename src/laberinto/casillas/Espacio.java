/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laberinto.casillas;

/**
 *
 * @author ion
 */
public abstract class Espacio {
    private Integer x;
    private Integer y;
    private Integer z;
    
    public abstract boolean pasable();

    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public Integer getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(Integer z) {
        this.z = z;
    }
    
    
}
