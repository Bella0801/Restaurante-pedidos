package model;

import java.util.*;

public class Pedido implements IPedido {
    private int numeroMesa;
    private Atendente atendente;
    private List<Prato> pratos;
    private String status;

    public Pedido(int numeroMesa, Atendente atendente) {
        this.numeroMesa = numeroMesa;
        this.atendente = atendente;
        this.pratos = new ArrayList<>();
        this.status = "Em preparo";
    }

    @Override
    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Mesa: " + numeroMesa);
        System.out.println("Atendente: " + atendente.getNome());
        System.out.println("Status: " + status);
        for (Prato prato : pratos) {
            prato.exibirInformacoes();
        }
        System.out.println("Total: R$ " + calcularTotal());
    }

    @Override
    public double calcularTotal() {
        return pratos.stream().mapToDouble(Prato::getPreco).sum();
    }
}