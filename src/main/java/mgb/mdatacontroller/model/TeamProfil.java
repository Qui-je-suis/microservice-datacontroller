package mgb.mdatacontroller.model;

import java.util.Date;

/**
 * Element containing team information.
 */
public class TeamProfil
{

  /**
   * Use the team_id value for team ID information.
   */
  private Integer id;

  /**
   * Team's birth date.
   */
  private Date birthDate;

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
   * Written profile comments.
   * Please check with Opta for availability.
   */
  private String comments;

  /**
   * 	The year the club was founded.
   * 	Please check with Opta for availability.
   */
  private Integer founded;

  /**
   * The last time the profile was edited.
   */
  private Date lastEdited;

  /**
   * Team name.
   */
  private String name;

  /**
   * Text profile of the team. Not populated for all competitions.
   * Please seek Opta advice.
   */
  private String profile;

  /**
   * 	The unique Opta team ID.
   */
  private Integer teamId;

  /**
   * The unique Opta venue ID for the team's home venue.
   */
  private Integer venueId;

  public TeamProfil()
  {

  }
  public TeamProfil(Integer id, Date birthDate, String coachFirstName, Integer coachId, String coachLastName, String comments, Integer founded, Date lastEdited,
          String name, String profile, Integer teamId, Integer venueId)
  {
    this.id = id;
    this.birthDate = birthDate;
    this.coachFirstName = coachFirstName;
    this.coachId = coachId;
    this.coachLastName = coachLastName;
    this.comments = comments;
    this.founded = founded;
    this.lastEdited = lastEdited;
    this.name = name;
    this.profile = profile;
    this.teamId = teamId;
    this.venueId = venueId;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Date getBirthDate()
  {
    return birthDate;
  }

  public void setBirthDate(Date birthDate)
  {
    this.birthDate = birthDate;
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

  public String getComments()
  {
    return comments;
  }

  public void setComments(String comments)
  {
    this.comments = comments;
  }

  public Integer getFounded()
  {
    return founded;
  }

  public void setFounded(Integer founded)
  {
    this.founded = founded;
  }

  public Date getLastEdited()
  {
    return lastEdited;
  }

  public void setLastEdited(Date lastEdited)
  {
    this.lastEdited = lastEdited;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getProfile()
  {
    return profile;
  }

  public void setProfile(String profile)
  {
    this.profile = profile;
  }

  public Integer getTeamId()
  {
    return teamId;
  }

  public void setTeamId(Integer teamId)
  {
    this.teamId = teamId;
  }

  public Integer getVenueId()
  {
    return venueId;
  }

  public void setVenueId(Integer venueId)
  {
    this.venueId = venueId;
  }

  @Override public String toString()
  {
    return "TeamProfil{" + "id=" + id + ", birthDate=" + birthDate + ", coachFirstName='" + coachFirstName + '\'' + ", coachId=" + coachId + ", coachLastName='"
            + coachLastName + '\'' + ", comments='" + comments + '\'' + ", founded=" + founded + ", lastEdited=" + lastEdited + ", name='" + name + '\''
            + ", profile='" + profile + '\'' + ", teamId=" + teamId + ", venueId=" + venueId + '}';
  }
}
