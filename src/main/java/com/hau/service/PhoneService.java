package com.hau.service;

import com.hau.model.Category;
import com.hau.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PhoneService {
    Page<Phone> findAll(Pageable pageable);
    Phone findById(Long id);
    void save (Phone material);
    void remove(Long id);
    Iterable<Phone> findAllByCategory(Category category);
    Page<Phone> findAllByNameContaining(String name, Pageable pageable);

}
