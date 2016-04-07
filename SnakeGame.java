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
     * M�todo que dibuja la serpiente
     */
    public void drawSnake(){
        lienzo.erase();
        serpiente = new Snake(ALTO_LIENZO,ANCHO_LIENZO);
        serpiente.dibujar(lienzo);
    }//

    /**
     * M�todo para dar animacion a la serpiente
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
    /**
     * que pinte una serie de galletas de forma aleatoria por la pantalla pero en posiciones que la serpiente pueda comer. 
     * Cada vez que la serpiente come una galleta se hace un segmento m�s larga. La serpiente debe moverse por pantalla sin parar hasta que se quede sin salida. 
     * A�ade los m�todos y las clases que consideres necesarios.
     */
    public void startGame()
    {
        
    }
}
