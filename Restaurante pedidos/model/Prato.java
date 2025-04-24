package model;

public abstract class Prato {
    private String nome;
    private double preco;
    private String tipo;

    public Prato(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void exibirInformacoes() {
        System.out.println(tipo + ": " + nome + " - R$ " + preco);
    }
}