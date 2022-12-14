package org.fitsum;


import java.io.Serializable;

public class Contact implements Serializable {

    public Integer userItem;

    public Contact(Integer userItem){
        this.userItem = userItem;
    }
}
