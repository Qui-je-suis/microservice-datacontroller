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
}
