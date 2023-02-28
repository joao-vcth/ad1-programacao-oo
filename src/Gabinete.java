import java.util.ArrayList;

public class Gabinete extends Item {
    private static int contador = 0;
    private Processador cpu;
    private ArrayList<Memoria> pentesMemoria = new ArrayList<>();
    private ArrayList<Item> componentes = new ArrayList<>(); /* Polimorfismo: o Array funciona de forma normalmente mesmo sendo declarado como Array de "Item" pois
    todos os elementos que o mesmo recebe herdam de "Item" */

    public Gabinete(String descricao, Processador processador, Memoria memoria) {
        this.cpu = processador;
        this.descricao = descricao;
        pentesMemoria.add(memoria);
        componentes.add(processador);
        componentes.add(memoria);
        this.identificador = "GBNT0" + contador;
    }

    public ArrayList<Memoria> getMemoria() {
        return pentesMemoria;
    }

    public Processador getCpu() {
        return this.cpu;
    }

    public void setCpu(Processador cpu) {
        this.cpu = cpu;
    }


    public void adcionaMemoria(Memoria memoria) {
        pentesMemoria.add(memoria);
        componentes.add(memoria);
    }

    public Double calculaPreco() {
        Double contadorDePreco = 0.0;

        for (Memoria m : pentesMemoria) {
            contadorDePreco += m.getPreco();
        }
        contadorDePreco += cpu.getPreco();
        return contadorDePreco;
    }

    public String imprimePreco() {
        return String.format("O preço do gabinete '%s' é: %.2f", this.descricao, calculaPreco());
    }

    public Double calculaCapacidadeDeMemoria() {
        Double contadorDeMemoria = 0.00;
        for(Memoria m: pentesMemoria) {
            contadorDeMemoria += m.getCapacidade();
        }
        return contadorDeMemoria;
    }

    public String imprimeMemorias() {
        return pentesMemoria.toString().replace("[", "").replace("]", "");
    }

    public void imprimeComponentes() {
        String saida = String.format("Os Componentes do Gabinete '%s' são\nProcessador: %s\nMemória: %.0fGB %s", this.getDescricao(), this.cpu.getDescricao(), calculaCapacidadeDeMemoria(), imprimeMemorias());
        System.out.println(saida);
    }
}
