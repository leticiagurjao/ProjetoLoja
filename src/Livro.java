public class Livro extends Produto {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro (String descricao){
        this.autor = autor;
    }
    
    public String getDescricao() {
        return super.getDescricao();
    }
}
