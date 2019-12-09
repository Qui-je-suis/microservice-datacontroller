/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Element containing player information.
 */
public class Players
{

  /**
   * Player's birth date.
   */
  @XmlAttribute(name = "birth_date")
  private String birthDate;

  /**
   * ???
   */
  @XmlAttribute(name = "games_started")
  private Integer gamesStarted;

  /**
   * The height of the player in centimetres.
   */
  @XmlAttribute(name = "height")
  private Integer height;

  /**
   * The date the player info was last edited.
   */
  @XmlAttribute(name = "last_edited")
  private String lastEdited;

  /**
   * Unique Opta team ID of the player's national team if applicable.
   */
  @XmlAttribute(name = "nationality_id")
  private Integer nationalityId;

  /**
   * The name of the player's birth place.
   * Check to see if supported for that league.
   */
  @XmlAttribute(name = "place_birth")
  private String placeBirth;

  /**
   * The number of player caps achieved.
   * Check to see if supported for that league.
   */
  @XmlAttribute(name = "player_caps")
  private Integer playerCaps;

  /**
   * The player's first name.
   */
  @XmlAttribute(name = "player_first_name")
  private String playerFirstName;

  /**
   * Unique Opta player ID.
   */
  @XmlAttribute(name = "player_id")
  private Integer playerId;

  /**
   * The player's initials.
   */
  @XmlAttribute(name = "player_initials")
  private String playerInitials;

  /**
   * The known name of the player if not his first name + last name.
   */
  @XmlAttribute(name = "player_know_name")
  private String playerKnowName;

  /**
   * The player's last name.
   */
  @XmlAttribute(name = "player_last_name")
  private String playerLastName;

  /**
   * The usual position the player plays in.
   */
  @XmlAttribute(name = "position")
  private Position position;

  /**
   * Opta id relating to position played.
   */
  @XmlAttribute(name = "position_id")
  private Integer positionId;

  /**
   * Text profile of the player: updated for selected competitions only.
   * Please check with Opta editorial.
   */
  @XmlAttribute(name = "profile")
  private String profile;

  /**
   * 	Unique Opta team ID of the player's team.
   */
  @XmlAttribute(name = "team_id")
  private Integer teamId;

  /**
   * The players listed weight in kilos.
   */
  @XmlAttribute(name = "weight")
  private Integer weight;
}
