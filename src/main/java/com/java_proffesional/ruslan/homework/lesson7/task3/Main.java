package com.java_proffesional.ruslan.homework.lesson7.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author Ruslan
 * Homework7 task3
 *  Вывести в консоль brand, speed всех транспортных средств используя любой из рассматриваемых ранее парсеров.
 */

public class Main {

    public static void main(String[] args) {

        try {
            File xmlFile = new File("task3.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // Получаем объект DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Парсим объект DocumentBuilder и получаем объект Document
            Document doc = db.parse(xmlFile);

            // Возвращает объект класса Element, получаем корневой элемент
            Element root = doc.getDocumentElement();

            //  Вызываем метод getChildNodes
            NodeList nodeList = root.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                // По номеру получаем узел
                Node node = nodeList.item(i);
                // Проверяем определенный тип, если узел является элементом, то входим в тело
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("brand: "
                            + element.getElementsByTagName("brand").item(0)
                            .getChildNodes().item(0).getNodeValue());
                    System.out.println("speed: "
                            + element.getElementsByTagName("speed").item(0)
                            .getChildNodes().item(0).getNodeValue());
                    System.out.println("----------------------");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}