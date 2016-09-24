package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;

public class UC03SetCnpj {
	static Empresa cnpj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cnpj = new Empresa();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test 
	public void test() {
		//boolean resultado = cnpj.isValido("47753481000170");
		boolean resultado = cnpj.isValido("11111111111111");
		boolean verdadeiro = false;
		assertTrue(verdadeiro==resultado);
	}

}
