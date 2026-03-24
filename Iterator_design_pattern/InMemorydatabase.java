package Iterator_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class InMemorydatabase {
  
  private List<String> Users = new ArrayList<>();

  public void seeder(){
  for(int i=0; i<= 2000; i++){
    Users.add("User "+ i);
  }
}

public List<String> getUsers(){
  return Users;
}

}
