package com.devong.product.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_no")
    private Long userNo;

    @Column(name = "user_name", unique = true, length = 64)
    private String userName;

    public Long getUserNo() {
        return this.userNo;
    }

    public void setUserNo(Long _userNo) {
        this.userNo = _userNo;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String _userName) {
        this.userName = _userName;
    }
}
