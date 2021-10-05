package controller;

import model.Order;
import model.Room;
import model.User;

import java.util.ArrayList;

public class Hotel {

    ArrayList<User> urserlist = new ArrayList<>();
    ArrayList<Room> roomlist = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();


    public Hotel() {
    }
    public void showAll(){
        for (Order o: orders) {
            System.out.println(o.toString());
        }
    }
    public void addNewUser(User user) {
        urserlist.add(user);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    public void setUser(ArrayList<User> users){
        this.urserlist = users;
    }
    public void updateUser(int index,User newUser){
        urserlist.set(index,newUser);
    }
    public void updateRoom(int index,Room newRoom){
        roomlist.set(index,newRoom);
    }
    public void addNewRoom(Room room) {
        roomlist.add(room);
    }

    public void deleteUser(int index) {
        urserlist.remove(index);
    }

    public void deleteRoom(int index) {
        roomlist.remove(index);
    }

    public long getAllTotalRoomPrice() {
        long allTotalPrice = 0;
        for (Order o : orders) {
            allTotalPrice += o.getTotalPrice();
        }
        return allTotalPrice;
    }
    public void checkUser(String code){
        for (User u:urserlist) {
            if (u.getCode().equals(code)){
                System.out.println(u.toString());
            }
        }
    }


}
