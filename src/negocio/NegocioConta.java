package negocio;

import negocio.entidade.Conta;
import repositorio.RepositorioConta;

import java.util.ArrayList;

public class NegocioConta {

    private static NegocioConta mySelf;
    private RepositorioConta rp;

    public NegocioConta() {
        this.rp = new RepositorioConta();
    }

    public static NegocioConta getInstance(){
        if(mySelf == null){
            mySelf = new NegocioConta();
        }
        return mySelf;
    }

    public void cadastrarConta(Conta conta){
        rp.cadastrarConta(conta);
    }

    public ArrayList<Conta> recuperarTodasContas(){
        return rp.recuperarTodasContas();
    }
}
