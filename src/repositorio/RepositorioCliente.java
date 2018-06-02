package repositorio;

import negocio.entidade.Cliente;

import java.util.ArrayList;

public class RepositorioCliente {

    private ArrayList<Cliente> clientes;

    public RepositorioCliente() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente c){
        this.clientes.add(c);
    }

    public ArrayList<Cliente> recuperarTodosClientes(){
        return this.clientes;
    }
}
