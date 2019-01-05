package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BookingRequest implements EvaluatePP {

  public static class BookingRequest_sentinel extends Sentinel {
    public static final int BookingRequest = 0;
    public static final int confirm = 1;
    public static final int decline = 2;
    public static final int cancel = 3;
    public static final int getRenter = 4;
    public static final int getListing = 5;
    public static final int getStartDate = 6;
    public static final int getEndDate = 7;
    public static final int isActive = 8;
    public static final int getTotalPrice = 9;
    public static final int toString = 10;
    public final int function_sum = 11;

    public BookingRequest_sentinel() {}

    public BookingRequest_sentinel(final EvaluatePP instance) {

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

  public void cg_init_BookingRequest_1(
      final Renter t_renter,
      final Listing t_listing,
      final Date t_start_date,
      final Date t_end_date,
      final VDMSet t_extras) {

    sentinel = new BookingRequest_sentinel(this);
    renter = t_renter;
    listing = t_listing;
    start_date = t_start_date;
    end_date = t_end_date;
    extras = Utils.copy(t_extras);
    return;
  }

  public BookingRequest(
      final Renter t_renter,
      final Listing t_listing,
      final Date t_start_date,
      final Date t_end_date,
      final VDMSet t_extras) {

    cg_init_BookingRequest_1(t_renter, t_listing, t_start_date, t_end_date, Utils.copy(t_extras));
  }

  public Boolean confirm(final User t_user, final Date t_curr_date) {

    sentinel.entering(((BookingRequest_sentinel) sentinel).confirm);
    try {
      VDMSet wanted_dates = start_date.getDatesTo(end_date);
      Boolean andResult_4 = false;

      if (Utils.equals(t_user.getUsername(), listing.getLister().getUsername())) {
        Boolean andResult_5 = false;

        if (t_curr_date.daysSinceStart().longValue() < start_date.daysSinceStart().longValue()) {
          if (active) {
            andResult_5 = true;
          }
        }

        if (andResult_5) {
          andResult_4 = true;
        }
      }

      if (andResult_4) {
        listing.getAvailableDates().removeDates(Utils.copy(wanted_dates));
        active = false;
        sentinel.stateChanged();

        renter.addBooking(new Booking(renter, listing, start_date, end_date, Utils.copy(extras)));
        return true;

      } else {
        return false;
      }

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).confirm);
    }
  }

  public Boolean decline(final User t_user, final Date t_curr_date) {

    sentinel.entering(((BookingRequest_sentinel) sentinel).decline);
    try {
      Boolean andResult_6 = false;

      if (Utils.equals(t_user.getUsername(), listing.getLister().getUsername())) {
        Boolean andResult_7 = false;

        if (t_curr_date.daysSinceStart().longValue() < start_date.daysSinceStart().longValue()) {
          if (active) {
            andResult_7 = true;
          }
        }

        if (andResult_7) {
          andResult_6 = true;
        }
      }

      if (andResult_6) {
        active = false;
        sentinel.stateChanged();

        return true;

      } else {
        return false;
      }

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).decline);
    }
  }

  public Boolean cancel(final User t_user, final Date t_curr_date) {

    sentinel.entering(((BookingRequest_sentinel) sentinel).cancel);
    try {
      Boolean andResult_8 = false;

      if (Utils.equals(t_user.getUsername(), renter.getUsername())) {
        Boolean andResult_9 = false;

        if (t_curr_date.daysSinceStart().longValue() < start_date.daysSinceStart().longValue()) {
          if (active) {
            andResult_9 = true;
          }
        }

        if (andResult_9) {
          andResult_8 = true;
        }
      }

      if (andResult_8) {
        active = false;
        sentinel.stateChanged();

        return true;

      } else {
        return false;
      }

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).cancel);
    }
  }

  public Renter getRenter() {

    sentinel.entering(((BookingRequest_sentinel) sentinel).getRenter);
    try {
      return this.renter;

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).getRenter);
    }
  }

  public Listing getListing() {

    sentinel.entering(((BookingRequest_sentinel) sentinel).getListing);
    try {
      return this.listing;

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).getListing);
    }
  }

  public Date getStartDate() {

    sentinel.entering(((BookingRequest_sentinel) sentinel).getStartDate);
    try {
      return this.start_date;

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).getStartDate);
    }
  }

  public Date getEndDate() {

    sentinel.entering(((BookingRequest_sentinel) sentinel).getEndDate);
    try {
      return this.end_date;

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).getEndDate);
    }
  }

  public Boolean isActive() {

    sentinel.entering(((BookingRequest_sentinel) sentinel).isActive);
    try {
      return this.active;

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).isActive);
    }
  }

  public Number getTotalPrice() {

    sentinel.entering(((BookingRequest_sentinel) sentinel).getTotalPrice);
    try {
      Number total = 0.0;
      total = total.doubleValue() + listing.getCar().getPricePerDay().doubleValue();
      for (Iterator iterator_5 = extras.iterator(); iterator_5.hasNext(); ) {
        Extra extra = (Extra) iterator_5.next();
        total = total.doubleValue() + extra.getCost().doubleValue();
      }
      return total;

    } finally {
      sentinel.leaving(((BookingRequest_sentinel) sentinel).getTotalPrice);
    }
  }

  public BookingRequest() {

    sentinel = new BookingRequest_sentinel(this);
  }

  public String toString() {

    return "BookingRequest{"
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

    } else if (Utils.equals(fnr, 9L)) {
      return true;

    } else if (Utils.equals(fnr, 10L)) {
      return true;

    } else {
      return true;
    }
  }
}
