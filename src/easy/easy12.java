package easy;

import org.testng.annotations.Test;

public class easy12 {
//字符          数值
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
    public String intToRoman(int num) {
        if(num==0)
            return "";
        char before;
        char med;
        char end;
        int pop;
        char[] chars = {'I','V','X','L','C','D','M'};

        StringBuilder s = new StringBuilder("");
        int i=0;
        while(i!=6){
            before = chars[i];
            med = chars[i+1];
            end = chars[i+2];
            pop = num%10;
            num/=10;
            if(pop==4){
                s.append(med).append(before);
            }else if(pop == 9){
                s.append(end).append(before);
            }else if(pop>=0&&pop<=3){
                s.append(String.valueOf(before).repeat(pop));
            }else{
                s.append(String.valueOf(before).repeat(pop-5)).append(med);
            }
            i=i+2;
        }

        return s.append("M".repeat(num)).reverse().toString();
    }
    @Test
    public void test(){
        System.out.println(intToRoman(1111));
    }
}
