package uo.cpm.modulo.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class VentanaRecuperarDatosRerserva extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnNorte;
	private JLabel lbLogo;
	private JLabel lbNombrePizzeria;
	private JPanel pnCentro;
	private JLabel lbCorreoReserva;
	private JTextField txCorreoReserva;
	private JPanel pnSur;
	private JButton btAceptar;
	private VentanaPrincipal vp;



	/**
	 * Create the frame.
	 * @param ventanaPrincipal 
	 */
	public VentanaRecuperarDatosRerserva(VentanaPrincipal ventanaPrincipal) {
		this.vp = ventanaPrincipal;
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaRecuperarDatosRerserva.class.getResource("/img/logo.jpg")));
		setTitle("Adri\u00E1n Pizzerías: Recuperar datos reserva");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 228, 159));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPnNorte(), BorderLayout.NORTH);
		contentPane.add(getPnCentro(), BorderLayout.CENTER);
		contentPane.add(getPnSur(), BorderLayout.SOUTH);
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
			lbLogo.setBackground(new Color(238, 228, 159));
			Image imagen = new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage();
			Image imagenFinal = imagen.getScaledInstance((int) (130), (int) (80),Image.SCALE_SMOOTH);
			lbLogo.setIcon(new ImageIcon(imagenFinal));
		}
		return lbLogo;
	}
	private JLabel getLbNombrePizzeria() {
		if (lbNombrePizzeria == null) {
			lbNombrePizzeria = new JLabel("Adri\u00E1n Pizzer\u00EDas");
			lbNombrePizzeria.setFont(new Font("Tahoma", Font.BOLD, 25));
		}
		return lbNombrePizzeria;
	}
	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setBackground(new Color(238, 228, 159));
			pnCentro.setLayout(null);
			pnCentro.add(getLbCorreoReserva());
			pnCentro.add(getTxCorreoReserva());
		}
		return pnCentro;
	}
	private JLabel getLbCorreoReserva() {
		if (lbCorreoReserva == null) {
			lbCorreoReserva = new JLabel("Correo de la reserva");
			lbCorreoReserva.setLabelFor(getTxCorreoReserva());
			lbCorreoReserva.setDisplayedMnemonic('c');
			lbCorreoReserva.setBounds(21, 61, 154, 19);
			lbCorreoReserva.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lbCorreoReserva;
	}
	private JTextField getTxCorreoReserva() {
		if (txCorreoReserva == null) {
			txCorreoReserva = new JTextField();
			txCorreoReserva.setBounds(197, 59, 201, 27);
			txCorreoReserva.setColumns(10);
		}
		return txCorreoReserva;
	}
	private JPanel getPnSur() {
		if (pnSur == null) {
			pnSur = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnSur.getLayout();
			flowLayout.setAlignment(FlowLayout.TRAILING);
			pnSur.setBackground(new Color(238, 228, 159));
			pnSur.add(getBtAceptar());
		}
		return pnSur;
	}
	private JButton getBtAceptar() {
		if (btAceptar == null) {
			btAceptar = new JButton("Aceptar");
			btAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comprobarCorreo();
				}
			});
			btAceptar.setBackground(new Color(0, 255, 0));
			btAceptar.setMnemonic('a');
			btAceptar.setForeground(new Color(0, 0, 0));
			btAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
		return btAceptar;
	}

	protected void comprobarCorreo() {
		if(getTxCorreoReserva().getText().isBlank()) {
			JOptionPane.showMessageDialog(this, "Error: introduzca el correo asociado a la reserva", "Adrián Pizzerías", JOptionPane.ERROR_MESSAGE);
		}else {
			dispose();
		}
		
	}
}
