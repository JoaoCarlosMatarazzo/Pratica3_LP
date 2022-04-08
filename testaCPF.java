package meuPacote;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class testaCPF {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);

			String nome;
			String CPF;
			
			nome = JOptionPane.showInputDialog("Digite o nome: ");
			CPF = JOptionPane.showInputDialog ("Digite o seu CPF:");
			JOptionPane.showMessageDialog(null, "Nome:"+nome,"informação",JOptionPane.INFORMATION_MESSAGE);
			
            if (ValidaCPF.isCPF(CPF) == true)
            	JOptionPane.showMessageDialog(null, "CPF valido:"+ValidaCPF.imprimeCPF(CPF));
            else 
            	JOptionPane.showMessageDialog(null,"CPF invalido!" );

	}

}