package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Category;
import scau.aotu.biz.model.CategoryExample;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(Integer cateId);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer cateId);

    //获取所有分类名
    List<String> selectAllCateName();

    //根据分类名获取分类
    Category selectByCateName(String cateName);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}