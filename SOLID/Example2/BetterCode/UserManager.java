package SOLID.Example2.BetterCode;

public class UserManager {

  public void addUser(User user){

    if(user.getAge() < 18){
      System.out.println("User is underage, cannot be added.");
    } else {
      System.out.println("User added successfully.");
    }
  }

  public void removeUser(User user){
    System.out.println("User removed successfully");
  }

  public void updateUser(User user){
    if(user.getAge()< 18){
      System.out.println("User is underage, cannot be updated");
    }

    System.out.println("User updated successfully");;
  }

  public void getUser(User user){
    System.out.println("User details fetched successfully");
  }

  
}

  

