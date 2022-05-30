package One.Digitalinnovation.Patterns;

import java.util.List;

public class Produtos {

    List<String> produtos = List.of("Bola de basquete", "Bola de futebol");
    List<Integer> preco = List.of(120, 60);

    public List<String> getProdutos() {
        return produtos;
    }
    public List<Integer> getPreco() {
        return preco;
    }
}
