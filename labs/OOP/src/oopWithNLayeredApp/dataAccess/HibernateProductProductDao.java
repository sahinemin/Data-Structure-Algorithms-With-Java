package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductProductDao implements ProductDao {
    public void add(Product product){
    System.out.println(product.getName()+"Ürünü hibernate ile veritabanına eklendi");
}
}
