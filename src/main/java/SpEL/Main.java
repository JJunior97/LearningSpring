package SpEL;

import SpEL.Klasy.Citizen;
import SpEL.Klasy.CitizenType2;
import SpEL.Klasy.City;
import SpEL.Klasy.MyProp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpEL/spel-test.xml");
        //---------------------------------LISTY
        List<City> cityList = (List<City>) context.getBean("cities");       //Korzystając z komponentu, mogę stworzyć instancję interfejsu 'List' - jak to możliwe???
/*        for(City c: cityList){
            System.out.println(c.getName() + " " + c.getState() + " " + c.getPopulation());
        }*/

/*        List<Integer> numberList = (List<Integer>) context.getBean("numbers");
        System.out.print("\n\n");
        for(int nr: numberList)
            System.out.println(nr);*/
/*        Citizen john = (Citizen) context.getBean("John");
        System.out.println(john.getName() + " " + john.getSurname() + " " + john.getCity().getName() + "\n");

        Citizen mike = (Citizen) context.getBean("Mike");
        System.out.println(mike.getName() + " " + mike.getSurname() + " " + mike.getCity().getName() + "\n");*/

        //------------------------------------MAPY
/*        Map<String, Integer> population = (Map<String, Integer>) context.getBean("cities-population");
        for(Map.Entry<String, Integer> entry: population.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
/*        CitizenType2 harry = (CitizenType2) context.getBean("Harry");
        System.out.println(harry.getName() + " " + harry.getSurname() + " " + harry.getCityPopulation());
;*/

        TestClass myTest = (TestClass) context.getBean("test");
/*        System.out.println(myTest.getHomePath());
        for (City city: myTest.getBigCities()){
            System.out.println(city.getName() + " " + city.getState() + " " + city.getPopulation());
        }
        System.out.println(myTest.getSubString());
        City firstBig = myTest.getFirstBigCity();
        City lastBig = myTest.getLastBigCity();

        System.out.println(firstBig.getName() + " " + firstBig.getState() + " " + firstBig.getPopulation());
        System.out.println(lastBig.getName() + " " + lastBig.getState() + " " + lastBig.getPopulation());*/
        for(int pop: myTest.getCityPopulations()){
            System.out.println(pop);
        }

    }
}
