package negocio.entidade;

public class Endereco {

    private int id;
    private String rua;
    private int numero;
    private String cidade;
    private int cont = 0;

    public Endereco(String rua, int numero, String cidade) {
        this.id = cont++;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Rua: "+this.rua+" Numero: "+this.numero+" Cidade: "+this.cidade;
    }
}
