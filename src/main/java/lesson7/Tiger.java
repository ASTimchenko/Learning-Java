package lesson7;

public class Tiger {
      String nickname; //Кличка
      String gender; //Пол
      String region; //Регион
      Integer age; //Возраст
      Integer weight; //Масса
      Integer maxDistance; //Максимальная дистанция по бегу
      Integer maxSpeed; //Максимальная скорость

    public Tiger(String nickname, String gender, String region, Integer age, Integer weight, Integer maxDistance, Integer maxSpeed) {
        this.nickname = nickname;
        this.gender = gender;
        this.region = region;
        this.age = age;
        this.weight = weight;
        this.maxDistance = maxDistance;
        this.maxSpeed = maxSpeed;
    }

    public String getTigerRun(double intervalRun) {
        if (this.maxDistance >= intervalRun) {
            return "Тигр по кличке " + this.nickname + " пробежит расстояние " + String.valueOf(intervalRun) + "м";
        }


        if ((this.maxDistance != 0) & (this.maxDistance < intervalRun)) {
            return "Тигр по кличке " + this.nickname + " не сможет пробежать "
                    + String.valueOf(intervalRun) + "м, так как его предел "+ this.maxDistance + "м";

        }

        if (this.maxDistance == 0) {
            return "Тигр по кличке " + this.nickname +"не умеет бегать";
        }
        return "Ответ не предусмотрен";
    }
}

