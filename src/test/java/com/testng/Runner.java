package com.testng;

import com.testng.listeners.TestListeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListeners());

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));

        List<XmlSuite> xmlSuites = new ArrayList<>();
        xmlSuites.add(xmlSuite);

        testNG.setXmlSuites(xmlSuites);
        testNG.run();
    }
}
