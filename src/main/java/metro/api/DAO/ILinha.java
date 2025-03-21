package metro.api.DAO;

import metro.api.model.Linha;
import metro.api.model.Metro;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILinha extends CrudRepository<Linha, Integer> {

    @Procedure(name = "ObterEstacoesPorLinha")
    List<String> obterEstacoesPorLinha(@Param("ID_LINHA") Integer idLinha);


}