package domain;

import lombok.Data;

@Data
public class UserGroup {

  //N:1 관계
  private User user;
  private Group group;
}
