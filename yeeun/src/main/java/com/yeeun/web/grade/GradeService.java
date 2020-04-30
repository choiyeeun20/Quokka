package com.yeeun.web.grade;

import com.yeeun.web.util.Credit;

public interface GradeService {

	public int count();

	public void add(Grade grade);

	public Credit detail(String userid);

}
