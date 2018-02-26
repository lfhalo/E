package com.dao;

import com.entity.Person;

import java.util.List;

public interface PersonDao {

    public Person getPersonId(int pid);

    public List<Person> getPerson();

    public void delPerson(int pid);

    public void addPerson(Person person);

    public void updatePerson(Person person);



}
