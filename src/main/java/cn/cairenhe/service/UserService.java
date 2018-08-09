package cn.cairenhe.service;

import cn.cairenhe.maid.UserDao;
import cn.cairenhe.maid.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userRepository;
    public User findUserByName(String username){
        return userRepository.findByUserName(username);
    }
}
