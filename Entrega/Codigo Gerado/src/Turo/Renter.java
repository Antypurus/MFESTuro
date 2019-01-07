package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Renter extends User implements EvaluatePP {

  public static class Renter_sentinel extends User_sentinel {
    public static final int Renter = 0;
    public static final int getPaymentMethod = 1;
    public static final int setPaymentMethod = 2;
    public static final int getInsuranceScore = 3;
    public static final int getDriversLicenceID = 4;
    public static final int getPassportID = 5;
    public static final int getBookings = 6;
    public static final int addBooking = 7;
    public static final int toString = 8;
    public static final int getUsername = 9;
    public static final int getEmail = 10;
    public static final int getName = 11;
    public static final int verifyLogin = 12;
    public static final int getInbox = 13;
    public static final int getRequests = 14;
    public static final int addRequest = 15;
    public static final int addReview = 16;
    public static final int getReviews = 17;
    public static final int User = 18;
    public final int function_sum = 19;

    public Renter_sentinel() {}

    public Renter_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile Number insuranceScore = 0L;
  private volatile Number driversLicenceID = 0L;
  private volatile Number passportId = 0L;
  private volatile Object PaymentMethod;
  private volatile VDMSet bookings = SetUtil.set();
  public volatile Sentinel sentinel;

  public void cg_init_Renter_1(
      final String m_username,
      final String m_password,
      final String m_email,
      final String m_name,
      final Number m_insurance_score,
      final Number m_drivers_licence,
      final Number m_passport,
      final Object m_pay_type) {

    sentinel = new Renter_sentinel(this);
    username = m_username;
    password = m_password;
    email = m_email;
    name = m_name;
    PaymentMethod = m_pay_type;
    insuranceScore = m_insurance_score;
    driversLicenceID = m_drivers_licence;
    passportId = m_passport;
    return;
  }

  public Renter(
      final String m_username,
      final String m_password,
      final String m_email,
      final String m_name,
      final Number m_insurance_score,
      final Number m_drivers_licence,
      final Number m_passport,
      final Object m_pay_type) {

    cg_init_Renter_1(
        m_username,
        m_password,
        m_email,
        m_name,
        m_insurance_score,
        m_drivers_licence,
        m_passport,
        m_pay_type);
  }

  public Object getPaymentMethod() {

    sentinel.entering(((Renter_sentinel) sentinel).getPaymentMethod);
    try {
      return this.PaymentMethod;

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).getPaymentMethod);
    }
  }

  public void setPaymentMethod(final Object pay_method) {

    sentinel.entering(((Renter_sentinel) sentinel).setPaymentMethod);
    try {
      PaymentMethod = pay_method;
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).setPaymentMethod);
    }
  }

  public Number getInsuranceScore() {

    sentinel.entering(((Renter_sentinel) sentinel).getInsuranceScore);
    try {
      return this.insuranceScore;

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).getInsuranceScore);
    }
  }

  public Number getDriversLicenceID() {

    sentinel.entering(((Renter_sentinel) sentinel).getDriversLicenceID);
    try {
      return this.driversLicenceID;

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).getDriversLicenceID);
    }
  }

  public Number getPassportID() {

    sentinel.entering(((Renter_sentinel) sentinel).getPassportID);
    try {
      return this.passportId;

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).getPassportID);
    }
  }

  public VDMSet getBookings() {

    sentinel.entering(((Renter_sentinel) sentinel).getBookings);
    try {
      return this.bookings;

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).getBookings);
    }
  }

  public void addBooking(final Booking t_booking) {

    sentinel.entering(((Renter_sentinel) sentinel).addBooking);
    try {
      bookings = SetUtil.union(Utils.copy(bookings), SetUtil.set(t_booking));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Renter_sentinel) sentinel).addBooking);
    }
  }

  public Renter() {

    sentinel = new Renter_sentinel(this);
  }

  public String toString() {

    return "Renter{"
        + "insuranceScore := "
        + Utils.toString(insuranceScore)
        + ", driversLicenceID := "
        + Utils.toString(driversLicenceID)
        + ", passportId := "
        + Utils.toString(passportId)
        + ", PaymentMethod := "
        + Utils.toString(PaymentMethod)
        + ", bookings := "
        + Utils.toString(bookings)
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

    } else if (Utils.equals(fnr, 11L)) {
      return true;

    } else if (Utils.equals(fnr, 12L)) {
      return true;

    } else if (Utils.equals(fnr, 13L)) {
      return true;

    } else if (Utils.equals(fnr, 14L)) {
      return true;

    } else if (Utils.equals(fnr, 15L)) {
      return true;

    } else if (Utils.equals(fnr, 16L)) {
      return true;

    } else if (Utils.equals(fnr, 17L)) {
      return true;

    } else if (Utils.equals(fnr, 18L)) {
      return true;

    } else {
      return true;
    }
  }
}
