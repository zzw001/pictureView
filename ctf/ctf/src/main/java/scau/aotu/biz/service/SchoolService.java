package scau.aotu.biz.service;

import scau.aotu.biz.model.School;

public interface SchoolService {

    int add(School school);

    School get(String school_name);
}
