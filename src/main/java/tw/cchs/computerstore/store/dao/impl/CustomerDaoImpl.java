package tw.cchs.computerstore.store.dao.impl;

import tw.cchs.computerstore.db.core.JdbcTemplate;
import tw.cchs.computerstore.db.core.PreparedStatementCreator;
import tw.cchs.computerstore.db.core.RowCallbackHandler;
import tw.cchs.computerstore.store.dao.CustomerDao;
import tw.cchs.computerstore.store.domain.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    @Override
    public void create(Customer customer) {

    }

    @Override
    public Customer findByPk(String pk) {

        List<Customer> list = new ArrayList<>();

        String sql = "SELECT id, name, password, address, phone, birthday FROM customers WHERE id = ?";

        jdbcTemplate.query(conn -> {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pk);
            return ps;
        }, rs -> {
            Customer customer = new Customer();
            customer.setId(rs.getString("id"));
            customer.setName(rs.getString("name"));
            customer.setPassword(rs.getString("password"));
            customer.setAddress(rs.getString("address"));
            customer.setPhone(rs.getString("phone"));
            customer.setBirthday(rs.getTimestamp("birthday"));

            list.add(customer);
        });

        if (list.size() == 0) {
            return null;
        }

        return list.get(0);

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
