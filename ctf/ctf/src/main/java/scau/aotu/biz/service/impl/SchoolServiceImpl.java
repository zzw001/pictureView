package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.SchoolMapper;
import scau.aotu.biz.model.School;
import scau.aotu.biz.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public int add(School school) {
        return schoolMapper.insert(school);
    }

    @Override
    public School get(String school_name) {
        return schoolMapper.selectBySchoolName(school_name);
    }
}
