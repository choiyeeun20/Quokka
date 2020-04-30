package com.yeeun.web.admin;

public interface AdminService {
	
	public void add (Admin admin);
	public Admin [] list();
	public Admin detail(String userid);
	public int Count();
	public boolean login(Admin admin);
	public void update(Admin admin);
	public void delete(Admin admin);

	
}
