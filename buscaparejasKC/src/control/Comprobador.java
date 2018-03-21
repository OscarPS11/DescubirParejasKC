package control;

import modelo.Casilla;
import modelo.Tablero;

public class Comprobador implements Comprobable{

	@Override
	public Boolean CompararCasilla(Casilla casillaUno, Casilla casillaDos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean ComprobarGanador(Tablero tablero) {
		for (int i = 0; i < tablero.getCasilla().length; i++) {
			for (int j = 0; j < tablero.getCasilla()[i].length; j++) {
				if (!tablero.getCasilla()[i][j].isVisible()) {
					return false;
				}
				
				
			}
			
		}
		return true;
	}

}
