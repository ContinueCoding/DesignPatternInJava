package com.huoxy.b3_filter_criteria_pattern_08;

import java.util.List;

//满足任何一条标准的结果
public class OrCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    /**
     * 创建含有2条标准的标准
     * @param criteria1 标准1
     * @param criteria2 标准2
     */
    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaResult = criteria1.meetCriteria(persons);
        List<Person> secondCriteriaResult = criteria2.meetCriteria(persons);

        for(Person person : secondCriteriaResult) {
            if(!firstCriteriaResult.contains(person)) {
                firstCriteriaResult.add(person);
            }
        }

        return firstCriteriaResult;
    }
}
