package br.com.etec.harry.estoquedobidu.resource;

import br.com.etec.harry.estoquedobidu.model.ContasReceber;
import br.com.etec.harry.estoquedobidu.repository.ContasReceberRepository;
import br.com.etec.harry.estoquedobidu.repository.filter.ContasReceberFilter;
import br.com.etec.harry.estoquedobidu.repository.projections.ContasreceberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contasreceber")
public class ContasReceberResource {

    @Autowired
    private ContasReceberRepository contasReceberRepository;

    @GetMapping("/todos")
    public List<ContasReceber> listarTodasContas() { return contasReceberRepository.findAll();}

    @GetMapping()
    public Page<ContasreceberDto> pesquisar(ContasReceberFilter contasReceberFilter, Pageable pageable) {
        return contasReceberRepository.Filtrar(contasReceberFilter, pageable);
    }
}
