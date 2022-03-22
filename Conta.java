package lu.com.banco.contas;
import java.text.NumberFormat;

import lu.com.banco.interfaces.IExtratoConta;

public class Conta implements IExtratoConta{

	private String tipoConta;
	private String nome;
	private Double saldo;
	private String numeroConta;

	public Conta(String tipoConta, String nome, Double saldo, String numeroConta) {
		this.tipoConta = tipoConta;
		this.nome = nome;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}

	public void saque(Double saque) {
		saldo = saldo - saque;
	}

	public void deposito(Double valor) {
		saldo = saldo + valor;
	}

	private String getSaldoContaFormatado() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		String moneyString = numberFormat.format(saldo);
		return moneyString;
	}

	public void imprimeExtrato() {
		System.out.println(nome + " tem R$" + getSaldoContaFormatado() + " na conta.");
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String detalhes() {
		return "Conta [tipoConta=" + tipoConta + ", nome=" + nome + ", saldo=" + saldo + ", numeroConta=" + numeroConta
				+ "]";
	}

}