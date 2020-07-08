package item01;

/**
 * @author lokie on 2020/07/06
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }
    /*
        ticketSeller 에게 책임을 넘기면서 ticketOffice 에 접근하지 않음.
    */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
