package getinvoice;
import java.util.Date;
import java.util.List;

import com.example.fetchorder.Items;
public class Root
{
    private String base_currency_code;

    private int base_discount_amount;

    private int base_grand_total;

    private int base_discount_tax_compensation_amount;

    private int base_shipping_amount;

    private int base_shipping_discount_tax_compensation_amnt;

    private int base_shipping_incl_tax;

    private int base_shipping_tax_amount;

    private int base_subtotal;

    private int base_subtotal_incl_tax;

    private int base_tax_amount;

    private int base_to_global_rate;

    private int base_to_order_rate;

    private int billing_address_id;

    private int can_void_flag;

    private Date created_at;

    private int discount_amount;

    private int email_sent;

    private int entity_id;

    private String global_currency_code;

    private int grand_total;

    private int discount_tax_compensation_amount;

    private String increment_id;

    private String order_currency_code;

    private int order_id;

    private int shipping_address_id;

    private int shipping_amount;

    private int shipping_discount_tax_compensation_amount;

    private int shipping_incl_tax;

    private int shipping_tax_amount;

    private int state;

    private String store_currency_code;

    private int store_id;

    private int store_to_base_rate;

    private int store_to_order_rate;

    private int subtotal;

    private int subtotal_incl_tax;

    private int tax_amount;

    private int total_qty;

    private Date updated_at;

    private List<Items> items;

    private List<String> comments;

    public void setBase_currency_code(String base_currency_code){
        this.base_currency_code = base_currency_code;
    }
    public String getBase_currency_code(){
        return this.base_currency_code;
    }
    public void setBase_discount_amount(int base_discount_amount){
        this.base_discount_amount = base_discount_amount;
    }
    public int getBase_discount_amount(){
        return this.base_discount_amount;
    }
    public void setBase_grand_total(int base_grand_total){
        this.base_grand_total = base_grand_total;
    }
    public int getBase_grand_total(){
        return this.base_grand_total;
    }
    public void setBase_discount_tax_compensation_amount(int base_discount_tax_compensation_amount){
        this.base_discount_tax_compensation_amount = base_discount_tax_compensation_amount;
    }
    public int getBase_discount_tax_compensation_amount(){
        return this.base_discount_tax_compensation_amount;
    }
    public void setBase_shipping_amount(int base_shipping_amount){
        this.base_shipping_amount = base_shipping_amount;
    }
    public int getBase_shipping_amount(){
        return this.base_shipping_amount;
    }
    public void setBase_shipping_discount_tax_compensation_amnt(int base_shipping_discount_tax_compensation_amnt){
        this.base_shipping_discount_tax_compensation_amnt = base_shipping_discount_tax_compensation_amnt;
    }
    public int getBase_shipping_discount_tax_compensation_amnt(){
        return this.base_shipping_discount_tax_compensation_amnt;
    }
    public void setBase_shipping_incl_tax(int base_shipping_incl_tax){
        this.base_shipping_incl_tax = base_shipping_incl_tax;
    }
    public int getBase_shipping_incl_tax(){
        return this.base_shipping_incl_tax;
    }
    public void setBase_shipping_tax_amount(int base_shipping_tax_amount){
        this.base_shipping_tax_amount = base_shipping_tax_amount;
    }
    public int getBase_shipping_tax_amount(){
        return this.base_shipping_tax_amount;
    }
    public void setBase_subtotal(int base_subtotal){
        this.base_subtotal = base_subtotal;
    }
    public int getBase_subtotal(){
        return this.base_subtotal;
    }
    public void setBase_subtotal_incl_tax(int base_subtotal_incl_tax){
        this.base_subtotal_incl_tax = base_subtotal_incl_tax;
    }
    public int getBase_subtotal_incl_tax(){
        return this.base_subtotal_incl_tax;
    }
    public void setBase_tax_amount(int base_tax_amount){
        this.base_tax_amount = base_tax_amount;
    }
    public int getBase_tax_amount(){
        return this.base_tax_amount;
    }
    public void setBase_to_global_rate(int base_to_global_rate){
        this.base_to_global_rate = base_to_global_rate;
    }
    public int getBase_to_global_rate(){
        return this.base_to_global_rate;
    }
    public void setBase_to_order_rate(int base_to_order_rate){
        this.base_to_order_rate = base_to_order_rate;
    }
    public int getBase_to_order_rate(){
        return this.base_to_order_rate;
    }
    public void setBilling_address_id(int billing_address_id){
        this.billing_address_id = billing_address_id;
    }
    public int getBilling_address_id(){
        return this.billing_address_id;
    }
    public void setCan_void_flag(int can_void_flag){
        this.can_void_flag = can_void_flag;
    }
    public int getCan_void_flag(){
        return this.can_void_flag;
    }
    public void setCreated_at(Date created_at){
        this.created_at = created_at;
    }
    public Date getCreated_at(){
        return this.created_at;
    }
    public void setDiscount_amount(int discount_amount){
        this.discount_amount = discount_amount;
    }
    public int getDiscount_amount(){
        return this.discount_amount;
    }
    public void setEmail_sent(int email_sent){
        this.email_sent = email_sent;
    }
    public int getEmail_sent(){
        return this.email_sent;
    }
    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
    public void setGlobal_currency_code(String global_currency_code){
        this.global_currency_code = global_currency_code;
    }
    public String getGlobal_currency_code(){
        return this.global_currency_code;
    }
    public void setGrand_total(int grand_total){
        this.grand_total = grand_total;
    }
    public int getGrand_total(){
        return this.grand_total;
    }
    public void setDiscount_tax_compensation_amount(int discount_tax_compensation_amount){
        this.discount_tax_compensation_amount = discount_tax_compensation_amount;
    }
    public int getDiscount_tax_compensation_amount(){
        return this.discount_tax_compensation_amount;
    }
    public void setIncrement_id(String increment_id){
        this.increment_id = increment_id;
    }
    public String getIncrement_id(){
        return this.increment_id;
    }
    public void setOrder_currency_code(String order_currency_code){
        this.order_currency_code = order_currency_code;
    }
    public String getOrder_currency_code(){
        return this.order_currency_code;
    }
    public void setOrder_id(int order_id){
        this.order_id = order_id;
    }
    public int getOrder_id(){
        return this.order_id;
    }
    public void setShipping_address_id(int shipping_address_id){
        this.shipping_address_id = shipping_address_id;
    }
    public int getShipping_address_id(){
        return this.shipping_address_id;
    }
    public void setShipping_amount(int shipping_amount){
        this.shipping_amount = shipping_amount;
    }
    public int getShipping_amount(){
        return this.shipping_amount;
    }
    public void setShipping_discount_tax_compensation_amount(int shipping_discount_tax_compensation_amount){
        this.shipping_discount_tax_compensation_amount = shipping_discount_tax_compensation_amount;
    }
    public int getShipping_discount_tax_compensation_amount(){
        return this.shipping_discount_tax_compensation_amount;
    }
    public void setShipping_incl_tax(int shipping_incl_tax){
        this.shipping_incl_tax = shipping_incl_tax;
    }
    public int getShipping_incl_tax(){
        return this.shipping_incl_tax;
    }
    public void setShipping_tax_amount(int shipping_tax_amount){
        this.shipping_tax_amount = shipping_tax_amount;
    }
    public int getShipping_tax_amount(){
        return this.shipping_tax_amount;
    }
    public void setState(int state){
        this.state = state;
    }
    public int getState(){
        return this.state;
    }
    public void setStore_currency_code(String store_currency_code){
        this.store_currency_code = store_currency_code;
    }
    public String getStore_currency_code(){
        return this.store_currency_code;
    }
    public void setStore_id(int store_id){
        this.store_id = store_id;
    }
    public int getStore_id(){
        return this.store_id;
    }
    public void setStore_to_base_rate(int store_to_base_rate){
        this.store_to_base_rate = store_to_base_rate;
    }
    public int getStore_to_base_rate(){
        return this.store_to_base_rate;
    }
    public void setStore_to_order_rate(int store_to_order_rate){
        this.store_to_order_rate = store_to_order_rate;
    }
    public int getStore_to_order_rate(){
        return this.store_to_order_rate;
    }
    public void setSubtotal(int subtotal){
        this.subtotal = subtotal;
    }
    public int getSubtotal(){
        return this.subtotal;
    }
    public void setSubtotal_incl_tax(int subtotal_incl_tax){
        this.subtotal_incl_tax = subtotal_incl_tax;
    }
    public int getSubtotal_incl_tax(){
        return this.subtotal_incl_tax;
    }
    public void setTax_amount(int tax_amount){
        this.tax_amount = tax_amount;
    }
    public int getTax_amount(){
        return this.tax_amount;
    }
    public void setTotal_qty(int total_qty){
        this.total_qty = total_qty;
    }
    public int getTotal_qty(){
        return this.total_qty;
    }
    public void setUpdated_at(Date updated_at){
        this.updated_at = updated_at;
    }
    public Date getUpdated_at(){
        return this.updated_at;
    }
    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
    public void setComments(List<String> comments){
        this.comments = comments;
    }
    public List<String> getComments(){
        return this.comments;
    }
}
