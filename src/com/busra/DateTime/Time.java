package com.busra.DateTime;

import java.util.Calendar;

public class Time {
    private int m_hour,m_minute, m_second , m_millisecond;

    private static boolean isValidForBounds(int val, int min, int max){
        return min<=val && max>=val;
    }

    private static boolean isValidForTime(int hour,int minute,int second,int millisecond){
        return isValidHour(hour) && isValidMinute(minute) && isValidSecond(second) && isValidMillisecond(millisecond);
    }

    private static boolean isValidHour(int hour){
        return isValidForBounds(hour,0,23);
    }
    private static boolean isValidMinute(int minute){
        return isValidForBounds(minute,0,59);
    }
    private static boolean isValidSecond(int second){
        return isValidForBounds(second,0,60);
    }
    private static boolean isValidMillisecond (int millisecond){
        return isValidForBounds(millisecond,0,999);
    }

    private static void control (int hour , int minute , int second , int millisecond){
        try {
            if(isValidForTime(hour,minute,second,millisecond));
        }catch (Exception e){
            System.out.println("Invalid Time");
        }
    }

    private static void controlForHour (int hour){
        try {
            if(isValidHour(hour));
        }catch (Exception e){
            System.out.println("Invalid Hour");
        }
    }

    private static void controlForMinute (int minute){
        try {
            if(isValidMinute(minute));
        }catch (Exception e){
            System.out.println("Invalid Minute");
        }
    }

    private static void controlForSecond (int second){
        try {
            if(isValidSecond(second));
        }catch (Exception e){
            System.out.println("Invalid Second");
        }
    }

    private static void controlForMillisecond (int millisecond){
        try {
            if(isValidMillisecond(millisecond));
        }catch (Exception e){
            System.out.println("Invalid Millisecond");
        }
    }

    public int getM_hour() {
        return m_hour;
    }

    public int getM_minute() {
        return m_minute;
    }

    public int getM_second() {
        return m_second;
    }

    public int getM_millisecond() {
        return m_millisecond;
    }

    public void setM_hour(int hour){
        if(m_hour==hour)
            return;

        controlForHour(hour);
        m_hour=hour;
    }

    public void setM_minute(int minute){
        if(m_minute==minute)
            return;

        controlForMinute(minute);
        m_minute=minute;
    }

    public void setM_second(int second){
        if(m_second==second)
            return;

        controlForSecond(second);
        m_second=second;
    }

    public void setM_millisecond(int millisecond){
        if(m_millisecond==millisecond)
            return;

        controlForMillisecond(millisecond);
        m_millisecond=millisecond;
    }

    private void set( int hour, int minute , int second , int millisecond){
        m_hour=hour;
        m_minute=minute;
        m_second=second;
        m_millisecond=millisecond;
    }

    public Time(){
        Calendar now = Calendar.getInstance();

        set(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND), now.get(Calendar.MILLISECOND));
    }

    public String toShortTimeString(){
        return String.format("%02d:%02d" ,m_hour,m_minute);
    }


    public String toString() {
        return String.format("%s:%02d" , toShortTimeString() , m_second);
    }

    public String toLongTimeString(){
        return String.format("%s:%04d" , toString(),m_millisecond);
    }

}
