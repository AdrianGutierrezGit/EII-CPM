package uo.cpm.modulo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import uo.cpm.modulo.service.Pizzeria;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.help.*;
import java.net.*;
import java.io.*;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnNorte;
	private JPanel pnCentro;
	private JLabel lbLogoRegistro;
	private JPanel pnRegistro;
	private JLabel lbDNI;
	private JTextField txDNI;
	private JLabel lbNumReserva;
	private JTextField txNumReserva;
	private JButton btConfirmar;
	private Pizzeria pizzeria;
	private JScrollPane scPnPrincipal;
	private JPanel pnFiltro;
	private JButton btPizzaDelDia;
	private JToggleButton tgBtPan;
	private JToggleButton tgBtPasta;
	private JToggleButton tgBtPizza;
	private JPanel pnPantallaPrincipal;
	private JPanel pnIntoleraciasYJugar;
	private JPanel pnSur;
	private JPanel pnBtnsRegistro;
	private JPanel pnBtnsPrincipal;
	private JPanel pnPrecio;
	private JLabel lbPrecio;
	private JButton btTramitarPedido;
	private JPanel pnTituloRegistro;
	private JLabel lbNombrePizzeriaRegistro;
	private JPanel pnTituloPrincipal;
	private JLabel lbLogoPrincipal;
	private JLabel lbNombrePizzeriaPrincipal;
	private JButton btNuevaReserva;
	private ProcesaFiltro pf = new ProcesaFiltro();
	private JToggleButton tgBtBebida;
	private JToggleButton tgBtEnsalada;
	private JToggleButton tgBtEntrante;
	private JToggleButton tgBtPostre;
	private JPanel pnPizzaDelDia;
	private JPanel pnPizza;
	private JTextField txPizzaDelDia;
	private JPanel pnBtnsPizzaDelDia;
	private JButton btEliminarPizzaDelDia;
	private JButton btAniadirPizzaDelDia;
	private JLabel lbFotoPizzaDelDia;
	private JTextField txPrecioTotal;
	private JPanel pnTituloTramitarPedido;
	private JLabel lbLogoTramitarPedido;
	private JLabel lbNombrePizzeriaTramitarPedido;
	private JPanel pnTramitarPedido;
	private JPanel pnBtnsTramitarPedido;
	private JLabel lbComentarios;
	private JScrollPane scPnPedido;
	private JScrollPane scPnComentarios;
	private JTextArea taObservaciones;
	private JPanel pnPrecioFinal;
	private JPanel pnBtnsPagarOSeguir;
	private JTextField txPrecioFinal;
	private JPanel pnBtPagar;
	private JButton btPagar;
	private JPanel pnBtSeguirPidiendo;
	private JButton btSeguirPidiendo;
	private JPanel pnJuego;
	private JPanel pnTituloJuego;
	private JLabel lbLogoJuego;
	private JLabel lbNombrePizzeriaJuego;
	private JPanel pnNorteJuego;
	private JPanel pnNumIntentos;
	private JPanel pnPremiosDisponibles;
	private JLabel lbIntentosRestantes;
	private JTextField txIntentosRestantes;
	private JButton btPremiosDisponibles;
	private JPanel pnBtnsJuego;
	private JButton btVolverAlMenu;
	private JPanel pnCentroJuego;
	private JPanel pnTablero;
	private DestapaCasilla dc = new DestapaCasilla();
	private JPanel pnArticulos;
	private JButton btJugar;
	private JPanel pnSeccionesResumen;
	private JPanel pnResumenPedido;
	private JLabel lbProductosResumenPedido;
	private JLabel lbUnidadesResumenPedido;
	private JLabel lbPrecioResumenPedido;
	private JButton btAyudaRegistro;
	private JToggleButton tgBtIntolerancias;
	private DarFoco df = new DarFoco();
	private JPanel pnBtNuevaReserva;
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal(Pizzeria pizzeria) {
		addWindowListener(df);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/logo.jpg")));
		this.pizzeria = pizzeria;
		setTitle("Adri\u00E1n Pizzerías: Registro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 717, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPnNorte(), BorderLayout.NORTH);
		contentPane.add(getPnCentro(), BorderLayout.CENTER);
		contentPane.add(getPnSur(), BorderLayout.SOUTH);
		cargaAyuda("intro");
		setLocationRelativeTo(null);

	}
	private JPanel getPnNorte() {
		if (pnNorte == null) {
			pnNorte = new JPanel();
			pnNorte.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
			pnNorte.setBackground(new Color(255, 255, 255));
			pnNorte.setLayout(new CardLayout(0, 0));
			pnNorte.add(getPnTituloRegistro(), "pnTituloRegistro");
			pnNorte.add(getPnTituloPrincipal(), "pnTituloPrincipal");
			pnNorte.add(getPnTituloTramitarPedido(), "pnTituloTramitarPedido");
			pnNorte.add(getPnTituloJuego(), "pnTituloJuego");
		}
		return pnNorte;
	}
	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setBackground(new Color(255, 255, 255));
			pnCentro.setLayout(new CardLayout(0, 0));
			pnCentro.add(getPnRegistro(), "pnRegistro");
			pnCentro.add(getScPnPrincipal(), "pnPrincipal");
			pnCentro.add(getPnTramitarPedido(), "pnTramitarPedido");
			pnCentro.add(getPnJuego(), "pnJuego");
		}
		return pnCentro;
	}
	private JLabel getLbLogoRegistro() {
		if (lbLogoRegistro == null) {
			lbLogoRegistro = new JLabel("");
			lbLogoRegistro.setBackground(new Color(237, 218, 173));
			Image imagen = new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbLogoRegistro.setIcon(new ImageIcon(imagenFinal));
		}
		return lbLogoRegistro;
	}
	
	private JPanel getPnRegistro() {
		if (pnRegistro == null) {
			pnRegistro = new JPanel();
			pnRegistro.setBackground(new Color(238, 228, 159));
			pnRegistro.setLayout(null);
			pnRegistro.add(getLbDNI());
			pnRegistro.add(getTxDNI());
			pnRegistro.add(getLbNumReserva());
			pnRegistro.add(getTxNumReserva());
			pnRegistro.add(getBtAyudaRegistro());
		}
		return pnRegistro;
	}
	private JLabel getLbDNI() {
		if (lbDNI == null) {
			lbDNI = new JLabel("DNI:");
			lbDNI.setDisplayedMnemonic('d');
			lbDNI.setLabelFor(getTxDNI());
			lbDNI.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbDNI.setBounds(69, 119, 55, 20);
		}
		return lbDNI;
	}
	private JTextField getTxDNI() {
		if (txDNI == null) {
			txDNI = new JTextField();
			txDNI.setBounds(324, 117, 305, 33);
			txDNI.setColumns(10);
		}
		return txDNI;
	}
	private JLabel getLbNumReserva() {
		if (lbNumReserva == null) {
			lbNumReserva = new JLabel("N\u00BA de reserva:\r\n");
			lbNumReserva.setLabelFor(getTxNumReserva());
			lbNumReserva.setDisplayedMnemonic('n');
			lbNumReserva.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbNumReserva.setBounds(69, 215, 170, 20);
		}
		return lbNumReserva;
	}
	private JTextField getTxNumReserva() {
		if (txNumReserva == null) {
			txNumReserva = new JTextField();
			txNumReserva.setColumns(10);
			txNumReserva.setBounds(324, 213, 305, 33);
		}
		return txNumReserva;
	}
	private JButton getBtConfirmar() {
		if (btConfirmar == null) {
			btConfirmar = new JButton("Confirmar");
			btConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btConfirmar.setForeground(new Color(0, 0, 0));
			btConfirmar.setBackground(new Color(0, 255, 0));
			btConfirmar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarPnPrincipal();
				}
			});
			btConfirmar.setMnemonic('c');
		}
		return btConfirmar;
	}
	protected void guardarReservaAsociadaAPedido() {
		pizzeria.guardarDatosReserva(getTxDNI().getText(), getTxNumReserva().getText());
		pizzeria.eliminarReserva(getTxDNI().getText(), getTxNumReserva().getText());
		
	}
	protected void mostrarPnPrincipal() {
		if(comprobacionParametros()) {
			this.setTitle("Adrián Pizzerías");
			((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnPrincipal");
			((CardLayout)getPnSur().getLayout()).show(getPnSur(), "pnBtnsPrincipal");
			((CardLayout)getPnNorte().getLayout()).show(getPnNorte(), "pnTituloPrincipal");
			cargaAyuda("menu");

		}
		
	}
	protected boolean comprobacionParametros() {
		if(getTxDNI().getText().isBlank()) {
			JOptionPane.showMessageDialog(getPnRegistro(), "Error: introduzca el dni asociado a la reserva","Adrián Pizzerías" , JOptionPane.ERROR_MESSAGE);
		}else if(getTxNumReserva().getText().isBlank()) {
			JOptionPane.showMessageDialog(getPnRegistro(), "Error: introduzca el numero de reserva","Adrián Pizzerías" , JOptionPane.ERROR_MESSAGE);
		}else if(!pizzeria.confirmarReserva(getTxDNI().getText(), getTxNumReserva().getText())) {
			JOptionPane.showMessageDialog(getPnRegistro(), "Los datos introducidos no se corresponden con ninguna reserva","Adrián Pizzerías" , JOptionPane.ERROR_MESSAGE);
		}else {
			guardarReservaAsociadaAPedido();
			return true;
		}
		return false;
		
	}
	private JScrollPane getScPnPrincipal() {
		if (scPnPrincipal == null) {
			scPnPrincipal = new JScrollPane();
			scPnPrincipal.setBackground(new Color(238, 228, 159));
			scPnPrincipal.setRowHeaderView(getPnFiltro());
			scPnPrincipal.setViewportView(getPnPantallaPrincipal());
			scPnPrincipal.setColumnHeaderView(getPnIntoleraciasYJugar());
		}
		return scPnPrincipal;
	}
	
	private void creaBotonesArticulos() {
		getPnArticulos().removeAll();
		getPnArticulos().repaint();
		for(int i = 0; i < pizzeria.getNumArticulos(); i++) {
			if(pizzeria.estaEnFiltro(i)) {
				getPnArticulos().add(nuevoPanel(i));
			}
		}
		getPnArticulos().validate();
		
	}
	private JButton nuevoBoton(int indice) {
		JButton boton = new JButton();
		boton.setActionCommand(String.valueOf(indice));
		boton.setBackground(Color.WHITE);
		boton.setVerticalAlignment(SwingConstants.CENTER);
		boton.setHorizontalTextPosition(SwingConstants.CENTER);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentanaDescripcionArticulo(indice);
			}
		});
		boton.setVerticalTextPosition(SwingConstants.TOP);
		if(pizzeria.isPizzaDelDia(indice)) {
			boton.setText(pizzeria.getNombreProducto(indice) + "(Pizza del dia)");
		}else {
			boton.setText(pizzeria.getNombreProducto(indice));
		}
		setImagenAdaptada(boton, "/img/" + pizzeria.getCodigoArticulo(indice)  + ".png");
		return boton;
	}
	protected void mostrarVentanaDescripcionArticulo(int indice) {
		VentanaInformacionArticulos via = new VentanaInformacionArticulos(this, indice);
		via.setLocationRelativeTo(this); //centra con relacion a la ventana printipal
		via.setVisible(true);
		
		
	}
	private void setImagenAdaptada(JButton boton, String imagen) {
		Image imagenInicial = new ImageIcon(getClass().getResource(imagen)).getImage();
		Image imagenFinal = imagenInicial.getScaledInstance((int) (90), (int) (90F),Image.SCALE_SMOOTH);
		boton.setIcon(new ImageIcon(imagenFinal));
	}
	private JPanel getPnFiltro() {
		if (pnFiltro == null) {
			pnFiltro = new JPanel();
			pnFiltro.setBorder(new LineBorder(new Color(238, 228, 159), 2));
			pnFiltro.setBackground(new Color(238, 228, 159));
			pnFiltro.setLayout(new GridLayout(8, 1, 0, 0));
			pnFiltro.add(getBtPizzaDelDia());
			pnFiltro.add(getTgBtPan());
			pnFiltro.add(getTgBtEntrante());
			pnFiltro.add(getTgBtEnsalada());
			pnFiltro.add(getTgBtPasta());
			pnFiltro.add(getTgBtPizza());
			pnFiltro.add(getTgBtBebida());
			pnFiltro.add(getTgBtPostre());
		}
		return pnFiltro;
	}
	private JButton getBtPizzaDelDia() {
		if (btPizzaDelDia == null) {
			btPizzaDelDia = new JButton("Pizza del d\u00EDa");
			btPizzaDelDia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ponerPizzaDelDia();
				}
			});
			btPizzaDelDia.setMnemonic('p');
		}
		return btPizzaDelDia;
	}
	
	protected void ponerPizzaDelDia() {
		((CardLayout)getPnPantallaPrincipal().getLayout()).show(getPnPantallaPrincipal(), "pnPizzaDelDia");
		desactivarBotones();
		
	}
	private void desactivarBotones() {
		//logica
		pizzeria.limpiarListaArticulosFiltrados();
		desmarcarSeccionesFiltro();
		
	}
	private JToggleButton getTgBtPan() {
		if (tgBtPan == null) {
			tgBtPan = new JToggleButton("Pan");
			tgBtPan.setSelected(false);
			tgBtPan.setActionCommand("Pan");
			tgBtPan.addActionListener(pf);
			tgBtPan.setMnemonic('a');
		}
		return tgBtPan;
	}
	private JToggleButton getTgBtPasta() {
		if (tgBtPasta == null) {
			tgBtPasta = new JToggleButton("Pasta");
			tgBtPasta.setSelected(false);
			tgBtPasta.addActionListener(pf);
			tgBtPasta.setActionCommand("Pasta");
			tgBtPasta.setMnemonic('s');
		}
		return tgBtPasta;
	}
	private JToggleButton getTgBtPizza() {
		if (tgBtPizza == null) {
			tgBtPizza = new JToggleButton("Pizzas");
			tgBtPizza.setSelected(false);
			tgBtPizza.setActionCommand("Pizza");
			tgBtPizza.addActionListener(pf);
			tgBtPizza.setMnemonic('z');
		}
		return tgBtPizza;
	}
	
	private JPanel getPnPantallaPrincipal() {
		if (pnPantallaPrincipal == null) {
			pnPantallaPrincipal = new JPanel();
			pnPantallaPrincipal.setBackground(new Color(238, 228, 159));
			pnPantallaPrincipal.setLayout(new CardLayout(0, 0));
			pnPantallaPrincipal.add(getPnArticulos(), "pnArticulos");
			pnPantallaPrincipal.add(getPnPizzaDelDia(), "pnPizzaDelDia");
		}
		return pnPantallaPrincipal;
	}
	private JPanel getPnIntoleraciasYJugar() {
		if (pnIntoleraciasYJugar == null) {
			pnIntoleraciasYJugar = new JPanel();
			FlowLayout fl_pnIntoleraciasYJugar = (FlowLayout) pnIntoleraciasYJugar.getLayout();
			fl_pnIntoleraciasYJugar.setAlignment(FlowLayout.RIGHT);
			pnIntoleraciasYJugar.setBackground(new Color(238, 228, 159));
			pnIntoleraciasYJugar.add(getBtJugar());
			pnIntoleraciasYJugar.add(getTgBtIntolerancias());
		}
		return pnIntoleraciasYJugar;
	}
	private JPanel getPnSur() {
		if (pnSur == null) {
			pnSur = new JPanel();
			pnSur.setBackground(new Color(238, 228, 159));
			pnSur.setLayout(new CardLayout(0, 0));
			pnSur.add(getPnBtnsRegistro(), "pnBtnsRegistro");
			pnSur.add(getPnBtnsPrincipal(), "pnBtnsPrincipal");
			pnSur.add(getPnBtnsTramitarPedido(), "pnBtnsTramitarPedido");
			pnSur.add(getPnBtnsJuego(), "pnBtnsJuego");
		}
		return pnSur;
	}
	private JPanel getPnBtnsRegistro() {
		if (pnBtnsRegistro == null) {
			pnBtnsRegistro = new JPanel();
			pnBtnsRegistro.setBackground(new Color(238, 228, 159));
			pnBtnsRegistro.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
			pnBtnsRegistro.add(getBtConfirmar());
		}
		return pnBtnsRegistro;
	}
	private JPanel getPnBtnsPrincipal() {
		if (pnBtnsPrincipal == null) {
			pnBtnsPrincipal = new JPanel();
			pnBtnsPrincipal.setBackground(new Color(238, 228, 159));
			pnBtnsPrincipal.setLayout(new GridLayout(0, 2, 0, 0));
			pnBtnsPrincipal.add(getPnPrecio());
			pnBtnsPrincipal.add(getBtTramitarPedido());
		}
		return pnBtnsPrincipal;
	}
	private JPanel getPnPrecio() {
		if (pnPrecio == null) {
			pnPrecio = new JPanel();
			pnPrecio.setBackground(new Color(255, 255, 255));
			pnPrecio.add(getLbPrecio());
			pnPrecio.add(getTxPrecioTotal());
		}
		return pnPrecio;
	}
	private JLabel getLbPrecio() {
		if (lbPrecio == null) {
			lbPrecio = new JLabel("Importe total:");
			lbPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lbPrecio;
	}
	private JButton getBtTramitarPedido() {
		if (btTramitarPedido == null) {
			btTramitarPedido = new JButton("Tramitar comanda y ver pedido");
			btTramitarPedido.setMnemonic('c');
			btTramitarPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btTramitarPedido.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarPnTramitarPedido();
				}
			});
			btTramitarPedido.setForeground(new Color(0, 0, 0));
			btTramitarPedido.setBackground(Color.GREEN);
		}
		return btTramitarPedido;
	}
	protected void mostrarPnTramitarPedido() {
		this.setTitle("Adrián Pizzerías: Tramitar pedido");
		((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnTramitarPedido");
		((CardLayout)getPnNorte().getLayout()).show(getPnNorte(), "pnTituloTramitarPedido");
		((CardLayout)getPnSur().getLayout()).show(getPnSur(), "pnBtnsTramitarPedido");
		cargaAyuda("intolerancias");
		getTxPrecioFinal().setText("Precio: " + String.format("%.2f", pizzeria.getImportePedido()));
		if(pizzeria.noHayPedido()) {
			getBtPagar().setEnabled(false);
		}
		crearResumenPedido();
		
	}
	private void crearResumenPedido() {
		getPnResumenPedido().removeAll();
		getPnResumenPedido().repaint();
		for(int i = 0; i < pizzeria.getNumArticulosPedido(); i++) {
			getPnResumenPedido().add(nuevoPanelArticuloResumen(i));
		}
		
	}
	private JPanel nuevoPanelArticuloResumen(int i) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		panel.setBackground(Color.WHITE);
		panel.add(nuevaLabelProductoArticuloResumen(i));
		panel.add(nuevaLabelUnidadesArticuloResumen(i));
		panel.add(nuevaLabelPrecioArticuloResumen(i));
		return panel;
	}
	private JLabel nuevaLabelPrecioArticuloResumen(int i) {
		JLabel label = new JLabel();
		label.setText(String.format("%.2f",pizzeria.getPrecioArticuloEnPedido(i)* pizzeria.getUnidadesArticuloEnPedido(i)));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		return label;
	}
	private JLabel nuevaLabelUnidadesArticuloResumen(int i) {
		JLabel label = new JLabel();
		label.setText(String.valueOf(pizzeria.getUnidadesArticuloEnPedido(i)));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		return label;
	}
	private JLabel nuevaLabelProductoArticuloResumen(int i) {
		JLabel label = new JLabel();
		label.setText(pizzeria.getDenominacionArticuloEnPedido(i));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		return label;
	}
	private JPanel nuevoPanel(int indice) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(nuevoBoton(indice), BorderLayout.CENTER);
		panel.add(nuevoPanelArticulo(indice), BorderLayout.SOUTH);
		return panel;
	}
	private JPanel nuevoPanelArticulo(int indice) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		panel.setBackground(Color.WHITE);
		JLabel label = new JLabel();
		label.setText("Precio: " + String.valueOf(pizzeria.getPrecioArticulo(indice)));
		panel.add(label);
		if(pizzeria.getIntoleranciaArticulo(indice)) {
			JLabel lbIntolerancias = new JLabel();
			Image imagen = new ImageIcon(getClass().getResource("/img/intolerancias.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (50), (int) (30),Image.SCALE_SMOOTH);
			lbIntolerancias.setIcon(new ImageIcon(imagenFinal));
			lbIntolerancias.setToolTipText("Es posible realizar este articulo adaptado a intolerancias");
			panel.add(lbIntolerancias);
		}
		panel.add(botonMas(indice));
		panel.add(botonMenos(indice));
		return panel;
		
	}
	
	private JButton botonMas(int indice) {
		JButton boton = new JButton();
		boton.setText("+");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirAPedido(indice);
			}
		});
		boton.setBackground(Color.GREEN);
		return boton;
	}
	
	protected void añadirAPedido(int indice) {
		pizzeria.añadirAPedido(indice);
		getTxPrecioTotal().setText(String.format("%.2f", pizzeria.getImportePedido()));
		getBtPagar().setEnabled(true);
	}
	
	private JButton botonMenos(int indice) {
		JButton boton = new JButton();
		boton.setText("-");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarDePedido(indice);
			}
		});
		boton.setBackground(Color.RED);
		return boton;
		
	}
	
	protected void eliminarDePedido(int indice) {
		pizzeria.eliminarDePedido(indice);
		getTxPrecioTotal().setText(String.format("%.2f", pizzeria.getImportePedido()));
		
	}
	private JPanel getPnTituloRegistro() {
		if (pnTituloRegistro == null) {
			pnTituloRegistro = new JPanel();
			pnTituloRegistro.setBackground(new Color(255, 255, 255));
			pnTituloRegistro.setLayout(new GridLayout(1, 2, 0, 0));
			pnTituloRegistro.add(getLbLogoRegistro());
			pnTituloRegistro.add(getLbNombrePizzeriaRegistro());
		}
		return pnTituloRegistro;
	}
	private JLabel getLbNombrePizzeriaRegistro() {
		if (lbNombrePizzeriaRegistro == null) {
			lbNombrePizzeriaRegistro = new JLabel("Adri\u00E1n Pizzer\u00EDas");
			lbNombrePizzeriaRegistro.setFont(new Font("Arial", Font.BOLD, 30));
		}
		return lbNombrePizzeriaRegistro;
	}
	private JPanel getPnTituloPrincipal() {
		if (pnTituloPrincipal == null) {
			pnTituloPrincipal = new JPanel();
			pnTituloPrincipal.setBackground(new Color(255, 255, 255));
			pnTituloPrincipal.setLayout(new GridLayout(0, 3, 0, 0));
			pnTituloPrincipal.add(getLbLogoPrincipal());
			pnTituloPrincipal.add(getLbNombrePizzeriaPrincipal());
			pnTituloPrincipal.add(getPnBtNuevaReserva());
		}
		return pnTituloPrincipal;
	}
	private JLabel getLbLogoPrincipal() {
		if (lbLogoPrincipal == null) {
			lbLogoPrincipal = new JLabel("");
			lbLogoPrincipal.setBackground(new Color(237, 218, 173));
			Image imagen = new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbLogoPrincipal.setIcon(new ImageIcon(imagenFinal));
		}
		return lbLogoPrincipal;
	}
	private JLabel getLbNombrePizzeriaPrincipal() {
		if (lbNombrePizzeriaPrincipal == null) {
			lbNombrePizzeriaPrincipal = new JLabel("Adri\u00E1n Pizzer\u00EDas");
			lbNombrePizzeriaPrincipal.setFont(new Font("Arial", Font.BOLD, 24));
		}
		return lbNombrePizzeriaPrincipal;
	}
	private JButton getBtNuevaReserva() {
		if (btNuevaReserva == null) {
			btNuevaReserva = new JButton("");
			btNuevaReserva.setToolTipText("Preparar para nueva reserva(Solo uso de personal autorizado)");
			btNuevaReserva.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarPantallaNuevaRerserva();
				}
			});
			btNuevaReserva.setBackground(new Color(240, 240, 240));
			Image imagen = new ImageIcon(getClass().getResource("/img/usuario.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (80), (int) (80),Image.SCALE_SMOOTH);
			btNuevaReserva.setIcon(new ImageIcon(imagenFinal));
		}
		return btNuevaReserva;
	}
	
	protected void mostrarPantallaNuevaRerserva() {
		VentanaNuevaReserva vnr = new VentanaNuevaReserva(this);
		vnr.setLocationRelativeTo(this); //centra con relacion a la ventana printipal
		vnr.setModal(true);
		vnr.setVisible(true);
		
	}

	public class ProcesaFiltro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JToggleButton boton = (JToggleButton) e.getSource();
			if(boton.isSelected()) {
				if(getTgBtIntolerancias().isSelected()) {
					pizzeria.añadirArticulosFiltroSoloIntolerancias(boton.getActionCommand());
				}else {
					pizzeria.añadirArticulosFiltro(boton.getActionCommand());
				}
				((CardLayout)getPnPantallaPrincipal().getLayout()).show(getPnPantallaPrincipal(), "pnArticulos");
				creaBotonesArticulos();
			}else {
				pizzeria.eliminarArticulosFiltro(boton.getActionCommand());
				((CardLayout)getPnPantallaPrincipal().getLayout()).show(getPnPantallaPrincipal(), "pnArticulos");
				creaBotonesArticulos();
			}
			
		}
		
	}
	private JToggleButton getTgBtBebida() {
		if (tgBtBebida == null) {
			tgBtBebida = new JToggleButton("Bebidas");
			tgBtBebida.setSelected(false);
			tgBtBebida.setActionCommand("Bebida");
			tgBtBebida.addActionListener(pf);
			tgBtBebida.setMnemonic('b');
		}
		return tgBtBebida;
	}
	private JToggleButton getTgBtEnsalada() {
		if (tgBtEnsalada == null) {
			tgBtEnsalada = new JToggleButton("Ensaladas");
			tgBtEnsalada.setSelected(false);
			tgBtEnsalada.setMnemonic('l');
			tgBtEnsalada.setActionCommand("Ensalada");
			tgBtEnsalada.addActionListener(pf);
		}
		return tgBtEnsalada;
	}
	private JToggleButton getTgBtEntrante() {
		if (tgBtEntrante == null) {
			tgBtEntrante = new JToggleButton("Entrantes");
			tgBtEntrante.setSelected(false);
			tgBtEntrante.setMnemonic('t');
			tgBtEntrante.setActionCommand("Entrante");
			tgBtEntrante.addActionListener(pf);
		}
		return tgBtEntrante;
	}
	private JToggleButton getTgBtPostre() {
		if (tgBtPostre == null) {
			tgBtPostre = new JToggleButton("Postres");
			tgBtPostre.setSelected(false);
			tgBtPostre.setActionCommand("Postre");
			tgBtPostre.setMnemonic('o');
			tgBtPostre.addActionListener(pf);
		}
		return tgBtPostre;
	}
	private JPanel getPnPizzaDelDia() {
		if (pnPizzaDelDia == null) {
			pnPizzaDelDia = new JPanel();
			pnPizzaDelDia.setBackground(new Color(238, 228, 159));
			pnPizzaDelDia.setLayout(new BorderLayout(0, 0));
			pnPizzaDelDia.add(getPnPizza(), BorderLayout.CENTER);
			creaBotonesArticulos();
		}
		return pnPizzaDelDia;
	}
	private JPanel getPnPizza() {
		if (pnPizza == null) {
			pnPizza = new JPanel();
			pnPizza.setBackground(new Color(238, 228, 159));
			pnPizza.setLayout(new BorderLayout(0, 0));
			pnPizza.add(getTxPizzaDelDia(), BorderLayout.NORTH);
			pnPizza.add(getPnBtnsPizzaDelDia(), BorderLayout.SOUTH);
			pnPizza.add(getLbFotoPizzaDelDia(), BorderLayout.CENTER);
		}
		return pnPizza;
	}
	private JTextField getTxPizzaDelDia() {
		if (txPizzaDelDia == null) {
			txPizzaDelDia = new JTextField();
			txPizzaDelDia.setBorder(null);
			txPizzaDelDia.setHorizontalAlignment(SwingConstants.CENTER);
			txPizzaDelDia.setFont(new Font("Tahoma", Font.BOLD, 40));
			txPizzaDelDia.setText("Prueba nuestra pizza del d\u00EDa por solo " + String.format("%.2f", pizzeria.getPrecioPizzaDelDia()) + " (20% de descuento)");
			txPizzaDelDia.setBackground(new Color(238, 228, 159));
			txPizzaDelDia.setColumns(10);
		}
		return txPizzaDelDia;
	}
	private JPanel getPnBtnsPizzaDelDia() {
		if (pnBtnsPizzaDelDia == null) {
			pnBtnsPizzaDelDia = new JPanel();
			pnBtnsPizzaDelDia.setBackground(new Color(238, 228, 159));
			pnBtnsPizzaDelDia.setLayout(new GridLayout(1, 0, 0, 0));
			pnBtnsPizzaDelDia.add(getBtEliminarPizzaDelDia());
			pnBtnsPizzaDelDia.add(getBtAniadirPizzaDelDia());
		}
		return pnBtnsPizzaDelDia;
	}
	private JButton getBtEliminarPizzaDelDia() {
		if (btEliminarPizzaDelDia == null) {
			btEliminarPizzaDelDia = new JButton("Eliminar");
			btEliminarPizzaDelDia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					eliminarPizzaDelDia();
				}
			});
			btEliminarPizzaDelDia.setForeground(new Color(0, 0, 0));
			btEliminarPizzaDelDia.setBackground(new Color(255, 0, 0));
		}
		return btEliminarPizzaDelDia;
	}
	protected void eliminarPizzaDelDia() {
		pizzeria.eliminarPizzaDelDia();
		getTxPrecioTotal().setText(String.format("%.2f", pizzeria.getImportePedido()));
	}
	private JButton getBtAniadirPizzaDelDia() {
		if (btAniadirPizzaDelDia == null) {
			btAniadirPizzaDelDia = new JButton("A\u00F1adir");
			btAniadirPizzaDelDia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					añadirPizzaDelDia();
				}
			});
			btAniadirPizzaDelDia.setForeground(new Color(0, 0, 0));
			btAniadirPizzaDelDia.setBackground(new Color(0, 255, 0));
		}
		return btAniadirPizzaDelDia;
	}
	protected void añadirPizzaDelDia() {
		pizzeria.añadirPizzaDelDia();
		getTxPrecioTotal().setText(String.format("%.2f", pizzeria.getImportePedido()));
		getBtPagar().setEnabled(true);
		
	}
	private JLabel getLbFotoPizzaDelDia() {
		if (lbFotoPizzaDelDia == null) {
			lbFotoPizzaDelDia = new JLabel("");
			lbFotoPizzaDelDia.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbFotoPizzaDelDia.setHorizontalTextPosition(SwingConstants.CENTER);
			lbFotoPizzaDelDia.setHorizontalAlignment(SwingConstants.CENTER);
			lbFotoPizzaDelDia.setVerticalTextPosition(SwingConstants.BOTTOM);
			Image imagen = new ImageIcon(getClass().getResource("/img/" + pizzeria.getCodigoPizzaDelDia() + ".png")).getImage();
			lbFotoPizzaDelDia.setIcon(new ImageIcon(imagen));
			lbFotoPizzaDelDia.setText("     Pizza: " + pizzeria.getDenominancionPizzaDelDia() + "          Ingredientes: " + pizzeria.getDescripcionPizzaDelDia());
		}
		return lbFotoPizzaDelDia;
	}
	private JTextField getTxPrecioTotal() {
		if (txPrecioTotal == null) {
			txPrecioTotal = new JTextField();
			txPrecioTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
			txPrecioTotal.setText(String.valueOf(pizzeria.getImportePedido()));
			txPrecioTotal.setEditable(false);
			txPrecioTotal.setColumns(10);
		}
		return txPrecioTotal;
	}
	public Pizzeria getPizzeria() {
		return pizzeria;
	}
	public void mostrarPnRegistro() {
		desmarcarSeccionesFiltro();
		getTxDNI().setText("");
		getTxNumReserva().setText("");
		getTxPrecioTotal().setText(String.valueOf(pizzeria.getImportePedido()));
		((CardLayout)getPnPantallaPrincipal().getLayout()).show(getPnPantallaPrincipal(), "pnArticulosCarta");
		((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnRegistro");
		((CardLayout)getPnSur().getLayout()).show(getPnSur(), "pnBtnsRegistro");
		((CardLayout)getPnNorte().getLayout()).show(getPnNorte(), "pnTituloRegistro");
		cargaAyuda("intro");
		
	}
	private void desmarcarSeccionesFiltro() {
		pizzeria.limpiarListaArticulosFiltrados();
		getTgBtBebida().setSelected(false);
		getTgBtEntrante().setSelected(false);
		getTgBtEnsalada().setSelected(false);
		getTgBtPizza().setSelected(false);
		getTgBtPostre().setSelected(false);
		getTgBtPasta().setSelected(false);
		getTgBtPan().setSelected(false);
		
	}
	private JPanel getPnTituloTramitarPedido() {
		if (pnTituloTramitarPedido == null) {
			pnTituloTramitarPedido = new JPanel();
			pnTituloTramitarPedido.setBackground(new Color(255, 255, 255));
			pnTituloTramitarPedido.setLayout(new GridLayout(0, 2, 0, 0));
			pnTituloTramitarPedido.add(getLbLogoTramitarPedido());
			pnTituloTramitarPedido.add(getLbNombrePizzeriaTramitarPedido());
		}
		return pnTituloTramitarPedido;
	}
	private JLabel getLbLogoTramitarPedido() {
		if (lbLogoTramitarPedido == null) {
			lbLogoTramitarPedido = new JLabel("");
			lbLogoTramitarPedido.setBackground(new Color(237, 218, 173));
			Image imagen = new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbLogoTramitarPedido.setIcon(new ImageIcon(imagenFinal));
		}
		return lbLogoTramitarPedido;
	}
	private JLabel getLbNombrePizzeriaTramitarPedido() {
		if (lbNombrePizzeriaTramitarPedido == null) {
			lbNombrePizzeriaTramitarPedido = new JLabel("Adri\u00E1n Pizzer\u00EDas");
			lbNombrePizzeriaTramitarPedido.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return lbNombrePizzeriaTramitarPedido;
	}
	private JPanel getPnTramitarPedido() {
		if (pnTramitarPedido == null) {
			pnTramitarPedido = new JPanel();
			pnTramitarPedido.setBackground(new Color(238, 228, 159));
			pnTramitarPedido.setLayout(null);
			pnTramitarPedido.add(getLbComentarios());
			pnTramitarPedido.add(getScPnPedido());
			pnTramitarPedido.add(getScPnComentarios());
		}
		return pnTramitarPedido;
	}
	private JPanel getPnBtnsTramitarPedido() {
		if (pnBtnsTramitarPedido == null) {
			pnBtnsTramitarPedido = new JPanel();
			pnBtnsTramitarPedido.setBackground(new Color(238, 228, 159));
			pnBtnsTramitarPedido.setLayout(new GridLayout(1, 0, 0, 0));
			pnBtnsTramitarPedido.add(getPnPrecioFinal());
			pnBtnsTramitarPedido.add(getPnBtnsPagarOSeguir());
		}
		return pnBtnsTramitarPedido;
	}
	private JLabel getLbComentarios() {
		if (lbComentarios == null) {
			lbComentarios = new JLabel("Comentarios:");
			lbComentarios.setDisplayedMnemonic('c');
			lbComentarios.setLabelFor(getTaObservaciones());
			lbComentarios.setFont(new Font("Tahoma", Font.BOLD, 14));
			lbComentarios.setBounds(25, 195, 113, 13);
		}
		return lbComentarios;
	}
	private JScrollPane getScPnPedido() {
		if (scPnPedido == null) {
			scPnPedido = new JScrollPane();
			scPnPedido.setBorder(null);
			scPnPedido.setBounds(25, 25, 644, 143);
			scPnPedido.setColumnHeaderView(getPnSeccionesResumen());
			scPnPedido.setViewportView(getPnResumenPedido());
		}
		return scPnPedido;
	}
	private JScrollPane getScPnComentarios() {
		if (scPnComentarios == null) {
			scPnComentarios = new JScrollPane();
			scPnComentarios.setBorder(new LineBorder(new Color(0, 0, 0)));
			scPnComentarios.setBounds(25, 218, 644, 67);
			scPnComentarios.setViewportView(getTaObservaciones());
		}
		return scPnComentarios;
	}
	private JTextArea getTaObservaciones() {
		if (taObservaciones == null) {
			taObservaciones = new JTextArea();
			taObservaciones.setWrapStyleWord(true);
			taObservaciones.setLineWrap(true);
		}
		return taObservaciones;
	}
	private JPanel getPnPrecioFinal() {
		if (pnPrecioFinal == null) {
			pnPrecioFinal = new JPanel();
			pnPrecioFinal.setLayout(new GridLayout(1, 0, 0, 0));
			pnPrecioFinal.add(getTxPrecioFinal());
		}
		return pnPrecioFinal;
	}
	private JPanel getPnBtnsPagarOSeguir() {
		if (pnBtnsPagarOSeguir == null) {
			pnBtnsPagarOSeguir = new JPanel();
			pnBtnsPagarOSeguir.setBackground(new Color(255, 255, 255));
			pnBtnsPagarOSeguir.setLayout(new GridLayout(0, 2, 0, 0));
			pnBtnsPagarOSeguir.add(getPnBtPagar());
			pnBtnsPagarOSeguir.add(getPnBtSeguirPidiendo());
		}
		return pnBtnsPagarOSeguir;
	}
	private JTextField getTxPrecioFinal() {
		if (txPrecioFinal == null) {
			txPrecioFinal = new JTextField();
			txPrecioFinal.setHorizontalAlignment(SwingConstants.CENTER);
			txPrecioFinal.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
			txPrecioFinal.setFont(new Font("Tahoma", Font.BOLD, 15));
			txPrecioFinal.setBackground(new Color(255, 255, 255));
			txPrecioFinal.setEditable(false);
			txPrecioFinal.setColumns(10);
		}
		return txPrecioFinal;
	}
	private JPanel getPnBtPagar() {
		if (pnBtPagar == null) {
			pnBtPagar = new JPanel();
			pnBtPagar.setBackground(new Color(238, 228, 159));
			pnBtPagar.add(getBtPagar());
		}
		return pnBtPagar;
	}
	private JButton getBtPagar() {
		if (btPagar == null) {
			btPagar = new JButton("Pagar");
			btPagar.setMnemonic('p');
			btPagar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btPagar.setEnabled(false);
			btPagar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					registrarComanda();
					comprobarSiJugo();
				}
			});
			btPagar.setForeground(Color.WHITE);
			btPagar.setBackground(Color.GREEN);
		}
		return btPagar;
	}
	protected void registrarComanda() {
		pizzeria.registrarComanda(getTaObservaciones().getText());
		
	}
	protected void comprobarSiJugo() {
		if(!pizzeria.yaSeHaJugado()) {
			getBtJugar().setEnabled(true);
		}
		if(pizzeria.yaSeHaJugado()) {
			JOptionPane.showMessageDialog(null, "Su comanda ha sido recibida en cocina", "Adrián Pizzerías: comanda recibida", JOptionPane.INFORMATION_MESSAGE);
			mostrarPnPrincipalNuevaComanda();
		}else {
			preguntarPorJugar();
		}
		
	}
	protected void preguntarPorJugar() {
		if(JOptionPane.showConfirmDialog(null, "       Su comanda hay sido recibida en cocina\n¿Desea jugar a un juego para conseguir premios?\n              "
				+ "(Solo podra jugar una vez)", "Adrián Pizzerías: confirmacion de juego", 
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
			pizzeria.haJugadoAlJuego();
			getBtJugar().setEnabled(false);
			mostrarPnJuego();
		}else {
			mostrarPnPrincipalNuevaComanda();
		}
		
	}
	private void mostrarPnJuego() {
		this.setTitle("Adrián Pizzerías: Juego");
		((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnJuego");
		((CardLayout)getPnSur().getLayout()).show(getPnSur(), "pnBtnsJuego");
		((CardLayout)getPnNorte().getLayout()).show(getPnNorte(), "pnTituloJuego");
		cargaAyuda("juego");
		
	}
	
	private void mostrarPnPrincipalNuevaComanda() {
		//logica
		pizzeria.limpiarListaArticulosFiltrados();
		pizzeria.iniciarNuevaComanda();
		
		//interfaz
		this.setTitle("Adrián Pizzerías");
		creaBotonesArticulos();
		desmarcarSeccionesFiltro();
		getTxPrecioTotal().setText(String.valueOf(pizzeria.getImportePedido()));
		getTaObservaciones().setText("");
		mostrarPnPrincipalParaNuevaComanda();
		
	}
	private void mostrarPnPrincipalParaNuevaComanda() {
		((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnPrincipal");
		((CardLayout)getPnPantallaPrincipal().getLayout()).show(getPnPantallaPrincipal(), "pnArticulos");
		((CardLayout)getPnSur().getLayout()).show(getPnSur(), "pnBtnsPrincipal");
		((CardLayout)getPnNorte().getLayout()).show(getPnNorte(), "pnTituloPrincipal");
		cargaAyuda("menu");
		
	}
	private JPanel getPnBtSeguirPidiendo() {
		if (pnBtSeguirPidiendo == null) {
			pnBtSeguirPidiendo = new JPanel();
			pnBtSeguirPidiendo.setBackground(new Color(238, 228, 159));
			pnBtSeguirPidiendo.add(getBtSeguirPidiendo());
		}
		return pnBtSeguirPidiendo;
	}
	private JButton getBtSeguirPidiendo() {
		if (btSeguirPidiendo == null) {
			btSeguirPidiendo = new JButton("Seguir pidiendo");
			btSeguirPidiendo.setMnemonic('s');
			btSeguirPidiendo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btSeguirPidiendo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarPnPrincipalParaSeguirPidiendo();
				}
			});
			btSeguirPidiendo.setForeground(new Color(0, 0, 0));
			btSeguirPidiendo.setBackground(Color.GREEN);
		}
		return btSeguirPidiendo;
	}
	protected void mostrarPnPrincipalParaSeguirPidiendo() {
		this.setTitle("Adrián Pizzerías");
		((CardLayout)getPnCentro().getLayout()).show(getPnCentro(), "pnPrincipal");
		((CardLayout)getPnSur().getLayout()).show(getPnSur(), "pnBtnsPrincipal");
		((CardLayout)getPnNorte().getLayout()).show(getPnNorte(), "pnTituloPrincipal");
		cargaAyuda("menu");
		
	}
	private JPanel getPnJuego() {
		if (pnJuego == null) {
			pnJuego = new JPanel();
			pnJuego.setBackground(new Color(238, 228, 159));
			pnJuego.setLayout(new BorderLayout(0, 0));
			pnJuego.add(getPnNorteJuego(), BorderLayout.NORTH);
			pnJuego.add(getPnCentroJuego(), BorderLayout.CENTER);
		}
		return pnJuego;
	}
	private JPanel getPnTituloJuego() {
		if (pnTituloJuego == null) {
			pnTituloJuego = new JPanel();
			pnTituloJuego.setBackground(new Color(255, 255, 255));
			pnTituloJuego.setLayout(new GridLayout(0, 2, 0, 0));
			pnTituloJuego.add(getLbLogoJuego());
			pnTituloJuego.add(getLbNombrePizzeriaJuego());
		}
		return pnTituloJuego;
	}
	private JLabel getLbLogoJuego() {
		if (lbLogoJuego == null) {
			lbLogoJuego = new JLabel("");
			lbLogoJuego.setBackground(new Color(237, 218, 173));
			Image imagen = new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbLogoJuego.setIcon(new ImageIcon(imagenFinal));
		}
		return lbLogoJuego;
	}
	private JLabel getLbNombrePizzeriaJuego() {
		if (lbNombrePizzeriaJuego == null) {
			lbNombrePizzeriaJuego = new JLabel("Adri\u00E1n Pizzer\u00EDas");
			lbNombrePizzeriaJuego.setFont(new Font("Tahoma", Font.BOLD, 30));
			
		}
		return lbNombrePizzeriaJuego;
	}
	private JPanel getPnNorteJuego() {
		if (pnNorteJuego == null) {
			pnNorteJuego = new JPanel();
			pnNorteJuego.setLayout(new GridLayout(0, 2, 0, 0));
			pnNorteJuego.add(getPnNumIntentos());
			pnNorteJuego.add(getPnPremiosDisponibles());
		}
		return pnNorteJuego;
	}
	private JPanel getPnNumIntentos() {
		if (pnNumIntentos == null) {
			pnNumIntentos = new JPanel();
			pnNumIntentos.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
			pnNumIntentos.setBackground(new Color(238, 228, 159));
			pnNumIntentos.setLayout(new GridLayout(0, 2, 0, 0));
			pnNumIntentos.add(getLbIntentosRestantes());
			pnNumIntentos.add(getTxIntentosRestantes());
		}
		return pnNumIntentos;
	}
	private JPanel getPnPremiosDisponibles() {
		if (pnPremiosDisponibles == null) {
			pnPremiosDisponibles = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnPremiosDisponibles.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			pnPremiosDisponibles.setBackground(new Color(238, 228, 159));
			pnPremiosDisponibles.add(getBtPremiosDisponibles());
		}
		return pnPremiosDisponibles;
	}
	private JLabel getLbIntentosRestantes() {
		if (lbIntentosRestantes == null) {
			lbIntentosRestantes = new JLabel("Intentos restantes:");
			lbIntentosRestantes.setBackground(new Color(238, 228, 159));
			lbIntentosRestantes.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return lbIntentosRestantes;
	}
	private JTextField getTxIntentosRestantes() {
		if (txIntentosRestantes == null) {
			txIntentosRestantes = new JTextField();
			txIntentosRestantes.setBorder(null);
			txIntentosRestantes.setBackground(new Color(238, 228, 159));
			txIntentosRestantes.setEditable(false);
			txIntentosRestantes.setText(String.valueOf(pizzeria.getNumIntentos()));
			txIntentosRestantes.setColumns(10);
		}
		return txIntentosRestantes;
	}
	private JButton getBtPremiosDisponibles() {
		if (btPremiosDisponibles == null) {
			btPremiosDisponibles = new JButton("Premios Disponibles");
			btPremiosDisponibles.setMnemonic('p');
			btPremiosDisponibles.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaPremiosDisponibles();
				}
			});
			btPremiosDisponibles.setForeground(new Color(0, 0, 0));
			btPremiosDisponibles.setBackground(new Color(0, 255, 0));
			btPremiosDisponibles.setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
		return btPremiosDisponibles;
	}
	protected void mostrarVentanaPremiosDisponibles() {
		VentanaPremiosDisponibles vpd = new VentanaPremiosDisponibles();
		vpd.setResizable(true);
		vpd.setVisible(true);
		
	}
	private JPanel getPnBtnsJuego() {
		if (pnBtnsJuego == null) {
			pnBtnsJuego = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnBtnsJuego.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			pnBtnsJuego.setBackground(new Color(238, 228, 159));
			pnBtnsJuego.add(getBtVolverAlMenu());
		}
		return pnBtnsJuego;
	}
	private JButton getBtVolverAlMenu() {
		if (btVolverAlMenu == null) {
			btVolverAlMenu = new JButton("Volver al men\u00FA");
			btVolverAlMenu.setMnemonic('s');
			btVolverAlMenu.setEnabled(false);
			btVolverAlMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarPnPrincipalNuevaComanda();
					
				}
			});
			btVolverAlMenu.setForeground(new Color(0, 0, 0));
			btVolverAlMenu.setBackground(new Color(0, 255, 0));
			btVolverAlMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btVolverAlMenu;
	}
	private JPanel getPnCentroJuego() {
		if (pnCentroJuego == null) {
			pnCentroJuego = new JPanel();
			pnCentroJuego.setBorder(null);
			pnCentroJuego.setBackground(new Color(238, 228, 159));
			pnCentroJuego.setLayout(null);
			pnCentroJuego.add(getPnTablero());
		}
		return pnCentroJuego;
	}
	private JPanel getPnTablero() {
		if (pnTablero == null) {
			pnTablero = new JPanel();
			pnTablero.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			pnTablero.setBackground(new Color(238, 228, 159));
			pnTablero.setBounds(138, 23, 426, 249);
			pnTablero.setLayout(new GridLayout(4, 4, 0, 0));
			crearTableroJuego();
		}
		return pnTablero;
	}
	private void crearTableroJuego() {
		getPnTablero().removeAll();
		for(int i = 0; i < pizzeria.getTamañoTablero(); i++) {
			getPnTablero().add(nuevoBotonTablero(i));
		}
		pizzeria.imprimirConfiguracionTablero();
		getPnTablero().validate();
		
	}
	
	private JButton nuevoBotonTablero(int indice) {
		JButton boton = new JButton();
		boton.addActionListener(dc);
		boton.setBackground(Color.WHITE);
		if(pizzeria.comprobarParejas(indice)) {
			Image imagen = new ImageIcon(getClass().getResource(pizzeria.obtenerImagen(indice))).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (95), (int) (95),Image.SCALE_SMOOTH);
			boton.setIcon(new ImageIcon(imagenFinal));
			boton.setDisabledIcon(new ImageIcon(imagenFinal));
			boton.setEnabled(false);
		} 
		boton.setActionCommand(String.valueOf(indice));
		return boton;
	}
	
	public class DestapaCasilla implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			seleccionCasilla(Integer.parseInt(boton.getActionCommand()));
			
		}
		
	}
	public void seleccionCasilla(int indice) {
		//logica
		pizzeria.seleccionCasilla(indice);
		
		//interfaz
		actualizarIntentos();
		destaparCasilla(indice);
		comprobarPareja();
		compruebaFin();
		
	}
	private void actualizarIntentos() {
		getTxIntentosRestantes().setText(String.valueOf(pizzeria.getNumIntentos()));
		
	}
	private void comprobarPareja() {
		if(!pizzeria.hayPareja()&& pizzeria.hayIntentos()) {
			crearTableroJuegoDesactivado();
			Timer timer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					crearTableroJuego();
					
				}
		});
			timer.setRepeats(false);
			timer.start();
		}else if(pizzeria.hayDosCasillasSeleccionadas() && pizzeria.hayPareja()){
			pizzeria.añadirPremio();
		}
	}

	protected void crearTableroJuegoDesactivado() {
		getPnTablero().removeAll();
		for(int i = 0; i < pizzeria.getTamañoTablero(); i++) {
			getPnTablero().add(nuevoBotonTableroDesactivado(i));
		}
		pizzeria.imprimirConfiguracionTablero();
		getPnTablero().validate();
		
	}
	private JButton nuevoBotonTableroDesactivado(int indice) {
		JButton boton = new JButton();
		boton.addActionListener(dc);
		if(pizzeria.comprobarParejas(indice) || pizzeria.isSeleccionUno(indice) || pizzeria.isSeleccionDos(indice)) {
			Image imagen = new ImageIcon(getClass().getResource(pizzeria.obtenerImagen(indice))).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (95), (int) (95),Image.SCALE_SMOOTH);
			boton.setIcon(new ImageIcon(imagenFinal));
			boton.setDisabledIcon(new ImageIcon(imagenFinal));
		} 
		boton.setEnabled(false);
		boton.setActionCommand(String.valueOf(indice));
		return boton;
	}
	private void compruebaFin() {
		if(pizzeria.comprobarFinJuego()) {
			descubrirTablero();
			mostrarVentanaPremiosObtenidos();
			getBtVolverAlMenu().setEnabled(true);
		}
		
	}
	private void mostrarVentanaPremiosObtenidos() {
		VentanaPremiosObtenidos vpo = new VentanaPremiosObtenidos(this);
		vpo.setVisible(true);
		
		
	}
	private void descubrirTablero() {
		for(int i = 0; i < getPnTablero().getComponentCount(); i++) {
			destaparCasilla(i);
		}
		
	}
	private void destaparCasilla(int indice) {
		Image imagen = new ImageIcon(getClass().getResource(pizzeria.obtenerImagen(indice))).getImage();
		Image imagenFinal = imagen.getScaledInstance((int) (95), (int) (95),Image.SCALE_SMOOTH);
		((JButton) getPnTablero().getComponent(indice)).setIcon(new ImageIcon(imagenFinal));
		((JButton) getPnTablero().getComponent(indice)).setDisabledIcon(new ImageIcon(imagenFinal));
		getPnTablero().getComponent(indice).setEnabled(false);
		
	}
	private JPanel getPnArticulos() {
		if (pnArticulos == null) {
			pnArticulos = new JPanel();
			pnArticulos.setBackground(new Color(238, 228, 159));
			pnArticulos.setLayout(new GridLayout(0, 6, 0, 0));
			creaBotonesArticulos();
		}
		return pnArticulos;
	}
	private JButton getBtJugar() {
		if (btJugar == null) {
			btJugar = new JButton("Jugar");
			btJugar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btJugar.setMnemonic('j');
			btJugar.setToolTipText("Si juegas se reiniciara tu pedido actual");
			btJugar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pizzeria.haJugadoAlJuego();
					getBtJugar().setEnabled(false);
					mostrarPnJuego();
				}
			});
			btJugar.setEnabled(false);
		}
		return btJugar;
	}
	private JPanel getPnSeccionesResumen() {
		if (pnSeccionesResumen == null) {
			pnSeccionesResumen = new JPanel();
			pnSeccionesResumen.setBackground(new Color(255, 255, 255));
			pnSeccionesResumen.setLayout(new GridLayout(0, 3, 0, 0));
			pnSeccionesResumen.add(getLbProductosResumenPedido());
			pnSeccionesResumen.add(getLbUnidadesResumenPedido());
			pnSeccionesResumen.add(getLbPrecioResumenPedido());
		}
		return pnSeccionesResumen;
	}
	private JPanel getPnResumenPedido() {
		if (pnResumenPedido == null) {
			pnResumenPedido = new JPanel();
			pnResumenPedido.setBackground(new Color(255, 255, 255));
			pnResumenPedido.setLayout(new GridLayout(0, 1, 0, 0));
		}
		return pnResumenPedido;
	}
	private JLabel getLbProductosResumenPedido() {
		if (lbProductosResumenPedido == null) {
			lbProductosResumenPedido = new JLabel("Productos");
			lbProductosResumenPedido.setHorizontalAlignment(SwingConstants.CENTER);
			lbProductosResumenPedido.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lbProductosResumenPedido;
	}
	private JLabel getLbUnidadesResumenPedido() {
		if (lbUnidadesResumenPedido == null) {
			lbUnidadesResumenPedido = new JLabel("Unidades");
			lbUnidadesResumenPedido.setHorizontalAlignment(SwingConstants.CENTER);
			lbUnidadesResumenPedido.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lbUnidadesResumenPedido;
	}
	private JLabel getLbPrecioResumenPedido() {
		if (lbPrecioResumenPedido == null) {
			lbPrecioResumenPedido = new JLabel("Precio");
			lbPrecioResumenPedido.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbPrecioResumenPedido.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbPrecioResumenPedido;
	}
	private JButton getBtAyudaRegistro() {
		if (btAyudaRegistro == null) {
			btAyudaRegistro = new JButton("");
			btAyudaRegistro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaRecuperarNumReserva();
				}
			});
			btAyudaRegistro.setToolTipText("Ayuda para recuperar el numero de reserva si no lo recuerda o no lo encuentra");
			btAyudaRegistro.setBounds(566, 25, 63, 45);
			Image imagen = new ImageIcon(getClass().getResource("/img/interrogacion.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (65), (int) (65),Image.SCALE_SMOOTH);
			btAyudaRegistro.setIcon(new ImageIcon(imagenFinal));
		}
		return btAyudaRegistro;
	}
	protected void mostrarVentanaRecuperarNumReserva() {
		VentanaRecuperarDatosRerserva vrdr = new VentanaRecuperarDatosRerserva(this);
		vrdr.setVisible(true);
		
	}
	private JToggleButton getTgBtIntolerancias() {
		if (tgBtIntolerancias == null) {
			tgBtIntolerancias = new JToggleButton("Intolerancias");
			tgBtIntolerancias.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actualizarFiltro();
				}
			});
			tgBtIntolerancias.setToolTipText("Si esta marcado se mostraran los podructos que tienen la posibilidad de ser realizados adaptados a intolerancias");
			tgBtIntolerancias.setFont(new Font("Tahoma", Font.PLAIN, 14));
			tgBtIntolerancias.setMnemonic('i');
		}
		return tgBtIntolerancias;
	}
	
	protected void actualizarFiltro() {
		pizzeria.limpiarListaArticulosFiltrados();
		if(getTgBtIntolerancias().isSelected()) {
			if(getTgBtBebida().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtBebida().getActionCommand());
			}if(getTgBtEnsalada().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtEnsalada().getActionCommand());
			}if(getTgBtEntrante().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtEntrante().getActionCommand());
			}if(getTgBtPan().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtPan().getActionCommand());
			}if(getTgBtPasta().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtPasta().getActionCommand());
			}if(getTgBtPizza().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtPizza().getActionCommand());
			}if(getTgBtPostre().isSelected()) {
				pizzeria.añadirArticulosFiltroSoloIntolerancias(getTgBtPostre().getActionCommand());
			}
			creaBotonesArticulos();
		}else {
			if(getTgBtBebida().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtBebida().getActionCommand());
			}if(getTgBtEnsalada().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtEnsalada().getActionCommand());
			}if(getTgBtEntrante().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtEntrante().getActionCommand());
			}if(getTgBtPan().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtPan().getActionCommand());
			}if(getTgBtPasta().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtPasta().getActionCommand());
			}if(getTgBtPizza().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtPizza().getActionCommand());
			}if(getTgBtPostre().isSelected()) {
				pizzeria.añadirArticulosFiltro(getTgBtPostre().getActionCommand());
			}	
			creaBotonesArticulos();
		}
		
	}
	
	public class DarFoco extends WindowAdapter{
		@Override
		public void windowOpened(WindowEvent e) {
			getTxDNI().requestFocus();
		}
	}
	
	private void cargaAyuda(String pagina){

		   URL hsURL;
		   HelpSet hs;

		    try {
			    	File fichero = new File("help/ayuda.hs");
			    	hsURL = fichero.toURI().toURL();
			        hs = new HelpSet(null, hsURL);
			      }

		    catch (Exception e){
		      System.out.println("Ayuda no encontrada");
		      return;
		   }

		   HelpBroker hb = hs.createHelpBroker();
		   hb.initPresentation();

		   hb.enableHelpKey(getRootPane(),pagina, hs);
		   
		 }
	public void inicializar() {
		//logica
		pizzeria.inicializar();
		
		//interfaz
		getTxIntentosRestantes().setText(String.valueOf(pizzeria.getNumIntentos()));
		desmarcarSeccionesFiltro();
		actualizarPizzaDelDia();
		creaBotonesArticulos();
		crearTableroJuego();
		mostrarPnPrincipalParaNuevaComanda();
		getTgBtIntolerancias().setSelected(false);
		getTaObservaciones().setText(null);
		mostrarPnRegistro();
		
		
	}
	private void actualizarPizzaDelDia() {
		getLbFotoPizzaDelDia().setFont(new Font("Tahoma", Font.BOLD, 20));
		getLbFotoPizzaDelDia().setHorizontalTextPosition(SwingConstants.CENTER);
		getLbFotoPizzaDelDia().setHorizontalAlignment(SwingConstants.CENTER);
		getTxPizzaDelDia().setText("Prueba nuestra pizza del d\u00EDa por solo " + String.format("%.2f", pizzeria.getPrecioPizzaDelDia()) + " (20% de descuento)");
		Image imagen = new ImageIcon(getClass().getResource("/img/" + pizzeria.getCodigoPizzaDelDia() + ".png")).getImage();
		getLbFotoPizzaDelDia().setIcon(new ImageIcon(imagen));
		getLbFotoPizzaDelDia().setText("     Pizza: " + pizzeria.getDenominancionPizzaDelDia() + "          Ingredientes: " + pizzeria.getDescripcionPizzaDelDia());
	}
	private JPanel getPnBtNuevaReserva() {
		if (pnBtNuevaReserva == null) {
			pnBtNuevaReserva = new JPanel();
			pnBtNuevaReserva.setBackground(new Color(255, 255, 255));
			pnBtNuevaReserva.add(getBtNuevaReserva());
		}
		return pnBtNuevaReserva;
	}
}
