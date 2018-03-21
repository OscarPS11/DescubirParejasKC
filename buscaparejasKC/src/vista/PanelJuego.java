package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;

public class PanelJuego extends JPanel {
	private JLabel aciertos;
	private JLabel tiempo;
	private JPanel panelBotones;
	private JPanel panelMarcador;

	/**
	 * Create the panel.
	 * CONTIENE LOS BOTONES Y MARCADORES.
	 */
	public PanelJuego() {
		setLayout(new BorderLayout(0, 0));
		
		panelMarcador = new JPanel();
		add(panelMarcador, BorderLayout.NORTH);
		GridBagLayout gbl_panelMarcador = new GridBagLayout();
		gbl_panelMarcador.columnWidths = new int[]{115, 33, 100, 190, 0};
		gbl_panelMarcador.rowHeights = new int[]{14, 0};
		gbl_panelMarcador.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelMarcador.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelMarcador.setLayout(gbl_panelMarcador);
		
		JLabel lblAciertos = new JLabel("ACIERTOS");
		lblAciertos.setForeground(new Color(34, 139, 34));
		lblAciertos.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
		GridBagConstraints gbc_lblAciertos = new GridBagConstraints();
		gbc_lblAciertos.fill = GridBagConstraints.BOTH;
		gbc_lblAciertos.insets = new Insets(0, 0, 0, 5);
		gbc_lblAciertos.gridx = 0;
		gbc_lblAciertos.gridy = 0;
		panelMarcador.add(lblAciertos, gbc_lblAciertos);
		
		aciertos = new JLabel("0");
		aciertos.setFont(new Font("Tahoma", Font.BOLD, 15));
		aciertos.setForeground(new Color(34, 139, 34));
		GridBagConstraints gbc_aciertos = new GridBagConstraints();
		gbc_aciertos.fill = GridBagConstraints.BOTH;
		gbc_aciertos.insets = new Insets(0, 0, 0, 5);
		gbc_aciertos.gridx = 1;
		gbc_aciertos.gridy = 0;
		panelMarcador.add(aciertos, gbc_aciertos);
		
		JLabel lblTiempo = new JLabel("TIEMPO");
		lblTiempo.setFont(new Font("Modern No. 20", Font.BOLD | Font.ITALIC, 15));
		GridBagConstraints gbc_lblTiempo = new GridBagConstraints();
		gbc_lblTiempo.fill = GridBagConstraints.BOTH;
		gbc_lblTiempo.insets = new Insets(0, 0, 0, 5);
		gbc_lblTiempo.gridx = 2;
		gbc_lblTiempo.gridy = 0;
		panelMarcador.add(lblTiempo, gbc_lblTiempo);
		
		tiempo = new JLabel("00:00:00");
		tiempo.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_tiempo = new GridBagConstraints();
		gbc_tiempo.anchor = GridBagConstraints.WEST;
		gbc_tiempo.fill = GridBagConstraints.VERTICAL;
		gbc_tiempo.gridx = 3;
		gbc_tiempo.gridy = 0;
		panelMarcador.add(tiempo, gbc_tiempo);
		
		panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
		
	}

	/**
	 * hace tortillas de patatas 
	 * @param filas
	 * @param columnas
	 */
	public void generarBotonera(int filas, int columnas){
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				JButton boton = new JButton(" ");
				boton.setName(i+" "+j);
				this.add(boton);
			}
		}
	}

	public JLabel getAciertos() {
		return aciertos;
	}

	public void setAciertos(JLabel aciertos) {
		this.aciertos = aciertos;
	}

	public JLabel getTiempo() {
		return tiempo;
	}

	public void setTiempo(JLabel tiempo) {
		this.tiempo = tiempo;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	public JPanel getPanelMarcador() {
		return panelMarcador;
	}

	public void setPanelMarcador(JPanel panelMarcador) {
		this.panelMarcador = panelMarcador;
	}
	
	
}
