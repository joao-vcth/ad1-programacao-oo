public class Memoria extends Item{

    private static int contador = 0;
    private Double capacidade; /*Encapsulamento este atributo só pode ser acessado através de métodos desta mesma classe*/

    public Memoria (String descricao, Double preco, Double capacidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.capacidade = capacidade;
        this.identificador = "MEM0" + contador;
        Memoria.contador++;
    }

    public Double getCapacidade() {
        return this.capacidade;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
