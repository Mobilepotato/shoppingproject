package com.shopping.studydemo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;

/**
 * SQL拦截器，控制日志打印
 * @author management
 * 2017-11-29
 */
@Slf4j
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class DialectStatementHandlerInterceptor implements Interceptor {

	/**是否开启debug模式*/
	private String debug;

	private static String DEBUG_TRUE = "true";

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		RoutingStatementHandler statement = (RoutingStatementHandler) invocation
				.getTarget();
		if (DEBUG_TRUE.equals(debug)) {
			log.info("Executing SQL: {}", statement.getBoundSql().getSql().replaceAll("\\s+", " "));
			log.info("\twith params: {}", statement.getBoundSql().getParameterObject());
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		this.debug = (String) properties.getProperty("debug");
	}
}
