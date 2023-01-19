package exercicioaula2;

public class Acessorios {
    String tipo;
    String modelo;
    int botoes;
    String recurso;
    String cor;
    String utilidade;
    boolean funcionando;
    
    void status(){
        System.out.println("O tipo do acessorio eh: " + this.tipo);
        System.out.println("O modelo do " + this.tipo + "eh " + this.modelo);
        System.out.println("A cor eh: " + this.cor);
        System.out.println("Tem " + this.botoes + " botoes");
        System.out.println("Tem o seguente recurso " + this.recurso);
        System.out.println("Serve para " + this.utilidade);
    }
    
    void uso(){
        if(this.funcionando == true){
            System.out.println("Pode usar o " + this.tipo);
        }else {
            System.out.println("Nao pode usar o " + this.tipo);
        }
    }
    
    void ligado(){
        this.funcionando = true;
    }
    
    void desligado(){
        this.funcionando = false;
    }
}
