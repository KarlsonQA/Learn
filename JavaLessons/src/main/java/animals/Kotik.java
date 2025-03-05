package animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private boolean starv = false;
    private static final int METHODS = 5;
    public static int count;

    public Kotik(){
        count++;
    }
    public Kotik(String name, String voice, int satiety, int weight ){
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    };

    public String getName(){
        return name;
    }
    public String getVoice(){
        return voice;
    }
    public int getSatiety(){
        return satiety;
    }
    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setVoice(String voice){
        this.voice = voice;
    }
    public void setSatiety(int satiety){
        this.satiety = satiety;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    private boolean starving(){
        System.out.println("Котик голоден. Просит кушать...");
        this.starv = true;
        return false;
    }
    private boolean play(){
        if (satiety > 0){
            System.out.println("Котик играет.");
            satiety--;
            return true;
        }
        else return starving();
    }
    private boolean sleep(){
        if (satiety > 0){
            System.out.println("Котик спит.");
            satiety--;
            return true;
        }
        else return starving();
    }
    private boolean wash(){
        if (satiety > 0){
            System.out.println("Котик умывается.");
            satiety--;
            return true;
        }
        else return starving();
    }
    private boolean walk(){
        if (satiety > 0){
            System.out.println("Котик гуляет.");
            satiety--;
            return true;
        }
        else { starving(); walk();
        }
        return true;
    }
    private boolean hunt(){
        if (satiety > 0){
            System.out.println("Котик охотится.");
            satiety--;
            return true;
        }
        else return starving();
    }

    private void eat (int satiety){
        this.satiety = satiety;
        System.out.println("Уровень сытости котика увеличился на " + this.satiety);
    }
    private void eat (int satiety, String eatName){
        this.satiety = satiety;
        System.out.println("Уровень сытости котика увеличился на " + this.satiety + ". Вы дали котику - " + eatName);
    }
    private void eat (){
        eat(5 ,"Мяско");
    }

    public String [] liveAnotherDay(){
        String [] dayTime = new String[24];
        for(int i = 0; i < 24; i++){
            System.out.print(i + " : ");
            switch ((int)(Math.random() * METHODS) + 1)
            {
                case 1:
                    play();
                    if (starv){
                        eat();
                        starv = false;
                    }
                    dayTime [i] = i + " : Котик играет.";
                    break;
                case 2:
                    sleep();
                    if (starv){
                        eat();
                        starv = false;
                    }
                    dayTime [i] = i + " : Котик спит.";
                    break;
                case 3:
                    wash();
                    if (starv){
                        eat();
                        starv = false;
                    }
                    dayTime [i] = i + " : Котик моется.";
                    break;
                case 4: walk();
                    if (starv){
                        eat();
                        starv = false;
                    }
                    dayTime [i] = i + " : Котик гуляет.";
                    break;
                case 5:
                    hunt();
                    if (starv){
                        eat();
                        starv = false;
                    }
                    dayTime [i] = i + " : Котик охотится.";
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
        return dayTime;

    }

}
