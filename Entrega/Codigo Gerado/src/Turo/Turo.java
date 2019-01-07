package Turo;

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
    public static final int renterLogin = 7;
    public static final int listerLogin = 8;
    public static final int getUserListings = 9;
    public static final int logout = 10;
    public static final int listerExists = 11;
    public static final int renterExists = 12;
    public static final int Turo = 13;
    public static final int toString = 14;
    public final int function_sum = 15;

    public Turo_sentinel() {}

    public Turo_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile VDMSet Renters = SetUtil.set();
  private volatile VDMSet Listers = SetUtil.set();
  private volatile VDMSet users = SetUtil.set();
  private volatile VDMSet listings = SetUtil.set();
  public static volatile User currUser = new User();
  public static volatile Number userType = 0L;
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

  public Boolean renterLogin(final String t_username, final String t_password) {

    sentinel.entering(((Turo_sentinel) sentinel).renterLogin);
    try {
      Boolean ok = false;
      for (Iterator iterator_7 = Renters.iterator(); iterator_7.hasNext(); ) {
        Renter renter = (Renter) iterator_7.next();
        if (Utils.equals(renter.getUsername(), t_username)) {
          if (renter.verifyLogin(t_password)) {
            currUser = renter;
            sentinel.stateChanged();

            userType = 1L;
            sentinel.stateChanged();

            return true;

          } else {
            return false;
          }
        }
      }
      return ok;

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).renterLogin);
    }
  }

  public Boolean listerLogin(final String t_username, final String t_password) {

    sentinel.entering(((Turo_sentinel) sentinel).listerLogin);
    try {
      Boolean ok = false;
      for (Iterator iterator_8 = Listers.iterator(); iterator_8.hasNext(); ) {
        Lister lister = (Lister) iterator_8.next();
        if (Utils.equals(lister.getUsername(), t_username)) {
          if (lister.verifyLogin(t_password)) {
            currUser = lister;
            sentinel.stateChanged();

            userType = 2L;
            sentinel.stateChanged();

            return true;

          } else {
            return false;
          }
        }
      }
      return ok;

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).listerLogin);
    }
  }

  public VDMSet getUserListings(final String t_user) {

    sentinel.entering(((Turo_sentinel) sentinel).getUserListings);
    try {
      VDMSet lists = SetUtil.set();
      for (Iterator iterator_9 = listings.iterator(); iterator_9.hasNext(); ) {
        Listing listing = (Listing) iterator_9.next();
        if (Utils.equals(listing.getLister().getUsername(), t_user)) {
          lists = SetUtil.union(Utils.copy(lists), SetUtil.set(listing));
        }
      }
      return Utils.copy(lists);

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).getUserListings);
    }
  }

  public void logout() {

    sentinel.entering(((Turo_sentinel) sentinel).logout);
    try {
      currUser = new User();
      sentinel.stateChanged();

      userType = 0L;
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).logout);
    }
  }

  public Boolean listerExists(final String t_user) {

    sentinel.entering(((Turo_sentinel) sentinel).listerExists);
    try {
      for (Iterator iterator_10 = Listers.iterator(); iterator_10.hasNext(); ) {
        Lister lister = (Lister) iterator_10.next();
        if (Utils.equals(lister.getUsername(), t_user)) {
          return true;
        }
      }
      return false;

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).listerExists);
    }
  }

  public Boolean renterExists(final String t_user) {

    sentinel.entering(((Turo_sentinel) sentinel).renterExists);
    try {
      for (Iterator iterator_11 = Renters.iterator(); iterator_11.hasNext(); ) {
        Renter renter = (Renter) iterator_11.next();
        if (Utils.equals(renter.getUsername(), t_user)) {
          return true;
        }
      }
      return false;

    } finally {
      sentinel.leaving(((Turo_sentinel) sentinel).renterExists);
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
        + ", currUser := "
        + Utils.toString(currUser)
        + ", userType := "
        + Utils.toString(userType)
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

    } else {
      return true;
    }
  }
}
