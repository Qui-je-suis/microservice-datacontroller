/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Element containing team information.
 */
public class Team
{

  /**
   * The unique Opta team ID.
   */
  @XmlAttribute(name = "id")
  private Integer id;

  /**
   * Coach's birth date.
   */
  @XmlAttribute(name = "coach_birth_date")
  private String coachBirthDate;

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
   * Official team name.
   */
  @XmlAttribute(name = "name")
  private String name;

  /**
   * Element containing player information.
   */
  @XmlElement(name = "players")
  private List<Players> players;

  /**
   * Element containing team information.
   */
  @XmlElement(name = "team_profile")
  private TeamProfile teamProfile;
}
