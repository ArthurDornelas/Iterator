package padrao.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Celula implements Iterable<Funcionario>{
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Celula(Funcionario... funcionarios) {
        this.funcionarios = Arrays.asList(funcionarios);
    }

    @Override
    public Iterator<Funcionario> iterator() {
        return funcionarios.iterator();
    }
}
