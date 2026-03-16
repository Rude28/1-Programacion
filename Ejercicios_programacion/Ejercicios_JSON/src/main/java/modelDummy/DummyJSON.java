package modelDummy;

@lombok.Data
public class DummyJSON {
    private Product[] products;
    private long total;
    private long skip;
    private long limit;
}
