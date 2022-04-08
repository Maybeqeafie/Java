package dz.algeev.other;

public class Time {
    private int sec;
    private int minute;
    private int hour;
    private double utc;
    public Time(int sec){
        this.sec = sec;
    }
    public Time(int hour,int minute,int sec,int utc){
        if(hour > 24){
            throw new IllegalArgumentException("кол-во часов не может быть больше 24");
        }
        if((utc > 14) && (utc < -12)){
            throw new IllegalArgumentException("таких часовых поясов не бывает");
        }
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
        this.utc = utc;
    }
    public void getTime(){
         hour = sec / 3600;
         minute = sec / 60 % 60;
//         if(hour > 24) {
//            hour = hour - (hour/24)*24;
//         }
         sec = sec % 60;
    }
    public int getHours(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSec(){
        return sec;
    }
    public double getUtc(){
        return utc;
    }
    public String toString() {
        return hour + ":" + minute + ":" + sec;
    }
}
