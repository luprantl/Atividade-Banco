package lu.com.banco.contas;

public class ContaPj extends Conta{


	public ContaPj(String tipoConta, String nome, Double saldo, String numeroConta) {
		super(tipoConta, nome, saldo, numeroConta);
	}

	@Override
	public void deposito(Double valor) {
		valor -= valor * 0.02;
		super.deposito(valor);
	}

	@Override
	public void saque(Double saque) {
			super.saque(saque);
	}
}