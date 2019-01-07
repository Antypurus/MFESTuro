package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Sunroof extends Feature implements EvaluatePP {

  public static class Sunroof_sentinel extends Feature_sentinel {
    public static final int Sunroof = 0;
    public static final int toString = 1;
    public static final int getName = 2;
    public static final int getDescription = 3;
    public static final int getValue = 4;
    public static final int Feature = 5;
    public final int function_sum = 6;

    public Sunroof_sentinel() {}

    public Sunroof_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String NAME = "Sunroof";
  private static final String DESCRIPTION = "This car has a sunroof";
  private static final Number VALUE = 1.0;
  public volatile Sentinel sentinel;

  public void cg_init_Sunroof_1() {

    sentinel = new Sunroof_sentinel(this);
    name = Sunroof.NAME;
    description = Sunroof.DESCRIPTION;
    value = Sunroof.VALUE;
    return;
  }

  public Sunroof() {

    cg_init_Sunroof_1();
  }

  public String toString() {

    return "Sunroof{"
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
