package com.groceryBazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groceryBazar.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String couponCode);
}
