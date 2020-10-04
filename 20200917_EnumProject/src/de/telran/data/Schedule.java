package de.telran.data;

public class Schedule {
    private DayOfWeek dayOfWeek;
    public Schedule (DayOfWeek dayOfWeek){
        this.dayOfWeek = dayOfWeek;

    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public void wekeUp(){
        if(getDayOfWeek()==DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY){  //if (dayOfWeek.ordinal()>4 );
            System.out.println("Выходной! Можешь спать подольше! ");
        } else {
            System.out.println("Пора просыпаться!");
        }

    }
    public void getMenu(){

        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Понедельник - суп");
                break;
            case TUESDAY:
                System.out.println("Вторник - макароны");
                break;
            case WEDNESDAY:
                System.out.println("Среда - рыба");
                break;
            case THURSDAY:
                System.out.println("Четверг - каша");
                break;
            case FRIDAY:
                System.out.println("Пятница - плов");
                break;
            case SATURDAY:
                System.out.println("Суббота - борщ");
                break;
            case SUNDAY:
                System.out.println("Воскресенье - суши");
                break;
        }
    }
}
