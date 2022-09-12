package repository.login;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository {
  int login(String id,String password);

}
