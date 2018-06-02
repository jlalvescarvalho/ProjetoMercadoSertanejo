package negocio;

import negocio.entidade.Endereco;
import repositorio.RepositorioEndereco;

public class NegocioEndereco {

    private static NegocioEndereco mySelf;
    private RepositorioEndereco rp;

    public NegocioEndereco() {
        this.rp = new RepositorioEndereco();
    }

    public static NegocioEndereco getInstance(){
        if(mySelf == null){
            mySelf = new NegocioEndereco();
        }
        return mySelf;
    }

    public void cadastrarEndereco(Endereco end){
        this.rp.cadastrarEndereco(end);
    }
}
