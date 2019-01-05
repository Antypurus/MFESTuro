package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class User implements EvaluatePP {

  public static class User_sentinel extends Sentinel {
    public static final int getUsername = 0;
    public static final int getEmail = 1;
    public static final int getName = 2;
    public static final int verifyLogin = 3;
    public static final int getInbox = 4;
    public static final int getRequests = 5;
    public static final int addRequest = 6;
    public static final int addReview = 7;
    public static final int getReviews = 8;
    public static final int User = 9;
    public static final int toString = 10;
    public final int function_sum = 11;

    public User_sentinel() {}

    public User_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  protected volatile String username = "";
  protected volatile String password = "";
  protected volatile String email = "";
  protected volatile String name = "";
  private volatile Inbox notifications = new Inbox();
  private volatile VDMSet requests = SetUtil.set();
  private volatile VDMSet reviews = SetUtil.set();
  public volatile Sentinel sentinel;

  public String getUsername() {

    sentinel.entering(((User_sentinel) sentinel).getUsername);
    try {
      return this.username;

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).getUsername);
    }
  }

  public String getEmail() {

    sentinel.entering(((User_sentinel) sentinel).getEmail);
    try {
      return this.email;

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).getEmail);
    }
  }

  public String getName() {

    sentinel.entering(((User_sentinel) sentinel).getName);
    try {
      return this.name;

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).getName);
    }
  }

  public Boolean verifyLogin(final String pass) {

    sentinel.entering(((User_sentinel) sentinel).verifyLogin);
    try {
      return Utils.equals(pass, this.password);

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).verifyLogin);
    }
  }

  public Inbox getInbox() {

    sentinel.entering(((User_sentinel) sentinel).getInbox);
    try {
      return this.notifications;

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).getInbox);
    }
  }

  public VDMSet getRequests() {

    sentinel.entering(((User_sentinel) sentinel).getRequests);
    try {
      return this.requests;

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).getRequests);
    }
  }

  public void addRequest(final BookingRequest t_request) {

    sentinel.entering(((User_sentinel) sentinel).addRequest);
    try {
      requests = SetUtil.union(Utils.copy(requests), SetUtil.set(t_request));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).addRequest);
    }
  }

  public void addReview(final Review t_review) {

    sentinel.entering(((User_sentinel) sentinel).addReview);
    try {
      reviews = SetUtil.union(Utils.copy(reviews), SetUtil.set(t_review));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).addReview);
    }
  }

  public VDMSet getReviews() {

    sentinel.entering(((User_sentinel) sentinel).getReviews);
    try {
      return this.reviews;

    } finally {
      sentinel.leaving(((User_sentinel) sentinel).getReviews);
    }
  }

  public User() {

    sentinel = new User_sentinel(this);
  }

  public String toString() {

    return "User{"
        + "username := "
        + Utils.toString(username)
        + ", password := "
        + Utils.toString(password)
        + ", email := "
        + Utils.toString(email)
        + ", name := "
        + Utils.toString(name)
        + ", notifications := "
        + Utils.toString(notifications)
        + ", requests := "
        + Utils.toString(requests)
        + ", reviews := "
        + Utils.toString(reviews)
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
