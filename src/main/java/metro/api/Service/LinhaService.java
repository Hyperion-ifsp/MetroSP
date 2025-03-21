package metro.api.Service;
import metro.api.DAO.ILinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class LinhaService {

    @Autowired
    private ILinha dao;

    @Transactional(readOnly = false)
    public List<String> obterEstacoesPorLinha(Integer idLinha) {
        return dao.obterEstacoesPorLinha(idLinha);
    }
}