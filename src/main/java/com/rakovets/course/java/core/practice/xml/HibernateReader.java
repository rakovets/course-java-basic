package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class HibernateReader {
    static LinkedHashMap<String, String> property = new LinkedHashMap<>();
    static LinkedHashMap<String, String> mapping = new LinkedHashMap<>();

    public HibernateConfiguration readConfig(String configFilepath) {
        HibernateConfiguration Hibernate = new HibernateConfiguration();
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(configFilepath));
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();
                    switch (elementName) {
                        case HibernateField.PROPERTY:
                            String name = getAttributeValueByName(startElement, HibernateField.NAME);
                            event = eventReader.nextEvent();
                            String value = event.asCharacters().getData();
                            if (name != null) {
                                property.put(name, value);
                            }
                            break;
                        case HibernateField.MAPPING:
                            String classValue = getAttributeValueByName(startElement, HibernateField.CLASS);
                            if (classValue != null) {
                                mapping.put(classValue, HibernateField.CLASS);
                            }
                    }
                }
            }
            Hibernate.setMapping(mapping);
            Hibernate.setProperty(property);
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
        return Hibernate;
    }

    private static String getAttributeValueByName(StartElement startElement, String attributeName) {
        Iterator<Attribute> attributes = startElement.getAttributes();
        while (attributes.hasNext()) {
            Attribute attribute = attributes.next();
            if (attribute.getName().toString().equals(attributeName)) {
                return attribute.getValue();
            }
        }
        return null;
    }
}
