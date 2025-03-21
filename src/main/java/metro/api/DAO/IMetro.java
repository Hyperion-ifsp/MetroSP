package metro.api.DAO;

import metro.api.model.Metro;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IMetro extends CrudRepository <Metro, Integer> {
    @Procedure(name = "ObterMetroComLinhasAgrupado")
    List<String> obterMetroComLinhasAgrupado(@Param("ID_METRO") Integer idmetro);
}
