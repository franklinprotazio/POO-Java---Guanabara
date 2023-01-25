package exercicioaula09;

import java.util.Random;

public class Livro implements Publicacao {
    // Atributos 
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    // Agregação
    private Pessoa leitor;
    // Metodo Publico
   /* public void detalhes(){
        System.out.println("------------------------"); 
        System.out.println("Nome do Livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotPaginas());
        System.out.println("--------------------------");
    }*/

    public String detalhes() {
        return " Livro - " + "Titulo: " + titulo + "\n Autor: " 
                + autor + "\n Total de Paginas: " + totPaginas + 
                "\n Pag Atual: " + pagAtual + "\n Esta Aberto? " + aberto + "\n -------" +
                "\n Leitor: " + leitor.getNome() + "\n Idade: " + leitor.getIdade()
                + "\n Sexo: " + leitor.getSexo() + "\n--------------------------";
    }
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    // Metodos Especiais 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro aberto");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechado");
    }

    @Override
    public void folhear() {
        if(this.getAberto()){
            Random aleatorio = new Random();
            int pagina = aleatorio.nextInt(this.getTotPaginas());
            this.setPagAtual(pagina);
            System.out.println("Pagina Folheada: " + this.getPagAtual());
        } else {
            System.out.println("Impossivel folhear");
        }
        
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            this.setPagAtual(getPagAtual() + 1);
            System.out.println("Proxima Pagina: " + this.getPagAtual());
        } else {
            System.out.println("Impossivel avancar pagina");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() > 0){
            this.setPagAtual(getPagAtual() - 1);
            System.out.println("Pagina Anterior: " + this.getPagAtual());
        } else {
            System.out.println("Impossivel voltar pagina");
        }
    }
    
}
