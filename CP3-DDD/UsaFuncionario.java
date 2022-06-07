package fiap;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class UsaFuncionario {
	public static void main(String[] args) {
		int esc, idade;
		float salario, salarioT, gorjeta, bonus;
		String aux, escolha="sim", nome, form;
		LocalDate dataNascimento;
		while (escolha.equalsIgnoreCase("sim")){
			try {
				aux = JOptionPane.showInputDialog("Qual tipo de funcion�rio deseja calcular o sal�rio? \n(1)Funcionario \n(2)Gar�om \n(3)Gerente");
				esc = Integer.parseInt(aux);
				switch (esc) {
				case 1:
					Funcionario fun;
					nome = JOptionPane.showInputDialog("Digite o nome do funcion�rio"); 
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					salario = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite a data de nascimento");
					form = aux.substring(6,10);
					form += "-" + aux.substring(3, 5);
					form += "-" + aux.substring(0,2);
					dataNascimento = LocalDate.now();
					dataNascimento = LocalDate.parse(form);
					fun = new Funcionario(nome, dataNascimento, salario);
					salarioT = fun.calculaSalario();
					idade = fun.calculaIdade();
					
					JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nData de nascimento: " + form + "\nIdade: " + idade + "\nSal�rio: " + salarioT);
					break;
				case 2:
					Garcom garc;
					nome = JOptionPane.showInputDialog("Digite o nome do gar�om"); 
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					salario = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite a gorjeta do gar�om");
					gorjeta = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite a data de nascimento");
					form = aux.substring(6,10);
					form += "-" + aux.substring(3, 5);
					form += "-" + aux.substring(0,2);
					dataNascimento = LocalDate.now();
					dataNascimento = LocalDate.now();
					dataNascimento = LocalDate.parse(form);
					garc = new Garcom(nome, dataNascimento, salario, gorjeta);
					salarioT = garc.calculaSalario();
					idade = garc.calculaIdade();
					JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nData de nascimento: " + form + "\nIdade: " + idade + "\nSal�rio: " + salarioT);
					break;
				case 3:
					Gerente ger;
					nome = JOptionPane.showInputDialog("Digite o nome do gerente"); 
					aux = JOptionPane.showInputDialog("Digite o valor da hora trabalhada");
					salario = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o bonus do gerente");
					bonus = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite a data de nascimento");
					form = aux.substring(6,10);
					form += "-" + aux.substring(3, 5);
					form += "-" + aux.substring(0,2);
					dataNascimento = LocalDate.now();
					dataNascimento = LocalDate.now();
					dataNascimento = LocalDate.parse(form);
					ger = new Gerente(nome, dataNascimento, salario, bonus);
					salarioT = ger.calculaSalario();
					idade = ger.calculaIdade();
					JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nData de nascimento: " + form + "\nIdade: " + idade + "\nSal�rio: " + salarioT);
					break;
				default:
					break;
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? Sim ou n�o");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
				JOptionPane.showMessageDialog(null,"Fim de programa");
		
		
	} 
}
