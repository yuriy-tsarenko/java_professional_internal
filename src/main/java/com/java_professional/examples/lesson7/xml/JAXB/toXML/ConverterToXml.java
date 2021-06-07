package com.java_professional.examples.lesson7.xml.JAXB.toXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ConverterToXml {
    public static void main(String[] args) {
        try {
            JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
            Marshaller marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Employee emp1 = new Employee(2, "John Wick", 70000);

            marshallerObj.marshal(emp1, new FileOutputStream("D:\\IT\\IdeaProjects\\java_profesional_internal\\"
                    + "src\\main\\java\\com\\java_professional\\examples\\lesson7\\xml\\JAXB\\employee.xml"));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
