package org.bitbucket.dkrut.Utils;

import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Denis Krutikov on 26.11.2018.
 */

public class ValidateXml {

    public void validate(File xml, File xsd) {

        Logger log = Logger.getLogger(ValidateXml.class.toString());
        try {

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            StreamSource xmlFile = new StreamSource(xml);
            validator.validate(xmlFile);

            log.log(Level.INFO, "\""  + xml.getName() + "\" is Well Formed and Valid\n");
        } catch (SAXException e) {
            log.log(Level.SEVERE, "\""  + xml.getName() + "\" Validation FAILED. \ncause: " + e.toString() + "\n");
        } catch (IOException e) {
            log.log(Level.SEVERE, "\""  + xml.getName() + "\" Validation BLOCKED. \ncause: " + e.toString() + "\n");
        }
    }
}