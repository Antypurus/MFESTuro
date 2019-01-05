package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ProtectionPlan implements EvaluatePP {

  public static class ProtectionPlan_sentinel extends Sentinel {
    public static final int getBenefits = 0;
    public static final int getRevenueSplit = 1;
    public static final int ProtectionPlan = 2;
    public static final int toString = 3;
    public final int function_sum = 4;

    public ProtectionPlan_sentinel() {}

    public ProtectionPlan_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  protected volatile String benefits = "";
  protected volatile Number revenueSplit = 0.0;
  public volatile Sentinel sentinel;

  public String getBenefits() {

    sentinel.entering(((ProtectionPlan_sentinel) sentinel).getBenefits);
    try {
      return this.benefits;

    } finally {
      sentinel.leaving(((ProtectionPlan_sentinel) sentinel).getBenefits);
    }
  }

  public Number getRevenueSplit() {

    sentinel.entering(((ProtectionPlan_sentinel) sentinel).getRevenueSplit);
    try {
      return this.revenueSplit;

    } finally {
      sentinel.leaving(((ProtectionPlan_sentinel) sentinel).getRevenueSplit);
    }
  }

  public ProtectionPlan() {

    sentinel = new ProtectionPlan_sentinel(this);
  }

  public String toString() {

    return "ProtectionPlan{"
        + "benefits := "
        + Utils.toString(benefits)
        + ", revenueSplit := "
        + Utils.toString(revenueSplit)
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
