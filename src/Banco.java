import java.util.HashSet;
import java.util.Set;

public class Banco {

    private String nome;
    private Set<Conta> contasSet;

    public Banco(){
        this.contasSet = new HashSet<>();
    }

    public void adicionarConta(Conta conta){
        this.contasSet.add(conta);
    }

    public void removerConta(Conta conta){
        this.contasSet.remove(conta);
    }

    public void imprimirContas(){
        System.out.println("CONTAS PRESENTES NO BANCO:\n" + contasSet);
    }

    public boolean analisarCredito(int score){
        if(score > 700){
            return true;
        }
        return false;
    }
}
