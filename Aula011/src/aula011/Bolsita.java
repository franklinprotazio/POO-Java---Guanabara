package aula011;
public class Bolsita extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de" + this.nome);
    }
   
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " Eh bolsita, pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
