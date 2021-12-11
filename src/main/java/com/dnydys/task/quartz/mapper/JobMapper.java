package com.dnydys.task.quartz.mapper;

import com.dnydys.task.quartz.entity.domain.JobAndTrigger;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * Job Mapper
 * </p>
 *
 * @author dnydys
 * @date Created in 2021-12-11 23:48
 */
@Component
public interface JobMapper {
    /**
     * 查询定时作业和触发器列表
     *
     * @return 定时作业和触发器列表
     */
    List<JobAndTrigger> list();
}
