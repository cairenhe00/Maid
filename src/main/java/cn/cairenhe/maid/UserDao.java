package cn.cairenhe.maid;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
