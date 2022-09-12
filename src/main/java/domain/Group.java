package domain;

import java.util.List;
import lombok.Data;

@Data
public class Group {

  private int groupNo;
  private String groupName;
  private GroupType groupType;
  //1:N
  private List<UserGroup> userGroups;
}
