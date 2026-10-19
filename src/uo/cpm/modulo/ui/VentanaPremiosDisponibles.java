package uo.cpm.modulo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class VentanaPremiosDisponibles extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnNorte;
	private JLabel lbLogo;
	private JLabel lbNombrePizzeria;
	private JPanel pnCentro;
	private JLabel lbPremiosDisponibles;
	private JLabel lbPremioIntento2;
	private JLabel lbPremioIntento3;
	private JLabel lbPremioIntento4;
	private JLabel lbPremioIntento5;
	private JLabel lbPremioIntento1;


	/**
	 * Create the frame.
	 */
	public VentanaPremiosDisponibles() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPremiosDisponibles.class.getResource("/img/logo.jpg")));
		setTitle("Adri\u00E1n Pizzerías: Premios disponibles");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 228, 159));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPnNorte(), BorderLayout.NORTH);
		contentPane.add(getPnCentro(), BorderLayout.CENTER);
	}

	private JPanel getPnNorte() {
		if (pnNorte == null) {
			pnNorte = new JPanel();
			pnNorte.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
			pnNorte.setBackground(new Color(255, 255, 255));
			pnNorte.setLayout(new GridLayout(1, 2, 0, 0));
			pnNorte.add(getLbLogo());
			pnNorte.add(getLbNombrePizzeria());
		}
		return pnNorte;
	}
	private JLabel getLbLogo() {
		if (lbLogo == null) {
			lbLogo = new JLabel("");
			lbLogo.setBackground(new Color(255, 255, 255));
			Image imagen = new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbLogo.setIcon(new ImageIcon(imagenFinal));
		}
		return lbLogo;
	}
	private JLabel getLbNombrePizzeria() {
		if (lbNombrePizzeria == null) {
			lbNombrePizzeria = new JLabel("Adri\u00E1n Pizzer\u00EDas");
			lbNombrePizzeria.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return lbNombrePizzeria;
	}
	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setBackground(new Color(238, 228, 159));
			pnCentro.setLayout(new GridLayout(6, 1, 0, 0));
			pnCentro.add(getLbPremiosDisponibles());
			pnCentro.add(getLbPremioIntento1());
			pnCentro.add(getLbPremioIntento2());
			pnCentro.add(getLbPremioIntento3());
			pnCentro.add(getLbPremioIntento4());
			pnCentro.add(getLbPremioIntento5());
		}
		return pnCentro;
	}
	private JLabel getLbPremiosDisponibles() {
		if (lbPremiosDisponibles == null) {
			lbPremiosDisponibles = new JLabel("Premios disponibles");
			lbPremiosDisponibles.setHorizontalAlignment(SwingConstants.CENTER);
			lbPremiosDisponibles.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lbPremiosDisponibles;
	}
	private JLabel getLbPremioIntento2() {
		if (lbPremioIntento2 == null) {
			lbPremioIntento2 = new JLabel("2\u00BA intento......................................................................... Entrante aleatorio de nuestra carta");
			lbPremioIntento2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbPremioIntento2;
	}
	private JLabel getLbPremioIntento3() {
		if (lbPremioIntento3 == null) {
			lbPremioIntento3 = new JLabel("3\u00BA intento......................................................................... Ensalada aleatoria de nuestra carta");
			lbPremioIntento3.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbPremioIntento3;
	}
	private JLabel getLbPremioIntento4() {
		if (lbPremioIntento4 == null) {
			lbPremioIntento4 = new JLabel("4\u00BA intento............................................................................ Postres aleatorio de nuestra carta");
			lbPremioIntento4.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbPremioIntento4;
	}
	private JLabel getLbPremioIntento5() {
		if (lbPremioIntento5 == null) {
			lbPremioIntento5 = new JLabel("5\u00BA intento............................................................................. Bebida aleatoria de nuestra carta");
			lbPremioIntento5.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbPremioIntento5;
	}
	private JLabel getLbPremioIntento1() {
		if (lbPremioIntento1 == null) {
			lbPremioIntento1 = new JLabel("1\u00BA intento.............................................................................. Pizza aleatoria de nuestra carta");
			lbPremioIntento1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbPremioIntento1;
	}
}
