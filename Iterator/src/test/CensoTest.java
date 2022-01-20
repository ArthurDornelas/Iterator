package test;

import org.junit.jupiter.api.Test;
import padrao.iterator.Celula;
import padrao.iterator.Censo;
import padrao.iterator.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

public class CensoTest {
    @Test
    void deveContarFuncionariosAtivosCelula() {
        Celula celula = new Celula(
                new Funcionario("Arthur", true),
                new Funcionario("James", true),
                new Funcionario("Jack", false),
                new Funcionario("Betty", false)
        );
        assertEquals(2, Censo.contarFuncionariosAtivosCelula(celula));
    }

    @Test
    void deveContarTotalFuncionariosCelula() {
        Celula celula = new Celula(
                new Funcionario("Arthur", true),
                new Funcionario("James", true),
                new Funcionario("Jack", false),
                new Funcionario("Betty", false)
        );
        assertEquals(4, Censo.contarTotalFuncionariosCelula(celula));
    }
}
