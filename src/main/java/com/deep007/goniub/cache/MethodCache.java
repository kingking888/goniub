package com.deep007.goniub.cache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MethodCache {
	
	public static final long HOUR_TIME = 1000 * 3600;
	
	public static final long DAY_TIME = HOUR_TIME * 24;

	long expires() default DAY_TIME;
	
	/**
	 * @return 缓存参数
	 */
	Class<?>[] cacheArgs() default {};
	
	/**
	 * @return 生成缓存的索引的参数参与，会调用参数的toString方法
	 */
	Class<?>[] generateIndexArgs() default {};
}
