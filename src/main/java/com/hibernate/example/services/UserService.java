package com.hibernate.example.services;

import com.hibernate.example.dao.UserDao;
import com.hibernate.example.models.Auto;
import com.hibernate.example.models.User;
import com.hibernate.example.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }

    public void closeConnection() {
        HibernateSessionFactoryUtil.closeSession();
    }
}
