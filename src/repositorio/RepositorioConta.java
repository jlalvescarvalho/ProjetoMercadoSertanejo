package repositorio;

import negocio.entidade.Conta;

import java.util.ArrayList;

public class RepositorioConta {

    private ArrayList<Conta> contas;

    public RepositorioConta() {
        this.contas = new ArrayList<>();
    }

    public void cadastrarConta(Conta c){
        this.contas.add(c);
    }
    public ArrayList<Conta> recuperarTodasContas(){
        return this.contas;
    }
}
