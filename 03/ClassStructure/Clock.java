public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    Clock(){
        hour = 0;
        minute = 0;
    }
    
    Clock(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    void setClock(){
        hour = 0;
        minute = 0;
    }
    void displayTime(){
    System.out.println("There is: "+hour+":"+minute);
    }
    void addOneMinute(){
        minute++;
        if (minute == 60){
            minute = 0;
            hour++;
            if(hour == 24){
                hour = 0;
            }
        }
        if (hour == alarmHour && minute == alarmMinute){
            runAlarm();
        }
    }
    void setAlarm(int hour, int minute){
    alarmHour = hour;
    alarmMinute = minute;
    }
    void runAlarm(){
    System.out.println("beep-beep-beep-beep !!");
    }
}
