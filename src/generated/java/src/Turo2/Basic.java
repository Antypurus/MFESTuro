package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Basic extends ProtectionPlan implements EvaluatePP {

  public static class Basic_sentinel extends ProtectionPlan_sentinel {
    public static final int Basic = 0;
    public static final int toString = 1;
    public static final int getBenefits = 2;
    public static final int getRevenueSplit = 3;
    public static final int ProtectionPlan = 4;
    public final int function_sum = 5;

    public Basic_sentinel() {}

    public Basic_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String BENEFITS = "";
  private static final Number REVENUE_SPLIT = 0.85;
  public volatile Sentinel sentinel;

  public void cg_init_Basic_1() {

    sentinel = new Basic_sentinel(this);
    benefits = Basic.BENEFITS;
    revenueSplit = Basic.REVENUE_SPLIT;
    return;
  }

  public Basic() {

    cg_init_Basic_1();
  }

  public String toString() {

    return "Basic{"
        + "BENEFITS = "
        + Utils.toString(BENEFITS)
        + ", REVENUE_SPLIT = "
        + Utils.toString(REVENUE_SPLIT)
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

    } else {
      return true;
    }
  }
}
