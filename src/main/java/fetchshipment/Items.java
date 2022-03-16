package fetchshipment;
public class Items
{
    private int entity_id;

    private String name;

    private int parent_id;

    private int price;

    private int product_id;

    private String sku;

    private int order_item_id;

    private int qty;

    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setParent_id(int parent_id){
        this.parent_id = parent_id;
    }
    public int getParent_id(){
        return this.parent_id;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setProduct_id(int product_id){
        this.product_id = product_id;
    }
    public int getProduct_id(){
        return this.product_id;
    }
    public void setSku(String sku){
        this.sku = sku;
    }
    public String getSku(){
        return this.sku;
    }
    public void setOrder_item_id(int order_item_id){
        this.order_item_id = order_item_id;
    }
    public int getOrder_item_id(){
        return this.order_item_id;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return this.qty;
    }
}