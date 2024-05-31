package tw.cchs.computerstore.store.domain;

import java.util.Date;
import java.util.List;

public class Orders {

    private String id;
    private Date orderDate;
    private Integer status = 1; // 訂單狀態 1 代表待確認，0 代表已確認
    private Double total;

    private List<OrderLineItem> orderLineItems;

    public Orders() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<OrderLineItem> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

}
