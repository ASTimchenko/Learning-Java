package lesson7;

public class DomesticCat {
    String nickname; //Кличка
    String gender; //Пол
    String breet; //Порода
    String color; //Окрас
    Integer age; //Возвраст
    Integer weight; //Масса
    Integer maxDistance; //Максимальная дистанция по бегу
    Integer maxSwimming; //Максимальная дистанция по плаванию

    public DomesticCat(String nickname, String gender, String breet, String color, Integer age, Integer weight,
                       Integer maxDistance, Integer maxSwimming) {
        this.nickname = nickname;
        this.gender = gender;
        this.breet = breet;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.maxDistance = maxDistance;
        this.maxSwimming = maxSwimming;
    }

    public DomesticCat() {
    }

    @Override
    public String toString() {
        return "DomesticCat{" +
                "nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", breet='" + breet + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", maxDistance=" + maxDistance +
                ", maxSwimming=" + maxSwimming +
                '}';
    }

    public void beolder() {
        age++;

    }

    public String getCatsRun(double intervalRun) {
        if (this.maxDistance >= intervalRun) {
            return "Кошка по кличке " + this.nickname + " пробежит расстояние " + String.valueOf(intervalRun) + "м";
        }


        if ((this.maxDistance != 0) & (this.maxDistance < intervalRun)) {
            return "Кошка по кличке " + this.nickname + " не сможет пробежать "
                    + String.valueOf(intervalRun) + "м, так как её предел "+ this.maxDistance + "м";

        }

        if (this.maxSwimming == 0) {
            return "Кошка по кличке " + this.nickname +"не умеет бегать";
        }
        return "Ответ не предусмотрен";
    }

    public String getCatsSwimming(double intervalSwimming) {
        if (this.maxSwimming >= intervalSwimming) {
            return "Кошка по кличке " + this.nickname + " проплывёт расстояние " + String.valueOf(intervalSwimming) + "м";
        }


        if ((this.maxSwimming != 0) & (this.maxSwimming < intervalSwimming)) {
            return "Кошка по кличке " + this.nickname + " не сможет проплыть "
                    + String.valueOf(intervalSwimming) + "м, так как её предел "+ this.maxSwimming + "м";

        }

        if (this.maxSwimming == 0) {
            return "Кошка по кличке " + this.nickname + " не умеет плавать";
        }
        return "Ответ не предусмотрен";
    }
}
