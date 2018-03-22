package control;

public interface Iniciable {
	/**
	 * recibe una interface Dificultad con un valor que va a determinar el numero de filas y columnas.
	 * contiene los m�todos privados: 
	 * GenerarTablero(int fila, int columna),
	 * RellenarTablero()crea una casilla por cada posicion del tablero y recibir� un n�mero (referencia).
	 * DesordenarCasillas() el tablero queda con las casillas desordenadas.,
	 * @param ParaFilaYColumna Enum Dificultad que contiene un valor (.getValor)
	 * que servira para las filas y las columnas
	 */

void iniciarJuego(Dificultad ParaFilaYColumna);



}
