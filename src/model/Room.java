package model;

public class Room {
    private String type;
    private int price;
    private String name;
    private boolean status;
    private int count=0;

    public Room() {
    }

    public Room(String type, int price, String name, boolean status) {
        this.type = type;
        this.price = price;
        this.name = name;
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }


}
