package negocio.entidade;

import java.util.Date;

public class Conta {

    private int id;
    private Cliente cliente;
    private double valor;
    private Date data;
    private int cont = 0;

    public Conta(Cliente cliente, double valor, Date data) {
        this.id = cont++;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
