package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.CategoryMapper;
import scau.aotu.biz.model.Category;
import scau.aotu.biz.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<String> getAllCateName() {
        return categoryMapper.selectAllCateName();
    }

    @Override
    public Category getByCateName(String catename) {
        return categoryMapper.selectByCateName(catename);
    }
}
