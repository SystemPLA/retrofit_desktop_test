package mvp;

import mvp.model.repo.TalosRepo;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(TalosRepo.getSingleton().getApi().loadProducts().execute().body().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
