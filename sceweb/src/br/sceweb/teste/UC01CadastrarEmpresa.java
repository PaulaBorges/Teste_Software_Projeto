package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	static Empresa empresa;
	static EmpresaDAO empresaDAO;

	/*
	 * Estabelece as pr� condi��es de teste
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@Before
	public void excluiCNPJ() {
		empresaDAO.exclui("89424232000180");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/*
	 * Verificar o comportamento do sistema na inser��o de uma empresa com
	 * sucesso
	 */

	@Test
	public void CT01UC01FPCadastrarEmpresa_com_sucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
		;
	}
	
	
	/*
	 * Verificar o comportamento do sistema na inser��o de uma empresa 
	 * com cnpj inv�lido
	 */

	@Test(expected = RuntimeException.class)
	public void CT02UC01FPCadastrarEmpresa_com_cnpj_invalido() {
		empresaDAO.adiciona(empresa);
		empresaDAO.adiciona(empresa);
	}

}
