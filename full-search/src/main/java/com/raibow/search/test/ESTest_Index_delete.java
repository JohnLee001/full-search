package com.raibow.search.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import java.io.IOException;

/**
 * @author 李昌赐
 * @version V 0.0.1
 * @since 2021−04-27 15:24
 */
public class ESTest_Index_delete {

    public static void main(String[] args) throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost",9200,"http")));
        DeleteIndexRequest request = new DeleteIndexRequest("user");
        AcknowledgedResponse response = client.indices().delete(request,RequestOptions.DEFAULT);
        System.out.println(response.isAcknowledged());
                client.close();
    }
}
