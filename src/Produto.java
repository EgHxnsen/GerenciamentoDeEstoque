public class Produto {
    public String name;
    public double price;
    public int quantity;

    public void addProduct (int quantity) {
        this.quantity += quantity;
    }

    public void remProduto (int quantity) {
        this.quantity -= quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public String toString() {
        return "Nome do produto: " + name
                + "\n R$" + price
                + String.format("%.2f", price)
                + "\n " + quantity + " unidades"
                + "\nTotal: R$" + totalValueInStock();
    }
}