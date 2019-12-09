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
}
