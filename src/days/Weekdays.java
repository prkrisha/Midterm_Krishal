/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
   public enum WeekdaysEnum {
        ONE("Monday"),
        TWO("Tuesday"),
        THREE("Wednesday"),
        FOUR("Thursday"),
        FIVE("Friday"),
        SIX("Saturday"),
        SEVEN("Sunday");

        private final String dayName;

        WeekdaysEnum(String dayName) {
            this.dayName = dayName;
        }

        public String getDayName() {
            return dayName;
        }
    }
    public void nameOfDay(WeekdaysEnum code) {
        System.out.println(code.getDayName());
    }
}


