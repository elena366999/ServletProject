package by.training.epam.parsers;

import java.io.IOException;
import java.util.List;

import by.training.epam.entities.Candy;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.SAXException;

public class MySAXParser implements XMLParser{

    @Override
    public List<Candy> createCandiesList() {
        String fileName = "src\\main\\java\\by\\training\\epam\\res\\Candies.xml";
        SimpleCandyHandler schendler = new SimpleCandyHandler();

        try {
            XMLReader reader =  XMLReaderFactory.createXMLReader();
            reader.setContentHandler(schendler);
            reader.parse(fileName);
        } catch (IOException | SAXException e ) {
            System.out.println(e.getMessage());
        }

        return schendler.getCandiesList();
    }

}