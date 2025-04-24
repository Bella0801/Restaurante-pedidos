package model;

public interface IPedido {
    void adicionarPrato(Prato prato);
    void exibirResumo();
    double calcularTotal();
}