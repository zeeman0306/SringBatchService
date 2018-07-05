package com.zamir.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
// PersonItemProcessor hat implements the ItemProcessor interface that has two generic types passed in that are both of the Person class
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

//    a static final logger that is connected to the PersonItemProcessor class
    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

//    an overridden method called process that passes in a final Person object named person whose return type is a Person and throws an exception
    @Override
    public Person process(final Person person) throws Exception {
//        a final String object named firstName is assigned to an UpperCase form of the getFirstName method of the Person object passed into the process method
        final String firstName = person.getFirstName().toUpperCase();
//        a final String object named lastName is assigned to an UpperCase form of the getLastName method of the Person object passed into the process method
        final String lastName = person.getLastName().toUpperCase();
//        a final Person object named transformedPerson is assigned to a new Person object with the firstName and lastName variables passed into it
        final Person transformedPerson = new Person(firstName, lastName);
//        a logger that shows that the Person object named person is being converted into the Person object named transformedPerson
        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
//        completing the method by returning the Person object named transformedPerson
        return transformedPerson;
    }

}
