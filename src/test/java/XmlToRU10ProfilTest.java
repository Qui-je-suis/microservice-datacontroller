/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */

import mgb.mdatacontroller.model.RU10Profile;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToRU10ProfilTest
{

  private RU10Profile ru10Profile;

  @Test
  public void testXmlToObject() throws JAXBException
  {
    File file = new File("src/test/resources/test-jaxb/ru10_comp-201.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(RU10Profile.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    ru10Profile = (RU10Profile) unmarshaller.unmarshal(file);
    System.out.println(ru10Profile);
  }
}
