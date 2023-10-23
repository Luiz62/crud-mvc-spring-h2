package Luiz62.com.github.agendavirtualprofessorhenrique.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class ContatoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 7821396289047102184L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "IDADE")
    private Integer idade;

    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;
}
