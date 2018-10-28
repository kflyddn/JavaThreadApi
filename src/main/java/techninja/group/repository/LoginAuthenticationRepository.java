package techninja.group.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import techninja.group.model.LoginAuthentication;

@Repository
public interface LoginAuthenticationRepository extends MongoRepository<LoginAuthentication,String>{

	public LoginAuthentication findByUserName(String username);
}
