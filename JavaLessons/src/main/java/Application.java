import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Барсик", "Мяу", 4, 5);
        Kotik kotik2 = new Kotik();

        kotik2.setName("Мурзик");
        kotik2.setVoice("Мяу");
        kotik2.setSatiety(10);
        kotik2.setWeight(8);

        String [] strings = kotik1.liveAnotherDay();
        for(String str : strings){
            System.out.println(str);
        }
        System.out.println(Kotik.count);
        compareVoice(kotik1, kotik2);

    }
     static public void compareVoice(Kotik kotik1, Kotik kotik2){
        if (kotik1.getVoice().equals(kotik2.getVoice())){
            System.out.println("Котики мурчат одинаково!!! ");;
        }
        else System.out.println("Котики мурчат по разному!!!");;
     }

}
