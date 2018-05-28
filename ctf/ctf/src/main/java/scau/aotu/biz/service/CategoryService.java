package scau.aotu.biz.service;

import scau.aotu.biz.model.Category;

import java.util.List;

public interface CategoryService {

    List<String> getAllCateName();

    Category getByCateName(String cataname);
}
