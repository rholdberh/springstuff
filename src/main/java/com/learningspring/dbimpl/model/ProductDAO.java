package com.learningspring.dbimpl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("productdao")
public class ProductDAO {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new JdbcTemplate(jdbc);
    }

    public List<Product> getProducts(){
        return jdbc.query("select * from SCHEMA_TEST_ROMAN.PRODUCT", (resultSet, i) -> {
            Product prod = new Product();
            prod.setId(resultSet.getInt("id"));
            prod.setName(resultSet.getString("name"));
            return prod;
        });
    }

}
