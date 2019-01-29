package com.huoxy.b3_filter_criteria_pattern_08;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<>();
        for(Person person : persons) {
            if("male".equalsIgnoreCase(person.getGender())){
                malePerson.add(person);
            }
        }
        return malePerson;
    }
}
