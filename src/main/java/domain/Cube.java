package domain;

import java.sql.Date;
import java.util.List;
import lombok.Data;

@Data
public class Cube {
  private int cubeNo;
  private String writerId;
  private Date regDate;
  private CubeType cubeType;
  private String content;
  private Group groupNo;
  private String file;


  private List<Comment> comments;
}
