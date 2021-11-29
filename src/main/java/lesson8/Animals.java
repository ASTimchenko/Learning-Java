package lesson8;

public class Animals {
    String nickname; //Кличка
    String gender; //Пол
    String breet; //Порода
    Integer age; //Возраст
    String voice; //Голос
    String skill; //Умение

    public Animals(String nickname, String gender, String breet, Integer age, String voice, String skill) {
        this.nickname = nickname;
        this.gender = gender;
        this.breet = breet;
        this.age = age;
        this.voice = voice;
        this.skill = skill;
    }

    public String getVoice() {
        if (this.voice != null) {
            System.out.println("--------------------------------------------------");
            return "Животное по кличке " + this.nickname + " подаёт следующий голос: " + this.voice +".";
        }
        return "У животного нет голоса";
    }
}