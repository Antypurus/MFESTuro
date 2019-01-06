package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Booking implements EvaluatePP {

  public static class Booking_sentinel extends Sentinel {
    public static final int Booking = 0;
    public static final int cancel = 1;
    public static final int getRenter = 2;
    public static final int getListing = 3;
    public static final int getStartDate = 4;
    public static final int getEndDate = 5;
    public static final int isActive = 6;
    public static final int getTotalPrice = 7;
    public static final int toString = 8;
    public final int function_sum = 9;

    public Booking_sentinel() {}

    public Booking_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile Renter renter;
  private volatile Listing listing;
  private volatile Date start_date;
  private volatile Date end_date;
  private volatile Boolean active = true;
  private volatile VDMSet extras = SetUtil.set();
  public volatile Sentinel sentinel;

  public void cg_init_Booking_1(
      final Renter t_renter,
      final Listing t_listing,
      final Date t_start_date,
      final Date t_end_date,
      final VDMSet t_extras) {

    sentinel = new Booking_sentinel(this);
    renter = t_renter;
    listing = t_listing;
    start_date = t_start_date;
    end_date = t_end_date;
    extras = Utils.copy(t_extras);
    return;
  }

  public Booking(
      final Renter t_renter,
      final Listing t_listing,
      final Date t_start_date,
      final Date t_end_date,
      final VDMSet t_extras) {

    cg_init_Booking_1(t_renter, t_listing, t_start_date, t_end_date, Utils.copy(t_extras));
  }

  public Boolean cancel(final User t_user, final Date t_curr_date) {

    sentinel.entering(((Booking_sentinel) sentinel).cancel);
    try {
      VDMSet wanted_dates = start_date.getDatesTo(end_date);
      Boolean andResult_12 = false;

      if (Utils.equals(t_user.getUsername(), renter.getUsername())) {
        Boolean andResult_13 = false;

        if (t_curr_date.daysSinceStart().longValue() < start_date.daysSinceStart().longValue()) {
          if (active) {
            andResult_13 = true;
          }
        }

        if (andResult_13) {
          andResult_12 = true;
        }
      }

      if (andResult_12) {
        listing.getAvailableDates().addDates(Utils.copy(wanted_dates));
        active = false;
        sentinel.stateChanged();

        return true;

      } else {
        return false;
      }

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).cancel);
    }
  }

  public Renter getRenter() {

    sentinel.entering(((Booking_sentinel) sentinel).getRenter);
    try {
      return this.renter;

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).getRenter);
    }
  }

  public Listing getListing() {

    sentinel.entering(((Booking_sentinel) sentinel).getListing);
    try {
      return this.listing;

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).getListing);
    }
  }

  public Date getStartDate() {

    sentinel.entering(((Booking_sentinel) sentinel).getStartDate);
    try {
      return this.start_date;

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).getStartDate);
    }
  }

  public Date getEndDate() {

    sentinel.entering(((Booking_sentinel) sentinel).getEndDate);
    try {
      return this.end_date;

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).getEndDate);
    }
  }

  public Boolean isActive() {

    sentinel.entering(((Booking_sentinel) sentinel).isActive);
    try {
      return this.active;

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).isActive);
    }
  }

  public Number getTotalPrice() {

    sentinel.entering(((Booking_sentinel) sentinel).getTotalPrice);
    try {
      Number total = 0.0;
      total = total.doubleValue() + listing.getCar().getPricePerDay().doubleValue();
      for (Iterator iterator_12 = extras.iterator(); iterator_12.hasNext(); ) {
        Extra extra = (Extra) iterator_12.next();
        total = total.doubleValue() + extra.getCost().doubleValue();
      }
      return total;

    } finally {
      sentinel.leaving(((Booking_sentinel) sentinel).getTotalPrice);
    }
  }

  public Booking() {

    sentinel = new Booking_sentinel(this);
  }

  public String toString() {

    return "Booking{"
        + "renter := "
        + Utils.toString(renter)
        + ", listing := "
        + Utils.toString(listing)
        + ", start_date := "
        + Utils.toString(start_date)
        + ", end_date := "
        + Utils.toString(end_date)
        + ", active := "
        + Utils.toString(active)
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

    } else if (Utils.equals(fnr, 7L)) {
      return true;

    } else if (Utils.equals(fnr, 8L)) {
      return true;

    } else {
      return true;
    }
  }
}
