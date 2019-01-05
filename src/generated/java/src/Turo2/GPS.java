package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class GPS extends Feature implements EvaluatePP {

  public static class GPS_sentinel extends Feature_sentinel {
    public static final int GPS = 0;
    public static final int toString = 1;
    public static final int getName = 2;
    public static final int getDescription = 3;
    public static final int getValue = 4;
    public static final int Feature = 5;
    public final int function_sum = 6;

    public GPS_sentinel() {}

    public GPS_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String NAME = "GPS";
  private static final String DESCRIPTION = "This car has GPS connectivity";
  private static final Number VALUE = 1.0;
  public volatile Sentinel sentinel;

  public void cg_init_GPS_1() {

    sentinel = new GPS_sentinel(this);
    name = GPS.NAME;
    description = GPS.DESCRIPTION;
    value = GPS.VALUE;
    return;
  }

  public GPS() {

    cg_init_GPS_1();
  }

  public String toString() {

    return "GPS{"
        + "NAME = "
        + Utils.toString(NAME)
        + ", DESCRIPTION = "
        + Utils.toString(DESCRIPTION)
        + ", VALUE = "
        + Utils.toString(VALUE)
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

    } else {
      return true;
    }
  }
}
