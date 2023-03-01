/*Herança: Essa e todas as outras classes herdam da classe "Item" */

public class Processador extends Item {
    private static int contador = 0;
    public Processador(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
        this.identificador = "CPU0" + contador;
        Processador.contador++;
    }

    @Override
    public String toString() {
        return this.getDescricao();
    }
}
