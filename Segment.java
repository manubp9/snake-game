import java.awt.Color;

/**
 * Write a description of class Segment here.
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class Segment
{
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color;
    public static final int LONGITUD_SEGMENTO = 10;
    
    /*
     * Constructor de la clase Segment
     */
    public Segment(int posX, int posY, int direccion, Color color)
    {
        posicionX = posX;
        posicionY = posY;
        this.direccion = direccion;
        this.color = color;
    }
    
    /*
     * Devuelve la coordenada del eje X donde acaba el segmento
     */
    public int getPosicionFinalX()
    {
        int posicionFinalX = posicionX;
        if (direccion == 0) {
            posicionFinalX += LONGITUD_SEGMENTO;
        } 
        else if (direccion == 180) {
            posicionFinalX -= LONGITUD_SEGMENTO;
        }
        return posicionFinalX;
    }
    
    /*
     * Devuelve la coordenada del eje Y donde acaba el segmento
     */
    public int getPosicionFinalY()
    {
        int posicionFinalY = posicionY;
        if (direccion == 90) {
            posicionFinalY += LONGITUD_SEGMENTO;
        }
        else if (direccion == 270) {
            posicionFinalY -= LONGITUD_SEGMENTO;
        }
        return posicionFinalY;
    }
    
    /*
     * Dibuja el segmento en el lienzo
     */
    public void dibujar(Canvas lienzo)
    {
        lienzo.setForegroundColor(color);
        lienzo.drawLine(posicionX, posicionY, getPosicionFinalX(), getPosicionFinalY());
    }
    
    /*
     * Borra el segmento del lienzo
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.setForegroundColor(Color.WHITE);
        lienzo.drawLine(posicionX, posicionY, getPosicionFinalX(), getPosicionFinalY());
    }
    
    /*
     * Devuelve la coordenada del eje X donde empieza el segmento
     */
    public int getPosicionInicialX()
    {
        return posicionX;
    }
    
    /*
     * Devuelve la coordenada del eje Y donde empieza el segmento
     */
    public int getPosicionInicialY()
    {
        return posicionY;
    }    
    
    /*
     * Devuelve la direccion que tiene el segmento
     */
    public int getDireccion()
    {
        return direccion;
    }
    
    /*
     * Devuelve true si el segmento colisiona con el segmento pasado como
     * parametro; false en otro caso
     */
    public boolean colisiona(Segment segmento)
    {
        boolean colisiona = false;
        if ((segmento.getPosicionFinalX() == posicionX) && 
            (segmento.getPosicionFinalY() == posicionY)) {
                colisiona = true;
        }
        return colisiona;
    }
}


















