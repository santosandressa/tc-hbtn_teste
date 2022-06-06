package src;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    public Person setUp(){
        Person person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(2000, Calendar.JANUARY, 1));
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);

        return person;
    }

    public void show_full_name(){
        Person person = setUp();
        assertEquals("Paul McCartney", Person.fullName(person.getName(), person.getSurname()));
    }

    public void test_calculateYearlySalary(){
        float salary = 1200;

        assertEquals(salary, Person.calculateYearlySalary(salary), 0);
    }

    public void person_is_MEI(){
        Person person = setUp();

        assertTrue(Person.isMEI(person.getSalary(), person.isAnotherCompanyOwner(), person.isPensioner(), person.isPublicServer(), person.getBirthDate()));
    }

    public void person_is_not_MEI(){
        Person person = setUp();

        assertTrue(!Person.isMEI(person.getSalary(), person.isAnotherCompanyOwner(), person.isPensioner(), person.isPublicServer(), person.getBirthDate()));
    }
}
