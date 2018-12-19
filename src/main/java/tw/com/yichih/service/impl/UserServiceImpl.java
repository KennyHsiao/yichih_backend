package tw.com.yichih.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import tw.com.yichih.mapper.SysUserMapper;
import tw.com.yichih.pojo.SysUser;
import tw.com.yichih.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper userMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUser(SysUser user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateUser(SysUser user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
	}

	@Override
	public SysUser queryUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysUser> queryUserList(SysUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysUser> queryUserListPaged(SysUser user, Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser queryUserByIdCustom(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUserTransactional(SysUser user) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
