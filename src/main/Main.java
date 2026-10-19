package main;

import java.awt.EventQueue;

import javax.swing.UIManager;

import uo.cpm.modulo.service.Pizzeria;
import uo.cpm.modulo.ui.VentanaPrincipal;

public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			Pizzeria pizzeria = new Pizzeria();
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					VentanaPrincipal frame = new VentanaPrincipal(pizzeria);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
