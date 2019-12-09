/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mdatacontroller.model;

/**
 * The usual position the player plays in.
 */
public enum Position
{
  PROP("Prop"),
  HOOKER("Hooker"),
  LOCK("Lock"),
  FLANKER("Flanker"),
  NO_8("No. 8"),
  BLACK_ROW("Black Row"),
  SCRUM_HALF("Scrum Half"),
  FLY_HALF("Fly Half"),
  CENTRE("Centre"),
  WINGER("Winger"),
  FULL_BACK("Full Back"),
  UTILITY_BACK("Utility Back");

  private String position;

  Position(String position)
  {
    this.position = position;
  }

  public String getPosition()
  {
    return position;
  }

  @Override
  public String toString()
  {
    return position;
  }
}
