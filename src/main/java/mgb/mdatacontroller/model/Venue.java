package mgb.mdatacontroller.model;

import java.util.Date;

public class Venue
{

  /**
   * The id of the venue within this competition.
   * Not to be confused with the universal venue_id see below.
   * N.B. A venue can appear in RU10 feeds for multiple competitions.
   */
  private Integer id;

  /**
   * The capacity of the stadium.
   */
  private Integer capacity;

  /**
   * The name of the city where the venue is located.
   */
  private String city;

  /**
   * The country id relating to a country name where the venue is
   * 1	England / 2	Scotland / 3	Wales / 4	Spain / 6	Italy
   * 8	France / 9	Northern Ireland / 10	Republic of Ireland
   * 13	Romania / 14	Portugal / 17	Belgium / 23	Canada / 27	USA
   * 28	Australia / 30	Japan / 32	Argentina / 43	Georgia
   * 44	Uruguay / 49	Russia / 52	Chile / 56	South Africa
   * 74	New Zealand / 162 United Arab Emirates / 184 Fiji
   * 189 Tonga / 211 USSR / 214 Hong Kong/  241 Samoa
   */
  private Integer country;

  /**
   * The date the venue hosted its first event.
   */
  private Date established;

  /**
   * North/south geographical co-ordinate in relation to
   * the zero-latitude reference line (i.e. the equator).
   */
  private Double latitude;

  /**
   * East/west geographical co-ordinate in relation
   * to the zero-longitude reference line (i.e. Royal Observatory, Greenwich UK).
   */
  private Double longitude;

  /**
   * The name of the venue.
   */
  private String name;

  /**
   * A text summary to describe the venue.
   * This is written such that it can be integrated into a web page with <p> tags included.
   * Please check with Opta on availability.
   */
  private String profile;

  /**
   * The address of the venue.
   */
  private String street;

  /**
   * The name of the team that usually plays at the venue.
   */
  private String teamName;

  /**
   * The unique Opta venue ID.
   */
  private Integer venueId;

  public Venue()
  {

  }
  public Venue(Integer id, Integer capacity, String city, Integer country, Date established, Double latitude, Double longitude, String name, String profile,
          String street, String teamName, Integer venueId)
  {
    this.id = id;
    this.capacity = capacity;
    this.city = city;
    this.country = country;
    this.established = established;
    this.latitude = latitude;
    this.longitude = longitude;
    this.name = name;
    this.profile = profile;
    this.street = street;
    this.teamName = teamName;
    this.venueId = venueId;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Integer getCapacity()
  {
    return capacity;
  }

  public void setCapacity(Integer capacity)
  {
    this.capacity = capacity;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public Integer getCountry()
  {
    return country;
  }

  public void setCountry(Integer country)
  {
    this.country = country;
  }

  public Date getEstablished()
  {
    return established;
  }

  public void setEstablished(Date established)
  {
    this.established = established;
  }

  public Double getLatitude()
  {
    return latitude;
  }

  public void setLatitude(Double latitude)
  {
    this.latitude = latitude;
  }

  public Double getLongitude()
  {
    return longitude;
  }

  public void setLongitude(Double longitude)
  {
    this.longitude = longitude;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getProfile()
  {
    return profile;
  }

  public void setProfile(String profile)
  {
    this.profile = profile;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getTeamName()
  {
    return teamName;
  }

  public void setTeamName(String teamName)
  {
    this.teamName = teamName;
  }

  public Integer getVenueId()
  {
    return venueId;
  }

  public void setVenueId(Integer venueId)
  {
    this.venueId = venueId;
  }

  @Override public String toString()
  {
    return "Venue{" + "id=" + id + ", capacity=" + capacity + ", city='" + city + '\'' + ", country=" + country + ", established=" + established + ", latitude="
            + latitude + ", longitude=" + longitude + ", name='" + name + '\'' + ", profile='" + profile + '\'' + ", street='" + street + '\'' + ", teamName='"
            + teamName + '\'' + ", venueId=" + venueId + '}';
  }
}
