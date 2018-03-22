package control;

import modelo.Casilla;
import modelo.Tablero;

public interface Comprobable {
/**
 * recibe dos casillas, las compara y si no son iguales, Visible=False. 
 * @param casillaUno casilla que fue pulsada en primer lugar.
 * @param casillaDos casilla que fue pulsada en segundo lugar.
 * @return true si son iguales false en caso contrario.
 */
Boolean CompararCasilla(Casilla casillaUno,Casilla casillaDos);


/**
 * recibe un tablero y si todas las casillas tienen visible a true retorna true
 * @param tablero es un array de casillas
 * @return true si todas casillas visibles false en caso contrario
 */
Boolean ComprobarGanador(Tablero tablero);
}
