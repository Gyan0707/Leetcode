class Solution {
    public String intToRoman(int num) {
       String[] Thousands =  {"","M","MM","MMM","MMMM"};
       String[] Hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
       String[] Tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
       String[] Units= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
       return Thousands[num/1000]+Hundreds[(num%1000)/100]+Tens[(num%100)/10]+Units[num%10];  
       
    }
}