package com.DDN.login.repository;

import com.DDN.login.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository  extends JpaRepository<WishList, Integer> {
    List<WishList> findAllByUserIdOrderByCreatedDateDesc(Long userId);
}
