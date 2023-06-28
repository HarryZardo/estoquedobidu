package br.com.etec.harry.estoquedobidu.repository;

import br.com.etec.harry.estoquedobidu.model.Cliente;
import br.com.etec.harry.estoquedobidu.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery {}
