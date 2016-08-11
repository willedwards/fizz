package com.travellazy;


public class App 
{
    private static final String FIZZBUZZ = "fizzbuzz";
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String SPACE = " ";

    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.applyForRange(1, 20));
    }

    public String applyForRange(int start, int end){

        StringBuilder sb = new StringBuilder();

        for(int i = start; i<=end; i++){

           if(i % 15 == 0){
               sb.append(FIZZBUZZ);
           }
           else if(i % 3 == 0){
               sb.append(FIZZ);
           }
           else if(i % 5 == 0){
               sb.append(BUZZ);
           }
           else{
               sb.append(i);
           }

            sb.append(SPACE);
        }

        return sb.substring(0, sb.length() - 1);
    }
}
