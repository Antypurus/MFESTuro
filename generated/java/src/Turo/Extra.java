package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Extra implements EvaluatePP {

  public static class Extra_sentinel extends Sentinel {
    public static final int Extra = 0;
    public static final int getName = 1;
    public static final int getDescription = 2;
    public static final int getCost = 3;
    public static final int toString = 4;
    public final int function_sum = 5;

    public Extra_sentinel() {}

    public Extra_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile String name = "";
  private volatile String description = "";
  private volatile Number cost = 0.0;
  public volatile Sentinel sentinel;

  public void cg_init_Extra_1(
      final String t_name, final String t_description, final Number t_value) {

    sentinel = new Extra_sentinel(this);
    name = t_name;
    description = t_description;
    cost = t_value;
    return;
  }

  public Extra(final String t_name, final String t_description, final Number t_value) {

    cg_init_Extra_1(t_name, t_description, t_value);
  }

  public String getName() {

    sentinel.entering(((Extra_sentinel) sentinel).getName);
    try {
      return this.name;

    } finally {
      sentinel.leaving(((Extra_sentinel) sentinel).getName);
    }
  }

  public String getDescription() {

    sentinel.entering(((Extra_sentinel) sentinel).getDescription);
    try {
      return this.description;

    } finally {
      sentinel.leaving(((Extra_sentinel) sentinel).getDescription);
    }
  }

  public Number getCost() {

    sentinel.entering(((Extra_sentinel) sentinel).getCost);
    try {
      return this.cost;

    } finally {
      sentinel.leaving(((Extra_sentinel) sentinel).getCost);
    }
  }

  public Extra() {

    sentinel = new Extra_sentinel(this);
  }

  public String toString() {

    return "Extra{"
        + "name := "
        + Utils.toString(name)
        + ", description := "
        + Utils.toString(description)
        + ", cost := "
        + Utils.toString(cost)
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
