package br.com.fiap.arremate.msintensao.service;

import br.com.fiap.arremate.msintensao.dtos.request.IntensaoDTO;

import java.util.List;

public interface IntensaoService {

    List<IntensaoDTO> listar();

    IntensaoDTO listarPorId(Long id);

    IntensaoDTO cadastrar(IntensaoDTO intensaoDTO);

    void editar(Long id, IntensaoDTO intensaoDTO);

    void deletar(Long id);
}
