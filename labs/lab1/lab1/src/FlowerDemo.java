public class FlowerDemo {
    public static void main(String[] args) {
        Flower flower1= new Flower();
        Flower flower2= new Flower("rose",6, 3.45f);
        String name=flower2.getName();
        int petals =flower2.getPetals();
        float price =flower2.getPrice();
        System.out.println("name: "+name+" petals: "+petals+" price: "+price);
        flower1.setName("daisy");
        flower1.setPetals(8);
        flower1.setPrice(2.56f);
         name=flower1.getName();
         petals =flower1.getPetals();
         price =flower1.getPrice();
        System.out.println("name: "+name+" petals: "+petals+" price: "+price);
    }
}
