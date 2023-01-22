package exercicioaula05;

import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status; 
        
    public void abrirConta(){
        Scanner teclado = new Scanner(System.in);
        escreverNaTela("## Escolha uma das opcoes abaixo ##");
        escreverNaTela("1 - Conta Poupanca \n2 - Conta Corrente" );
        setTipo(tipo = teclado.next());
        setStatus(true);
        switch(this.tipo){
            case "1":              
                escreverNaTela("Digite o seu nome: ");
                setDono(dono = teclado.next());
                escreverNaTela("## Conta Aberta ##"); 
                setTipo(tipo = "Conta Poupanca");
                setNumConta(numConta = (int) (this.numConta + 1 + Math.random() * (9-1)));
                escreverNaTela("Tipo de Conta: " + this.tipo);
                escreverNaTela("Numero da conta: " + this.numConta);
                escreverNaTela("Nome do cliente: " + this.dono);
                this.saldo = 150f;
                escreverNaTela("Voce ganhou R$" + this.saldo);
                break;    
            case "2":
                escreverNaTela("Digite o seu nome: ");
                setDono(dono = teclado.next());
                escreverNaTela("## Conta Aberta ##");
                setTipo(tipo = "Conta Corrente");
                setNumConta(numConta = (int) (this.numConta + 1 + Math.random() * (9-1)));
                escreverNaTela("Tipo de Conta: " + this.tipo);
                escreverNaTela("Numero da conta: " + this.numConta);
                escreverNaTela("Nome do Cliente: " + this.dono);
                this.saldo = 50f;
                escreverNaTela("Voce ganhou R$" + this.saldo);
                break;
            default:
                escreverNaTela("O numero escolhido eh invalido! Digite 1 ou 2");
        }
    }
    
    public void fecharConta(){
       if(this.saldo == 0f){
           escreverNaTela("Conta Fechada");
           this.status = false;
       } else if (this.saldo < 0f){
           escreverNaTela("Existe um debito em sua conta de R$" + Math.abs(getSaldo()));
       } else if (this.saldo > 0f){
           escreverNaTela("Sua conta tem um saldo de R$" + this.saldo);
       }
        escreverNaTela("---------------------");
    }
    
    public float depositar (float depositar){
        if(this.status == true){
            this.saldo += depositar;
            escreverNaTela("Voce depositou R$" + depositar);
        } else {
            escreverNaTela("Impossivel depositar");
        }
        return depositar;
    }
    
    public float sacar (float sacar){
        if(this.status == true && this.saldo > 0){         
            if(sacar < this.saldo){
              this.saldo -= sacar;
                escreverNaTela("Voce sacou " + sacar );
            } else if (sacar > this.saldo){
                escreverNaTela("O valor solicitado eh maior do que o saldo em conta");
            }    
        } else {
            escreverNaTela("Impossivel sacar");
        }
        return sacar;
    } 
    
    public float pagarMensal (float pagarMensalidade){
       if(this.status == true && this.saldo > 0f){
           if(this.tipo.equals("1")){
               escreverNaTela("Mensalidade Conta Poupanca: R$20");
               this.saldo -= 20f;
           } else if (this.tipo.equals("2")){
               escreverNaTela("Mensalidade Conta Corrente: R$12");
               this.saldo -= 12f;
           }
       } else {
           escreverNaTela("Impossivel em pagar mensalidade");
       }
        return pagarMensalidade;
    }
    
    private String escreverNaTela(String texto){
        System.out.println(texto);
        return texto;
    }
        // Construtor

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
  
        // get e set 
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {    
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        saldo = this.saldo;
        return saldo;
    }

    public void setSaldo(float saldo) {
        System.out.println(this.saldo);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }   
     
}
