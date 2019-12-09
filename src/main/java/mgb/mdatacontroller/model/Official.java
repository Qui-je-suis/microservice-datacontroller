/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
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

  public Official()
  {

  }

  public Official(Date birthDate, String city, String country, String firstName, String lastName, Integer officialId, String profile)
  {
    this.birthDate = birthDate;
    this.city = city;
    this.country = country;
    this.firstName = firstName;
    this.lastName = lastName;
    this.officialId = officialId;
    this.profile = profile;
  }

  public Date getBirthDate()
  {
    return birthDate;
  }

  public void setBirthDate(Date birthDate)
  {
    this.birthDate = birthDate;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public Integer getOfficialId()
  {
    return officialId;
  }

  public void setOfficialId(Integer officialId)
  {
    this.officialId = officialId;
  }

  public String getProfile()
  {
    return profile;
  }

  public void setProfile(String profile)
  {
    this.profile = profile;
  }

  @Override public String toString()
  {
    return "Official{" + "birthDate=" + birthDate + ", city='" + city + '\'' + ", country='" + country + '\'' + ", firstName='" + firstName + '\''
            + ", lastName='" + lastName + '\'' + ", officialId=" + officialId + ", profile='" + profile + '\'' + '}';
  }
}
