package dtos;

import entities.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatDTO {
    private int id;
    private String brand;
    private String make;
    private String name;
    private String image;

    private List<OwnerDTO> owners = new ArrayList<>();
    private HarbourDTO harbour;

    public BoatDTO(String brand, String make, String name, String image, List<OwnerDTO> owners, HarbourDTO harbour) {
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.image = image;
        this.owners = owners;
        this.harbour = harbour;
    }

    public BoatDTO(Boat boat) {
        if(boat.getId()!= 0);
            this.id = boat.getId();
        this.brand = boat.getBrand();
        this.make = boat.getMake();
        this.name = boat.getName();
        this.image = boat.getImage();
        boat.getOwners().forEach(owner -> this.owners.add(new OwnerDTO(owner)));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<OwnerDTO> getOwners() {
        return owners;
    }

    public void setOwners(List<OwnerDTO> owners) {
        this.owners = owners;
    }

    public HarbourDTO getHarbour() {
        return harbour;
    }

    public void setHarbour(HarbourDTO harbour) {
        this.harbour = harbour;
    }

    @Override
    public String toString() {
        return "BoatDTO{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", owners=" + owners +
                ", harbour=" + harbour +
                '}';
    }
}
