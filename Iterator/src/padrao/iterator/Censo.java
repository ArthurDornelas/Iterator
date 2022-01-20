package padrao.iterator;

import java.util.Iterator;

public class Censo {
    public static Integer contarFuncionariosAtivosCelula(Celula celula) {
        int quantidade = 0;
        for(Funcionario funcionario : celula) {
            if (funcionario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosCelula(Celula celula) {
        int quantidade = 0;
        for (Iterator f = celula.iterator(); f.hasNext();) {
            quantidade++;
            f.next();
        }
        return quantidade;
    }
}
