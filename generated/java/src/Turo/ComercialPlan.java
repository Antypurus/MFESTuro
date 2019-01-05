package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ComercialPlan extends ProtectionPlan implements EvaluatePP {

  public static class ComercialPlan_sentinel extends ProtectionPlan_sentinel {
    public static final int ComercialPlan = 0;
    public static final int toString = 1;
    public static final int getBenefits = 2;
    public static final int getRevenueSplit = 3;
    public static final int ProtectionPlan = 4;
    public final int function_sum = 5;

    public ComercialPlan_sentinel() {}

    public ComercialPlan_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final String BENEFITS = "";
  private static final Number REVENUE_SPLIT = 0.9;
  public volatile Sentinel sentinel;

  public void cg_init_ComercialPlan_1() {

    sentinel = new ComercialPlan_sentinel(this);
    benefits = ComercialPlan.BENEFITS;
    revenueSplit = ComercialPlan.REVENUE_SPLIT;
    return;
  }

  public ComercialPlan() {

    cg_init_ComercialPlan_1();
  }

  public String toString() {

    return "ComercialPlan{"
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
