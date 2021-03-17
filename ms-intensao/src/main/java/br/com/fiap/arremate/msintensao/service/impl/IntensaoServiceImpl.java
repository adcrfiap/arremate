package br.com.fiap.arremate.msintensao.service.impl;

import br.com.fiap.arremate.msintensao.dtos.request.IntensaoDTO;
import br.com.fiap.arremate.msintensao.entities.Intensao;
import br.com.fiap.arremate.msintensao.repositories.IntensaoRepository;
import br.com.fiap.arremate.msintensao.service.IntensaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class IntensaoServiceImpl implements IntensaoService {

    private final IntensaoRepository intensaoRepository;
    private final RabbitTemplate rabbitTemplate;
    private final ModelMapper mapper;

    @Override
    public List<IntensaoDTO> listar() {
        List<Intensao> intensoes = intensaoRepository.findAll();
        return mapListaIntensao(intensoes);
    }

    @Override
    public IntensaoDTO listarPorId(Long id) {
        Intensao intensao = intensaoRepository.findByIdIntensao(id);
        return mapper.map(intensao, IntensaoDTO.class);
    }

    @Override
    public IntensaoDTO cadastrar(IntensaoDTO intensaoDTO) throws JsonProcessingException {
        ObjectMapper mapperObj = new ObjectMapper();
        Intensao intensao = mapper.map(intensaoDTO, Intensao.class);
        intensao.setData(LocalDate.now());
        intensaoRepository.save(intensao);

        rabbitTemplate.convertAndSend("arremate.exchange", "arremate.routingkey",mapperObj.writeValueAsString(intensaoDTO.getDescricao()));

        return mapper.map(intensao, IntensaoDTO.class);
    }

    @Override
    public void editar(Long id, IntensaoDTO intensaoDTO) {
        Intensao intensao = mapper.map(listarPorId(id), Intensao.class);
        intensao.setDescricao(intensaoDTO.getDescricao());
        intensao.setIdComprador(intensaoDTO.getIdComprador());
        intensao.setIdProduto(intensaoDTO.getIdProduto());
        intensao.setValorEstimado(intensaoDTO.getValorEstimado());

        intensaoRepository.save(intensao);
    }

    @Override
    public void deletar(Long id) {
        intensaoRepository.delete(mapper.map(listarPorId(id), Intensao.class));
    }

    private List<IntensaoDTO> mapListaIntensao(List<Intensao> intensoes) {
        return intensoes.stream()
                .map(transaction -> this.mapper.map(transaction, IntensaoDTO.class))
                .collect(Collectors.toList());
    }

}
