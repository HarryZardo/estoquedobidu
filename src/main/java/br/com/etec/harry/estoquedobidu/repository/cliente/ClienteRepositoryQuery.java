package br.com.etec.harry.estoquedobidu.repository.cliente;

import br.com.etec.harry.estoquedobidu.model.Cliente;
import br.com.etec.harry.estoquedobidu.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface ClienteRepositoryQuery {

    public Page<Cliente> Filtrar(ClienteFilter clienteFilter, Pageable pageable);
}
