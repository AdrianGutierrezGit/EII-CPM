package uo.cpm.modulo.ui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uo.cpm.modulo.service.Pizzeria;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class VentanaInformacionArticulos extends JFrame {

	private JPanel contentPane;
	private JPanel pnNorte;
	private JLabel lbLogo;
	private JLabel lbNombrePizzeria;
	private JPanel pnCentro;
	private JLabel lbFotoArticulo;
	private VentanaPrincipal vp;
	private int indiceArticulo;
	private JLabel lbDenominación;
	private JLabel lbDescripcion;
	private JLabel lbIntolerancia;
	private JLabel lbPrecio;
	private JTextArea taDescripcion;


	/**
	 * Create the frame.
	 * @param indice 
	 */
	public VentanaInformacionArticulos(VentanaPrincipal vp, int indiceArticulo) {
		this.vp = vp;
		this.indiceArticulo = indiceArticulo;
		setTitle("Adri\u00E1n Pizzerías");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInformacionArticulos.class.getResource("/img/logo.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 720, 550);
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
			pnNorte.setLayout(new GridLayout(0, 2, 0, 0));
			pnNorte.add(getLbLogo());
			pnNorte.add(getLbNombrePizzeria());
			
		}
		return pnNorte;
	}
	private JLabel getLbLogo() {
		if (lbLogo == null) {
			lbLogo = new JLabel("");
			lbLogo.setBackground(new Color(237, 218, 173));
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
			pnCentro.setLayout(null);
			pnCentro.add(getLbFotoArticulo());
			pnCentro.add(getLbDenominación());
			pnCentro.add(getLbDescripcion());
			pnCentro.add(getLbIntolerancia());
			pnCentro.add(getLbPrecio());
			pnCentro.add(getTaDescripcion());
			
		}
		return pnCentro;
	}
	private JLabel getLbFotoArticulo() {
		if (lbFotoArticulo == null) {
			lbFotoArticulo = new JLabel("");
			lbFotoArticulo.setBounds(248, 27, 255, 175);
			Image imagen = new ImageIcon(getClass().getResource("/img/" + vp.getPizzeria().getCodigoArticulo(indiceArticulo) + ".png")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (170), (int) (170),Image.SCALE_SMOOTH);
			lbFotoArticulo.setIcon(new ImageIcon(imagenFinal));
		}
		return lbFotoArticulo;
	}
	private JLabel getLbDenominación() {
		if (lbDenominación == null) {
			lbDenominación = new JLabel();
			lbDenominación.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbDenominación.setBounds(61, 227, 606, 20);
			lbDenominación.setText("Denominacion:                 " + vp.getPizzeria().getDenominacionArticulo(indiceArticulo));
		}
		return lbDenominación;
	}
	private JLabel getLbDescripcion() {
		if (lbDescripcion == null) {
			lbDescripcion = new JLabel();
			lbDescripcion.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbDescripcion.setBounds(61, 268, 113, 20);
			lbDescripcion.setText("Descripcion:");
		}
		return lbDescripcion;
	}
	private JLabel getLbIntolerancia() {
		if (lbIntolerancia == null) {
			lbIntolerancia = new JLabel();
			lbIntolerancia.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbIntolerancia.setBounds(61, 343, 606, 13);
			lbIntolerancia.setText("Posibilidad de intolerancias:                 " + esPosibleIntolerancias(vp.getPizzeria().getIntoleranciaArticulo(indiceArticulo)));
		}
		return lbIntolerancia;
	}
	private String esPosibleIntolerancias(boolean intoleranciaArticulo) {
		if(intoleranciaArticulo) {
			return "Si";
		}else {
			return "No";
		}
	}

	private JLabel getLbPrecio() {
		if (lbPrecio == null) {
			lbPrecio = new JLabel();
			lbPrecio.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbPrecio.setBounds(61, 381, 606, 13);
			lbPrecio.setText("Precio:                 " + vp.getPizzeria().getPrecioArticulo(indiceArticulo));
		}
		return lbPrecio;
	}
	private JTextArea getTaDescripcion() {
		if (taDescripcion == null) {
			taDescripcion = new JTextArea();
			taDescripcion.setEditable(false);
			taDescripcion.setFont(new Font("Tahoma", Font.BOLD, 16));
			taDescripcion.setBorder(null);
			taDescripcion.setBackground(new Color(238, 228, 159));
			taDescripcion.setBounds(203, 268, 433, 65);
			taDescripcion.setLineWrap(true);
			taDescripcion.setWrapStyleWord(true);
			taDescripcion.setText(vp.getPizzeria().getDescripcionArticulo(indiceArticulo));
		}
		return taDescripcion;
	}
}
