package graphical_user_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.SystemColor;

	

public class FormAlunoFatecSJC extends JFrame {
	

	private JPanel contentPane;
	public JPanel getContentPane() {
		return contentPane;
	}
	private JTextField NomeField;
	private JTextField CursoField;
	private JTextField SemestreField;
	private JButton btnFechar;
	private JTextField DiaField;
	private JTextField MesField;
	private JTextField AnoField;
	private JLabel lblFatec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAlunoFatecSJC frame = new FormAlunoFatecSJC();
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
	public FormAlunoFatecSJC() {
		setTitle("Cadastro Aluno Fatec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlLtHighlight);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome ");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(10, 13, 46, 14);
		contentPane.add(lblNome);
		
		NomeField = new JTextField();
		NomeField.setBackground(SystemColor.control);
		NomeField.setBounds(157, 11, 225, 20);
		contentPane.add(NomeField);
		NomeField.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCurso.setBounds(10, 71, 46, 14);
		contentPane.add(lblCurso);
		
		CursoField = new JTextField();
		CursoField.setBackground(SystemColor.control);
		CursoField.setBounds(157, 69, 225, 20);
		contentPane.add(CursoField);
		CursoField.setColumns(10);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setBackground(new Color(245, 245, 245));
		lblSemestre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSemestre.setBounds(10, 102, 67, 14);
		contentPane.add(lblSemestre);
		
		SemestreField = new JTextField();
		SemestreField.setBackground(SystemColor.control);
		SemestreField.setBounds(157, 100, 33, 20);
		contentPane.add(SemestreField);
		SemestreField.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(SystemColor.inactiveCaption);
		btnSalvar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSalvar.setBounds(157, 159, 103, 44);
		contentPane.add(btnSalvar);
		//Ao apertar o botão enter clica no botão salvar;
		getRootPane().setDefaultButton(btnSalvar);
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Aluno cadastrado com sucesso");
				System.out.println(NomeField.getText());
				System.out.println(DiaField.getText() + "/" + MesField.getText() + "/" + AnoField.getText());
				System.out.println(CursoField.getText());
				System.out.println(SemestreField.getText() + " semestre");
				NomeField.setText("");
				DiaField.setText("");
				MesField.setText("");
				AnoField.setText("");
				CursoField.setText("");
				SemestreField.setText("");
				System.out.println("");
								
			}
		});
		
		btnFechar = new JButton("Fechar");
		btnFechar.setForeground(Color.BLACK);
		btnFechar.setBackground(SystemColor.inactiveCaption);
		btnFechar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnFechar.setBounds(279, 159, 103, 44);
		contentPane.add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		JLabel lblDatadeNascimento = new JLabel("Data de nascimento");
		lblDatadeNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDatadeNascimento.setBounds(10, 38, 146, 20);
		contentPane.add(lblDatadeNascimento);
		
		DiaField = new JTextField();
		DiaField.setBackground(SystemColor.control);
		DiaField.setBounds(157, 42, 33, 20);
		contentPane.add(DiaField);
		DiaField.setColumns(10);
		
		MesField = new JTextField();
		MesField.setBackground(SystemColor.control);
		MesField.setColumns(10);
		MesField.setBounds(200, 42, 33, 20);
		contentPane.add(MesField);
		
		AnoField = new JTextField();
		AnoField.setBackground(SystemColor.control);
		AnoField.setColumns(10);
		AnoField.setBounds(248, 42, 40, 20);
		contentPane.add(AnoField);
		
		lblFatec = new JLabel("Faculdade de tecnologia - FATEC");
		lblFatec.setForeground(SystemColor.inactiveCaption);
		lblFatec.setHorizontalAlignment(SwingConstants.CENTER);
		lblFatec.setToolTipText("");
		lblFatec.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFatec.setBounds(10, 226, 414, 24);
		contentPane.add(lblFatec);
		
		
		
		}

	
	
		
	}
	
