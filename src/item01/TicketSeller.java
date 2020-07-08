package item01;

/**
 * @author lokie on 2020/07/06
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*
        티켓 판매 책임을 ticketOffice 에게 이동
    */
    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}
