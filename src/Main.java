import One.Digitalinnovation.Patterns.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produtos produto = new Produtos();

        List<String> ProdutoDesejado = produto.getProdutos();
        List<Integer> ProdutoPreco = produto.getPreco();

        ArrayList<String> ProdutoCarrinho = new ArrayList<>();
        ArrayList<Integer> ProdutoCarrinhoQntd = new ArrayList<>();
        ArrayList<Integer> ProdutoCarrinhoValor = new ArrayList<>();

        int ProdutoEscolhido = 0;
        int Qntd = 0;

        do {
            System.out.println("Informe o código do produto que você deseja | 1- Bola de basquete | 2- Bola de futebol | 3- Finalizar");
            ProdutoEscolhido = scan.nextInt();
            if (ProdutoEscolhido!=3) {
                System.out.println("Insere a quantidade que você deseja");
                Qntd = scan.nextInt();

                if (ProdutoEscolhido >= 1 && ProdutoEscolhido <= 2) {
                    ProdutoCarrinho.add(ProdutoDesejado.get(ProdutoEscolhido - 1));
                    ProdutoCarrinhoQntd.add(Qntd);
                    ProdutoCarrinhoValor.add(ProdutoPreco.get(ProdutoEscolhido - 1) * 4);
                }
            }
        } while(ProdutoEscolhido!=3);

        int TotalValor = 0;
        for (Integer integer : ProdutoCarrinhoValor) {
            TotalValor += integer;
        }
        System.out.println("O valor total dos produtos é igual a: " + TotalValor);
    }
}
