package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.PanelInicio;
import vista.PanelJuego;
import vista.VistaPrincipal;

public class ListenerInicio implements ActionListener {
Iniciador iniciador;
PanelInicio panelinicio;
VistaPrincipal vistaprincipal;
PanelJuego paneljuego;
//ComboBox combobox
//TODO crear constructor cuando tengamos informacion.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Remueve PanelInicio de PanelPrincipal
		//Asignar Filas y Columnas a la Logica
		//crear botonera.
		//a�adir PanelJuego a PanelPrincipal
		//crear ListenerJuego (tiene que recibir paneljuego y un nuevo comprobador)
		//a�adir ListenerJuego a Botones.
		//Iniciador tiene que tener un un m�todo "IniciarJuego" que tiene que recibir un Casting Dificultad del ComboBox getItemsSelected
		//
	}

}
