package com.reddit.Reddit.configuration;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.session.data.redis.config.ConfigureRedisAction;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import redis.clients.jedis.JedisPoolConfig;

//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 2400)
//@PropertySource("classpath:/redis.properties")
public class RedisConfig {
//    @Bean
//    public static ConfigureRedisAction configureRedisAction() {
//        return ConfigureRedisAction.NO_OP;
//    }
//    @Bean
//    public JedisConnectionFactory connectionFactory(@Value("${spring.redis.host}") String host,
//                                                    @Value("${spring.redis.port}") int port)
//    {
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
//        poolConfig.setMaxTotal(10);
//        poolConfig.setMaxIdle(5);
//        poolConfig.setMinIdle(1);
//        poolConfig.setTestOnBorrow(true);
//        poolConfig.setTestOnReturn(true);
//        poolConfig.setTestWhileIdle(true);
//        poolConfig.setMaxWaitMillis(10*1000);
//        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
//        jedisConnectionFactory.setHostName(host);
//        jedisConnectionFactory.setPort(port);
//        return jedisConnectionFactory;
//    }
}
