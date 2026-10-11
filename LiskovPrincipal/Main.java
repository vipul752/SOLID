package LiskovPrincipal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalCompatibleCreditCard card:cards){
            card.internationalPayment();
        }
    }
}
