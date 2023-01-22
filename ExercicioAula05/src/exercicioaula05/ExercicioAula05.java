package exercicioaula05;
public class ExercicioAula05 {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco(0, true);
        cliente1.abrirConta();
        cliente1.depositar(300);
        cliente1.pagarMensal(0);
        cliente1.fecharConta();
        
        ContaBanco cliente2 = new ContaBanco(0, true);
        cliente2.abrirConta();
        cliente2.depositar(500);
        cliente2.sacar(1000);
        cliente2.pagarMensal(0);
        cliente2.fecharConta();

    }

}
