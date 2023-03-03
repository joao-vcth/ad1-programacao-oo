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

    @Override
    public Double getPreco() {
        return (gabinete.getPreco() + monitor.getPreco() + teclado.getPreco());
    }

    public void imprimePreco() {
        System.out.println("O preço deste computador é: " + this.getPreco() + "\n");
    }

    public void imprimeInformacoes() {
        System.out.println("Informações do Computador");
        String saida = String.format("Descrição: %s\nProcessador: %s\nMemoria: %.0fGB %s\nMonitor: %s\nTeclado: %s", this.getDescricao(), this.gabinete.getProcessador(), this.gabinete.calculaCapacidadeDeMemoria(), this.gabinete.imprimeMemorias(), this.getMonitor(), this.getTeclado());
        System.out.println(saida);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
