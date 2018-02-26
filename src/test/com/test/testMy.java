package com.test;

import com.dao.PersonDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class testMy {

    @Test
    public void test1(){
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            PersonDao personDao=sqlSession.getMapper(PersonDao.class);

            System.out.println(personDao.getPerson().size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
