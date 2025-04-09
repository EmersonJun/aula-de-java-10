package model;

public class CidadeEnum {
    curitiba("Curitiba"),
    campo_largo("Campo Largo"),
    ponta_grossa("Ponta Grossa"),

    private String nome;

    private CidadeEnum(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CidadeEnum [nome=" + nome + "]";
    }
    
}
