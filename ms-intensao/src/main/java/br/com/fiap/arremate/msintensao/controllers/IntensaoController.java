package br.com.fiap.arremate.msintensao.controllers;

import br.com.fiap.arremate.msintensao.dtos.request.IntensaoDTO;
import br.com.fiap.arremate.msintensao.service.IntensaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("intensao")
@AllArgsConstructor
public class IntensaoController {

    private final IntensaoService intensaoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<IntensaoDTO> listar(){
        return intensaoService.listar();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public IntensaoDTO listarPorId(String id){
        return intensaoService.listarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public IntensaoDTO cadastrar(@RequestBody IntensaoDTO intensaoDTO){
        return intensaoService.cadastrar(intensaoDTO);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void editar(@PathVariable String id,@RequestBody IntensaoDTO intensaoDTO){
        intensaoService.editar(id, intensaoDTO);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String id, @RequestBody IntensaoDTO intensaoDTO){
        intensaoService.deletar(id, intensaoDTO);
    }
}
