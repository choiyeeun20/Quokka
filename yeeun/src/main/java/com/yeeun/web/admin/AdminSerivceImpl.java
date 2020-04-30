package com.yeeun.web.admin;

import org.springframework.stereotype.Service;

@Service	
public class AdminSerivceImpl implements AdminService{
	private Admin [] admins;
	private int count;
	
	public AdminSerivceImpl() {
		admins = new Admin[5];
		count = 0;
	}

	@Override
	public void add(Admin admin) {
		admins[count] = admin;
		count++;
		
	}

	@Override
	public Admin[] list() {
		return admins;
	}
	
	@Override
	public Admin detail(String userid) {
		Admin returnDetail = null;
		for(int i=0;i<count;i++) {
			if(userid.equals(admins[i].getUserid())) {
				returnDetail = admins[i];
				break;
			}
		}
		return returnDetail;
	}
	

	@Override
	public int Count() {
		return count;
	}

	@Override
	public void update(Admin admin) {
		for(int i=0;i<count;i++) {
			if(admin.getUserid().equals(admins[i].getUserid())) {
				admins[i].setPassword(admin.getPassword());
				break;
			}
		}
	}

	@Override
	public void delete(Admin admin) {
		for(int i=0;i<count;i++) {
			if(admin.getUserid().equals(admins[i].getUserid())
					&& admin.getPassword().equals(admins[i].getPassword())){
				admins[i] = admins[count-1];
				admins[count-1] =null;
				count--;
				}
	}
		}

	@Override
	public boolean login(Admin admin) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			if(admin.getUserid().equals(admins[i].getUserid())
					&& admin.getPassword().equals(admins[i].getPassword())){

				ok = true; 
				break;
				}
		}
		return ok;
	}
	
}
