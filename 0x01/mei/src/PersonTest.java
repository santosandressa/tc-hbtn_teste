import org.junit.jupiter.api.BeforeEach;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PersonTest {

    @BeforeEach
    public void setUp(){
        Person person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(2000, Calendar.JANUARY, 1));
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);
    }

    public void show_full_name(){
        Person person = new Person();
        assertEquals("Paul McCartney", Person.fullName(person.getName(), person.getSurname()));
    }

    public void test_calculateYearlySalary(){
        float salary = 1200;

        assertEquals(salary, Person.calculateYearlySalary(salary), 0);
    }

    public void person_is_MEI(){
        Person person = new Person();

        assertTrue(Person.isMEI(person.getSalary(), person.isAnotherCompanyOwner(), person.isPensioner(), person.isPublicServer(), person.getBirthDate()));
    }

    public void person_is_not_MEI(){
        Person person = new Person();

        assertTrue(!Person.isMEI(person.getSalary(), person.isAnotherCompanyOwner(), person.isPensioner(), person.isPublicServer(), person.getBirthDate()));
    }
}
