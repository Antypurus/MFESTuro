package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Notification implements EvaluatePP {

  public static class Notification_sentinel extends Sentinel {
    public static final int getNotificationText = 0;
    public static final int getNotificationDate = 1;
    public static final int wasViewed = 2;
    public static final int setAsViewed = 3;
    public static final int Notification = 4;
    public static final int toString = 5;
    public final int function_sum = 6;

    public Notification_sentinel() {}

    public Notification_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  protected volatile String notificationText = "";
  protected volatile Date date;
  protected volatile Boolean viewed = false;
  public volatile Sentinel sentinel;

  public String getNotificationText() {

    sentinel.entering(((Notification_sentinel) sentinel).getNotificationText);
    try {
      return this.notificationText;

    } finally {
      sentinel.leaving(((Notification_sentinel) sentinel).getNotificationText);
    }
  }

  public Date getNotificationDate() {

    sentinel.entering(((Notification_sentinel) sentinel).getNotificationDate);
    try {
      return this.date;

    } finally {
      sentinel.leaving(((Notification_sentinel) sentinel).getNotificationDate);
    }
  }

  public Boolean wasViewed() {

    sentinel.entering(((Notification_sentinel) sentinel).wasViewed);
    try {
      return this.viewed;

    } finally {
      sentinel.leaving(((Notification_sentinel) sentinel).wasViewed);
    }
  }

  public void setAsViewed() {

    sentinel.entering(((Notification_sentinel) sentinel).setAsViewed);
    try {
      viewed = true;
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Notification_sentinel) sentinel).setAsViewed);
    }
  }

  public Notification() {

    sentinel = new Notification_sentinel(this);
  }

  public String toString() {

    return "Notification{"
        + "notificationText := "
        + Utils.toString(notificationText)
        + ", date := "
        + Utils.toString(date)
        + ", viewed := "
        + Utils.toString(viewed)
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

    } else {
      return true;
    }
  }
}
