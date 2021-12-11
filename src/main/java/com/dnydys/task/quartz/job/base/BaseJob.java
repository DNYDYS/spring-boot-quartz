package com.dnydys.task.quartz.job.base;

import org.quartz.*;

/**
 * <p>
 * Job 基类，主要是在 {@link org.quartz.Job} 上再封装一层，只让我们自己项目里的Job去实现
 * </p>
 *
 * @author dnydys
 * @date Created in 2021-12-11 23:48
 */
public interface BaseJob extends Job {
    /**
     * <p>
     * Called by the <code>{@link Scheduler}</code> when a <code>{@link Trigger}</code>
     * fires that is associated with the <code>Job</code>.
     * </p>
     *
     * <p>
     * The implementation may wish to set a
     * {@link JobExecutionContext#setResult(Object) result} object on the
     * {@link JobExecutionContext} before this method exits.  The result itself
     * is meaningless to Quartz, but may be informative to
     * <code>{@link JobListener}s</code> or
     * <code>{@link TriggerListener}s</code> that are watching the job's
     * execution.
     * </p>
     *
     * @param context 上下文
     * @throws JobExecutionException if there is an exception while executing the job.
     */
    @Override
    void execute(JobExecutionContext context) throws JobExecutionException;
}