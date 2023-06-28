package br.com.etec.harry.estoquedobidu.repository.contasreceber;

import br.com.etec.harry.estoquedobidu.repository.filter.ContasReceberFilter;
import br.com.etec.harry.estoquedobidu.repository.projections.ContasreceberDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasReceberRepositoryQuery {
    public Page<ContasreceberDto> Filtrar(ContasReceberFilter contasReceberFilter, Pageable pageable);
}
