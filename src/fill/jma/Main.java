package fill.jma;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

class CarBrand {
}

 class Audi extends CarBrand {
    public Audi(){
    }
}

 class BMW extends CarBrand {
    public BMW(){
    }
}

 class Mersedes extends CarBrand {
    public Mersedes(){
    }
}



public class Main extends CarBrand {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<? extends CarBrand>[] classes1 = new Class[]{
                BMW.class,
                Audi.class,
                Mersedes.class
        };


        for(int i=0; i<10; i++) {
            Random r = new Random();
            int ind = r.nextInt(3);
            Constructor<? extends CarBrand> constructor = classes1[ind].getConstructor();
            Object[] arguments = new Object[]{};
            CarBrand animal = (CarBrand) constructor.newInstance(arguments);
            System.out.println(animal.getClass().getName());
        }


    }

//System.out.println(GenerateXYZ.calculatedXYZ());
//        GenerateArray.printArray();


//        RocketLaunches rocketLaunches = new RocketLaunches();
//        System.out.println(rocketLaunches.massRocket());

//              Lesson 8
        /*
//        ThreadMaxNumArray.allThread();
//        ThreadАverage.allThread();
//        ThreadWhritePath.allThread();
*/

//              Lesson 7
        /*
//        Catalog catalog = new Catalog();
//        Catalog.catalog();
//        Catalog.catalogOne();
//        Catalog.getNameFile();
//        Catalog.totalCommander();
//        Catalog.catalogOne();
//        WordAndCommaCounter wordAndCommaCounter = new WordAndCommaCounter();
//        WordAndCommaCounter.commaCounter();
//        WordAndCommaCounter.wordCounter();
//        NymberFindeSummClear nymberFindeSummClear = new NymberFindeSummClear();
//        NymberFindeSummClear.nymberFindeSummClear();

//        String path = "/Users/user/Desktop/Itacademy/src/fill/jma/Lesson7/NymberList";
//        System.out.println(ReversNumbersText.readIntegersFromFile(path));
//        List<Integer> reversList =  ReversNumbersText.readIntegersFromFile(path);
//        System.out.println(ReversNumbersText.reversList(reversList));
*/

//              Lesson 6
        /*
//        BadMark badMark = new BadMark();
//        BadMark.CreateMarkCollection();
//        ClearCopy clearCopy = new ClearCopy();
//        ClearCopy.RandomCollection();
//       BestMark.CreateJournalBestMark();
        Password.Password();
*/

//              Lesson 4
        /*

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String text = String.valueOf(reader.readLine());
//        FindComma findComma = new FindComma();
//        FindComma.EnterText("");
//        WordCounter wordCounter = new WordCounter();
//        WordCounter.Delete(text);
//        LastLetter lastLetter = new LastLetter();
 //       LastLetter.WordOfLastLetter(text);
//        WordAdditionTime wordAdditionTime = new WordAdditionTime();
//        WordAdditionTime.TheFirst();
//        WordAdditionTime.TheSecond();
*/

//              Lesson 3 task 18 19 20 22 23
        /* PrintArray.printArray(array);
        PrintArray.lastElementArray(array);
        PrintArray.evenElementArray(array);
        PrintArray.maxElementArray(array);
        PrintArray.rePlaceArray(array);
        PrintArray.printArrayRevers(array);
        System.out.println();
        System.out.println();
        ArrayButterfly.butterfly();*/

//              Lesson 1-2 task 4-17
        /*
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        Time time = new Time();
        time.time();
        SummNum summNum = new SummNum();
        summNum.summNum();
        OperatorDemo operatorDemo = new OperatorDemo();
        operatorDemo.printSumm();
        CircleRectangle circleRectangle = new CircleRectangle();
        circleRectangle.circlRectangle();
        YouBalanceRub youBalanceRub = new YouBalanceRub();
        youBalanceRub.suffixRub();
        DayOfWeek dayOfWeek = new DayOfWeek();
        dayOfWeek.dayofweek();
        Factorial factorial = new Factorial();
        factorial.factorial();
        Factorialcyclewhile factorialcyclewhile = new Factorialcyclewhile();
        factorialcyclewhile.CycleWhile();
        SummNumber sumNumber = new SummNumber();
        sumNumber.sumNumber();
        HopeNum hopeNum = new HopeNum();
        hopeNum.hope();
        NumberFormat numberFormat = new NumberFormat();
        numberFormat.Format();
        NumberFormatEasy numberFormatEasy = new NumberFormatEasy();
        numberFormatEasy.FormatEasy();
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primenumber();*/

    }

