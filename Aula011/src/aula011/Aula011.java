package aula011;
public class Aula011 {
    public static void main(String[] args) {
      //  Pessoa p1 = new Pessoa();
     /* Visitante v1 = new Visitante();
      v1.setNome("Jose");
        System.out.println(v1.toString());*/
     Aluno a1 = new Aluno();
     a1.setNome("Carlos");
     a1.setMatricula(111);
     a1.setCurso("TI");
     a1.setIdade(16);
     a1.setSexo("M");
     a1.pagarMensalidade();
     Bolsita b1 = new Bolsita();
     b1.setMatricula(3151521);
     b1.setNome("Joao");
     b1.setBolsa(12.5f);
     b1.setSexo("M");
     b1.pagarMensalidade();
    }
    
}
