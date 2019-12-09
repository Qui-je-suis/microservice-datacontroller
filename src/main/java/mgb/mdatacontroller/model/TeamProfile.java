/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Element containing team information.
 */
public class TeamProfile
{

  /**
   * Use the team_id value for team ID information.
   */
  @XmlAttribute(name = "id")
  private Integer id;

  /**
   * Team's birth date.
   */
  @XmlAttribute(name = "birth_date")
  private String birthDate;

  /**
   * The coach's first name.
   */
  @XmlAttribute(name = "coach_first_name")
  private String coachFirstName;

  /**
   * The coach's id.
   */
  @XmlAttribute(name = "coach_id")
  private Integer coachId;

  /**
   * The coach's last name.
   */
  @XmlAttribute(name = "coach_last_name")
  private String coachLastName;

  /**
   * Written profile comments.
   * Please check with Opta for availability.
   */
  @XmlAttribute(name = "comments")
  private String comments;

  /**
   * 	The year the club was founded.
   * 	Please check with Opta for availability.
   */
  @XmlAttribute(name = "founded")
  private Integer founded;

  /**
   * The last time the profile was edited.
   */
  @XmlAttribute(name = "last_edited")
  private String lastEdited;

  /**
   * Team name.
   */
  @XmlAttribute(name = "name")
  private String name;

  /**
   * Text profile of the team. Not populated for all competitions.
   * Please seek Opta advice.
   */
  @XmlAttribute(name = "profile")
  private String profile;

  /**
   * 	The unique Opta team ID.
   */
  @XmlAttribute(name = "team_id")
  private Integer teamId;

  /**
   * The unique Opta venue ID for the team's home venue.
   */
  @XmlAttribute(name = "venue_id")
  private Integer venueId;
}
