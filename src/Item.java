/* Abstração: essa é uma Classe abastrata da qual todas as outras classes herdam atributos e métodos.
                por ser uma classe abstrata, esta não pode ser instânciada.
 */

public abstract class Item {
    /*Encapuslamento: Esses atributos só podem ser acessados por classes 'filhas' desta. */
    protected String descricao;
    protected Double preco;
    protected String identificador;

    public Double getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}