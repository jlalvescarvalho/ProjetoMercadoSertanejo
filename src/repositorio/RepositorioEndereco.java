package repositorio;

import negocio.entidade.Endereco;

import java.util.ArrayList;

public class RepositorioEndereco {

    private ArrayList<Endereco> enderecos;

    public RepositorioEndereco() {
        this.enderecos = new ArrayList<>();
    }

    public void cadastrarEndereco(Endereco end){
        this.enderecos.add(end);
    }
    public ArrayList<Endereco> recuperarTodosEnderocos(){
        return this.enderecos;
    }
}
