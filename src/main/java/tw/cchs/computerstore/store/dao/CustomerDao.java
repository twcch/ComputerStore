package tw.cchs.computerstore.store.dao;

import tw.cchs.computerstore.store.domain.Customer;

import java.util.List;

public interface CustomerDao {

    public void create(Customer customer);

    public Customer findByPk(String pk);

    public List<Customer> findAll();

    public void modify(Customer customer);

    public void remove(String pk);

}
