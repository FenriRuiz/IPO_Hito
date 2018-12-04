package presentacion;

import javax.swing.JPanel;

import dominio.Trabajador;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JPanel {
	private JLabel lblPedidos;
	private JLabel lblHabituales;
	private JLabel lblComidas;
	private JLabel lblNewPedido;
	private JLabel btnAtras;
	private JLabel lblCamarero;
	private JLabel lblUserName;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel label_1;

	/**
	 * Create the panel.
	 */
	public Menu(Trabajador trabajador) {
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 150, 0, 0};
		gridBagLayout.rowHeights = new int[]{76, 161, 0, 0, 0, 82, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblCamarero = new JLabel("");
		lblCamarero.setIcon(new ImageIcon(Menu.class.getResource("/recursos/camarero.png")));
		GridBagConstraints gbc_lblCamarero = new GridBagConstraints();
		gbc_lblCamarero.insets = new Insets(0, 0, 5, 5);
		gbc_lblCamarero.gridx = 2;
		gbc_lblCamarero.gridy = 1;
		add(lblCamarero, gbc_lblCamarero);
		
		lblUserName = new JLabel(trabajador.getRealName());
		lblUserName.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUserName = new GridBagConstraints();
		gbc_lblUserName.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserName.gridx = 2;
		gbc_lblUserName.gridy = 2;
		add(lblUserName, gbc_lblUserName);
		
		label = new JLabel(trabajador.getLastConnect());
		label.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 3;
		add(label, gbc_label);
		
		lblNewPedido = new JLabel("");
		lblNewPedido.setIcon(new ImageIcon(Menu.class.getResource("/recursos/icons8-carrito-de-compras-96.png")));
		GridBagConstraints gbc_lblNewPedido = new GridBagConstraints();
		gbc_lblNewPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewPedido.gridx = 2;
		gbc_lblNewPedido.gridy = 5;
		add(lblNewPedido, gbc_lblNewPedido);
		
		lblNewLabel_2 = new JLabel("Nuevo Pedido");
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblPedidos = new JLabel("");
		lblPedidos.setIcon(new ImageIcon(Menu.class.getResource("/recursos/icons8-lista-de-quehaceres-96.png")));
		GridBagConstraints gbc_lblPedidos = new GridBagConstraints();
		gbc_lblPedidos.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedidos.gridx = 1;
		gbc_lblPedidos.gridy = 7;
		add(lblPedidos, gbc_lblPedidos);
		
		lblHabituales = new JLabel("");
		lblHabituales.setIcon(new ImageIcon(Menu.class.getResource("/recursos/icons8-llamada-de-conferencia-96.png")));
		GridBagConstraints gbc_lblHabituales = new GridBagConstraints();
		gbc_lblHabituales.anchor = GridBagConstraints.SOUTH;
		gbc_lblHabituales.insets = new Insets(0, 0, 5, 5);
		gbc_lblHabituales.gridx = 2;
		gbc_lblHabituales.gridy = 7;
		add(lblHabituales, gbc_lblHabituales);
		
		lblComidas = new JLabel("");
		lblComidas.setIcon(new ImageIcon(Menu.class.getResource("/recursos/icons8-comida-96.png")));
		GridBagConstraints gbc_lblComidas = new GridBagConstraints();
		gbc_lblComidas.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblComidas.insets = new Insets(0, 0, 5, 5);
		gbc_lblComidas.gridx = 3;
		gbc_lblComidas.gridy = 7;
		add(lblComidas, gbc_lblComidas);
		
		lblNewLabel = new JLabel("Pedidos");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 8;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Clientes Habituales");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 8;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("Comidas");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 8;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		btnAtras = new JLabel("Cerrar Sesión");
		btnAtras.addMouseListener(new BtnAtrasMouseListener());
		btnAtras.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnAtras.setIcon(new ImageIcon(Menu.class.getResource("/recursos/icons8-atrás-64.png")));
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.anchor = GridBagConstraints.WEST;
		gbc_btnAtras.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtras.gridx = 0;
		gbc_btnAtras.gridy = 10;
		add(btnAtras, gbc_btnAtras);
		
		label_1 = new JLabel("");
		label_1.setToolTipText("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridx = 5;
		gbc_label_1.gridy = 10;
		add(label_1, gbc_label_1);

	}

	private class BtnAtrasMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}
	}
}