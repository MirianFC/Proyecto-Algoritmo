package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import rsbuttom.RSButtonMetro;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 782, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 0, 789, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnClose = new JButton("");
		btnClose.setContentAreaFilled(false);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClose.setBorder(null);
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setForeground(new Color(0, 255, 255));
		btnClose.setBackground(new Color(30, 144, 255));
		btnClose.setIcon(new ImageIcon(frmPrincipal.class.getResource("/img/desplegar.png")));
		btnClose.setBounds(20, 11, 56, 31);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBounds(0, 52, 150, 467);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(159, 64, 602, 444);
		panel.add(panelPrincipal);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));
		
		RSButtonMetro rsbuttom1 = new RSButtonMetro();
		rsbuttom1.setIconTextGap(9);
		rsbuttom1.setHorizontalAlignment(SwingConstants.LEFT);
		rsbuttom1.setIcon(new ImageIcon(frmPrincipal.class.getResource("/img/gorro-de-graduacion.png")));
		rsbuttom1.setFocusable(false);
		rsbuttom1.setText("Alumno");
		rsbuttom1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// mostrar ventana frmAlumno
				
				//frmAlumno fr = new frmAlumno();
			
				new CambiaPanel(panelPrincipal, new frmAlumno());
				
			}
		});
		rsbuttom1.setBounds(10, 72, 133, 35);
		panel_2.add(rsbuttom1);
		
		RSButtonMetro btnmtrRegistro = new RSButtonMetro();
		btnmtrRegistro.setIconTextGap(9);
		btnmtrRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		btnmtrRegistro.setIcon(new ImageIcon(frmPrincipal.class.getResource("/img/aprender-en-linea.png")));
		btnmtrRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmtrRegistro.setFocusable(false);
		btnmtrRegistro.setText("Curso");
		btnmtrRegistro.setBounds(10, 110, 133, 35);
		panel_2.add(btnmtrRegistro);
		
		RSButtonMetro rsbuttom1_1_1 = new RSButtonMetro();
		rsbuttom1_1_1.setFocusable(false);
		rsbuttom1_1_1.setText("Matricula");
		rsbuttom1_1_1.setBounds(10, 209, 133, 35);
		panel_2.add(rsbuttom1_1_1);
		
		RSButtonMetro rsbuttom1_1_1_1 = new RSButtonMetro();
		rsbuttom1_1_1_1.setFocusable(false);
		rsbuttom1_1_1_1.setText("Retiro");
		rsbuttom1_1_1_1.setBounds(10, 247, 133, 35);
		panel_2.add(rsbuttom1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("MANTENIMIENTO");
		lblNewLabel.setForeground(new Color(119, 136, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 36, 140, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setForeground(new Color(119, 136, 153));
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setBounds(10, 173, 140, 25);
		panel_2.add(lblRegistro);
		
		JLabel lblConsulta = new JLabel("CONSULTA");
		lblConsulta.setForeground(new Color(119, 136, 153));
		lblConsulta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsulta.setBounds(10, 307, 140, 25);
		panel_2.add(lblConsulta);
		
		RSButtonMetro rsbuttom1_1_1_1_1 = new RSButtonMetro();
		rsbuttom1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rsbuttom1_1_1_1_1.setText("Alumno y Curso");
		rsbuttom1_1_1_1_1.setFocusable(false);
		rsbuttom1_1_1_1_1.setBounds(10, 342, 133, 35);
		panel_2.add(rsbuttom1_1_1_1_1);
		
		RSButtonMetro rsbuttom1_1_1_1_2 = new RSButtonMetro();
		rsbuttom1_1_1_1_2.setText("Matricula y Retiro");
		rsbuttom1_1_1_1_2.setFocusable(false);
		rsbuttom1_1_1_1_2.setBounds(10, 380, 133, 35);
		panel_2.add(rsbuttom1_1_1_1_2);
		
		
		
		
	}
}
