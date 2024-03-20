import java.util.Arrays;
import java.util.Objects;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto (int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    private void aumentaCapacidade() {
    }
    public void adiciona(Object elemento)throws Exception{
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else{
            throw new Exception("O vetor está cheio, " + "Não é possivél adicionar novos elementos");
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

}
