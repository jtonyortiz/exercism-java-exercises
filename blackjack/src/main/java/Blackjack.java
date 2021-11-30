import java.util.HashMap;
import java.util.Map.Entry;
public class Blackjack {

    public int parseCard(String card) {
        if(card.equals("ace")){
            return 11;
        }
        else if(card.equals("two")){
            return 2;
        }
        else if(card.equals("three")){
            return 3;
        }
        else if(card.equals("four")){
            return 4;
        }
        else if(card.equals("five")){
            return 5;
        }
        else if(card.equals("six")){
            return 6;
        }
        else if(card.equals("seven")){
            return 7;
        }
        else if(card.equals("eight")){
            return 8;
        }
        else if(card.equals("nine")){
            return 9;
        }
        else if(card.equals("ten")){
            return 10;
        }
        else if(card.equals("jack")){
            return 10;
        }
        else if(card.equals("queen")){
            return 10;
        }
        else if(card.equals("king")){
            return 10;
        }
        else{
            return 0;
        }

        
    }

    public boolean isBlackjack(String card1, String card2) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        int sum = 0;
        int value1 = 0;
        int value2 = 0;

        if(card1.equals("ace")){
            value1 =  11;
        }
        else if(card1.equals("two")){
            value1 = 2;
        }
        else if(card1.equals("three")){
            value1 = 3;
        }
        else if(card1.equals("four")){
            value1 = 4;
        }
        else if(card1.equals("five")){
            value1 = 5;
        }
        else if(card1.equals("six")){
            value1= 6;
        }
        else if(card1.equals("seven")){
            value1 = 7;
        }
        else if(card1.equals("eight")){
            value1 = 8;
        }
        else if(card1.equals("nine")){
            value1 = 9;
        }
        else if(card1.equals("ten")){
            value1 = 10;
        }
        else if(card1.equals("jack")){
            value1 =  10;
        }
        else if(card1.equals("queen")){
            value1 =  10;
        }
        else if(card1.equals("king")){
            value1 =  10;
        }
        else{
            value1 =  0;
        }

        
        
        if(card2.equals("ace")){
            value2 =  11;
        }
        else if(card2.equals("two")){
            value2 = 2;
        }
        else if(card2.equals("three")){
            value2 = 3;
        }
        else if(card2.equals("four")){
            value2 = 4;
        }
        else if(card2.equals("five")){
            value2 = 5;
        }
        else if(card2.equals("six")){
            value2= 6;
        }
        else if(card2.equals("seven")){
            value2 = 7;
        }
        else if(card2.equals("eight")){
            value2 = 8;
        }
        else if(card2.equals("nine")){
            value2 = 9;
        }
        else if(card2.equals("ten")){
            value2 = 10;
        }
        else if(card2.equals("jack")){
            value2 =  10;
        }
        else if(card2.equals("queen")){
            value2 =  10;
        }
        else if(card2.equals("king")){
            value2 =  10;
        }
        else{
            value2 =  0;
        }

        sum = value1 + value2;

        if(sum == 21){
            return true;
        }
        else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack == false){
            return "P";
        }
        else if(isBlackjack == true && dealerScore < 10){
            return "W";
        }
        else if(isBlackjack == true && dealerScore >= 10){
            return "S";
        }
        else {
            return "P";
        }

    }

    public String smallHand(int handScore, int dealerScore) {
        
        if((handScore>= 12 && handScore<= 16) && dealerScore >= 7){
            return "H";
        }

        if((handScore >= 12 && handScore <= 16) && dealerScore < 7){
            return "S";
        }

        if(handScore>= 17){
            return "S";
        }
        if(handScore <= 11){
            return "H";
        }

        return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
