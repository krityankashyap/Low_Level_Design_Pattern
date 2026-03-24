package Iterator_design_pattern.repository;

import java.util.List;

import Iterator_design_pattern.InMemorydatabase;

public class UserRepositoryImpl implements UserRepository {
  
  private InMemorydatabase db;

  private UserRepositoryImpl(InMemorydatabase db){
    this.db = db;
  }

  @Override
  public List<String> findUser(int limit, int offset) {
    List<String> alluser= db.getUsers();

    int start= (offset-1) * limit;  // start of the paginated data
    int end= Math.min(start + limit, alluser.size());  // end of the paginated data

    if(start>= alluser.size()) {
      return List.of();  // return empty list if offset is out of bounds
    }

    return alluser.subList(start, end); // return the paginated data
  }
}
