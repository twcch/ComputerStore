package tw.cchs.computerstore.store.dao;

import tw.cchs.computerstore.store.domain.OrderLineItem;

import java.util.List;

public interface OrderLineItemDao {

    public void create(OrderLineItem orderLineItem);

    public OrderLineItem findByPk(Long pk);

    public List<OrderLineItem> findAll();

    public void modify(OrderLineItem orderLineItem);

    public void remove(Long pk);

}
