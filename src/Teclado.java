public class Teclado extends Item {
    private static int contador;

    public Teclado(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
        this.identificador = "TECL0" + contador;
        Teclado.contador++;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
