package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager{
    private final ProductDao productDao;
    private final List<Logger> loggerList;
    public ProductManager(ProductDao productDao,List<Logger> loggerList) {
        this.productDao = productDao;
        this.loggerList = loggerList;
    }

    public void add(Product product)throws Exception{
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10dan küçük olamaz");
        }
        productDao.add(product);


    }
    public void log(){
        for (Logger logger:loggerList) {
            logger.log("Kullanıcı saldırdı");
        }
    }
}
