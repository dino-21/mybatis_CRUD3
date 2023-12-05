package com.dino.controller;

import java.util.List;

public interface TestMapper {
	public List<TestVO>  getList();
	
	public int insert(TestVO vo);
	
	public int update(TestVO vo);
	
	public void delete(int id);


	
}
