package dev.diego.CadastroDeNinjas.Ninjas.Services;

import dev.diego.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe comum em uma entidade do DB
@Entity
//Criando tabela do DB
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    //Atributos
    @Id//informa que o atributo abaixo será o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa a estratégia de geração do id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true) //Informa que a coluna é única, utilizamos sempre que estivermos tratando de dados unícos como CPF
    private String email;

    @Column(name = "idade")
    private int idade;

    @ManyToOne//@ManyToOne um ninja tem uma única missão
    @JoinColumn(name = "missoes_id") //foreing key ou chave estrangeira
    private MissoesModel missoes;


}
