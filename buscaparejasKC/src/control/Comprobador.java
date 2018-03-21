package control;

import modelo.Casilla;
import modelo.Tablero;

public class Comprobador implements Comprobable{

	@Override
	public Boolean CompararCasilla(Casilla casillaUno, Casilla casillaDos) {
		assert (casillaUno.isVisible()&&casillaDos.isVisible());
		if (casillaUno.getIdentificador()==casillaDos.getIdentificador()) {
			return true;
		} else return false;
	}

	@Override
	public Boolean ComprobarGanador(Tablero tablero) {
		// TODO Auto-generated method stub
		return null;
	}

}
