package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Turo implements EvaluatePP {

  public static class Turo_sentinel extends Sentinel {
    public static final int getUsers = 0;
    public static final int getListings = 1;
    public static final int registerListing = 2;
    public static final int removeListing = 3;
    public static final int registerLister = 4;
    public static final int registerRenter = 5;
    public static final int SearchListing = 6;
    public static final int Turo = 7;
    public static final int toString = 8;
    public final int function_sum = 9;

    public Turo_sentinel() {}

    public Turo_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile VDMSet Renters = SetUtil.set();
  private volatile VDMSet Listers = SetUtil.set();
  private volatile VDMSet users = SetUtil.set();
  private volatile VDMSet listings = SetUtil.set();
  public volatile Sentinel sentinel;

  public VDMSet getUsers() {

    sentinel.entering(((Turo_sentinel) sentinel).getUsers);
    try {
      return this.users;

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).getUsers);
    }
  }

  public VDMSet getListings() {

    sentinel.entering(((Turo_sentinel) sentinel).getListings);
    try {
      return this.listings;

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).getListings);
    }
  }

  public void registerListing(final Listing t_listing) {

    sentinel.entering(((Turo_sentinel) sentinel).registerListing);
    try {
      listings = SetUtil.union(Utils.copy(listings), SetUtil.set(t_listing));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).registerListing);
    }
  }

  public void removeListing(final Listing t_listing) {

    sentinel.entering(((Turo_sentinel) sentinel).removeListing);
    try {
      listings = SetUtil.diff(Utils.copy(listings), SetUtil.set(t_listing));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).removeListing);
    }
  }

  public void registerLister(final Lister t_lister) {

    sentinel.entering(((Turo_sentinel) sentinel).registerLister);
    try {
      Listers = SetUtil.union(Utils.copy(Listers), SetUtil.set(t_lister));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).registerLister);
    }
  }

  public void registerRenter(final Renter t_renter) {

    sentinel.entering(((Turo_sentinel) sentinel).registerRenter);
    try {
      Renters = SetUtil.union(Utils.copy(Renters), SetUtil.set(t_renter));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).registerRenter);
    }
  }

  public VDMSet SearchListing(
      final Location t_location, final Date t_start_date, final Date t_end_date) {

    sentinel.entering(((Turo_sentinel) sentinel).SearchListing);
    try {
      VDMSet found = SetUtil.set();
      for (Iterator iterator_6 = listings.iterator(); iterator_6.hasNext(); ) {
        Listing listing = (Listing) iterator_6.next();
        Location lstLoc = listing.getLocation();
        Boolean andResult_11 = false;

        if (Utils.equals(lstLoc.getCity(), t_location.getCity())) {
          if (Utils.equals(lstLoc.getCountry(), t_location.getCountry())) {
            andResult_11 = true;
          }
        }

        if (andResult_11) {
          if (listing.getAvailableDates().availableThrough(t_start_date, t_end_date)) {
            found = SetUtil.union(Utils.copy(found), SetUtil.set(listing));
          }
        }
      }
      return Utils.copy(found);

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).SearchListing);
    }
  }

  public Turo() {

    sentinel = new Turo_sentinel(this);
  }

  public String toString() {

    return "Turo{"
        + "Renters := "
        + Utils.toString(Renters)
        + ", Listers := "
        + Utils.toString(Listers)
        + ", users := "
        + Utils.toString(users)
        + ", listings := "
        + Utils.toString(listings)
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
