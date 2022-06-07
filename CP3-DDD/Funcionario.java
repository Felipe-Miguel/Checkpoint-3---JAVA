package fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private LocalDate dataNascimento;
	private float valorHoraTrabalho;
	
	public Funcionario() {
	}

	public Funcionario(String nome, LocalDate dataNascimento, float valorHoraTrabalho) {
		this.nome = nome;
		setDataNascimento(dataNascimento);
		this.valorHoraTrabalho = valorHoraTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		LocalDate minhaData = LocalDate.now();
		try {
			if (dataNascimento.getYear() >= 1900 && dataNascimento.isBefore(minhaData)) {
				this.dataNascimento = dataNascimento;
			}else {
				throw new Exception("Ano de nascimento inválido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public float getValorHoraTrabalho() {
		return valorHoraTrabalho;
	}

	public void setValorHoraTrabalho(float valorHoraTrabalho) {
		this.valorHoraTrabalho = valorHoraTrabalho;
	}
	
	public float calculaSalario(){
		float salario = valorHoraTrabalho * 40 * 4;
		return salario;
	}
	public int calculaIdade() {
		LocalDate minhaData = LocalDate.now();
		Period periodo = Period.between(dataNascimento, minhaData);
		int idade = periodo.getYears();
		return idade;
		}
}
