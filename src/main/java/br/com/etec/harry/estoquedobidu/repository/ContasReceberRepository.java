package br.com.etec.harry.estoquedobidu.repository;

import br.com.etec.harry.estoquedobidu.model.ContasReceber;
import br.com.etec.harry.estoquedobidu.repository.contasreceber.ContasReceberRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface ContasReceberRepository extends JpaRepository<ContasReceber, Long>, ContasReceberRepositoryQuery {


}
