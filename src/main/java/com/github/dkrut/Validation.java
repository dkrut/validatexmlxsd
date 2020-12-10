package com.github.dkrut;

import com.github.dkrut.Utils.ValidateXml;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Denis Krutikov on 26.11.2018.
 */

public class Validation {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(ValidateXml.class.toString());

        ValidateXml validateXml = new ValidateXml();

        File xmlFolder = new File("XML");
        File[] xmlFiles = xmlFolder.listFiles();

        File xsdFolder = new File("XSD");
        File[] xsdFiles = xsdFolder.listFiles();

        if (xsdFiles.length != 0) {
            if (xmlFiles.length != 0) {
                for (File xml :xmlFiles) {
                    validateXml.validate(xml, xsdFiles[0]);
                }
            } else log.log(Level.WARNING, "There are no XML files. Add files to the folder " + xmlFolder.getPath());
        } else log.log(Level.WARNING, "There is no XSD file. Add schema to the folder " + xsdFolder.getPath());
    }
}