package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Location implements EvaluatePP {

  public static class Location_sentinel extends Sentinel {
    public static final int Location = 0;
    public static final int getCountry = 1;
    public static final int getCity = 2;
    public static final int toString = 3;
    public final int function_sum = 4;

    public Location_sentinel() {}

    public Location_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile String country = "";
  private volatile String city = "";
  public volatile Sentinel sentinel;

  public void cg_init_Location_1(final String t_country, final String t_city) {

    sentinel = new Location_sentinel(this);
    country = t_country;
    city = t_city;
    return;
  }

  public Location(final String t_country, final String t_city) {

    cg_init_Location_1(t_country, t_city);
  }

  public String getCountry() {

    sentinel.entering(((Location_sentinel) sentinel).getCountry);
    try {
      return this.country;

    } finally {
      sentinel.leaving(((Location_sentinel) sentinel).getCountry);
    }
  }

  public String getCity() {

    sentinel.entering(((Location_sentinel) sentinel).getCity);
    try {
      return this.city;

    } finally {
      sentinel.leaving(((Location_sentinel) sentinel).getCity);
    }
  }

  public Location() {

    sentinel = new Location_sentinel(this);
  }

  public String toString() {

    return "Location{"
        + "country := "
        + Utils.toString(country)
        + ", city := "
        + Utils.toString(city)
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

    } else {
      return true;
    }
  }
}
