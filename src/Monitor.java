public class Monitor extends Item{

    private static int contador = 0;
    private Double polegadas;

    public Monitor(String descricao, Double preco, Double polegadas) {
        this.descricao = descricao;
        this.preco = preco;
        this.polegadas = polegadas;
        this.identificador = "MONI0" + contador;
        Monitor.contador++;
    }

    public Double getPolegadas() {
        return this.polegadas;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
