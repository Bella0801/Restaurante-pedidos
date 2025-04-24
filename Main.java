import model.*;
import service.GerenciadorPedidos;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("Carlos");
        Pedido pedido1 = new Pedido(5, atendente);

        Prato entrada = new PratoEntrada("Salada Caesar", 18.0);
        Prato principal = new PratoPrincipal("Filé ao molho madeira", 42.5);

        pedido1.adicionarPrato(entrada);
        pedido1.adicionarPrato(principal);

        pedido1.atualizarStatus("Pronto");

        GerenciadorPedidos sistema = new GerenciadorPedidos();
        sistema.registrarPedido(pedido1);

        sistema.listarPedidos();
    }
}