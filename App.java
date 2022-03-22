package App;

import lu.com.banco.contas.ContaPf;
import lu.com.banco.contas.ContaPj;
import lu.com.banco.contas.ContaPr;

public class App {

		public static void main(String[] args) {

		ContaPf contaPf = new ContaPf("pf", "Luisa Prantl", 800.00, "123456" );
		ContaPr contaPr = new ContaPr("123456", "Luisa Prantl", 800.00, "Pr");
		ContaPj contapj = new ContaPj("123456", "Luisa Prantl", 800.00, "pj");

		contaPf.detalhes();

	}


}
