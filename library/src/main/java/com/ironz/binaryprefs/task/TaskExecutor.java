package com.ironz.binaryprefs.task;

/**
 * Abstraction for task running. You should guarantee sequential task execution.
 */
public interface TaskExecutor {
    /**
     * After submitting executor adds this task in queue and runs later.
     * Tasks guaranteed to execute sequentially.
     *
     * @param runnable instance for task execution
     * @return future barrier for task blocking
     */
    FutureBarrier submit(Runnable runnable);
}