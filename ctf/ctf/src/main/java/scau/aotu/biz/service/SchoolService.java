package scau.aotu.biz.service;

import scau.aotu.biz.model.School;

import java.util.List;

public interface SchoolService {

    int add(School school);

    School getBySchoolName(String schoolname);

    School getBySchoolId(Integer schoolid);

    List<String> getAllSchoolName();
}
