import java.awt.Color;
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
    private int posicionX;
    private int posicionY;
    private Color color;
    private Canvas lienzo;
    public static final int LONGITUD_SEGMENTO = 10;

    /**
     * Constructor for objects of class Segment
     * Direcciones válidas: 0 DERECHA, 90 ABAJO, 180 IZQUIERDA, 270 ARRIBA
     */
    public Segment(int posX, int posY,int direccion, Color color)
    {
        longitud = LONGITUD_SEGMENTO;
        posicionX = posX;
        posicionY = posY;
        this.direccion = direccion;
        this.color = color;
    }

    /**
     * Método que devuelve la posicion inicial en el eje X de un segmento
     */
    public int getPosicionInicialX(){
        return posicionX;
    }

    /**
     * Método que devuelve la posicion inicial en el eje Y de un segmento
     */
    public int getPosicionInicialY(){
        return  posicionY;
    }

    /**
     * Método que devuelve la posicion final en el eje X de un segmento
     */
    public int getPosicionFinalX(){
        int posFinalX = posicionX;
        if (direccion == 0){
            posFinalX = posicionX + LONGITUD_SEGMENTO;
        }
        else if (direccion == 180){
            posFinalX = posicionX - LONGITUD_SEGMENTO;
        }
        return posFinalX;
    }

    /**
     * Método que devuelve la posicion final en el eje Y de un segmento
     */
    public int getPosicionFinalY(){
        int posFinalY = posicionY;
        if (direccion == 90){
            posFinalY = posicionY + LONGITUD_SEGMENTO;
        }
        else if (direccion == 270){
            posFinalY = posicionY - LONGITUD_SEGMENTO;
        }
        return posFinalY;
    }

    /**
     * Método que devuelve la direccion en la que se ha creado el segmento: 
     * 0º DERECHA, 90º ABAJO, 180º IZQUIERDA, 270º ARRIBA
     */
    public int getDireccion(){
        return direccion;
    }

    /**
     * Método que dibuja el segmento en el lienzo
     */
    public void dibujar(Canvas lienzo){
        lienzo.setForegroundColor(color);
        lienzo.drawLine(posicionX,posicionY,getPosicionFinalX(),getPosicionFinalY());
    }
    
    /**
     * Método que borra el segmento del lienzo
     */
    public void borrar(Canvas lienzo)
    {
      lienzo.setForegroundColor(lienzo.getBackgroundColor());
      lienzo.drawLine(posicionX,posicionY,getPosicionFinalX(),getPosicionFinalY());
    }

    /**
     * Método para comprobar si el segmento colisiona con otro
     */
    public boolean colisiona(Segment segmento){
        return (posicionX == segmento.getPosicionFinalX() && posicionY == segmento.getPosicionFinalY());
    }
}
