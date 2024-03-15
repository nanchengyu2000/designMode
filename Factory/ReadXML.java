package Factory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadXML {
    public static String readName(String path,String nodeName){
        String name="";
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document parse = documentBuilder.parse(new File(path));
            NodeList nodeList = parse.getElementsByTagName(nodeName);
            name = nodeList.item(0).getFirstChild().getNodeValue();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return name;
    }
    public static List<String> readFactorise(){
        List<String> list=new ArrayList<>();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document parse = documentBuilder.parse(new File("й╣ож/foconfig.xml"));
            NodeList nodeList = parse.getElementsByTagName("foctoryBean");
            NodeList childNodes = nodeList.item(0).getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                list.add(childNodes.item(i).getNodeValue());
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return  list;
    }
}
