package fill.jma.lesson1.task8;

public class YouBalanceRub {
    public void suffixRub(){
        int x =(int) (Math.random()*1000);
        int a;
        System.out.print("счет вашего баланса  " + x);
        switch (a=x%10){
            case 1:
                a=1;
                System.out.print("  рубль");
                break;
            case 2:
                a=2;
                System.out.print("  рубля");
                break;
            case 3:
                a=3;
                System.out.print("  рубля");
                break;
            case 4:
                a=4;
                System.out.print("  рубля");
                break;
            case 5:
                a=5;
                System.out.print("  рублей");
                break;
            case 6:
                a=6;
                System.out.print("  рублей");
                break;
            case 7:
                a=7;
                System.out.print("  рублей");
                break;
            case 8:
                a=8;
                System.out.print("  рублей");
                break;
            case 9:
                a=9;
                System.out.print("  рублей");
                break;
            default:
                a=0;
                System.out.print("  рублей");
        }
    }
}
