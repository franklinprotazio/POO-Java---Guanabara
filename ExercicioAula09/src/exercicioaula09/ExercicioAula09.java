package exercicioaula09;
public class ExercicioAula09 {
    public static void main(String[] args) {
        Pessoa nome[] = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        nome[0] = new Pessoa("Franklin", 35, "Masculino");
        nome[1] = new Pessoa("Maria", 70, "Feminino");
        
        l[0] = new Livro("A vida de um protazio", "Protazio", 300, nome[0]);
        l[1] = new Livro("De onde vem o Protazio", "Santana", 500, nome[1]);
        l[2] = new Livro("Haja Protazio", "Franklin", 1000, nome[1]);
        
        
        
        l[0].abrir();
        l[0].folhear();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }
    
}
