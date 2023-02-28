public class Computador extends Item{
    private static int contador = 0;
    Gabinete gabinete;
    Monitor monitor;
    Teclado teclado;

    public Computador(String descricao, Gabinete gabinete, Monitor monitor, Teclado teclado) {
        this.descricao = descricao;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.teclado = teclado;
        this.identificador = "CMPT0" + contador;
        Computador.contador++;
    }

    public Gabinete getGabinete() {
        return this.gabinete;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Double calculaPrecoComputador() {
        return (gabinete.calculaPreco() + monitor.getPreco() + teclado.getPreco());
    }

    public String imprimePreco() {
        return "O preço deste computador é: " + calculaPrecoComputador() + "\n";
    }

    public void imprimeInformacoes() {
        System.out.println("Informações do Computador");
        String saida = String.format("Descrição: %s\nProcessador: %s\nMemoria: %.0fGB %s ", this.getDescricao(), this.gabinete.getCpu(), this.gabinete.calculaCapacidadeDeMemoria(), this.gabinete.imprimeMemorias());
        System.out.println(saida);
    }
}
