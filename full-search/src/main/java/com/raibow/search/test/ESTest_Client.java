package com.raibow.search.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

/**
 * @author 李昌赐
 * @version V 0.0.1
 * @since 2021−04-27 15:24
 */
public class ESTest_Client {

    public static void main(String[] args) throws IOException {
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost",9200,"http")));

        //close
        restHighLevelClient.close();
    }
}
