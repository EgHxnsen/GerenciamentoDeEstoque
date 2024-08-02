import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        produto.name = sc.nextLine();
        System.out.println("Price: ");
        produto.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        produto.quantity = sc.nextInt();

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("Informe a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade a adicionar ao estoque: ");
                    int quantity = sc.nextInt();
                    produto.addProduct(quantity);
                    System.out.println(produto);
                    break;
                case 2:
                    System.out.println("Informe a quantidade a remover do estoque: ");
                    quantity = sc.nextInt();
                    produto.remProduto(quantity);
                    System.out.println(produto);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);

        sc.close();
    }
}
