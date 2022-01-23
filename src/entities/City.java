package entities;

import interfaces.IChild;
import visitors.CityVisitor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class City {
    private String name;
    private Double niceScoreCity;
    private List<IChild> childrenFromCity;

    public City(String name) {
        this.name = name;
        this.niceScoreCity = 0.0;
        childrenFromCity = new ArrayList<>();
    }

    public void accept(CityVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public Double getNiceScoreCity() {
        return niceScoreCity;
    }

    public List<IChild> getChildrenFromCity() {
        return childrenFromCity;
    }

    public void setNiceScoreCity(Double niceScoreCity) {
        this.niceScoreCity = niceScoreCity;
    }
}
