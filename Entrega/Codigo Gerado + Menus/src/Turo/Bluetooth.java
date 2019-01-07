package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Bluetooth extends Feature implements EvaluatePP {

  public static class Bluetooth_sentinel extends Feature_sentinel {
    public static final int Bluetooth = 0;
    public static final int toString = 1;
    public static final int getName = 2;
    public static final int getDescription = 3;
    public static final int getValue = 4;
    public static final int Feature = 5;
    public final int function_sum = 6;

    public Bluetooth_sentinel() {}

    public Bluetooth_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String NAME = "Bluetooth";
  private static final String DESCRIPTION = "This car supports bluetooth connectivity";
  private static final Number VALUE = 1.0;
  public volatile Sentinel sentinel;

  public void cg_init_Bluetooth_1() {

    sentinel = new Bluetooth_sentinel(this);
    name = Bluetooth.NAME;
    description = Bluetooth.DESCRIPTION;
    value = Bluetooth.VALUE;
    return;
  }

  public Bluetooth() {

    cg_init_Bluetooth_1();
  }

  public String toString() {

    return "Bluetooth{"
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

    } else {
      return true;
    }
  }
}
