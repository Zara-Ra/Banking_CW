package ir.maktab.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private int code;
    private String city;
    private int degree;
    private Location location;

    private List<Customer> customerList = new ArrayList<>();

    public Branch(int code, String city, int degree,Location location) {
        this.code = code;
        this.city = city;
        setDegree(degree);
        this.location = location;
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void deleteCustomer(Customer customer){
        //TODO: delete customer
    }
    public void setDegree(int degree) {
        if (degree == 1 || degree == 2 || degree == 3)
            this.degree = degree;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public int getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "'Branch Information' Branch number " + code + " ,this branch is located in " + city +
                " ,the degree of this branch is " + degree;
    }
}
