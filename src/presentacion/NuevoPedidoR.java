package presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import dominio.Comida;
import dominio.Pedido;

import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class NuevoPedidoR extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JPanel panel_2;

	/**
	 * Create the panel.
	 * @param panel2 
	 * @param antecesor 
	 * @param listaComidas 
	 * @param mostrar 
	 * @param mMenu 
	 */

	public NuevoPedidoR(JPanel panel2, Pedido ped) {
		
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane);
		
		panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("Realizar Pedido");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.setIcon(new ImageIcon(NuevoPedidoR.class.getResource("/recursos/icons8-derecha-en-círculo-2-64.png")));
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		panel_1.add(btnNewButton, BorderLayout.EAST);
		
		panel_2 = new JPanel();
		panel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_1.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{66, 41, 40, 9, 0};
		gbl_panel_2.rowHeights = new int[]{18, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel_1 = new JLabel("Total:");
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		
		lblNewLabel = new JLabel("43.80");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		
		label = new JLabel("€");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHWEST;
		gbc_label.gridx = 3;
		gbc_label.gridy = 1;
		panel_2.add(label, gbc_label);
		label.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));


		/*try {
			Comida comida = new Comida();
			ArrayList<Comida> listaComidas = comida.leerComidas();
			int i;
			for(i=0 ; i < listaComidas.size() ; i++) {
				if(eleccion=="") {
					NuevoPedidoRLP platillo = new NuevoPedidoRLP(listaComidas.get(i), panel2);
					panel.add(platillo);
					panel.repaint();
					panel.revalidate();
				}
				else if(listaComidas.get(i).getPestana().equals(eleccion)) {
					NuevoPedidoRLP platillo = new NuevoPedidoRLP(listaComidas.get(i), panel2);
					panel.add(platillo);
					panel.repaint();
					panel.revalidate();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}