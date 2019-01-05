package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class InstantBookNotification extends Notification implements EvaluatePP {

  public static class InstantBookNotification_sentinel extends Notification_sentinel {
    public static final int InstantBookNotification = 0;
    public static final int toString = 1;
    public static final int getNotificationText = 2;
    public static final int getNotificationDate = 3;
    public static final int wasViewed = 4;
    public static final int setAsViewed = 5;
    public static final int Notification = 6;
    public final int function_sum = 7;

    public InstantBookNotification_sentinel() {}

    public InstantBookNotification_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String base_string_1 = " has instantly booked the car ";
  private static final String base_string_2 = " on the days:";
  private volatile VDMSet extras = SetUtil.set();
  public volatile Sentinel sentinel;

  public void cg_init_InstantBookNotification_1(
      final Date t_date,
      final User t_user,
      final Car t_car,
      final VDMSet t_dates,
      final VDMSet t_extras) {

    sentinel = new InstantBookNotification_sentinel(this);
    notificationText =
        ":"
            + t_user.getName()
            + InstantBookNotification.base_string_1
            + t_car.getName()
            + InstantBookNotification.base_string_2;
    date = t_date;
    return;
  }

  public InstantBookNotification(
      final Date t_date,
      final User t_user,
      final Car t_car,
      final VDMSet t_dates,
      final VDMSet t_extras) {

    cg_init_InstantBookNotification_1(
        t_date, t_user, t_car, Utils.copy(t_dates), Utils.copy(t_extras));
  }

  public InstantBookNotification() {

    sentinel = new InstantBookNotification_sentinel(this);
  }

  public String toString() {

    return "InstantBookNotification{"
        + "base_string_1 = "
        + Utils.toString(base_string_1)
        + ", base_string_2 = "
        + Utils.toString(base_string_2)
        + ", extras := "
        + Utils.toString(extras)
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

    } else {
      return true;
    }
  }
}
