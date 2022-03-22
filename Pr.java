package lu.com.banco.contas;

public class ContaPr extends Conta{

	private int qtdeSaque;

	public ContaPr(String tipoConta, String nome, Double saldo, String numeroConta) {
		super(tipoConta, nome, saldo, numeroConta);
	}

	@Override
	public void deposito(Double valor) {
		if(valor <= 1000) {
			double porcentagem = valor * 0.008;
			valor -= porcentagem;
			super.deposito(valor);
		}
		super.deposito(valor);
	}

	@Override
	public void saque(Double saque) {
		if (this.qtdeSaque >= 3){
			double porcentagem = saque * 0.015;
			saque += porcentagem;
			super.saque(saque);
			return;
		}
		super.saque(saque);
		this.qtdeSaque++;
	}

	@Override
	public void imprimeExtrato() {
		super.imprimeExtrato();
	}




}