package com.easy.cache.enums;

/**
 * 缓存操作类型
 * 
 * @author chendd
 */
public enum CacheOpType {
    /**
     * 读写缓存操:如果缓存中有数据，则使用缓存中的数据，如果缓存中没有数据，则加载数据，并写入缓存。
     */
    READ_WRITE, //
    /**
     * 从数据源中加载最新的数据，并写入缓存。
     */
    WRITE, //
    /**
     * 只从数据源加载数据，不读取缓存中的数据，也不写入缓存。
     */
    LOAD, //
    ;
}
