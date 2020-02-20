package mvp.model.api;

import mvp.model.entity.InfoData;
import mvp.model.entity.Order;
import mvp.model.entity.Product;
import mvp.model.entity.StorageOperation;
import okhttp3.Response;
import okhttp3.ResponseBody;
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

    @GET("api/v1/operations/{id}")
    Call<StorageOperation> loadOperations(@Path("id") int id);

    @GET("api/v1/products")
    Call<List<Product>> loadProducts();

    @GET("api/v1/orders")
    Call<List<Order>> loadOrders();

    @GET("api/v1/info_data")
    Call<List<InfoData>> loadInfoData();

    @GET("api/v1/operations")
    Call<List<StorageOperation>> loadOperations();

    @POST("api/v1/products")
    Call<Void> createProduct(@Body Product product);

    @POST("api/v1/orders")
    Call<Void> createOrder(@Body Order order);

    @POST("api/v1/info_data")
    Call<Void> createInfoData(@Body InfoData infoData);

    @POST("api/v1/operations")
    Call<Void> createOperation(@Body StorageOperation storageOperation);

    @PUT("api/v1/products/{id}")
    Call<Void> editProduct(@Path("id") int id, @Body Product product);

    @PUT("api/v1/orders/{id}")
    Call<Void> editOrder(@Path("id") int id, @Body Order order);

    @PUT("api/v1/info_data/{id}")
    Call<Void> editInfoData(@Path("id") int id, @Body InfoData infoData);

    @PUT("api/v1/operations/{id}")
    Call<Void> editOperation(@Path("id") int id, @Body StorageOperation storageOperation);

    @DELETE("api/v1/products/{id}")
    Call<Void> deleteProduct(@Path("id") int id);

    @DELETE("api/v1/orders/{id}")
    Call<Void> deleteOrder(@Path("id") int id);

    @DELETE("api/v1/info_data/{id}")
    Call<Void> deleteInfoData(@Path("id") int id);

    @DELETE("api/v1/operations/{id}")
    Call<Void> deleteOperation(@Path("id") int id);
}
