import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    public void show_full_name(){
        String name = "Paul";
        String surname = "McCartney";

        assertEquals("Paul McCartney", Person.fullName(name, surname));
    }

    public void test_calculateYearlySalary(){
        float salary = 1200;

        assertEquals(salary, Person.calculateYearlySalary(salary), 0);
    }

    public void person_is_MEI(){
        Person person = new Person();
        person.setSalary(1200);
        person.setPensioner(true);
        person.setBirthDate(new Date(1980, Calendar.FEBRUARY, 1));
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setAnotherCompanyOwner(true);
        person.setPublicServer(true);

        assertTrue(Person.isMEI(person.getSalary(), person.isAnotherCompanyOwner(), person.isPensioner(), person.isPublicServer(), person.getBirthDate()));
    }

    public void person_is_not_MEI(){
        Person person = new Person();
        person.setSalary(1200);
        person.setPensioner(true);
        person.setBirthDate(new Date(1980, Calendar.FEBRUARY, 1));
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setAnotherCompanyOwner(true);
        person.setPublicServer(false);

        assertTrue(!Person.isMEI(person.getSalary(), person.isAnotherCompanyOwner(), person.isPensioner(), person.isPublicServer(), person.getBirthDate()));
    }
}
