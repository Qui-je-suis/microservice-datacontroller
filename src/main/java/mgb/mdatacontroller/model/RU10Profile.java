package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

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
  @XmlElement(name = "official")
  private Official official;

  /**
   *
   */
  @XmlElement(name = "team")
  private Team team;

  /**
   *
   */
  @XmlElement(name = "venue")
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