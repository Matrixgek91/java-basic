public class Opdracht5 {
    public static void main(String[] args) {
        int x;
        int y;

        x = 2000;
        y = 1;

        //a
        if((x / y) == 4){
            x = 100;
        }

        //b
        if((x * y) == 5){
            x = 1;
        }

        //c
        if(x < y){
            x = x * 2;
        }

        //d
        if(x > y){
            x++;
        }


        System.out.println(x);

    }
}
