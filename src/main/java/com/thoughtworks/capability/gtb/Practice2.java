package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {
  private final static int NEXT_WORKDAY_NEAR_FRIDAY = 3;
  private final static int NEXT_WORKDAY_NEAR_SATURDAY = 2;
  private final static int NEXT_WORKDAY = 1;

  public static LocalDate getNextWorkDate(LocalDate date) {
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    int dayToAdd = NEXT_WORKDAY;
    if(dayOfWeek == DayOfWeek.FRIDAY) {
      dayToAdd = NEXT_WORKDAY_NEAR_FRIDAY;
    }
    if(dayOfWeek == DayOfWeek.SATURDAY) {
      dayToAdd = NEXT_WORKDAY_NEAR_SATURDAY;
    }
    return date.plusDays(dayToAdd);
  }
}
