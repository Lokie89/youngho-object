package item01;

/**
 * @author lokie on 2020/07/06
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /*
        Ticket 을 꺼내는 책임을 가방에게 할당
    */
    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
