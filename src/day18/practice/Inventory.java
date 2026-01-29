package day18.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inventory {
    private Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String name, Integer quantity) {
        stock.put(name, stock.getOrDefault(name, 0) + quantity);
        System.out.println(name + " " + quantity + "개 입고 (재고: " + stock.get(name) + ")");
    }

    public boolean sellProduct(String name, int quantity) {
        int current = stock.getOrDefault(name, 0);

        if (current < quantity) {
            System.out.println("재고 부족: " + name);
            return false;
        }

        stock.put(name, current - quantity);
        System.out.println(name + " " + quantity + "개 판매 (재고: " + stock.get(name) + ")");

        return true;
    }

    public Set<String> getLowStockProducts(int threshold) {
        Set<String> lowStock = new HashSet<>();

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue() < threshold) {
                lowStock.add(entry.getKey());
            }
        }

        return lowStock;
    }

    public void printInventory() {
        System.out.println("=== 재고 반환 ===");
        stock.forEach((name, qty) -> System.out.println(name + ": " + qty + "개"));
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct("노트북", 10);
        inv.addProduct("마우스", 50);
        inv.addProduct("키보드", 30);

        inv.sellProduct("노트북", 8);
        inv.sellProduct("마우스", 45);

        inv.printInventory();

        System.out.println("\n재고 부족 상품 (10개 미만): " + inv.getLowStockProducts(10));
    }
}
