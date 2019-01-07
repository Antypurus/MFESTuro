package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DateFactory extends Date implements EvaluatePP {

  public static class DateFactory_sentinel extends Date_sentinel {
    public static final int create_date = 0;
    public static final int DateFactory = 1;
    public static final int toString = 2;
    public static final int Date = 3;
    public static final int getDay = 4;
    public static final int getMonth = 5;
    public static final int getYear = 6;
    public static final int compare = 7;
    public static final int getText = 8;
    public static final int daysSinceStart = 9;
    public static final int daysToDate = 10;
    public static final int getNextDay = 11;
    public static final int getDatesTo = 12;
    public final int function_sum = 13;

    public DateFactory_sentinel() {}

    public DateFactory_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static volatile VDMMap dates = MapUtil.map();
  public volatile Sentinel sentinel;

  public static Date create_date(final Number t_day, final Number t_month, final Number t_year) {

    if (SetUtil.subset(
        SetUtil.set(Tuple.mk_(t_day, t_month, t_year)),
        MapUtil.dom(Utils.copy(DateFactory.dates)))) {
      return ((Date) Utils.get(dates, Tuple.mk_(t_day, t_month, t_year)));

    } else {
      Date dt = new Date(t_day, t_month, t_year);
      dates =
          MapUtil.munion(
              Utils.copy(DateFactory.dates),
              MapUtil.map(new Maplet(Tuple.mk_(t_day, t_month, t_year), dt)));
      return ((Date) Utils.get(dates, Tuple.mk_(t_day, t_month, t_year)));
    }
  }

  public DateFactory() {

    sentinel = new DateFactory_sentinel(this);
  }

  public String toString() {

    return "DateFactory{" + "dates := " + Utils.toString(dates) + "}";
  }

  public Boolean evaluatePP(final Number fnr) {

    if (Utils.equals(fnr, 0L)) {
      return true;

    } else if (Utils.equals(fnr, 1L)) {
      return true;

    } else if (Utils.equals(fnr, 2L)) {
      return true;

    } else if (Utils.equals(fnr, 3L)) {
      return true;

    } else if (Utils.equals(fnr, 4L)) {
      return true;

    } else if (Utils.equals(fnr, 5L)) {
      return true;

    } else if (Utils.equals(fnr, 6L)) {
      return true;

    } else if (Utils.equals(fnr, 7L)) {
      return true;

    } else if (Utils.equals(fnr, 8L)) {
      return true;

    } else if (Utils.equals(fnr, 9L)) {
      return true;

    } else if (Utils.equals(fnr, 10L)) {
      return true;

    } else if (Utils.equals(fnr, 11L)) {
      return true;

    } else if (Utils.equals(fnr, 12L)) {
      return true;

    } else if (Utils.equals(fnr, 13L)) {
      return true;

    } else {
      return true;
    }
  }
}
