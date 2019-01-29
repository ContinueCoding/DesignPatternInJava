package com.huoxy.b3_filter_criteria_pattern_08;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<>();
        for (Person person : persons) {
            if("single".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePerson.add(person);
            }
        }
        return singlePerson;
    }
}
