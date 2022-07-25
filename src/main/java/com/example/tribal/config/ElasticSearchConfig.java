package com.example.tribal.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-boot-example
 * @description
 * @author: 刘辉
 * @create: 2022-07-25 08:59
 **/
@Configuration
public class ElasticSearchConfig {
    /**
     * 配置RestHighLevelClient对象
     * 将该对象交给Spring容器去管理
     *
     * @return RestHighLevelClient对象
     */
    @Bean
    public RestHighLevelClient restHighLevelClient() {
        return new RestHighLevelClient(
                RestClient.builder(
                        //若有多个，可以传一个数组
                        new HttpHost("127.0.0.1", 9200, "http")));
    }
}
