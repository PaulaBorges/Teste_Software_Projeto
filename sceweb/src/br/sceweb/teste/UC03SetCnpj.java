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
		boolean resultado1 = cnpj.isValido("11111111111111");
		boolean verdadeiro1 = false;
		assertTrue(verdadeiro1==resultado1);
		
		boolean resultado2 = cnpj.isValido("22222222222222");
		boolean verdadeiro2 = false;
		assertTrue(verdadeiro2==resultado2);
		
	}
	

}
