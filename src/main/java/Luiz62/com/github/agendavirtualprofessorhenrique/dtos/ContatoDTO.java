package Luiz62.com.github.agendavirtualprofessorhenrique.dtos;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class ContatoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -3349832197920211589L;

    private Long id;

    private String nome;

    private Integer idade;

    private Date dataCadastro;
}
