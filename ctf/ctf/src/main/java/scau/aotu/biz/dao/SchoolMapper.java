package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.School;
import scau.aotu.biz.model.SchoolExample;

public interface SchoolMapper {
    int countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer schoolId);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    //根据学校id获取学校
    School selectByPrimaryKey(Integer schoolId);

    //根据学校名获取学校
    School selectBySchoolName(String schoolName);

    //获取所有学校名
    List<String> selectAllSchoolName();

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}