package mgb.mdatacontroller.model;

import java.util.Date;

/**
 * The element housing all referee information
 */
public class Official
{

  /**
   * The referee birth date
   */
  private Date birthDate;

  /**
   * City of birth of the referee.
   */
  private String city;

  /**
   * Country of birth of the referee.
   */
  private String country;

  /**
   * The first name of the official.
   */
  private String firstName;

  /**
   * The surname of the referee.
   */
  private String lastName;

  /**
   * The referee Id unique to Opta.
   */
  private Integer officialId;

  /**
   * The profile of the referee.
   * Please check with Opta for availability.
   */
  private String profile;
}
