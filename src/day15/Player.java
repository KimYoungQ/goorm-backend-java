package day15;

import lombok.Builder;

public class Player implements Movable, Attackable {
    private String name;
    private int x, y;
    private int damage;

    @Builder
    public Player(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name +  "이(가) (" + x + ", " + y + ")로 이동");
    }

    @Override
    public void stop() {
        System.out.println(name + " 정지");
    }

    @Override
    public void attack(String target) {
        System.out.println(name + "이(가)" + target + "을(를) 공격! (데미지: " + damage + ")");
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
