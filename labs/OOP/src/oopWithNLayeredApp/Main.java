package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1= new Product(1,"iphonexr",13);
        List<Logger> loggerList = new ArrayList<>();
        loggerList.add(new DatabaseLogger());
        loggerList.add(new MailLogger());
        loggerList.add(new FileLogger());

        ProductManager productManager = new ProductManager(new HibernateProductProductDao(),loggerList);
        productManager.add(product1);
        productManager.log();

    }
}
