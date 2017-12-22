package test.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import test.dao.UserMapper;
import test.model.User;
import test.service.IUserService;

  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;

	public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
    
  
}  