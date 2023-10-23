package Luiz62.com.github.agendavirtualprofessorhenrique.service;

import Luiz62.com.github.agendavirtualprofessorhenrique.dtos.ContatoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MockService implements CommandLineRunner {

    private final ContatoService service;

    @Override
    public void run(String... args) throws Exception {
        service.insert(ContatoDTO.builder()
                        .nome("Felipe")
                        .dataCadastro(new Date())
                        .idade(24)
                .build());

        service.insert(ContatoDTO.builder()
                .nome("Luiz")
                .dataCadastro(new Date())
                .idade(21)
                .build());

        service.insert(ContatoDTO.builder()
                .nome("Fulano")
                .dataCadastro(new Date())
                .idade(51)
                .build());

        List<ContatoDTO> contatos = service.findAll();

        contatos.forEach(contato -> {
            log.info("Contato nome: {}", contato.getNome());
            log.info("Contato idade: {}", contato.getIdade());
        });


    }
}
