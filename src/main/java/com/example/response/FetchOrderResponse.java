package com.example.response;

import java.util.Date;
import java.util.List;

import com.example.fetchorder.Billing_address;
import com.example.fetchorder.Extension_attributes;
import com.example.fetchorder.Items;
import com.example.fetchorder.Payment;

public class FetchOrderResponse {
	private String applied_rule_ids;

	private String base_currency_code;

	private int base_discount_amount;

	private int base_discount_invoiced;

	private int base_grand_total;

	private int base_discount_tax_compensation_amount;

	private int base_discount_tax_compensation_invoiced;

	private int base_shipping_amount;

	private int base_shipping_discount_amount;

	private int base_shipping_discount_tax_compensation_amnt;

	private int base_shipping_incl_tax;

	private int base_shipping_invoiced;

	private int base_shipping_tax_amount;

	private int base_subtotal;

	private int base_subtotal_incl_tax;

	private int base_subtotal_invoiced;

	private int base_tax_amount;

	private int base_tax_invoiced;

	private int base_total_due;

	private int base_total_invoiced;

	private int base_total_invoiced_cost;

	private int base_total_paid;

	private int base_to_global_rate;

	private int base_to_order_rate;

	private int billing_address_id;

	private Date created_at;

	private String customer_email;

	private String customer_firstname;

	private int customer_gender;

	private int customer_group_id;

	private int customer_id;

	private int customer_is_guest;

	private String customer_lastname;

	private int customer_note_notify;

	private int discount_amount;

	private int discount_invoiced;

	private int email_sent;

	private int entity_id;

	private String global_currency_code;

	private int grand_total;

	private int discount_tax_compensation_amount;

	private int discount_tax_compensation_invoiced;

	private String increment_id;

	private int is_virtual;

	private String order_currency_code;

	private String protect_code;

	private int quote_id;

	private String remote_ip;

	private int shipping_amount;

	private String shipping_description;

	private int shipping_discount_amount;

	private int shipping_discount_tax_compensation_amount;

	private int shipping_incl_tax;

	private int shipping_invoiced;

	private int shipping_tax_amount;

	private String state;

	private String status;

	private String store_currency_code;

	private int store_id;

	private String store_name;

	private int store_to_base_rate;

	private int store_to_order_rate;

	private int subtotal;

	private int subtotal_incl_tax;

	private int subtotal_invoiced;

	private int tax_amount;

	private int tax_invoiced;

	private int total_due;

	private int total_invoiced;

	private int total_item_count;

	private int total_paid;

	private int total_qty_ordered;

	private Date updated_at;

	private int weight;

	private List<Items> items;

	private Billing_address billing_address;

	private Payment payment;

	private List<String> status_histories;

	private Extension_attributes extension_attributes;

	public void setApplied_rule_ids(String applied_rule_ids) {
		this.applied_rule_ids = applied_rule_ids;
	}

	public String getApplied_rule_ids() {
		return this.applied_rule_ids;
	}

	public void setBase_currency_code(String base_currency_code) {
		this.base_currency_code = base_currency_code;
	}

	public String getBase_currency_code() {
		return this.base_currency_code;
	}

	public void setBase_discount_amount(int base_discount_amount) {
		this.base_discount_amount = base_discount_amount;
	}

	public int getBase_discount_amount() {
		return this.base_discount_amount;
	}

	public void setBase_discount_invoiced(int base_discount_invoiced) {
		this.base_discount_invoiced = base_discount_invoiced;
	}

	public int getBase_discount_invoiced() {
		return this.base_discount_invoiced;
	}

	public void setBase_grand_total(int base_grand_total) {
		this.base_grand_total = base_grand_total;
	}

	public int getBase_grand_total() {
		return this.base_grand_total;
	}

	public void setBase_discount_tax_compensation_amount(int base_discount_tax_compensation_amount) {
		this.base_discount_tax_compensation_amount = base_discount_tax_compensation_amount;
	}

	public int getBase_discount_tax_compensation_amount() {
		return this.base_discount_tax_compensation_amount;
	}

	public void setBase_discount_tax_compensation_invoiced(int base_discount_tax_compensation_invoiced) {
		this.base_discount_tax_compensation_invoiced = base_discount_tax_compensation_invoiced;
	}

	public int getBase_discount_tax_compensation_invoiced() {
		return this.base_discount_tax_compensation_invoiced;
	}

	public void setBase_shipping_amount(int base_shipping_amount) {
		this.base_shipping_amount = base_shipping_amount;
	}

	public int getBase_shipping_amount() {
		return this.base_shipping_amount;
	}

	public void setBase_shipping_discount_amount(int base_shipping_discount_amount) {
		this.base_shipping_discount_amount = base_shipping_discount_amount;
	}

	public int getBase_shipping_discount_amount() {
		return this.base_shipping_discount_amount;
	}

	public void setBase_shipping_discount_tax_compensation_amnt(int base_shipping_discount_tax_compensation_amnt) {
		this.base_shipping_discount_tax_compensation_amnt = base_shipping_discount_tax_compensation_amnt;
	}

	public int getBase_shipping_discount_tax_compensation_amnt() {
		return this.base_shipping_discount_tax_compensation_amnt;
	}

	public void setBase_shipping_incl_tax(int base_shipping_incl_tax) {
		this.base_shipping_incl_tax = base_shipping_incl_tax;
	}

	public int getBase_shipping_incl_tax() {
		return this.base_shipping_incl_tax;
	}

	public void setBase_shipping_invoiced(int base_shipping_invoiced) {
		this.base_shipping_invoiced = base_shipping_invoiced;
	}

	public int getBase_shipping_invoiced() {
		return this.base_shipping_invoiced;
	}

	public void setBase_shipping_tax_amount(int base_shipping_tax_amount) {
		this.base_shipping_tax_amount = base_shipping_tax_amount;
	}

	public int getBase_shipping_tax_amount() {
		return this.base_shipping_tax_amount;
	}

	public void setBase_subtotal(int base_subtotal) {
		this.base_subtotal = base_subtotal;
	}

	public int getBase_subtotal() {
		return this.base_subtotal;
	}

	public void setBase_subtotal_incl_tax(int base_subtotal_incl_tax) {
		this.base_subtotal_incl_tax = base_subtotal_incl_tax;
	}

	public int getBase_subtotal_incl_tax() {
		return this.base_subtotal_incl_tax;
	}

	public void setBase_subtotal_invoiced(int base_subtotal_invoiced) {
		this.base_subtotal_invoiced = base_subtotal_invoiced;
	}

	public int getBase_subtotal_invoiced() {
		return this.base_subtotal_invoiced;
	}

	public void setBase_tax_amount(int base_tax_amount) {
		this.base_tax_amount = base_tax_amount;
	}

	public int getBase_tax_amount() {
		return this.base_tax_amount;
	}

	public void setBase_tax_invoiced(int base_tax_invoiced) {
		this.base_tax_invoiced = base_tax_invoiced;
	}

	public int getBase_tax_invoiced() {
		return this.base_tax_invoiced;
	}

	public void setBase_total_due(int base_total_due) {
		this.base_total_due = base_total_due;
	}

	public int getBase_total_due() {
		return this.base_total_due;
	}

	public void setBase_total_invoiced(int base_total_invoiced) {
		this.base_total_invoiced = base_total_invoiced;
	}

	public int getBase_total_invoiced() {
		return this.base_total_invoiced;
	}

	public void setBase_total_invoiced_cost(int base_total_invoiced_cost) {
		this.base_total_invoiced_cost = base_total_invoiced_cost;
	}

	public int getBase_total_invoiced_cost() {
		return this.base_total_invoiced_cost;
	}

	public void setBase_total_paid(int base_total_paid) {
		this.base_total_paid = base_total_paid;
	}

	public int getBase_total_paid() {
		return this.base_total_paid;
	}

	public void setBase_to_global_rate(int base_to_global_rate) {
		this.base_to_global_rate = base_to_global_rate;
	}

	public int getBase_to_global_rate() {
		return this.base_to_global_rate;
	}

	public void setBase_to_order_rate(int base_to_order_rate) {
		this.base_to_order_rate = base_to_order_rate;
	}

	public int getBase_to_order_rate() {
		return this.base_to_order_rate;
	}

	public void setBilling_address_id(int billing_address_id) {
		this.billing_address_id = billing_address_id;
	}

	public int getBilling_address_id() {
		return this.billing_address_id;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getCreated_at() {
		return this.created_at;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_email() {
		return this.customer_email;
	}

	public void setCustomer_firstname(String customer_firstname) {
		this.customer_firstname = customer_firstname;
	}

	public String getCustomer_firstname() {
		return this.customer_firstname;
	}

	public void setCustomer_gender(int customer_gender) {
		this.customer_gender = customer_gender;
	}

	public int getCustomer_gender() {
		return this.customer_gender;
	}

	public void setCustomer_group_id(int customer_group_id) {
		this.customer_group_id = customer_group_id;
	}

	public int getCustomer_group_id() {
		return this.customer_group_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getCustomer_id() {
		return this.customer_id;
	}

	public void setCustomer_is_guest(int customer_is_guest) {
		this.customer_is_guest = customer_is_guest;
	}

	public int getCustomer_is_guest() {
		return this.customer_is_guest;
	}

	public void setCustomer_lastname(String customer_lastname) {
		this.customer_lastname = customer_lastname;
	}

	public String getCustomer_lastname() {
		return this.customer_lastname;
	}

	public void setCustomer_note_notify(int customer_note_notify) {
		this.customer_note_notify = customer_note_notify;
	}

	public int getCustomer_note_notify() {
		return this.customer_note_notify;
	}

	public void setDiscount_amount(int discount_amount) {
		this.discount_amount = discount_amount;
	}

	public int getDiscount_amount() {
		return this.discount_amount;
	}

	public void setDiscount_invoiced(int discount_invoiced) {
		this.discount_invoiced = discount_invoiced;
	}

	public int getDiscount_invoiced() {
		return this.discount_invoiced;
	}

	public void setEmail_sent(int email_sent) {
		this.email_sent = email_sent;
	}

	public int getEmail_sent() {
		return this.email_sent;
	}

	public void setEntity_id(int entity_id) {
		this.entity_id = entity_id;
	}

	public int getEntity_id() {
		return this.entity_id;
	}

	public void setGlobal_currency_code(String global_currency_code) {
		this.global_currency_code = global_currency_code;
	}

	public String getGlobal_currency_code() {
		return this.global_currency_code;
	}

	public void setGrand_total(int grand_total) {
		this.grand_total = grand_total;
	}

	public int getGrand_total() {
		return this.grand_total;
	}

	public void setDiscount_tax_compensation_amount(int discount_tax_compensation_amount) {
		this.discount_tax_compensation_amount = discount_tax_compensation_amount;
	}

	public int getDiscount_tax_compensation_amount() {
		return this.discount_tax_compensation_amount;
	}

	public void setDiscount_tax_compensation_invoiced(int discount_tax_compensation_invoiced) {
		this.discount_tax_compensation_invoiced = discount_tax_compensation_invoiced;
	}

	public int getDiscount_tax_compensation_invoiced() {
		return this.discount_tax_compensation_invoiced;
	}

	public void setIncrement_id(String increment_id) {
		this.increment_id = increment_id;
	}

	public String getIncrement_id() {
		return this.increment_id;
	}

	public void setIs_virtual(int is_virtual) {
		this.is_virtual = is_virtual;
	}

	public int getIs_virtual() {
		return this.is_virtual;
	}

	public void setOrder_currency_code(String order_currency_code) {
		this.order_currency_code = order_currency_code;
	}

	public String getOrder_currency_code() {
		return this.order_currency_code;
	}

	public void setProtect_code(String protect_code) {
		this.protect_code = protect_code;
	}

	public String getProtect_code() {
		return this.protect_code;
	}

	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	public int getQuote_id() {
		return this.quote_id;
	}

	public void setRemote_ip(String remote_ip) {
		this.remote_ip = remote_ip;
	}

	public String getRemote_ip() {
		return this.remote_ip;
	}

	public void setShipping_amount(int shipping_amount) {
		this.shipping_amount = shipping_amount;
	}

	public int getShipping_amount() {
		return this.shipping_amount;
	}

	public void setShipping_description(String shipping_description) {
		this.shipping_description = shipping_description;
	}

	public String getShipping_description() {
		return this.shipping_description;
	}

	public void setShipping_discount_amount(int shipping_discount_amount) {
		this.shipping_discount_amount = shipping_discount_amount;
	}

	public int getShipping_discount_amount() {
		return this.shipping_discount_amount;
	}

	public void setShipping_discount_tax_compensation_amount(int shipping_discount_tax_compensation_amount) {
		this.shipping_discount_tax_compensation_amount = shipping_discount_tax_compensation_amount;
	}

	public int getShipping_discount_tax_compensation_amount() {
		return this.shipping_discount_tax_compensation_amount;
	}

	public void setShipping_incl_tax(int shipping_incl_tax) {
		this.shipping_incl_tax = shipping_incl_tax;
	}

	public int getShipping_incl_tax() {
		return this.shipping_incl_tax;
	}

	public void setShipping_invoiced(int shipping_invoiced) {
		this.shipping_invoiced = shipping_invoiced;
	}

	public int getShipping_invoiced() {
		return this.shipping_invoiced;
	}

	public void setShipping_tax_amount(int shipping_tax_amount) {
		this.shipping_tax_amount = shipping_tax_amount;
	}

	public int getShipping_tax_amount() {
		return this.shipping_tax_amount;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStore_currency_code(String store_currency_code) {
		this.store_currency_code = store_currency_code;
	}

	public String getStore_currency_code() {
		return this.store_currency_code;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public int getStore_id() {
		return this.store_id;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_name() {
		return this.store_name;
	}

	public void setStore_to_base_rate(int store_to_base_rate) {
		this.store_to_base_rate = store_to_base_rate;
	}

	public int getStore_to_base_rate() {
		return this.store_to_base_rate;
	}

	public void setStore_to_order_rate(int store_to_order_rate) {
		this.store_to_order_rate = store_to_order_rate;
	}

	public int getStore_to_order_rate() {
		return this.store_to_order_rate;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public int getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal_incl_tax(int subtotal_incl_tax) {
		this.subtotal_incl_tax = subtotal_incl_tax;
	}

	public int getSubtotal_incl_tax() {
		return this.subtotal_incl_tax;
	}

	public void setSubtotal_invoiced(int subtotal_invoiced) {
		this.subtotal_invoiced = subtotal_invoiced;
	}

	public int getSubtotal_invoiced() {
		return this.subtotal_invoiced;
	}

	public void setTax_amount(int tax_amount) {
		this.tax_amount = tax_amount;
	}

	public int getTax_amount() {
		return this.tax_amount;
	}

	public void setTax_invoiced(int tax_invoiced) {
		this.tax_invoiced = tax_invoiced;
	}

	public int getTax_invoiced() {
		return this.tax_invoiced;
	}

	public void setTotal_due(int total_due) {
		this.total_due = total_due;
	}

	public int getTotal_due() {
		return this.total_due;
	}

	public void setTotal_invoiced(int total_invoiced) {
		this.total_invoiced = total_invoiced;
	}

	public int getTotal_invoiced() {
		return this.total_invoiced;
	}

	public void setTotal_item_count(int total_item_count) {
		this.total_item_count = total_item_count;
	}

	public int getTotal_item_count() {
		return this.total_item_count;
	}

	public void setTotal_paid(int total_paid) {
		this.total_paid = total_paid;
	}

	public int getTotal_paid() {
		return this.total_paid;
	}

	public void setTotal_qty_ordered(int total_qty_ordered) {
		this.total_qty_ordered = total_qty_ordered;
	}

	public int getTotal_qty_ordered() {
		return this.total_qty_ordered;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getUpdated_at() {
		return this.updated_at;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public List<Items> getItems() {
		return this.items;
	}

	public void setBilling_address(Billing_address billing_address) {
		this.billing_address = billing_address;
	}

	public Billing_address getBilling_address() {
		return this.billing_address;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setStatus_histories(List<String> status_histories) {
		this.status_histories = status_histories;
	}

	public List<String> getStatus_histories() {
		return this.status_histories;
	}

	public void setExtension_attributes(Extension_attributes extension_attributes) {
		this.extension_attributes = extension_attributes;
	}

	public Extension_attributes getExtension_attributes() {
		return this.extension_attributes;
	}
}
