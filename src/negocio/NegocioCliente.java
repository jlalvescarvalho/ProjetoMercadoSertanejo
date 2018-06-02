package negocio;

import negocio.entidade.Cliente;
import repositorio.RepositorioCliente;

import java.util.ArrayList;

public class NegocioCliente {

    private RepositorioCliente rp;
    private static NegocioCliente mySelf;

    public NegocioCliente() {
        this.rp = new RepositorioCliente();
    }

    public static NegocioCliente getInstance() {
        if(mySelf == null){
            mySelf = new NegocioCliente();
        }
        return mySelf;
    }

    public void cadastrarCliente(Cliente cliente){
        rp.cadastrarCliente(cliente);
    }

    public ArrayList<Cliente> recuperarTodosCliente(){
        return rp.recuperarTodosClientes();
    }
}
