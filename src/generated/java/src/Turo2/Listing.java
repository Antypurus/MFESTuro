package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Listing implements EvaluatePP {

  public static class Listing_sentinel extends Sentinel {
    public static final int Listing = 0;
    public static final int getLocation = 1;
    public static final int getDeliveryOptions = 2;
    public static final int getProtectionPlan = 3;
    public static final int getGuidelines = 4;
    public static final int getParkingDetails = 5;
    public static final int getFAQS = 6;
    public static final int getCar = 7;
    public static final int getAvailableDates = 8;
    public static final int getLister = 9;
    public static final int getExtras = 10;
    public static final int requestBooking = 11;
    public static final int instantBook = 12;
    public static final int toString = 13;
    public final int function_sum = 14;

    public Listing_sentinel() {}

    public Listing_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile Location location;
  private volatile DeliveryOptions develiveryOptions;
  private volatile ProtectionPlan protectionPlan;
  private volatile String guidelines = "";
  private volatile String parkingDetails = "";
  private volatile String faqs = "";
  private volatile Car car;
  private volatile AvailabilityCalendar availableDates;
  private volatile Boolean hasInstantBook = false;
  private volatile Lister Lister;
  private volatile VDMSet extras = SetUtil.set();
  public volatile Sentinel sentinel;

  public void cg_init_Listing_1(
      final Location t_location,
      final DeliveryOptions t_options,
      final ProtectionPlan t_plan,
      final String t_guidelines,
      final String t_park_details,
      final String t_faqs,
      final Car t_car,
      final AvailabilityCalendar t_dates,
      final Boolean t_instant_book,
      final Lister t_owner,
      final VDMSet t_extras) {

    sentinel = new Listing_sentinel(this);
    location = t_location;
    develiveryOptions = t_options;
    protectionPlan = t_plan;
    guidelines = t_guidelines;
    parkingDetails = t_park_details;
    faqs = t_faqs;
    car = t_car;
    availableDates = t_dates;
    hasInstantBook = t_instant_book;
    Lister = t_owner;
    extras = Utils.copy(t_extras);
    return;
  }

  public Listing(
      final Location t_location,
      final DeliveryOptions t_options,
      final ProtectionPlan t_plan,
      final String t_guidelines,
      final String t_park_details,
      final String t_faqs,
      final Car t_car,
      final AvailabilityCalendar t_dates,
      final Boolean t_instant_book,
      final Lister t_owner,
      final VDMSet t_extras) {

    cg_init_Listing_1(
        t_location,
        t_options,
        t_plan,
        t_guidelines,
        t_park_details,
        t_faqs,
        t_car,
        t_dates,
        t_instant_book,
        t_owner,
        Utils.copy(t_extras));
  }

  public Location getLocation() {

    sentinel.entering(((Listing_sentinel) sentinel).getLocation);
    try {
      return this.location;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getLocation);
    }
  }

  public DeliveryOptions getDeliveryOptions() {

    sentinel.entering(((Listing_sentinel) sentinel).getDeliveryOptions);
    try {
      return this.develiveryOptions;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getDeliveryOptions);
    }
  }

  public ProtectionPlan getProtectionPlan() {

    sentinel.entering(((Listing_sentinel) sentinel).getProtectionPlan);
    try {
      return this.protectionPlan;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getProtectionPlan);
    }
  }

  public String getGuidelines() {

    sentinel.entering(((Listing_sentinel) sentinel).getGuidelines);
    try {
      return this.guidelines;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getGuidelines);
    }
  }

  public String getParkingDetails() {

    sentinel.entering(((Listing_sentinel) sentinel).getParkingDetails);
    try {
      return this.parkingDetails;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getParkingDetails);
    }
  }

  public String getFAQS() {

    sentinel.entering(((Listing_sentinel) sentinel).getFAQS);
    try {
      return this.faqs;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getFAQS);
    }
  }

  public Car getCar() {

    sentinel.entering(((Listing_sentinel) sentinel).getCar);
    try {
      return this.car;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getCar);
    }
  }

  public AvailabilityCalendar getAvailableDates() {

    sentinel.entering(((Listing_sentinel) sentinel).getAvailableDates);
    try {
      return this.availableDates;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getAvailableDates);
    }
  }

  public Lister getLister() {

    sentinel.entering(((Listing_sentinel) sentinel).getLister);
    try {
      return this.Lister;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getLister);
    }
  }

  public VDMSet getExtras() {

    sentinel.entering(((Listing_sentinel) sentinel).getExtras);
    try {
      return this.extras;

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).getExtras);
    }
  }

  public Boolean requestBooking(
      final Renter t_booker,
      final Date t_curr_date,
      final Date t_start_date,
      final Date t_end_date,
      final VDMSet t_extras) {

    sentinel.entering(((Listing_sentinel) sentinel).requestBooking);
    try {
      BookingRequest request =
          new BookingRequest(t_booker, this, t_start_date, t_end_date, Utils.copy(t_extras));
      VDMSet wanted_dates = t_start_date.getDatesTo(t_end_date);
      Notification notification =
          new BookingRequestNotification(
              t_curr_date,
              t_booker,
              this.car,
              Utils.copy(wanted_dates),
              Utils.copy(t_extras),
              request);
      Inbox inbox = this.Lister.getInbox();
      if (this.availableDates.availableThrough(t_start_date, t_end_date)) {
        inbox.registerNotification(notification);
        this.Lister.addRequest(request);
        t_booker.addRequest(request);
        return true;

      } else {
        return false;
      }

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).requestBooking);
    }
  }

  public Boolean instantBook(
      final Renter t_booker,
      final Date t_curr_date,
      final Date t_start_date,
      final Date t_end_date,
      final VDMSet t_extras) {

    sentinel.entering(((Listing_sentinel) sentinel).instantBook);
    try {
      Booking booking = new Booking(t_booker, this, t_start_date, t_end_date, Utils.copy(t_extras));
      VDMSet wanted_dates = t_start_date.getDatesTo(t_end_date);
      Notification notification =
          new InstantBookNotification(
              t_curr_date, t_booker, this.car, Utils.copy(wanted_dates), Utils.copy(t_extras));
      Inbox inbox = this.Lister.getInbox();
      if (this.availableDates.availableThrough(t_start_date, t_end_date)) {
        inbox.registerNotification(notification);
        availableDates.removeDates(Utils.copy(wanted_dates));
        t_booker.addBooking(booking);
        return true;

      } else {
        return false;
      }

    } finally {
      sentinel.leaving(((Listing_sentinel) sentinel).instantBook);
    }
  }

  public Listing() {

    sentinel = new Listing_sentinel(this);
  }

  public String toString() {

    return "Listing{"
        + "location := "
        + Utils.toString(location)
        + ", develiveryOptions := "
        + Utils.toString(develiveryOptions)
        + ", protectionPlan := "
        + Utils.toString(protectionPlan)
        + ", guidelines := "
        + Utils.toString(guidelines)
        + ", parkingDetails := "
        + Utils.toString(parkingDetails)
        + ", faqs := "
        + Utils.toString(faqs)
        + ", car := "
        + Utils.toString(car)
        + ", availableDates := "
        + Utils.toString(availableDates)
        + ", hasInstantBook := "
        + Utils.toString(hasInstantBook)
        + ", Lister := "
        + Utils.toString(Lister)
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
