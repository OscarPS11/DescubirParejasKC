package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VistaPrincipal extends JFrame {

	protected JPanel contentPane;
	protected JPanel panelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDescubrirParejas = new JLabel("Descubrir Parejas");
		lblDescubrirParejas.setFont(new Font("Snap ITC", Font.PLAIN, 19));
		lblDescubrirParejas.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDescubrirParejas, BorderLayout.NORTH);
		
		 panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
	}

}
