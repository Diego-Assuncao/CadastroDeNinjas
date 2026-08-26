package dev.diego.CadastroDeNinjas.Missoes;

import dev.diego.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name="tb_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //Relacionando com o Ninja Model
    @OneToMany(mappedBy = "missoes") //UMa missão pode ter vários ninjas
    private List<NinjaModel> ninja;




}
