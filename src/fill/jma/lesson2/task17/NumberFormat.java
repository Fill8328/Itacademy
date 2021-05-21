package fill.jma.lesson2.task17;

public class NumberFormat {
    public void Format(){
        int number = 20023143;
        int thousand = 1000;
        int tem;
        for (int i = 1;i <=4;i++){
            tem = number%thousand;
            number=number/thousand;
            String s=String.valueOf(tem);
            System.out.println(s);
        }


    }
}
