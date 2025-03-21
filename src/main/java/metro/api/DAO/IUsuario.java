package metro.api.DAO;

import org.springframework.data.repository.CrudRepository;

import metro.api.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
