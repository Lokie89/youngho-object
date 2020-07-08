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
        TicketSeller 의 로직을 가져와 실행 함으로써
        Bag 을 리턴할 필요가 없어짐 ( 내부 객체로 사용됨 )
    */
    public Long buy(Ticket ticket){
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.minusAmount(ticket.getFee());
            bag.setTicket(ticket);
            return ticket.getFee();
        }
    }
}
