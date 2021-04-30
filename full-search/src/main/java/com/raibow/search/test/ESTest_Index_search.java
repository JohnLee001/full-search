package com.raibow.search.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

import java.io.IOException;

/**
 * @author 李昌赐
 * @version V 0.0.1
 * @since 2021−04-27 15:24
 */
public class ESTest_Index_search {

    public static void main(String[] args) throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost",9200,"http")));
        GetIndexRequest request = new GetIndexRequest("user");
        GetIndexResponse response = client.indices().get(request,RequestOptions.DEFAULT);
        System.out.println(response.getSettings());
                client.close();
    }
}
