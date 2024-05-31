package tw.cchs.computerstore.store.dao;

import tw.cchs.computerstore.store.domain.Orders;

import java.util.List;

public interface OrdersDao {

    public void create(Orders orders);

    public Orders findByPk(String pk);

    public List<Orders> findAll();

    public void modify(Orders orders);

    public void remove(String pk);

}
