/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.portfolio;

/**
 *
 * @author Lipe
 */
public class Stock {

private String name;
private int quantity;

public Stock(String name, int quantity) {
this.name = name;
this.quantity = quantity;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getQuantity() {
return quantity;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

}