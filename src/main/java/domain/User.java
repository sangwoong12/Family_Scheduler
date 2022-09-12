package domain;

import java.util.List;
import lombok.Data;

@Data
public class User {

  private String id;
  private String password;
  private String name;
  //1:N 관계
  private List<Friends> friends;
  private List<FriendRequest> friendRequests;
  private List<UserGroup> userGroups;
}
