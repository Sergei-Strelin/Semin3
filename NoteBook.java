package Algorythm.HomeWork_002;

import java.util.Objects;
import java.util.List;
import java.util.Random;

public class NoteBook {
    private double price;
    private int ram;
    private Brand brand;

    public enum Brand {
        Lenuvo,
        Asos,
        MacNote,
        Eser,
        Xamiou;

        private static final List<Brand> VALUES = List.of(values());
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Brand randomBrand() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }
    private NoteBook(Builder builder) {
        this.price = builder.builderPrice;
        this.ram = builder.builderRam;
        this.brand = builder.builderBrand;
    }

    public double getPrice() {
        return price;
    }
    public int getRam() {
        return ram;
    }
    public Brand getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Double.compare(noteBook.price, price) == 0 && ram == noteBook.ram && brand == noteBook.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, ram, brand);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand=" + brand +
                '}';
    }

    public static final class Builder {
        private double builderPrice;
        private int builderRam;
        private Brand builderBrand;

        public Builder setPrice(double price) {
            this.builderPrice = price;
            return this;
        }

        public Builder setRam(int ram) {
            this.builderRam = ram;
            return  this;
        }

        public Builder setBrand(Brand brand){
            this.builderBrand = brand;
            return this;
        }

        public NoteBook build() {
            return new NoteBook(this);
        }
    }
}
