package gui;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import rsbuttom.RSButtonMetro;
import javax.swing.SwingConstants;

public class frmAlumno extends JPanel {
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtApellido;
	private JTextField txtCelular;

	/**
	 * Create the panel.
	 */
	public frmAlumno() {
		setBackground(new Color(230, 230, 250));
		setBounds(159, 64, 602, 444);
		setBorder(new LineBorder(new Color(0, 255, 255)));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(10, 11, 582, 47);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALUMNO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setIcon(new ImageIcon(frmAlumno.class.getResource("/img/gorro-de-graduacion.png")));
		lblNewLabel.setBounds(218, 11, 147, 25);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 79, 582, 143);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00D3DIGO:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 23, 66, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NOMBRE:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 56, 79, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DNI:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 90, 66, 23);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ESTADO:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(312, 23, 66, 23);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("CELULAR:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(312, 90, 79, 23);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("APELLIDOS:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(312, 56, 96, 23);
		panel_1.add(lblNewLabel_1_5);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(86, 26, 136, 20);
		panel_1.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(86, 59, 194, 20);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(86, 90, 175, 20);
		panel_1.add(txtDni);
		txtDni.setColumns(10);
		
		JComboBox cboEstado = new JComboBox();
		cboEstado.setBounds(406, 25, 166, 22);
		panel_1.add(cboEstado);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(406, 59, 166, 20);
		panel_1.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(406, 93, 166, 20);
		panel_1.add(txtCelular);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 233, 582, 55);
		add(panel_2);
		panel_2.setLayout(null);
		
		RSButtonMetro btnmtrRegistrar = new RSButtonMetro();
		btnmtrRegistrar.setColorNormal(new Color(0, 128, 128));
		btnmtrRegistrar.setBackground(new Color(0, 128, 128));
		btnmtrRegistrar.setIcon(new ImageIcon(frmAlumno.class.getResource("/img/salvar.png")));
		btnmtrRegistrar.setText("REGISTRAR");
		btnmtrRegistrar.setIconTextGap(9);
		btnmtrRegistrar.setFocusable(false);
		btnmtrRegistrar.setBounds(70, 11, 133, 35);
		panel_2.add(btnmtrRegistrar);
		
		RSButtonMetro btnmtrModificar = new RSButtonMetro();
		btnmtrModificar.setColorNormal(new Color(0, 206, 209));
		btnmtrModificar.setBackground(new Color(0, 206, 209));
		btnmtrModificar.setIcon(new ImageIcon(frmAlumno.class.getResource("/img/actualizar-datos.png")));
		btnmtrModificar.setText("MODIFICAR");
		btnmtrModificar.setIconTextGap(9);
		btnmtrModificar.setFocusable(false);
		btnmtrModificar.setBounds(215, 11, 133, 35);
		panel_2.add(btnmtrModificar);
		
		RSButtonMetro rsbuttom1_1_1 = new RSButtonMetro();
		rsbuttom1_1_1.setColorNormal(new Color(220, 20, 60));
		rsbuttom1_1_1.setIcon(new ImageIcon(frmAlumno.class.getResource("/img/borrar0.png")));
		rsbuttom1_1_1.setBackground(new Color(220, 20, 60));
		rsbuttom1_1_1.setText("ELIMINAR");
		rsbuttom1_1_1.setIconTextGap(9);
		rsbuttom1_1_1.setFocusable(false);
		rsbuttom1_1_1.setBounds(358, 11, 133, 35);
		panel_2.add(rsbuttom1_1_1);

	}
}
