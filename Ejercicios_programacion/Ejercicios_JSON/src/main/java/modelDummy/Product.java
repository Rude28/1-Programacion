package modelDummy;

@lombok.Data
public class Product {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private long stock;
    private String[] tags;
    private String brand;
    private String sku;
    private long weight;
    private Dimensions dimensions;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private Review[] reviews;
    private String returnPolicy;
    private long minimumOrderQuantity;
    private Meta meta;
    private String[] images;
    private String thumbnail;
}
