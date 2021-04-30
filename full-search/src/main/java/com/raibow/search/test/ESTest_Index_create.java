package com.raibow.search.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;

import java.io.IOException;

/**
 * @author 李昌赐
 * @version V 0.0.1
 * @since 2021−04-27 15:24
 */
public class ESTest_Index_create {

    public static void main(String[] args) throws IOException {
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost",9200,"http")));
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("user");
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
        boolean flag = createIndexResponse.isAcknowledged();
        System.out.println(flag);
        GetIndexRequest getIndexRequest = new GetIndexRequest();
        restHighLevelClient.close();
    }
}
