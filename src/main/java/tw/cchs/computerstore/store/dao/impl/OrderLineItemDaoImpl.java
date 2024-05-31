package tw.cchs.computerstore.store.dao.impl;

import tw.cchs.computerstore.store.dao.OrderLineItemDao;
import tw.cchs.computerstore.store.domain.OrderLineItem;

import java.util.List;

public class OrderLineItemDaoImpl implements OrderLineItemDao {

    @Override
    public void create(OrderLineItem orderLineItem) {

    }

    @Override
    public OrderLineItem findByPk(Long pk) {
        return null;
    }

    @Override
    public List<OrderLineItem> findAll() {
        return List.of();
    }

    @Override
    public void modify(OrderLineItem orderLineItem) {

    }

    @Override
    public void remove(Long pk) {

    }

}
