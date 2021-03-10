package br.com.fiap.arremate.msintensao.service;

import br.com.fiap.arremate.msintensao.dtos.request.IntensaoDTO;

import java.util.List;

public interface IntensaoService {

    List<IntensaoDTO> listar();

    IntensaoDTO listarPorId(String id);

    IntensaoDTO cadastrar(IntensaoDTO intensaoDTO);

    void editar(String id, IntensaoDTO intensaoDTO);

    void deletar(String id, IntensaoDTO intensaoDTO);
}
