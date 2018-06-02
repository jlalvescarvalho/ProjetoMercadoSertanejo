package negocio.entidade;

import java.util.Date;

public class Cliente {

    private long cpf;
    private int rg;
    private String nome;
    private char genero;
    private String apelido;
    private Date dt_nascimento;
    private Endereco endereco;

    public Cliente(long cpf, int rg, String nome, char genero, String apelido, Date dt_nascimento, Endereco endereco) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.genero = genero;
        this.apelido = apelido;
        this.dt_nascimento = dt_nascimento;
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
