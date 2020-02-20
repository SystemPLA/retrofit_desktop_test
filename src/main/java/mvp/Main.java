package mvp;

import mvp.model.entity.Product;
import mvp.model.repo.TalosRepo;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(TalosRepo.getSingleton().getApi().loadProducts().execute().body().toString());
//            TalosRepo.getSingleton().getApi().createProduct(new Product("test_name","test_source","test_status",1)).execute();
//            TalosRepo.getSingleton().getApi().deleteProduct(16).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
