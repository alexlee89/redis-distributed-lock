package com.distributedlock.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/** 分布式锁全局配置信息
 * Created by alex on 18/12/19.
 */
@Configuration
@ConfigurationProperties(prefix = "redis.distributed.lock")
public class LockProperties {

    private String lockPre = "";//锁key的前缀
    private int expiredTime = 30;// 单位s，加锁操作持有锁的最大时间
    private int retryCount = 2;//获取锁的重试次数

    public int getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(int expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getLockPre() {
        return lockPre;
    }

    public void setLockPre(String lockPre) {
        this.lockPre = lockPre;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
}
