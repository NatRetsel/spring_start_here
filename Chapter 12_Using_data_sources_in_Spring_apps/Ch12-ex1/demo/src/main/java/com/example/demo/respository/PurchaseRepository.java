package com.example.demo.respository;


import org.springframework.jdbc.core.RowMapper;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Purchase;

@Repository
public class PurchaseRepository {
    private final JdbcTemplate jdbc;
    public PurchaseRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase purchase){
        String sql = "INSERT INTO purchase (`product`, `price`) VALUES ( ?, ?)";
        jdbc.update(sql, 
                    purchase.getProduct(), 
                    purchase.getPrice());
        return;
    }

    public List<Purchase> findAllPurchases() {
        String sql = "SELECT * FROM purchase";
        RowMapper<Purchase> purchaseRowMapper = (r,i) -> {
            Purchase rowObj = new Purchase();
            rowObj.setId(r.getInt("id"));
            rowObj.setProduct(r.getString("product"));
            rowObj.setPrice(r.getBigDecimal("price"));
            return rowObj;
        };
        return jdbc.query(sql, purchaseRowMapper);
    }
}
