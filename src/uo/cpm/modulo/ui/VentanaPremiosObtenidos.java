package uo.cpm.modulo.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;

public class VentanaPremiosObtenidos extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnNorte;
	private JLabel lbLogo;
	private JLabel lbNombrePizzeria;
	private JPanel pnCentro;
	private VentanaPrincipal vp;
	private JPanel pnNoHayPremios;
	private JLabel lbNoHayPremio;
	private JPanel pnGraciasPorJugar;
	private JLabel lbFotoMuñeco;
	private JLabel lbGraciasPorJugar;
	private JPanel pnHayPremios;
	private JLabel lbPremiosObtenidos;
	private JPanel pnPremiosObtenidos;


	/**
	 * Create the frame.
	 * @param ventanaPrincipal 
	 */
	public VentanaPremiosObtenidos(VentanaPrincipal ventanaPrincipal) {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPremiosObtenidos.class.getResource("/img/logo.jpg")));
		this.vp = ventanaPrincipal;
		setTitle("Adri\u00E1n Pizzerías: Premios Obtenidos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 575, 365);
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
			pnNorte.setBackground(Color.WHITE);
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
			pnCentro.setLayout(new CardLayout(0, 0));
			pnCentro.add(getPnNoHayPremios(), "pnNoHayPremios");
			pnCentro.add(getPnHayPremios(), "pnHayPremios");
			if(!vp.getPizzeria().haObtenidoPremios()) {
				((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnNoHayPremios");
			}else {
				((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnHayPremios");
			}
		}
		return pnCentro;
	}
	private JPanel getPnNoHayPremios() {
		if (pnNoHayPremios == null) {
			pnNoHayPremios = new JPanel();
			pnNoHayPremios.setBackground(new Color(238, 228, 159));
			pnNoHayPremios.setLayout(new GridLayout(2, 1, 0, 0));
			pnNoHayPremios.add(getLbNoHayPremio());
			pnNoHayPremios.add(getPnGraciasPorJugar());
		}
		return pnNoHayPremios;
	}
	private JLabel getLbNoHayPremio() {
		if (lbNoHayPremio == null) {
			lbNoHayPremio = new JLabel("No ha obtenido ningun premio");
			lbNoHayPremio.setHorizontalAlignment(SwingConstants.CENTER);
			lbNoHayPremio.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return lbNoHayPremio;
	}
	private JPanel getPnGraciasPorJugar() {
		if (pnGraciasPorJugar == null) {
			pnGraciasPorJugar = new JPanel();
			pnGraciasPorJugar.setBackground(new Color(238, 228, 159));
			pnGraciasPorJugar.add(getLbFotoMuñeco());
			pnGraciasPorJugar.add(getLbGraciasPorJugar());
		}
		return pnGraciasPorJugar;
	}
	private JLabel getLbFotoMuñeco() {
		if (lbFotoMuñeco == null) {
			lbFotoMuñeco = new JLabel("");
			Image imagen = new ImageIcon(getClass().getResource("/img/gracias_por_jugar.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbFotoMuñeco.setIcon(new ImageIcon(imagenFinal));
		}
		return lbFotoMuñeco;
	}
	private JLabel getLbGraciasPorJugar() {
		if (lbGraciasPorJugar == null) {
			lbGraciasPorJugar = new JLabel("Gracias por \r\nJugar");
			lbGraciasPorJugar.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lbGraciasPorJugar;
	}
	private JPanel getPnHayPremios() {
		if (pnHayPremios == null) {
			pnHayPremios = new JPanel();
			pnHayPremios.setBackground(new Color(238, 228, 159));
			pnHayPremios.setLayout(new BorderLayout(0, 0));
			pnHayPremios.add(getLbPremiosObtenidos(), BorderLayout.NORTH);
			pnHayPremios.add(getPnPremiosObtenidos(), BorderLayout.CENTER);
		}
		return pnHayPremios;
	}
	private JLabel getLbPremiosObtenidos() {
		if (lbPremiosObtenidos == null) {
			lbPremiosObtenidos = new JLabel("Premios obtenidos");
			lbPremiosObtenidos.setHorizontalAlignment(SwingConstants.CENTER);
			lbPremiosObtenidos.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lbPremiosObtenidos;
	}
	private JPanel getPnPremiosObtenidos() {
		if (pnPremiosObtenidos == null) {
			pnPremiosObtenidos = new JPanel();
			pnPremiosObtenidos.setBackground(new Color(238, 228, 159));
			pnPremiosObtenidos.setLayout(new GridLayout(0, 1, 0, 0));
			mostrarPremios();
		}
		return pnPremiosObtenidos;
	}
	private void mostrarPremios() {
		for(int i= 0; i < vp.getPizzeria().getNumPremios(); i++) {
			getPnPremiosObtenidos().add(nuevoPremio(i));
		}
		
	}
	private JPanel nuevoPremio(int i) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 228, 159));
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		JLabel nombrePremio = new JLabel();
		nombrePremio.setText(vp.getPizzeria().getDenominacionPremio(i));
		nombrePremio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nombrePremio.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(nombrePremio);
		JLabel fotoPremio = new JLabel();
		Image imagen = new ImageIcon(getClass().getResource("/img/"+ vp.getPizzeria().getFotoPremio(i) + ".png")).getImage();
		Image imagenFinal = imagen.getScaledInstance((int) (90), (int) (90),Image.SCALE_SMOOTH);
		fotoPremio.setIcon(new ImageIcon(imagenFinal));
		fotoPremio.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(fotoPremio);
		return panel;
	}
}
