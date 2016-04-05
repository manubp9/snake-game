import java.awt.*;
import java.awt.geom.*;

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
    private Canvas canvas;
    public static final int LONGITUD_SEGMENTO = 40;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    private static final int DIRECCION_DERECHA = 0;
    private static final int DIRECCION_ABAJO = 1;
    private static final int DIRECCION_IZQUIERDA = 2;
    private static final int DIRECCION_ARRIBA = 3;
    
    /**
     * Constructor for objects of class Segment
     * Direcciones válidas: 0 DERECHA, 1 ABAJO, 2 IZQUIERDA, 3 ARRIBA
     */
    public Segment(int direccion, int posX, int posY)
    {
        longitud = LONGITUD_SEGMENTO;
        this.direccion = direccion;
        this.posX = posX;
        this.posY = posY;
        color = Color.BLACK;
        canvas = new Canvas("myCanvas",500,500);
        dibujar();
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
        if (direccion == DIRECCION_DERECHA){
            posFinalX = posX + LONGITUD_SEGMENTO;
        }
        else if (direccion == DIRECCION_IZQUIERDA){
            posFinalX = posX - LONGITUD_SEGMENTO;
        }
        return posFinalX;
    }
    
    /**
     * Método que devuelve la posicion final en el eje Y de un segmento
     */
    public int getPosFinalY(){
        int posFinalY = posY;
        if (direccion == DIRECCION_ABAJO){
            posFinalY = posY + LONGITUD_SEGMENTO;
        }
        else if (direccion == DIRECCION_ARRIBA){
            posFinalY = posY - LONGITUD_SEGMENTO;
        }
        return posFinalY;
    }
    
    /**
     * Método que devuelve la direccion en la que se ha creado el segmento: 
     * 0º DERECHA, 90º ABAJO, 180º IZQUIERDA, 270º ARRIBA
     */
    public int getDireccion(){
        return direccion * DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES;
    }
    
    /**
     * Método que dibuja un segmento en el lienzo
     */
    public void dibujar(){
        canvas.setForegroundColor(color);
        if (direccion == DIRECCION_DERECHA){
            canvas.drawLine(posX, posY, posX + LONGITUD_SEGMENTO, posY);
        }
        else if (direccion == DIRECCION_ABAJO){
            canvas.drawLine(posX, posY, posX, posY + LONGITUD_SEGMENTO);
        }
        else if (direccion == DIRECCION_IZQUIERDA){
            canvas.drawLine(posX, posY, posX - LONGITUD_SEGMENTO, posY);
        }
        else if (direccion == DIRECCION_ARRIBA){
            canvas.drawLine(posX, posY, posX, posY - LONGITUD_SEGMENTO);
        }
    }
    
    /**
     * Método para comprobar si el segmento colisiona con otro
     */
    public boolean colisiona(){
        boolean colisiona = false;
        return colisiona;
    }
}
