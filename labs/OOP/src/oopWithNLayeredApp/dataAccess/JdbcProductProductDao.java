package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductProductDao implements ProductDao {
    @Override
    public void add(Product product){
        System.out.println(product.getName()+"Ürünü jdbc ile veritabanına eklendi");
    }
    public void delete(){}
    public void update(){}
    public void read(){}

}
