package uo.cpm.modulo.ui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uo.cpm.modulo.service.Pizzeria;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

public class VentanaNuevaReserva extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnNorte;
	private JPanel pnCentro;
	private JButton btVolverAInicio;
	private JLabel lbManager;
	private JLabel lbContrasenia;
	private JTextField txManager;
	private JLabel lbLogo;
	private JLabel lbNombrePizzeria;
	private VentanaPrincipal vp;
	private JPasswordField pwContraseña;



	/**
	 * Create the frame.
	 */
	public VentanaNuevaReserva(VentanaPrincipal vp) {
		this.vp = vp;
		setTitle("Adri\u00E1n Pizzerías: Nueva Reserva");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaNuevaReserva.class.getResource("/img/logo.jpg")));
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 601, 376);
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
	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setBackground(new Color(238, 228, 159));
			pnCentro.setLayout(null);
			pnCentro.add(getBtVolverAInicio());
			pnCentro.add(getLbManager());
			pnCentro.add(getLbContrasenia());
			pnCentro.add(getTxManager());
			pnCentro.add(getPwContraseña());
		}
		return pnCentro;
	}
	private JButton getBtVolverAInicio() {
		if (btVolverAInicio == null) {
			btVolverAInicio = new JButton("Volver a inicio");
			btVolverAInicio.setMnemonic('v');
			btVolverAInicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					iniciarNuevaReserva();
				}
			});
			btVolverAInicio.setBackground(new Color(0, 255, 0));
			btVolverAInicio.setForeground(new Color(0, 0, 0));
			btVolverAInicio.setBounds(403, 188, 113, 28);
		}
		return btVolverAInicio;
	}
	protected void iniciarNuevaReserva() {
		if(comprobarDatosEmpleado()) {
			vp.inicializar();
			dispose();
		}
			
	}
	private boolean comprobarDatosEmpleado() {
		if(getTxManager().getText().isBlank()) {
			JOptionPane.showMessageDialog(getPnCentro(), "Error: introduzca su nombre","Adrián Pizzerías" , JOptionPane.ERROR_MESSAGE);
		}else if(getPwContraseña().getText().isBlank()) {
			JOptionPane.showMessageDialog(getPnCentro(), "Error: introduzca la contraseña para empleados","Adrián Pizzerías" , JOptionPane.ERROR_MESSAGE);
		}else if(!vp.getPizzeria().confirmarClave(getTxManager().getText(), getPwContraseña().getText())) {
			JOptionPane.showMessageDialog(getPnCentro(), "Los datos introducidos no se corresponden con ningun empleado de nuestro restaurantes","Adrián Pizzerías" , JOptionPane.INFORMATION_MESSAGE);
		}else {
			return true;
		}
		return false;
	}
	
	private JLabel getLbManager() {
		if (lbManager == null) {
			lbManager = new JLabel("Manager");
			lbManager.setLabelFor(getTxManager());
			lbManager.setDisplayedMnemonic('m');
			lbManager.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbManager.setBounds(56, 45, 78, 20);
		}
		return lbManager;
	}
	private JLabel getLbContrasenia() {
		if (lbContrasenia == null) {
			lbContrasenia = new JLabel("Contrase\u00F1a");
			lbContrasenia.setDisplayedMnemonic('c');
			lbContrasenia.setLabelFor(getPwContraseña());
			lbContrasenia.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbContrasenia.setBounds(56, 105, 103, 28);
		}
		return lbContrasenia;
	}
	private JTextField getTxManager() {
		if (txManager == null) {
			txManager = new JTextField();
			txManager.setBounds(194, 44, 322, 28);
			txManager.setColumns(10);
		}
		return txManager;
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
	private JPasswordField getPwContraseña() {
		if (pwContraseña == null) {
			pwContraseña = new JPasswordField();
			pwContraseña.setBounds(194, 109, 322, 26);
		}
		return pwContraseña;
	}
}
