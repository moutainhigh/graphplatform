package com.haizhi.graph.tag.analytics.task;

import com.haizhi.graph.tag.analytics.task.context.TaskContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chengmo on 2018/3/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
public class IncTaskExecutorTest {

    @Test
    public void execute(){
        TaskExecutor taskExecutor = new IncTaskExecutor();
        TaskContext ctx = new TaskContext("crm_dev");
        taskExecutor.execute(ctx);
    }
}
