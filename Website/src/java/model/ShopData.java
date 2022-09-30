/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class ShopData {

    final private Map<String, Shop2> shops = new HashMap<>();
    final private static ShopData instance = new ShopData();

    ShopData() {
        shops.put("ดีเลิศ", new Shop2("ดีเลิศ", "ชมพู", "L","0938455215" ));
    }

    public static ShopData getInstance() {
        return instance;
    }

    public Shop2 getShop(String modelName) {
        return shops.get(modelName);
    }
}