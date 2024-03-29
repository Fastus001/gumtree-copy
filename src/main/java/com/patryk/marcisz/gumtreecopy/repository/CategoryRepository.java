package com.patryk.marcisz.gumtreecopy.repository;

import com.patryk.marcisz.gumtreecopy.model.dao.CategoryEntity;
import com.patryk.marcisz.gumtreecopy.model.dao.UserEntity;
import com.patryk.marcisz.gumtreecopy.model.dto.categories.main.GetMainCategoriesResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Query("SELECT cat FROM CategoryEntity cat WHERE cat.parent IS NULL")
    List<CategoryEntity> getMainCategories();

}
