package com.learningspring.dbimpl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component("productdao")
public class ProductDAO {

    private NamedParameterJdbcTemplate jdbc;

    public NamedParameterJdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public List<Product> getProducts(){
        return jdbc.query("select * from SCHEMA_TEST_ROMAN.PRODUCT", (resultSet, i) -> {
            Product prod = new Product();
            prod.setId(resultSet.getInt("id"));
            prod.setName(resultSet.getString("name"));
            return prod;
        });
    }

    public Product  getProductById(int id){
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);
        return jdbc.queryForObject("select * from SCHEMA_TEST_ROMAN.PRODUCT where id=:id",
                params, new BeanPropertyRowMapper<>(Product.class));

    }

    public boolean createProduct(Product product) {
        BeanPropertySqlParameterSource bean = new BeanPropertySqlParameterSource(product);

        return jdbc.update("insert into SCHEMA_TEST_ROMAN.PRODUCT(id,name) values(:id,:name)",bean) == 1;

    }

}
