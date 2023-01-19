package exercicioaula2;
public class ExercicioAula2 {
    public static void main(String[] args) {
        Acessorios a1 = new Acessorios();
        a1.cor = "Preto";
        a1.tipo = "Celular";
        a1.modelo = "Xiaomi";
        a1.botoes = 3;
        a1.recurso = "Faz ligacoes";
        a1.utilidade = "Acessar rede sociais";
        a1.ligado();
        a1.status();
        escrever("-------------------");
        Acessorios a2 = new Acessorios();
        a2.cor = "Preto";
        a2.tipo = "Mouse";
        a2.modelo = "Gammig";
        a2.botoes = 7;
        a2.recurso = "RGB";
        a2.utilidade = "Manusear arquivos do computador";
        a2.ligado();
        a2.status();
        escrever("-------------------");
        FerramentasDigitais fbads = new FerramentasDigitais();
        fbads.marketing = "Marketing Digital";
        fbads.funcionalidade =  "Criar e gerenciar anuncios online";
        
    }
    
    static void escrever(String texto){
        System.out.println(texto);
    }
    
}
