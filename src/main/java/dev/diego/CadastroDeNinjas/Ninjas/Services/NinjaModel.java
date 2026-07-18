package dev.diego.CadastroDeNinjas.Ninjas.Services;

import dev.diego.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe comum em uma entidade do DB
@Entity
//Criando tabela do DB
@Table(name = "tb_cadastro")
public class NinjaModel {

    //Atributos
    @Id//informa que o atributo abaixo será o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa a estratégia de geração do id
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<MissoesModel> missoes;

    //Constructors
    public NinjaModel() {
    }

    public NinjaModel(String email, String nome, int idade) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
