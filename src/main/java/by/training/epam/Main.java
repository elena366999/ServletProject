package by.training.epam;

import by.training.epam.builders.BeanBuilder;
import by.training.epam.builders.CandiesBuilderFactory;
import by.training.epam.entities.Candy;
import by.training.epam.entities.CandyBean;
import by.training.epam.parsers.XMLParser;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CandiesBuilderFactory builderFactory = new CandiesBuilderFactory();

        XMLParser parser = builderFactory.createCandiesListBuilder("DOM");
        List<Candy> list = parser.createCandiesList();
        List<CandyBean> beanList = BeanBuilder.buildCandyBeanList(list);
        System.out.println(beanList);
    }
}
