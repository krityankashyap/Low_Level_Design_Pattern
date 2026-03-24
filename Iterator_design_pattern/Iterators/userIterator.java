package Iterator_design_pattern.Iterators;

import java.util.List;

import Iterator_design_pattern.repository.UserRepository;
import Iterator_design_pattern.repository.UserRepositoryImpl;

public class userIterator implements iterator<List<String>> {

  private final UserRepository userRepository;

  private int limit= 1;
  private int offset= 0;
  private List<String> current;



  public userIterator(int limit) {
    this.userRepository = new UserRepositoryImpl();
    this.limit= limit;
    this.current = userRepository.findUser(limit, offset);
  }



  @Override
  public boolean hasNext() {
    return !current.isEmpty();
  }

  @Override
  public List<String> next(){
    List<String> result = current;

    this.offset += limit;  // move to the next page
    this.current= userRepository.findUser(limit, offset);

    return result;
  }
}
