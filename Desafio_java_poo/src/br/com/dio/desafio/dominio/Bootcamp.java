package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp extends Conteudo {
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataTermino = dataInicio.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public LocalDate getDataInicio() {return dataInicio;}
    public LocalDate getDataTermino() {return dataTermino;}

    public Set<Dev> getDevsInscritos() {return devsInscritos;}
    public void setDevsInscritos(Set<Dev> devsInscritos) {this.devsInscritos = devsInscritos;}

    public Set<Conteudo> getConteudos() {return conteudos;}
    public void setConteudos(Set<Conteudo> conteudos) {this.conteudos = conteudos;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataTermino, bootcamp.dataTermino) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataTermino, devsInscritos, conteudos);
    }
}
