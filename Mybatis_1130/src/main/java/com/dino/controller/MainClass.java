package com.dino.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainClass {
	public static void main(String[] args) {
		String resource = "com/dino/controller/mybatis-config.xml";
		InputStream inputStream = null;

		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("sqlSessionFactory => " + sqlSessionFactory);
			SqlSession session = sqlSessionFactory.openSession();
			System.out.println("session :  " + session);

			TestMapper mapper = session.getMapper(TestMapper.class);
			// Blog blog = mapper.selectBlog(101);
			/*
			 * TestVO test = new TestVO(); test.setTitle("title....");
			 * test.setContent("content....."); int result = mapper.insert(test);
			 * session.commit(); // 트랜잭션 커밋 System.out.println("result >> " + result);
			 */

			/*
			 * 수정 TestVO test = TestVO.builder() .title("제목 수정...") .content("내용 수정....")
			 * .id(1) .build();
			 * 
			 * mapper.update(test); session.commit(); // 트랜잭션 커밋
			 */

			/*
			List<TestVO> list = mapper.getList();

			for (TestVO vo : list)
				System.out.println("vo ==> " + vo);
			session.commit(); // 트랜잭션 커밋
			*/
			
			int idToDelete = 1; 
            mapper.delete(idToDelete);
            session.commit(); // Com

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
