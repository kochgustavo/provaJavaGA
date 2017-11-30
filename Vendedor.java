public class Vendedor{

    private String nome;
    private int tipo;
    
    public Vendedor(String nome, int tipo){
        setNome(nome);
        setTipo(tipo);
    }
    
    public void setNome(String novoNome){
        if(novoNome.length() >= 7){
            this.nome = novoNome;
        }else{
            this.nome = "NomeIndefinido";
        }
    }
    
    public void setTipo(int novoTipo){
        if(novoTipo == 1 || novoTipo == 2){
            this.tipo = novoTipo;
        }else{
            this.tipo = 2;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public String traduzTipo(){
        if(this.tipo == 1){
            return "Comissionado";
        }else{
            return "Não Comissionado";
        }
    }
}