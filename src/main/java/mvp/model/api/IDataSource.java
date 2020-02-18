package mvp.model.api;

import mvp.model.entity.InfoData;
import mvp.model.entity.Order;
import mvp.model.entity.Product;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface IDataSource {
    @GET("api/v1/products/{id}")
    Call<Product> loadProducts(@Path("id") int id);

    @GET("api/v1/orders/{id}")
    Call<Order> loadOrders(@Path("id") int id);

    @GET("api/v1/info_data/{id}")
    Call<InfoData> loadInfoData(@Path("id") int id);

    @GET("api/v1/products")
    Call<List<Product>> loadProducts();

    @GET("api/v1/orders")
    Call<List<Order>> loadOrders();

    @GET("api/v1/info_data")
    Call<List<InfoData>> loadInfoData();

    @POST("api/v1/products")
    Call createProduct(@Body Product product);

    @POST("api/v1/orders")
    Call createOrder(@Body Order order);

    @POST("api/v1/info_data")
    Call createInfoData(@Body InfoData infoData);

    @PUT("api/v1/products/{id}")
    Call editProduct(@Path("id") int id, @Body Product product);

    @PUT("api/v1/orders/{id}")
    Call editOrder(@Path("id") int id, @Body Order order);

    @PUT("api/v1/info_data/{id}")
    Call editInfoData(@Path("id") int id, @Body InfoData infoData);

    @DELETE("api/v1/products/{id}")
    Call deleteProduct(@Path("id") int id);

    @DELETE("api/v1/orders/{id}")
    Call deleteOrder(@Path("id") int id);

    @DELETE("api/v1/info_data/{id}")
    Call deleteInfoData(@Path("id") int id);
}
