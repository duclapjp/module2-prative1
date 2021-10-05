package view;

import controller.Hotel;
import model.Order;
import model.Room;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User lap = new User("lập", java.time.LocalDate.of(1994,9,10),"1");
        User thai = new User("thái", java.time.LocalDate.of(2004,2,11),"2");
        User xuanAnh = new User("xuân anh", java.time.LocalDate.of(2001,9,10),"3");
        User an = new User("An", java.time.LocalDate.of(2002,6,11),"4");
        ArrayList<User> users = getUsers(lap, thai, xuanAnh, an);
        Room r1 = new Room("VIP",1000,"302",true);
        Room r2 = new Room("normal",2000,"201",true);
        Room r3 = new Room("special",1500,"503",true);
        Room r4 = new Room("VIP",1000,"401",true);
        getRooms(r1, r2, r3, r4);
        ArrayList<Order> orders = new ArrayList<>();
        Order order1 = new Order(java.time.LocalDate.of(2021,5,5), java.time.LocalDate.of(2021,5,7),thai,r3);
        Order order2 = new Order(java.time.LocalDate.of(2021,7,6), java.time.LocalDate.of(2021,7,9),thai,r4);
        orders.add(order1);
        orders.add(order2);
        Hotel ducLap = new Hotel();
        ducLap.showAll();
        System.out.println((ducLap.getAllTotalRoomPrice()));
        System.out.printf("-----------");
        ducLap.checkUser("2");


    }

    private static void getRooms(Room r1, Room r2, Room r3, Room r4) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
    }

    private static ArrayList<User> getUsers(User lap, User thai, User xuanAnh, User an) {
        ArrayList<User> users = new ArrayList<>();
        users.add(lap);
        users.add(thai);
        users.add(xuanAnh);
        users.add(an);
        return users;
    }
}
