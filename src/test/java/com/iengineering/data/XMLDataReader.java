package com.iengineering.data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.iengineering.ltppinfopave.testcases.SDRGuideLinks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDataReader
{
    private static Logger logger = LogManager.getLogger(SDRGuideLinks.class);

    public String ReturnXMLNode (String strXmlElement, String strXmlNode, String strFileName, String strProject)
    {

        // System.out.println (strFileName);
        String strdata = null;


        // XML Testing END

        try
        {
            //File inputFile = new File (getClass ().getClassLoader ().getResource ("store/" + strFileName).getFile ());
            ClassLoader classLoader = this.getClass().getClassLoader();
            File inputFile = new File(Objects.requireNonNull(classLoader.getResource(strProject.toLowerCase() + "/" + strFileName.toLowerCase())).getFile());

            //File inputFile = new File (getClass ().getClassLoader ().getResource (strFileName).getFile ());

                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(inputFile);
                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName(strXmlElement);
                Node nNode = nList.item(0);
                Element eElement = (Element) nNode;
                strdata = eElement.getElementsByTagName(strXmlNode).item(0).getTextContent();
                //System.out.println(strXmlNode.toUpperCase() + ": " + strdata);
                logger.info("Node ("+ strXmlNode.toUpperCase() +") value: " + strdata );
                return strdata;

        }
        catch (NullPointerException e)
        {
            logger.fatal("File not found");
        }
        catch (Exception e)
        {
            logger.trace(e);
        }
        // System.out.print (returnString);
        return strdata;
    }

    public List<String> ReturnXMLNodes (String strXmlElement, String strXmlNode, String strFileName, String strProject)
    {

        // System.out.println (strFileName);
        List<String> strdata = new ArrayList<String>();


        // XML Testing END

        try
        {
            //File inputFile = new File (getClass ().getClassLoader ().getResource ("store/" + strFileName).getFile ());
            ClassLoader classLoader = this.getClass().getClassLoader();
            File inputFile = new File(Objects.requireNonNull(classLoader.getResource(strProject.toLowerCase() + "/" + strFileName.toLowerCase())).getFile());

            //File inputFile = new File (getClass ().getClassLoader ().getResource (strFileName).getFile ());

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName(strXmlElement);
            Node nNode = nList.item(0);
            Element eElement = (Element) nNode;
            for (int i=0; i<eElement.getElementsByTagName(strXmlNode).getLength();i++){
                strdata.add(eElement.getElementsByTagName(strXmlNode).item(i).getTextContent());
            }
            return strdata;

        }
        catch (NullPointerException e)
        {
            logger.fatal("File not found");
        }
        catch (Exception e)
        {
            logger.trace(e);
        }
        // System.out.print (returnString);
        return strdata;
    }

}
