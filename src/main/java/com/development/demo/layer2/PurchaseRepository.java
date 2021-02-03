package com.development.demo.layer2;
import com.development.demo.layer1.*;
import java.util.List;




public interface PurchaseRepository {
    public String addPurchase(Purchase purchase);
    Purchase getPurchase(int PurchaseId);
    public List<Purchase> getAllPurchases();
 }
