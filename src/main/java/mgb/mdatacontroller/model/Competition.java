package mgb.mdatacontroller.model;

/**
 * Element containing competition information.
 */
public class Competition
{

  /**
   * Unique Opta competition ID.
   */
  private Integer id;

  /**
   * Denotes whether or not the competition is club or international.
   * 0 - international comp ; 1 - club comp
   */
  private Integer clubCompetition;

  /**
   * The usual name that the competition is referred to as.
   */
  private String compKnowName;

  /**
   * The official long name of the competition.
   */
  private String compLongName;

  /**
   * A short code used to reference the competition.
   */
  private String compShortName;
}
