package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {return cargaHoraria;}
    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +" Horas"+
                '}';
    }
}