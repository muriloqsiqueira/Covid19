package Main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Main {	
  private JFrame frmTesteCovid;
	public int pontos=0, result=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmTesteCovid.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Main() {
		initialize();				
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
					
		frmTesteCovid = new JFrame();
		frmTesteCovid.setForeground(SystemColor.inactiveCaptionBorder);
		frmTesteCovid.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Murilo Siqueira\\Downloads\\hqdefault.jpg"));
		frmTesteCovid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTesteCovid.setTitle("Teste Covid - 19");
		frmTesteCovid.setBackground(UIManager.getColor("ToolBar.darkShadow"));
		frmTesteCovid.getContentPane().setBackground(UIManager.getColor("CheckBox.light"));
		frmTesteCovid.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frmTesteCovid.setSize(400, 600);
		frmTesteCovid.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("QUESTION\u00C1RIO COVID-19");
		titulo.setBackground(SystemColor.inactiveCaptionBorder);
		titulo.setBounds(71, 21, 231, 22);
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		frmTesteCovid.getContentPane().add(titulo);
		
		JLabel questao1 = new JLabel("1 - VOC\u00CA TEVE CONTATO COM ALGU\u00C9M INFECTADO?");
		questao1.setBounds(10, 81, 337, 17);
		questao1.setFont(new Font("Arial", Font.PLAIN, 12));
		frmTesteCovid.getContentPane().add(questao1);
		
		JRadioButton sim1 = new JRadioButton("SIM");		
		sim1.setBackground(UIManager.getColor("CheckBox.light"));
		sim1.setBounds(49, 105, 55, 25);
		sim1.setFont(new Font("Arial", Font.BOLD, 14));
		frmTesteCovid.getContentPane().add(sim1);
		sim1.setSelected(false);
		
		JRadioButton nao1 = new JRadioButton("N\u00C3O");		
		nao1.setBackground(UIManager.getColor("CheckBox.light"));
		nao1.setSelected(false);
		nao1.setFont(new Font("Arial", Font.BOLD, 14));
		nao1.setBounds(172, 105, 55, 25);
		frmTesteCovid.getContentPane().add(nao1);
		
		sim1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sim1.isSelected()) {
					nao1.setSelected(false);
					pontos += 4;
				}
			}
		});
		
		nao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nao1.isSelected()) {
					sim1.setSelected(false);
					pontos += 0;
				}
			}
		});		
		
		JLabel questao2 = new JLabel("2 - VOC\u00CA PERDEU O SEU OLFATO (ASNOMIA)?");
		questao2.setFont(new Font("Arial", Font.PLAIN, 12));
		questao2.setBounds(10, 141, 337, 17);
		frmTesteCovid.getContentPane().add(questao2);
		
		JRadioButton sim2 = new JRadioButton("SIM");
		sim2.setBackground(UIManager.getColor("CheckBox.light"));
		sim2.setSelected(false);
		sim2.setFont(new Font("Arial", Font.BOLD, 14));
		sim2.setBounds(49, 165, 51, 25);
		frmTesteCovid.getContentPane().add(sim2);
						
		JRadioButton nao2 = new JRadioButton("N\u00C3O");
		nao2.setBackground(UIManager.getColor("CheckBox.light"));
		nao2.setSelected(false);
		nao2.setFont(new Font("Arial", Font.BOLD, 14));
		nao2.setBounds(172, 165, 55, 25);
		frmTesteCovid.getContentPane().add(nao2);
		
		sim2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sim2.isSelected()) {
					nao2.setSelected(false);
					pontos += 6;
				}
			}
		});
		
		nao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nao2.isSelected()) {
					sim2.setSelected(false);
					pontos += 0;				    
				}
			}
		});
		
		JLabel questao3 = new JLabel("3 - VOC\u00CA TEM FEBRE (PIREXIA)?");
		questao3.setFont(new Font("Arial", Font.PLAIN, 12));
		questao3.setBounds(10, 193, 337, 17);
		frmTesteCovid.getContentPane().add(questao3);
		
		JRadioButton sim3 = new JRadioButton("SIM");
		sim3.setBackground(UIManager.getColor("CheckBox.light"));
		sim3.setSelected(false);
		sim3.setFont(new Font("Arial", Font.BOLD, 14));
		sim3.setBounds(49, 219, 51, 25);
		frmTesteCovid.getContentPane().add(sim3);
		
		JRadioButton nao3 = new JRadioButton("N\u00C3O");
		nao3.setBackground(UIManager.getColor("CheckBox.light"));
		nao3.setSelected(false);
		nao3.setFont(new Font("Arial", Font.BOLD, 14));
		nao3.setBounds(172, 219, 55, 25);
		frmTesteCovid.getContentPane().add(nao3);
		
		sim3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sim3.isSelected()) {
					nao3.setSelected(false);
					pontos += 3;
				}
			}
		});
		
		nao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nao3.isSelected()) {
					sim3.setSelected(false);
					pontos += 0;				    
				}
			}
		});			    
		
		JLabel questao4 = new JLabel("4 - VOC\u00CA EST\u00C1 COM TOSSE SECA?");
		questao4.setFont(new Font("Arial", Font.PLAIN, 12));
		questao4.setBounds(10, 255, 337, 17);
		frmTesteCovid.getContentPane().add(questao4);
		
		JRadioButton sim4 = new JRadioButton("SIM");
		sim4.setBackground(UIManager.getColor("CheckBox.light"));
		sim4.setSelected(false);
		sim4.setFont(new Font("Arial", Font.BOLD, 14));
		sim4.setBounds(49, 281, 51, 25);
		frmTesteCovid.getContentPane().add(sim4);
		
		JRadioButton nao4 = new JRadioButton("N\u00C3O");
		nao4.setBackground(UIManager.getColor("CheckBox.light"));
		nao4.setSelected(false);
		nao4.setFont(new Font("Arial", Font.BOLD, 14));
		nao4.setBounds(172, 281, 55, 25);
		frmTesteCovid.getContentPane().add(nao4);
		
		sim4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sim4.isSelected()) {
					nao4.setSelected(false);
					pontos += 3;
				}
			}
		});
		
		nao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nao4.isSelected()) {
					sim4.setSelected(false);
					pontos += 0;				    
				}
			}
		});			   
		
		JLabel questao5 = new JLabel("5 - VOC\u00CA SENTE CANSA\u00C7O F\u00CDSICO?");
		questao5.setFont(new Font("Arial", Font.PLAIN, 12));
		questao5.setBounds(10, 309, 337, 17);
		frmTesteCovid.getContentPane().add(questao5);
		
		JRadioButton sim5 = new JRadioButton("SIM");
		sim5.setBackground(UIManager.getColor("CheckBox.light"));
		sim5.setSelected(false);
		sim5.setFont(new Font("Arial", Font.BOLD, 14));
		sim5.setBounds(49, 335, 51, 25);
		frmTesteCovid.getContentPane().add(sim5);
		
		JRadioButton nao5 = new JRadioButton("N\u00C3O");
		nao5.setBackground(UIManager.getColor("CheckBox.light"));
		nao5.setSelected(false);
		nao5.setFont(new Font("Arial", Font.BOLD, 14));
		nao5.setBounds(172, 335, 55, 25);
		frmTesteCovid.getContentPane().add(nao5);
		
		sim5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sim5.isSelected()) {
					nao5.setSelected(false);
					pontos += 3;
				}
			}
		});
		
		nao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nao5.isSelected()) {
					sim5.setSelected(false);
					pontos += 0;				    
				}
			}
		});				
		
		JButton concluir = new JButton("Concluir");			
		concluir.setFont(new Font("Arial", Font.BOLD, 14));		
		concluir.setBounds(35, 383, 99, 31);
		frmTesteCovid.getContentPane().add(concluir);
		concluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							
				if (pontos <= 1) {
					result = pontos;
					JOptionPane.showMessageDialog(null, "Paciente não Infectado por Covid-19.\n"
							                          + "Não é Necessário efetuar o teste PCR");
				}
				
				else if (pontos >= 2 && pontos <= 3) {
					result = pontos;
					JOptionPane.showMessageDialog(null, "Paciente possivelmente Infectado por Covid-19.\n"
							                          + "Teste PCR exigido para casos de alto risco.\n"
							                          + "Aguardar resultado do teste para avaliar a\n"
							                          + "necessidade de tratamento. ");
				}
				
				else if (pontos >= 4 && pontos <= 5 ) {
					result = pontos;
					JOptionPane.showMessageDialog(null, "Paciente provavelmente Infectado por Covid-19.\n"
							                          + "Teste PCR requerido em todos os casos\n"
							                          + "Repetir o teste após 1-3 dias se negativo.\n"
							                          + "Iniciar tratamento sem o PCR em caso de alto risco. ");
				}
				else if (pontos >= 6) {
					result = pontos;
					JOptionPane.showMessageDialog(null, "Paciente infectado por Covid-19.\n"
							                          + "Não é necessário o teste PCR.\n"
							                          + "Iniciar tratamento imediato. ");
				}
			}
		});
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pontos = 0;
				sim1.setSelected(false);
				sim2.setSelected(false);
				sim3.setSelected(false);
				sim4.setSelected(false);
				sim5.setSelected(false);
				nao1.setSelected(false);
				nao2.setSelected(false);
				nao3.setSelected(false);
				nao4.setSelected(false);
				nao5.setSelected(false);				
			}
		});
		reset.setFont(new Font("Arial", Font.BOLD, 14));
		reset.setBounds(167, 383, 99, 31);
		frmTesteCovid.getContentPane().add(reset);		
		
		JButton btnInformao = new JButton("Informa\u00E7\u00E3o");		
		btnInformao.setFont(new Font("Arial", Font.BOLD, 14));
		btnInformao.setBounds(93, 446, 114, 31);
		frmTesteCovid.getContentPane().add(btnInformao);
		btnInformao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "O AndroCoV Clinical Scoring for COVID-19 Diagnostic: Uma ferramenta\n"
												  + " de diagnóstico rápida, viável, sem custos e altamente sensível para\n"
												  + " COVID-19 com base em um grupo de 1757 pacientes ");
			}
		});
	}
}
