package Task1and2;


public class Main {
    public static void main(String[] args) {
        String[] words = new String[] {"one ", "two "};

        Changer<Object> changer = new Changer<>();

        changer.doTask1(words);

        changer.doTask2(words);

    }
}


