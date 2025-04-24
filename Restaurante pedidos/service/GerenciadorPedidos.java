package service;

import model.*;
import java.util.*;

public class GerenciadorPedidos {
    private List<Pedido> pedidos;

    public GerenciadorPedidos() {
        pedidos = new ArrayList<>();
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        for (Pedido p : pedidos) {
            p.exibirResumo();
            System.out.println("------------");
        }
    }
}