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

  public Players()
  {

  }
  public Players(String birthDate, Integer gameStarted, Integer height, String lastEdited, Integer nationalityId, Integer placeBirth, Integer playerCaps,
          String playerFirstName, Integer playerId, String playerInitials, String playerKnowName, String playerLastName, Position position, Integer positionId,
          String profile, Integer teamId, Integer weight)
  {
    this.birthDate = birthDate;
    this.gameStarted = gameStarted;
    this.height = height;
    this.lastEdited = lastEdited;
    this.nationalityId = nationalityId;
    this.placeBirth = placeBirth;
    this.playerCaps = playerCaps;
    this.playerFirstName = playerFirstName;
    this.playerId = playerId;
    this.playerInitials = playerInitials;
    this.playerKnowName = playerKnowName;
    this.playerLastName = playerLastName;
    this.position = position;
    this.positionId = positionId;
    this.profile = profile;
    this.teamId = teamId;
    this.weight = weight;
  }

  public String getBirthDate()
  {
    return birthDate;
  }

  public void setBirthDate(String birthDate)
  {
    this.birthDate = birthDate;
  }

  public Integer getGameStarted()
  {
    return gameStarted;
  }

  public void setGameStarted(Integer gameStarted)
  {
    this.gameStarted = gameStarted;
  }

  public Integer getHeight()
  {
    return height;
  }

  public void setHeight(Integer height)
  {
    this.height = height;
  }

  public String getLastEdited()
  {
    return lastEdited;
  }

  public void setLastEdited(String lastEdited)
  {
    this.lastEdited = lastEdited;
  }

  public Integer getNationalityId()
  {
    return nationalityId;
  }

  public void setNationalityId(Integer nationalityId)
  {
    this.nationalityId = nationalityId;
  }

  public Integer getPlaceBirth()
  {
    return placeBirth;
  }

  public void setPlaceBirth(Integer placeBirth)
  {
    this.placeBirth = placeBirth;
  }

  public Integer getPlayerCaps()
  {
    return playerCaps;
  }

  public void setPlayerCaps(Integer playerCaps)
  {
    this.playerCaps = playerCaps;
  }

  public String getPlayerFirstName()
  {
    return playerFirstName;
  }

  public void setPlayerFirstName(String playerFirstName)
  {
    this.playerFirstName = playerFirstName;
  }

  public Integer getPlayerId()
  {
    return playerId;
  }

  public void setPlayerId(Integer playerId)
  {
    this.playerId = playerId;
  }

  public String getPlayerInitials()
  {
    return playerInitials;
  }

  public void setPlayerInitials(String playerInitials)
  {
    this.playerInitials = playerInitials;
  }

  public String getPlayerKnowName()
  {
    return playerKnowName;
  }

  public void setPlayerKnowName(String playerKnowName)
  {
    this.playerKnowName = playerKnowName;
  }

  public String getPlayerLastName()
  {
    return playerLastName;
  }

  public void setPlayerLastName(String playerLastName)
  {
    this.playerLastName = playerLastName;
  }

  public Position getPosition()
  {
    return position;
  }

  public void setPosition(Position position)
  {
    this.position = position;
  }

  public Integer getPositionId()
  {
    return positionId;
  }

  public void setPositionId(Integer positionId)
  {
    this.positionId = positionId;
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

  public Integer getWeight()
  {
    return weight;
  }

  public void setWeight(Integer weight)
  {
    this.weight = weight;
  }

  @Override public String toString()
  {
    return "Players{" + "birthDate='" + birthDate + '\'' + ", gameStarted=" + gameStarted + ", height=" + height + ", lastEdited='" + lastEdited + '\''
            + ", nationalityId=" + nationalityId + ", placeBirth=" + placeBirth + ", playerCaps=" + playerCaps + ", playerFirstName='" + playerFirstName + '\''
            + ", playerId=" + playerId + ", playerInitials='" + playerInitials + '\'' + ", playerKnowName='" + playerKnowName + '\'' + ", playerLastName='"
            + playerLastName + '\'' + ", position=" + position + ", positionId=" + positionId + ", profile='" + profile + '\'' + ", teamId=" + teamId
            + ", weight=" + weight + '}';
  }
}
