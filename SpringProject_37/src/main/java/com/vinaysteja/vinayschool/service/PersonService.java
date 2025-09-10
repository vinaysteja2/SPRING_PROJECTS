package com.vinaysteja.vinayschool.service;

import com.vinaysteja.vinayschool.constants.VinaySchoolConstants;
import com.vinaysteja.vinayschool.model.Person;
import com.vinaysteja.vinayschool.model.Roles;
import com.vinaysteja.vinayschool.repository.PersonRepository;
import com.vinaysteja.vinayschool.repository.RolesRepository;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(VinaySchoolConstants.STUDENT_ROLE);
        person.setRoles(role);
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }}