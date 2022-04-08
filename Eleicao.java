package meuPacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eleicao extends JFrame {

	private JPanel contentPane;
	private JTextField txtVoto;

	double candidatoM, candidatoP, nulo, branco, pvm, pvp, pb, pn;
	double total;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleicao frame = new Eleicao();
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
	public Eleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("20-Maria");
		
		JLabel lblNewLabel_1 = new JLabel("30-Pedro");
		
		JLabel lblNewLabel_2 = new JLabel("1-Nulo");
		
		JLabel lblNewLabel_3 = new JLabel("2-Branco");
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int voto = Integer.parseInt(txtVoto.getText());		
				switch(voto){
				case 20:
				{
				JOptionPane.showMessageDialog(null,"Você escolheu votar na Maria",null,JOptionPane.INFORMATION_MESSAGE);
				candidatoM++;
				break;	
				}
				case 30:
				{
				JOptionPane.showMessageDialog(null,"Você escolheu votar no Pedro",null,JOptionPane.INFORMATION_MESSAGE);
				candidatoP++;
				break;		
				}
				case 1:
				{
				JOptionPane.showMessageDialog(null,"Você escolheu voto Nulo",null,JOptionPane.INFORMATION_MESSAGE);
				nulo++;
				break;
				}
				case 2:
				{
				JOptionPane.showMessageDialog(null,"Você escolheu voto Branco",null,JOptionPane.INFORMATION_MESSAGE);
				branco++;
				break;
				}
				default:{
				JOptionPane.showMessageDialog(null,"Voto invalido!",null,JOptionPane.INFORMATION_MESSAGE);
				break;
				}
				
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		
		JLabel lblNewLabel_4 = new JLabel("Seu Voto");
		
		txtVoto = new JTextField();
		txtVoto.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Apurar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				total = (candidatoM + candidatoP + nulo + branco);
				pvm =(candidatoM * total ) % 100;
				pvp =(candidatoP * total ) % 100;
				pb=(branco * total ) % 100;
				pn=(nulo * total) % 100;
				
				if (candidatoM > candidatoP)
				{
				JOptionPane.showMessageDialog(null,"A vencedora da eleição foi a candidata Maria!!!!",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número de votos do vencedor é:"+pvm+"%",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número de votos em branco foram:"+pb+"%",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número de votos nulos foram:"+pn+"%",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número total de votos computados nesta eleição foram:"+total,null,JOptionPane.INFORMATION_MESSAGE);
				}
				else if (candidatoP > candidatoM)
				{
				JOptionPane.showMessageDialog(null,"O vencedor da eleição foi o candidato Pedro!!!!",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número de votos do vencedor é:"+pvp+"%",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número de votos em branco foram:"+pb+"%",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número de votos nulos foram:"+pn+"%",null,JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"O número total de votos computados nesta eleição foram:"+total,null,JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null,"Esta eleição resultou em empate.",null,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("");
		
		JLabel lblNewLabel_6 = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(80)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, Alignment.TRAILING)
								.addComponent(lblNewLabel_4, Alignment.TRAILING))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2))
								.addComponent(txtVoto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(182)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(219)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(181)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_6))))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_3))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtVoto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(51))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
