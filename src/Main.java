// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("Hello World");
        int lowTemp = 32;
        System.out.println(true || (lowTemp+=5)>0);
       // System.out.println(lowTemp);
        System.out.println(lowTemp);
        int currentTemp = 3;
        int warmThres = 68;
        if (currentTemp>warmThres)
            System.out.println("Its warm outside");
        else
            System.out.println("Its cold outside");


        String windDirection = "West";
        switch(windDirection) {
            case "north":
                System.out.println("The wind is blowing from the north");
                break;
            case "south":
                System.out.println("The wind is blowing from the south");
                break;
            case "east":
                System.out.println("The wind is blowing from the east");
                break;
            case "west":
                System.out.println("The wind is blowing from the west");
                break;
            default:
                System.out.println("I do not know where the wind is blowing!");
        }

        String[] words = {"Hello", "How","Are","You","Lifesaver"};
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        for(String a: words){
            System.out.println(a);
        }
        int j = 0;
        while(j>=10){
            System.out.println(j);
            j--;
        }
        int k = 0;
        do{
            System.out.println(k);
            k+=2;
        }while(k<10);

        int[] integers = {1, 2, 3, 4, -1, -2, 10};
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < 0) {
                System.out.println(integers[i]);

            }

        }
        String name = "Joleyne";
        System.out.println(name);
        System.out.println(name.substring(1, name.length()-1));
    }
}