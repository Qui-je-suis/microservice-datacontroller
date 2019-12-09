/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * The element housing all referee information
 */
public class Official
{

  /**
   * The referee birth date
   */
  @XmlAttribute(name = "birth_date")
  private String birthDate;

  /**
   * City of birth of the referee.
   */
  @XmlAttribute(name = "city")
  private String city;

  /**
   * Country of birth of the referee.
   */
  @XmlAttribute(name = "country")
  private String country;

  /**
   * The first name of the official.
   */
  @XmlAttribute(name = "first_name")
  private String firstName;

  /**
   * The surname of the referee.
   */
  @XmlAttribute(name = "last_name")
  private String lastName;

  /**
   * The referee Id unique to Opta.
   */
  @XmlAttribute(name = "official_id")
  private Integer officialId;

  /**
   * The profile of the referee.
   * Please check with Opta for availability.
   */
  @XmlAttribute(name = "profile")
  private String profile;
}
