package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public Position() {
    }

    public List<Position> highBonus(List<Position> employees) {
        List<Position> result = new ArrayList<>();
        for(Position i: employees) {
            if(i.getBonus() > 150000) {
                result.add(i);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> employees = new ArrayList<>();
        employees.add(new Position("Aron", 320000));
        employees.add(new Position("Balazs", 132000));
        employees.add(new Position("Csaba", 54000));
        employees.add(new Position("Dalma", 195000));

        Position position = new Position();
        System.out.println(position.highBonus(employees));
    }
}
