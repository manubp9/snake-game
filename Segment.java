import java.awt.*;

/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    private int longitud;
    private int direccion;
    private int posX;
    private int posY;
    private Color color;
    private static final int LONGITUD_SEGMENTO = 4;
    
    /**
     * Constructor for objects of class Segment
     */
    public Segment(int longitud, int direccion, int posX, int posY, Color color)
    {
        this.longitud = longitud;
        this.direccion = direccion;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }
    
    /**
     * Método que devuelve la posicion inicial en el eje X de un segmento
     */
    public int getPosInicialX(){
        return posX;
    }
        
    /**
     * Método que devuelve la posicion inicial en el eje Y de un segmento
     */
    public int getPosInicialY(){
        return posY;
    }
    
    /**
     * Método que devuelve la posicion final en el eje X de un segmento
     */
    public int getPosFinalX(){
        int posFinalX = posX;
        if (direccion == 0 || direccion == 180){
            posFinalX = posX + LONGITUD_SEGMENTO;
        }
        return posFinalX;
    }
    
    /**
     * Método que devuelve la posicion final en el eje Y de un segmento
     */
    public int getPosFinalY(){
        int posFinalY = posY;
        if (direccion == 90 || direccion == 270){
            posFinalY = posY + LONGITUD_SEGMENTO;
        }
        return posFinalY;
    }
}
