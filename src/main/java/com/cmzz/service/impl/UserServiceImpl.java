package com.cmzz.service.impl;


import com.cmzz.domain.ZzerrorListnum;
import com.cmzz.repository.UserJpaRepository;
import com.cmzz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserJpaRepository userJpaRepository;


    public List<ZzerrorListnum> findAll()
    {
        return userJpaRepository.findAll();
    }

}
