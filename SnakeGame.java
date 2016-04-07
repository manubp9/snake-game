/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    private Canvas lienzo;
    private Snake serpiente;
    private static final int ALTO_LIENZO = 500;
    private static final int ANCHO_LIENZO = 500;

    /**
     * Constructor for objects of class SnakeGame
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Lienzo",ALTO_LIENZO,ANCHO_LIENZO);
    }

    /**
     * Método que dibuja la serpiente
     */
    public void drawSnake(){
        lienzo.erase();
        serpiente = new Snake(ALTO_LIENZO,ANCHO_LIENZO);
        serpiente.dibujar(lienzo);
    }//

    /**
     * Método para dar animacion a la serpiente
     */
    public void animateSnake()
    {
        serpiente.borrar(lienzo);
        while(serpiente.mover())

        {
            
            serpiente.dibujar(lienzo);
            lienzo.wait(100);
            serpiente.borrar(lienzo);

        }
        serpiente.dibujar(lienzo);
        lienzo.drawString("GAME OVER",220, 240);

    }
}
