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

  public Team()
  {

  }
  public Team(Integer id, Date coachBirthDate, String coachFirstName, Integer coachId, String coachLastName, String name, Players players,
          TeamProfil teamProfil)
  {
    this.id = id;
    this.coachBirthDate = coachBirthDate;
    this.coachFirstName = coachFirstName;
    this.coachId = coachId;
    this.coachLastName = coachLastName;
    this.name = name;
    this.players = players;
    this.teamProfil = teamProfil;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Date getCoachBirthDate()
  {
    return coachBirthDate;
  }

  public void setCoachBirthDate(Date coachBirthDate)
  {
    this.coachBirthDate = coachBirthDate;
  }

  public String getCoachFirstName()
  {
    return coachFirstName;
  }

  public void setCoachFirstName(String coachFirstName)
  {
    this.coachFirstName = coachFirstName;
  }

  public Integer getCoachId()
  {
    return coachId;
  }

  public void setCoachId(Integer coachId)
  {
    this.coachId = coachId;
  }

  public String getCoachLastName()
  {
    return coachLastName;
  }

  public void setCoachLastName(String coachLastName)
  {
    this.coachLastName = coachLastName;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Players getPlayers()
  {
    return players;
  }

  public void setPlayers(Players players)
  {
    this.players = players;
  }

  public TeamProfil getTeamProfil()
  {
    return teamProfil;
  }

  public void setTeamProfil(TeamProfil teamProfil)
  {
    this.teamProfil = teamProfil;
  }

  @Override public String toString()
  {
    return "Team{" + "id=" + id + ", coachBirthDate=" + coachBirthDate + ", coachFirstName='" + coachFirstName + '\'' + ", coachId=" + coachId
            + ", coachLastName='" + coachLastName + '\'' + ", name='" + name + '\'' + ", players=" + players + ", teamProfil=" + teamProfil + '}';
  }
}
