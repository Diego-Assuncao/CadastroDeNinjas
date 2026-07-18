package dev.diego.CadastroDeNinjas.Missoes;

import dev.diego.CadastroDeNinjas.Ninjas.Services.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //Relacionando com o Ninja Model
    @ManyToOne
    @JoinColumn(name = "ninja_id")
    private NinjaModel ninja;

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }

    //Construtores
    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, String dificuldade) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
