package Iterator_design_pattern.repository;

import java.util.List;

public interface UserRepository {

  List<String> findUser(int limit, int offset);
}