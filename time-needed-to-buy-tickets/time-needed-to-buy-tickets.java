class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int sum =0;
        for(int i=0; i<tickets.length; i++) {

            if(tickets[i]<=tickets[k] && i<k) sum+=tickets[i];
            else if(tickets[i]>=tickets[k] && i>k) sum+= tickets[k]-1;
            else if(tickets[i]<=tickets[k] && i>k) sum+=tickets[i];
            else if(tickets[i]>=tickets[k] && i<k) sum += tickets[k];
        }
        return sum + tickets[k];
    }
}