package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class SkiRack extends Feature implements EvaluatePP {

  public static class SkiRack_sentinel extends Feature_sentinel {
    public static final int SkiRack = 0;
    public static final int toString = 1;
    public static final int getName = 2;
    public static final int getDescription = 3;
    public static final int getValue = 4;
    public static final int Feature = 5;
    public final int function_sum = 6;

    public SkiRack_sentinel() {}

    public SkiRack_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String NAME = "Ski Rack";
  private static final String DESCRIPTION = "This car has a ski rack";
  private static final Number VALUE = 1.0;
  public volatile Sentinel sentinel;

  public void cg_init_SkiRack_1() {

    sentinel = new SkiRack_sentinel(this);
    name = SkiRack.NAME;
    description = SkiRack.DESCRIPTION;
    value = SkiRack.VALUE;
    return;
  }

  public SkiRack() {

    cg_init_SkiRack_1();
  }

  public String toString() {

    return "SkiRack{"
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
