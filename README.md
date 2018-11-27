# validateXmlXsd

XML validator using XSD schema

## **How to use validator:**
1. add xsd-file(single) into **XSD** folder
2. add xml-file(s) into **XML** folder
3. run `mvn compile exec:java`
or run Validation.class in your IDE


### How to use validator on you desktop(example for windows):
1. run `mvn package`
2. get at package "target" _validateXmlXsd-version-jar-with-dependencies.jar_ and rename it into **_validateXmlXsd.jar_**
3. create root folder at your directory
4. in root folder create two folders - XML and XSD
5. copy into the root folder validateXmlXsd.jar
6. put files into XML and XSD folders
7. run command java -jar validateXmlXsd.jar

You can also use bat-file to start validator - copy validate.bat into the root folder and start it.

>
####Root folder structure:  
>root folder  
>|- XML  
>|- XSD  
>|- validate.bat  
>|- validateXmlXsd.jar