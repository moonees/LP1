package graphical_user_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import graphical_user_interface.SistemaSolar;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.DropMode;
import java.awt.ComponentOrientation;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Window.Type;
public class FormSistemaSolar extends JFrame {

	
	private JPanel contentPane;

	
	 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSistemaSolar frame = new FormSistemaSolar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void respostas() {	
		
		
		}
	
	public FormSistemaSolar() {
		setFont(new Font("Arial", Font.PLAIN, 14));
		setTitle("Sistema Solar");
		SistemaSolar[] planeta = new SistemaSolar[9];
		planeta[0] = new SistemaSolar("Terra", "terceiro", 1);
		planeta[1] = new SistemaSolar("Marte", "quarto",2);
		planeta[2] = new SistemaSolar("Jupiter","quinto", 79);
		planeta[3] = new SistemaSolar("Venus","segundo", 0);
		planeta[4] = new SistemaSolar("Netuno","oitavo", 14);
		planeta[5] = new SistemaSolar("Urano","sétimo", 27);
		planeta[6] = new SistemaSolar("Mercúrio","primeiro", 0);
		planeta[7] = new SistemaSolar("Saturno","sexto", 82);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Sistema Solar");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 414, 14);
		contentPane.add(lblTitulo);
		
		JButton btnTerra = new JButton("Terra");
		btnTerra.setBounds(10, 48, 77, 23);
		contentPane.add(btnTerra);
		btnTerra.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[0].getNome() + ". Este planeta possui " + planeta[0].getLuas()
						+ " lua e é o " + planeta[0].getPosicao() + " em relação ao Sol");
				
				}});
		
		JButton btnJupiter = new JButton("Jupiter");
		btnJupiter.setBounds(10, 136, 77, 23);
		contentPane.add(btnJupiter);
		btnJupiter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[2].getNome() + ". Este planeta possui " + planeta[2].getLuas()
						+ " luas e é o " + planeta[2].getPosicao() + " em relação ao Sol");
			}});
		
		JButton btnVenus = new JButton("Venus");
		btnVenus.setBounds(10, 179, 77, 23);
		contentPane.add(btnVenus);
		btnVenus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[3].getNome() + ". Este planeta possui " + planeta[3].getLuas()
						+ " luas e é o " + planeta[3].getPosicao() + " em relação ao Sol");
			}});
		
		JButton btnNetuno = new JButton("Netuno");
		btnNetuno.setBounds(97, 48, 77, 23);
		contentPane.add(btnNetuno);
		btnNetuno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[4].getNome() + ". Este planeta possui " + planeta[4].getLuas()
						+ " luas e é o " + planeta[4].getPosicao() + " em relação ao Sol");
			}});
		
		JButton btnUrano = new JButton("Urano");
		btnUrano.setBounds(97, 95, 77, 23);
		contentPane.add(btnUrano);
		btnUrano.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[5].getNome() + ". Este planeta possui " + planeta[5].getLuas()
						+ " luas e é o " + planeta[5].getPosicao() + " em relação ao Sol");
			}});
		
		JButton btnMercurio = new JButton("Mercurio");
		btnMercurio.setBounds(97, 136, 77, 23);
		contentPane.add(btnMercurio);
		btnMercurio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[6].getNome() + ". Este planeta possui " + planeta[6].getLuas()
						+ " luas e é o " + planeta[6].getPosicao() + " em relação ao Sol");
			}});
		
		JButton btnSaturno = new JButton("Saturno");
		btnSaturno.setBounds(97, 179, 77, 23);
		contentPane.add(btnSaturno);
		btnSaturno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[7].getNome() + ". Este planeta possui " + planeta[7].getLuas()
						+ " luas e é o " + planeta[7].getPosicao() + " em relação ao Sol");
			}});
		JButton btnMarte = new JButton("Marte");
		btnMarte.setBounds(10, 95, 77, 23);
		contentPane.add(btnMarte);
		btnMarte.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JTextPane textPane = new JTextPane();
				textPane.setMargin(new Insets(6, 6, 6, 6));
				textPane.setEditable(false);
				textPane.setBorder(null);
				textPane.setBackground(SystemColor.menu);
				textPane.setFont(new Font("Arial", Font.PLAIN, 14));
				textPane.setBounds(241, 51, 151, 151);
				contentPane.add(textPane);
				textPane.setText("O planeta selecionado se chama " + planeta[1].getNome() + ". Este planeta possui " + planeta[1].getLuas()
						+ " luas e é o " + planeta[1].getPosicao() + " em relação ao Sol");

				}});	
		JTextPane textPane = new JTextPane();
		textPane.setMargin(new Insets(6, 6, 6, 6));
		textPane.setEditable(false);
		textPane.setBorder(null);
		textPane.setBackground(SystemColor.menu);
		textPane.setFont(new Font("Arial", Font.PLAIN, 14));
		textPane.setBounds(244, 78, 151, 131);
		contentPane.add(textPane);
		textPane.setText("Selecione um planeta");
		
		JLabel lblinfo = new JLabel("Informa\u00E7\u00F5es");
		lblinfo.setFont(new Font("Arial", Font.BOLD, 14));
		lblinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo.setBounds(244, 52, 151, 14);
		contentPane.add(lblinfo);
		
		JButton btnLimpar = new JButton("Fechar");
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(306, 227, 101, 23);
		contentPane.add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
		
		
		
		
	}
}
