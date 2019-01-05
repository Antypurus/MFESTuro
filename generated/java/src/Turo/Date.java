package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Date implements EvaluatePP {

  public static class Date_sentinel extends Sentinel {
    public static final int Date = 0;
    public static final int getDay = 1;
    public static final int getMonth = 2;
    public static final int getYear = 3;
    public static final int compare = 4;
    public static final int getText = 5;
    public static final int daysSinceStart = 6;
    public static final int daysToDate = 7;
    public static final int getNextDay = 8;
    public static final int getDatesTo = 9;
    public static final int toString = 10;
    public final int function_sum = 11;

    public Date_sentinel() {}

    public Date_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final Number days_in_month = 30L;
  private static final Number months_in_year = 12L;
  private static final Number day_in_year =
      Date.days_in_month.longValue() * Date.months_in_year.longValue();
  private volatile Number year = 0L;
  private volatile Number month = 0L;
  private volatile Number day = 0L;
  public volatile Sentinel sentinel;

  protected void cg_init_Date_1(final Number t_day, final Number t_month, final Number t_year) {

    sentinel = new Date_sentinel(this);
    year = t_year;
    month = t_month;
    day = t_day;
    return;
  }

  protected Date(final Number t_day, final Number t_month, final Number t_year) {

    cg_init_Date_1(t_day, t_month, t_year);
  }

  public Number getDay() {

    sentinel.entering(((Date_sentinel) sentinel).getDay);
    try {
      return this.day;

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).getDay);
    }
  }

  public Number getMonth() {

    sentinel.entering(((Date_sentinel) sentinel).getMonth);
    try {
      return this.month;

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).getMonth);
    }
  }

  public Number getYear() {

    sentinel.entering(((Date_sentinel) sentinel).getYear);
    try {
      return this.year;

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).getYear);
    }
  }

  public Boolean compare(final Date d2) {

    sentinel.entering(((Date_sentinel) sentinel).compare);
    try {
      Boolean andResult_15 = false;

      if (Utils.equals(d2.day, this.day)) {
        Boolean andResult_16 = false;

        if (Utils.equals(d2.month, this.month)) {
          if (Utils.equals(d2.year, this.year)) {
            andResult_16 = true;
          }
        }

        if (andResult_16) {
          andResult_15 = true;
        }
      }

      return andResult_15;

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).compare);
    }
  }

  public String getText() {

    sentinel.entering(((Date_sentinel) sentinel).getText);
    try {
      String ret = "";
      return ret;

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).getText);
    }
  }

  public Number daysSinceStart() {

    sentinel.entering(((Date_sentinel) sentinel).daysSinceStart);
    try {
      return this.day.longValue()
          + this.month.longValue() * Date.days_in_month.longValue()
          + this.year.longValue() * Date.day_in_year.longValue();

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).daysSinceStart);
    }
  }

  public Number daysToDate(final Date t_date) {

    sentinel.entering(((Date_sentinel) sentinel).daysToDate);
    try {
      return t_date.daysSinceStart().longValue() - this.daysSinceStart().longValue();

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).daysToDate);
    }
  }

  public Date getNextDay() {

    sentinel.entering(((Date_sentinel) sentinel).getNextDay);
    try {
      Number n_day = this.day.longValue() + 1L;
      Number n_month = this.month;
      Number n_year = this.year;
      DateFactory fac = new DateFactory();
      if (n_day.longValue() > Date.days_in_month.longValue()) {
        n_day = 1L;
        n_month = n_month.longValue() + 1L;
      }

      if (n_month.longValue() > Date.months_in_year.longValue()) {
        n_month = 1L;
        n_year = n_year.longValue() + 1L;
      }

      return fac.create_date(n_day, n_month, n_year);

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).getNextDay);
    }
  }

  public VDMSet getDatesTo(final Date t_end_date) {

    sentinel.entering(((Date_sentinel) sentinel).getDatesTo);
    try {
      Date curr_date = this;
      VDMSet wanted_dates = SetUtil.set(this);
      Number date_diff = this.daysToDate(t_end_date);
      long toVar_1 = date_diff.longValue();
      long byVar_1 = 1L;
      for (Long i = 2L; byVar_1 < 0 ? i >= toVar_1 : i <= toVar_1; i += byVar_1) {
        curr_date = curr_date.getNextDay();
        wanted_dates = SetUtil.union(Utils.copy(wanted_dates), SetUtil.set(curr_date));
      }
      return Utils.copy(wanted_dates);

    } finally {
      sentinel.leaving(((Date_sentinel) sentinel).getDatesTo);
    }
  }

  public Date() {

    sentinel = new Date_sentinel(this);
  }

  public String toString() {

    return "Date{"
        + "days_in_month = "
        + Utils.toString(days_in_month)
        + ", months_in_year = "
        + Utils.toString(months_in_year)
        + ", day_in_year = "
        + Utils.toString(day_in_year)
        + ", year := "
        + Utils.toString(year)
        + ", month := "
        + Utils.toString(month)
        + ", day := "
        + Utils.toString(day)
        + "}";
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

    } else {
      return true;
    }
  }
}
