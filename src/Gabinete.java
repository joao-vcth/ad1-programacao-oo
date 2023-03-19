import java.util.ArrayList;

class Gabinete extends Item {
    private static int contador = 0;
    private Processador processador;
    private ArrayList<Memoria> pentesMemoria = new ArrayList<>();
    private ArrayList<Item> componentes = new ArrayList<>(); /* Polimorfismo: o Array funciona normalmente
    mesmo sendo declarado como Array de "Item" pois
    todos os elementos que o mesmo recebe herdam de "Item" */

    public Gabinete(String descricao, Processador processador, Memoria memoria) {
        this.processador = processador;
        this.descricao = descricao;
        pentesMemoria.add(memoria);
        componentes.add(processador);
        componentes.add(memoria);
        this.identificador = "GBNT0" + contador;
    }

    public Processador getProcessador() {
        return this.processador;
    }

    public ArrayList<Memoria> getMemoria() {
        return pentesMemoria;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void adcionaMemoria(Memoria memoria) {
        pentesMemoria.add(memoria);
        componentes.add(memoria);
    }

    @Override
    public Double getPreco() {
        Double contadorDePreco = 0.0;

        for (Item i : componentes) { /*Polimorfismo*/
            contadorDePreco += i.getPreco();
        }
        return contadorDePreco;
    }

    public void imprimePreco() {
        String calculoDePreco =  String.format("O preço do gabinete '%s' é: %.2f", this.descricao, getPreco());
        System.out.println(calculoDePreco);
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
        String saida = String.format("Os Componentes do Gabinete '%s' são\nProcessador: %s\nMemória: %.0fGB %s", this.getDescricao(), this.processador.getDescricao(), calculaCapacidadeDeMemoria(), imprimeMemorias());
        System.out.println(saida);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
