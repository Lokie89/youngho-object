package item01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lokie on 2020/07/06
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets = Arrays.asList(tickets);
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    private void plusAmount(long amount) {
        this.amount += amount;
    }

    /*
        티켓 판매 책임을 내부 메서드로 가져옴
     */
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
