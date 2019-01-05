package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class InstantBookCancellationNotification extends Notification implements EvaluatePP {

  public static class InstantBookCancellationNotification_sentinel extends Notification_sentinel {
    public static final int InstantBookCancellationNotification = 0;
    public static final int toString = 1;
    public static final int getNotificationText = 2;
    public static final int getNotificationDate = 3;
    public static final int wasViewed = 4;
    public static final int setAsViewed = 5;
    public static final int Notification = 6;
    public final int function_sum = 7;

    public InstantBookCancellationNotification_sentinel() {}

    public InstantBookCancellationNotification_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String base_string_1 = " has cancelled his instant book of the car ";
  public volatile Sentinel sentinel;

  public void cg_init_InstantBookCancellationNotification_1(
      final Date t_date, final User t_user, final Car t_car) {

    sentinel = new InstantBookCancellationNotification_sentinel(this);
    notificationText =
        ":"
            + t_user.getName()
            + InstantBookCancellationNotification.base_string_1
            + t_car.getName();
    date = t_date;
    return;
  }

  public InstantBookCancellationNotification(
      final Date t_date, final User t_user, final Car t_car) {

    cg_init_InstantBookCancellationNotification_1(t_date, t_user, t_car);
  }

  public InstantBookCancellationNotification() {

    sentinel = new InstantBookCancellationNotification_sentinel(this);
  }

  public String toString() {

    return "InstantBookCancellationNotification{"
        + "base_string_1 = "
        + Utils.toString(base_string_1)
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
