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
		boolean resultado0 = cnpj.isValido("00000000000000");
		boolean verdadeiro0 = false;
		assertTrue(verdadeiro0==resultado0);
		
		boolean resultado1 = cnpj.isValido("11111111111111");
		boolean verdadeiro1 = false;
		assertTrue(verdadeiro1==resultado1);
		
		boolean resultado2 = cnpj.isValido("22222222222222");
		boolean verdadeiro2 = false;
		assertTrue(verdadeiro2==resultado2);
		
		boolean resultado3 = cnpj.isValido("33333333333333");
		boolean verdadeiro3 = false;
		assertTrue(verdadeiro3==resultado3);
		
		boolean resultado4 = cnpj.isValido("44444444444444");
		boolean verdadeiro4 = false;
		assertTrue(verdadeiro4==resultado4);
		
		boolean resultado5 = cnpj.isValido("55555555555555");
		boolean verdadeiro5 = false;
		assertTrue(verdadeiro5==resultado5);
		
		boolean resultado6 = cnpj.isValido("66666666666666");
		boolean verdadeiro6 = false;
		assertTrue(verdadeiro6==resultado6);
		
		boolean resultado7 = cnpj.isValido("77777777777777");
		boolean verdadeiro7 = false;
		assertTrue(verdadeiro7==resultado7);
		
		boolean resultado8 = cnpj.isValido("88888888888888");
		boolean verdadeiro8 = false;
		assertTrue(verdadeiro8==resultado8);
		
		boolean resultado9 = cnpj.isValido("99999999999999");
		boolean verdadeiro9 = false;
		assertTrue(verdadeiro9==resultado9);
		
	}
	

}
