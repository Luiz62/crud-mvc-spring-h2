package Luiz62.com.github.agendavirtualprofessorhenrique.service;

import Luiz62.com.github.agendavirtualprofessorhenrique.domain.entity.ContatoEntity;
import Luiz62.com.github.agendavirtualprofessorhenrique.domain.repository.ContatoRepository;
import Luiz62.com.github.agendavirtualprofessorhenrique.dtos.ContatoDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContatoService {

    private final ContatoRepository repository;

    private final ModelMapper modelMapper;
    public List<ContatoDTO> findAll() {
        return repository.findAll().stream()
                .map(contato -> modelMapper.map(contato, ContatoDTO.class))
                .collect(Collectors.toList());
    }

    public ContatoDTO findById(Long id) {
        return modelMapper.map(repository.findById(id), ContatoDTO.class);
    }

    public ContatoDTO insert(ContatoDTO dto) {
        return modelMapper.map(repository.save(modelMapper.map(dto, ContatoEntity.class)),
                ContatoDTO.class );
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public ContatoDTO update(Long id, ContatoDTO dto) {
        ContatoEntity entity = repository.findById(id).orElse(null);
        if (entity != null) {
            BeanUtils.copyProperties(dto, entity);
            ContatoEntity entitySaved = repository.save(entity);
            return modelMapper.map(entitySaved, ContatoDTO.class);
        } else {
            return null;
        }
    }
}
