package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Inbox implements EvaluatePP {

  public static class Inbox_sentinel extends Sentinel {
    public static final int getAllNotifications = 0;
    public static final int getNotViewedNotifications = 1;
    public static final int viewNotifications = 2;
    public static final int registerNotification = 3;
    public static final int Inbox = 4;
    public static final int toString = 5;
    public final int function_sum = 6;

    public Inbox_sentinel() {}

    public Inbox_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile VDMSet notifications = SetUtil.set();
  public volatile Sentinel sentinel;

  public VDMSet getAllNotifications() {

    sentinel.entering(((Inbox_sentinel) sentinel).getAllNotifications);
    try {
      return this.notifications;

    } finally {
      sentinel.leaving(((Inbox_sentinel) sentinel).getAllNotifications);
    }
  }

  public VDMSet getNotViewedNotifications() {

    sentinel.entering(((Inbox_sentinel) sentinel).getNotViewedNotifications);
    try {
      VDMSet retNotifications = SetUtil.set();
      for (Iterator iterator_6 = retNotifications.iterator(); iterator_6.hasNext(); ) {
        Notification notification = (Notification) iterator_6.next();
        if (Utils.equals(notification.wasViewed(), false)) {
          retNotifications = SetUtil.union(Utils.copy(retNotifications), SetUtil.set(notification));
        }
      }
      return Utils.copy(retNotifications);

    } finally {
      sentinel.leaving(((Inbox_sentinel) sentinel).getNotViewedNotifications);
    }
  }

  public VDMSet viewNotifications() {

    sentinel.entering(((Inbox_sentinel) sentinel).viewNotifications);
    try {
      for (Iterator iterator_7 = notifications.iterator(); iterator_7.hasNext(); ) {
        Notification notification = (Notification) iterator_7.next();
        notification.setAsViewed();
      }
      return this.notifications;

    } finally {
      sentinel.leaving(((Inbox_sentinel) sentinel).viewNotifications);
    }
  }

  public void registerNotification(final Notification t_notification) {

    sentinel.entering(((Inbox_sentinel) sentinel).registerNotification);
    try {
      notifications = SetUtil.union(Utils.copy(notifications), SetUtil.set(t_notification));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Inbox_sentinel) sentinel).registerNotification);
    }
  }

  public Inbox() {

    sentinel = new Inbox_sentinel(this);
  }

  public String toString() {

    return "Inbox{" + "notifications := " + Utils.toString(notifications) + "}";
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
