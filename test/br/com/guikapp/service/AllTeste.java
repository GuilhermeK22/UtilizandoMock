package br.com.guikapp.service;

import br.com.guikapp.ClienteServiceTest;
import br.com.guikapp.ContratoServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author guilh
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTeste {
}
