package mgb.mdatacontroller.model;

import java.util.Date;

public class Team
{

  /**
   * The unique Opta team ID.
   */
  private Integer id;

  /**
   * Coach's birth date.
   */
  private Date coachBirthDate;

  /**
   * The coach's first name.
   */
  private String coachFirstName;

  /**
   * The coach's id.
   */
  private Integer coachId;

  /**
   * The coach's last name.
   */
  private String coachLastName;

  /**
   * Official team name.
   */
  private String name;

  /**
   * Element containing player information.
   */
  private Players players;

  /**
   * Element containing team information.
   */
  private TeamProfil teamProfil;
}
