package metro.api.Service;

import metro.api.DAO.IMetro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
public class MetroService {

    @Autowired
    private IMetro dao;

    @Transactional(readOnly = false)
    public List<String> obterMetroComLinhasAgrupado(Integer idLinha) {
        return dao.obterMetroComLinhasAgrupado(idLinha);
    }
}