package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BookingRequestNotification extends Notification implements EvaluatePP {

  public static class BookingRequestNotification_sentinel extends Notification_sentinel {
    public static final int BookingRequestNotification = 0;
    public static final int getRequest = 1;
    public static final int toString = 2;
    public static final int getNotificationText = 3;
    public static final int getNotificationDate = 4;
    public static final int wasViewed = 5;
    public static final int setAsViewed = 6;
    public static final int Notification = 7;
    public final int function_sum = 8;

    public BookingRequestNotification_sentinel() {}

    public BookingRequestNotification_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String base_string_1 = " has request to book the car ";
  private static final String base_string_2 = " on the following days:";
  private volatile VDMSet extras = SetUtil.set();
  private volatile BookingRequest request;
  public volatile Sentinel sentinel;

  public void cg_init_BookingRequestNotification_1(
      final Date t_date,
      final User t_user,
      final Car t_car,
      final VDMSet t_dates,
      final VDMSet t_extras,
      final BookingRequest t_request) {

    sentinel = new BookingRequestNotification_sentinel(this);
    notificationText =
        ":"
            + t_user.getName()
            + BookingRequestNotification.base_string_1
            + t_car.getName()
            + BookingRequestNotification.base_string_2;
    extras = Utils.copy(t_extras);
    request = t_request;
    date = t_date;
    return;
  }

  public BookingRequestNotification(
      final Date t_date,
      final User t_user,
      final Car t_car,
      final VDMSet t_dates,
      final VDMSet t_extras,
      final BookingRequest t_request) {

    cg_init_BookingRequestNotification_1(
        t_date, t_user, t_car, Utils.copy(t_dates), Utils.copy(t_extras), t_request);
  }

  public BookingRequest getRequest() {

    sentinel.entering(((BookingRequestNotification_sentinel) sentinel).getRequest);
    try {
      return this.request;

    } finally {
      sentinel.leaving(((BookingRequestNotification_sentinel) sentinel).getRequest);
    }
  }

  public BookingRequestNotification() {

    sentinel = new BookingRequestNotification_sentinel(this);
  }

  public String toString() {

    return "BookingRequestNotification{"
        + "base_string_1 = "
        + Utils.toString(base_string_1)
        + ", base_string_2 = "
        + Utils.toString(base_string_2)
        + ", extras := "
        + Utils.toString(extras)
        + ", request := "
        + Utils.toString(request)
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

    } else {
      return true;
    }
  }
}
