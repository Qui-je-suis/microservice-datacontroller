/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Root element containing all subsequent elements.
 */
@XmlRootElement(name = "RU10_Profile")
//@XmlAccessorType(XmlAccessType.FIELD)
public class RU10Profile
{

  /**
   * Element containing competition information.
   */
  @XmlElement(name = "competition")
  private Competition competition;

  /**
   * The element housing all referee information
   */
  @XmlElementWrapper
  @XmlElement(name = "official")
  private Official official;

  /**
   * Element containing team information.
   */
  @XmlElement(name = "team")
  @XmlElementWrapper
  private Team team;

  /**
   * Element containing venue infomation.
   */
  @XmlElement(name = "venue")
  @XmlElementWrapper
  private Venue venue;

  public RU10Profile()
  {

  }

  public RU10Profile(Competition competition, Official official, Team team, Venue venue)
  {
    this.competition = competition;
    this.official = official;
    this.team = team;
    this.venue = venue;
  }

  @Override public String toString()
  {
    return "RU10Profile{" + "competition=" + competition + ", official=" + official + ", team=" + team + ", venue=" + venue + '}';
  }
}
