package com.yeeun.web.user;

import java.util.List;

public interface UserService {
	public void add(User user);
	public int count();
	public boolean update(User user);
	public boolean remove(String userid);
	public User detail(String userid);
	public User login(User user);
	public List<User> list();
}
