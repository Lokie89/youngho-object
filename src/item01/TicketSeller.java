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
        Audience 에게 메서드를 실행시킴으로써
        Bag 을 가져올 필요가 없어짐
    */
    public void sellTo(Audience audience){
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
