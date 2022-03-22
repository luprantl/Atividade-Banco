package lu.com.banco.contas;

public class ContaPf extends Conta{

	private int qtdeSaque;

	public ContaPf(String tipoConta, String nome, Double saldo, String numeroConta) {
		super(tipoConta, nome, saldo, numeroConta);
	}

	@Override
	public void deposito(Double valor) {
		double porcentagem = valor * 0.01;
		valor -= porcentagem;
		super.saque(valor);
	}

	@Override
	public void saque(Double saque) {
		if(saque > this.getSaldo()) {
			System.out.println("Você não pode sacar mais do que possui!");
			return;
		}if (this.qtdeSaque >= 3){
			double porcentagem = saque * 0.01;
			saque += porcentagem;
			super.saque(saque);
			return;
		}
		super.saque(saque);
		this.qtdeSaque++;
	}


}