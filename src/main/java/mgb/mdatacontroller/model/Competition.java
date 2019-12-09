/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Element containing competition information.
 */
public class Competition
{

  /**
   * Unique Opta competition ID.
   */
  @XmlAttribute(name = "id")
  private Integer id;

  /**
   * Denotes whether or not the competition is club or international.
   * 0 - international comp ; 1 - club comp
   */
  @XmlAttribute(name = "club_competition")
  private Integer clubCompetition;

  /**
   * The usual name that the competition is referred to as.
   */
  @XmlAttribute(name = "comp_known_name")
  private String compKnownName;

  /**
   * The official long name of the competition.
   */
  @XmlAttribute(name = "comp_long_name")
  private String compLongName;

  /**
   * A short code used to reference the competition.
   */
  @XmlAttribute(name = "comp_short_name")
  private String compShortName;
}
