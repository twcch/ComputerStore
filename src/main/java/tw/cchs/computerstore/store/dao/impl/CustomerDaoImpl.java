package tw.cchs.computerstore.store.dao.impl;

import tw.cchs.computerstore.db.core.JdbcTemplate;
import tw.cchs.computerstore.store.dao.CustomerDao;
import tw.cchs.computerstore.store.domain.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void create(Customer customer) {

    }

    @Override
    public Customer findByPk(String pk) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public void modify(Customer customer) {

    }

    @Override
    public void remove(String pk) {

    }

}
