package model;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.Duration;
import java.time.LocalDate;

public class Order {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private User user;
    private Room room;

    public Order() {
    }

    public Order(LocalDate checkIn, LocalDate checkOut, User user, Room room) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.user = user;
        this.room = room;
        this.room.setCount();
        this.user.setCount();
        this.room.setStatus(false);
    }

    public LocalDate getCheckIn(LocalDate of) {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
        this.room.setStatus(false);
    }

    public LocalDate getCheckOut(LocalDate of) {
        this.room.setStatus(true);
        return checkOut;

    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    public long getTotalPrice(){
        long result;
        long numDay = DAYS.between(checkIn,checkOut);
        int price = room.getPrice();
        return  result = numDay*price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", user=" + user +
                ", room=" + room +
                '}';
    }
}
