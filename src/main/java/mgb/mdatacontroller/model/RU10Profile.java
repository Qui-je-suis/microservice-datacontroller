package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Root element containing all subsequent elements.
 */
@XmlRootElement(name = "RU10_Profile")
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
}
