package domain;

import lombok.Data;

@Data
public class FriendRequest {

  private String userId;
  private String friendId;
}
