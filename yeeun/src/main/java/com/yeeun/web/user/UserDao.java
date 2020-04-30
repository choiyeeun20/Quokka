package com.yeeun.web.user;

import java.util.List;

import com.yeeun.web.util.Messenger;

public interface UserDao {

	public Messenger insert(User user);

	public List<User> selectAll();

	public Messenger selectOne(String userid);

	public void update(User user);

	public void delete(User user);


}
