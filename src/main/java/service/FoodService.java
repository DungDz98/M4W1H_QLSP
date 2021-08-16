package service;

import model.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodService {
    public List<Food> list = new ArrayList<>();

    public FoodService() {
        list.add(new Food("Pizza", "/webpage/img/gallery/01.jpg", 25000, "Delicious", 1));
        list.add(new Food("Salad", "/webpage/img/gallery/02.jpg", 35000, "Very Delicious", 2));
        list.add(new Food("Noodle", "/webpage/img/gallery/03.jpg", 45000, "Delicious sssssa", 1));
        list.add(new Food("Salad2", "/webpage/img/gallery/04.jpg", 15000, "Delicious aaaaa", 3));
    }

    public void save(Food food) {
        list.add(food);
    }

    public void delete(int index) {
        list.remove(index);
    }

    public void edit(int index, Food food) {
        list.set(index, food);
    }

    public List<Food> find(String fName) {
        List<Food> findList = new ArrayList<>();
        for (Food f : list) {
            if (f.getTen().contains(fName)) {
                findList.add(f);
            }
        }
        return findList;
    }
}
