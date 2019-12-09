package mgb.mdatacontroller.model;

import java.util.Date;

public class Players
{

  /**
   * Player's birth date.
   */
  private String birthDate;

  /**
   * ???
   */
  private Integer gameStarted;

  /**
   * The height of the player in centimetres.
   */
  private Integer height;

  /**
   * The date the player info was last edited.
   */
  private String lastEdited;

  /**
   * Unique Opta team ID of the player's national team if applicable.
   */
  private Integer nationalityId;

  /**
   * The name of the player's birth place.
   * Check to see if supported for that league.
   */
  private Integer placeBirth;

  /**
   * The number of player caps achieved.
   * Check to see if supported for that league.
   */
  private Integer playerCaps;

  /**
   * The player's first name.
   */
  private String playerFirstName;

  /**
   * Unique Opta player ID.
   */
  private Integer playerId;

  /**
   * The player's initials.
   */
  private String playerInitials;

  /**
   * The known name of the player if not his first name + last name.
   */
  private String playerKnowName;

  /**
   * The player's last name.
   */
  private String playerLastName;

  /**
   * The usual position the player plays in.
   */
  private Position position;

  /**
   * Opta id relating to position played.
   */
  private Integer positionId;

  /**
   * Text profile of the player: updated for selected competitions only.
   * Please check with Opta editorial.
   */
  private String profile;

  /**
   * 	Unique Opta team ID of the player's team.
   */
  private Integer teamId;

  /**
   * The players listed weight in kilos.
   */
  private Integer weight;
}
