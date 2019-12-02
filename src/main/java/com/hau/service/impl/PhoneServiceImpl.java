package com.hau.service.impl;

import com.hau.model.Category;
import com.hau.model.Phone;
import com.hau.repository.PhoneRepository;
import com.hau.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }

    @Override
    public Page<Phone> findAllByNameContaining(String name,@PageableDefault(size = 10) Pageable pageable) {
        return phoneRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Phone findById(Long id) {
        return phoneRepository.findOne(id);
    }

    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);

    }

    @Override
    public void remove(Long id) {
        phoneRepository.delete(id);
    }

    @Override
    public Iterable<Phone> findAllByCategory(Category category) {
        return phoneRepository.findAllByCategory(category);
    }
}
