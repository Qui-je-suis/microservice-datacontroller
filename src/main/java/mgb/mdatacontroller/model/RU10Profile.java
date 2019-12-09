/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Root element containing all subsequent elements.
 */
@XmlRootElement(name = "RU10_Profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class RU10Profile implements Serializable
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
  private List<Official> officials;

  /**
   * Element containing team information.
   */
  @XmlElement(name = "team")
  private List<Team> teams;

  /**
   * Element containing venue infomation.
   */
  @XmlElement(name = "venue")
  private List<Venue> venues;
}
