package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Lister extends User implements EvaluatePP {

  public static class Lister_sentinel extends User_sentinel {
    public static final int Lister = 0;
    public static final int getPaymentMethod = 1;
    public static final int setPaymentMethod = 2;
    public static final int toString = 3;
    public static final int getUsername = 4;
    public static final int getEmail = 5;
    public static final int getName = 6;
    public static final int verifyLogin = 7;
    public static final int getInbox = 8;
    public static final int getRequests = 9;
    public static final int addRequest = 10;
    public static final int addReview = 11;
    public static final int getReviews = 12;
    public static final int User = 13;
    public final int function_sum = 14;

    public Lister_sentinel() {}

    public Lister_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile Object PaymentMethod;
  public volatile Sentinel sentinel;

  public void cg_init_Lister_1(
      final String m_username,
      final String m_password,
      final String m_email,
      final String m_name,
      final Object m_pay_type) {

    sentinel = new Lister_sentinel(this);
    username = m_username;
    password = m_password;
    email = m_email;
    name = m_name;
    PaymentMethod = m_pay_type;
    return;
  }

  public Lister(
      final String m_username,
      final String m_password,
      final String m_email,
      final String m_name,
      final Object m_pay_type) {

    cg_init_Lister_1(m_username, m_password, m_email, m_name, m_pay_type);
  }

  public Object getPaymentMethod() {

    sentinel.entering(((Lister_sentinel) sentinel).getPaymentMethod);
    try {
      return this.PaymentMethod;

    } finally {
      sentinel.leaving(((Lister_sentinel) sentinel).getPaymentMethod);
    }
  }

  public void setPaymentMethod(final Object pay_method) {

    sentinel.entering(((Lister_sentinel) sentinel).setPaymentMethod);
    try {
      PaymentMethod = pay_method;
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Lister_sentinel) sentinel).setPaymentMethod);
    }
  }

  public Lister() {

    sentinel = new Lister_sentinel(this);
  }

  public String toString() {

    return "Lister{" + "PaymentMethod := " + Utils.toString(PaymentMethod) + "}";
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
