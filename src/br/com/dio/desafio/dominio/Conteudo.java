package br.com.dio.desafio.dominio;

public abstract class Conteudo {

     protected static final double XP_PADRAO = 10d;

     private String titulo;
     private String descricao;

     public abstract double calcularXP();

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }
}


//quem vai ter acesso a constante XP_PADRAO vão ser os filhos de Conteudo (pq ta protected)
//todo bootcamp vai ter conteudo, e curso e mentoria sao conteudos
//abstract -> nao consegue ser instanciado