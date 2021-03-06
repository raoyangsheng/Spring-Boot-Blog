package cn.sheep3.repository;

import cn.sheep3.BlogApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by sheep3 on 16-9-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BlogApplication.class)
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepo;

    @Test
    public void testFindByPostTitle(){
        System.out.println(postRepo.findByPostTitle("Title"));
    }

    @Test
    public void testDelete(){
        postRepo.delete(postRepo.findOne(1L));
        System.out.println(postRepo.findOne(1L));
    }
}