package Iterator_design_pattern.service;

import java.util.List;

import Iterator_design_pattern.Iterators.iterator;
import Iterator_design_pattern.repository.UserRepository;

public class userService {
  
  private final UserRepository userRepository;
  private final iterator<List<String>> userIterator;

  private userService(UserRepository userRepository){
    this.userRepository = userRepository;
    this.userIterator = new UserIterator(10); // set the limit for pagination 
  }

  public void getUserOnPlatform(){
    this.userRepository.findUser(1 , 10 );
  }

  /**
   * flaws this.userRepository.findUser(1, 10)
   * 1) here the service layer has to keep track of the offset
   * 2) Whenever the pagination is reqd. , we need to maintain offset here
   * 3) We don't know when to stop?? we have to write the custom logic to stop the pagination when we reached the end of data
   */

  public void iterateUsers() {
    while(userIterator.hasNext()){
      List<String> user = userIterator.next();
      System.out.println(user);
    }
  }
}

