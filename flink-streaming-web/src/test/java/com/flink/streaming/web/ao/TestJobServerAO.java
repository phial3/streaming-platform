package com.flink.streaming.web.ao;

import com.flink.streaming.web.base.TestRun;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author zhuhuipei
 * @Description:
 * @date 2020-07-21
 * @time 19:26
 */
public class TestJobServerAO extends TestRun {

    @Resource
    private JobServerAO jobServerAO;

    @Test
    public void start() {
        jobServerAO.start(1L,null,"test");
    }
}
