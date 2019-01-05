package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Feature implements EvaluatePP {

  public static class Feature_sentinel extends Sentinel {
    public static final int getName = 0;
    public static final int getDescription = 1;
    public static final int getValue = 2;
    public static final int Feature = 3;
    public static final int toString = 4;
    public final int function_sum = 5;

    public Feature_sentinel() {}

    public Feature_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  protected volatile String name = "";
  protected volatile String description = "";
  protected volatile Number value = 0.0;
  public volatile Sentinel sentinel;

  public String getName() {

    sentinel.entering(((Feature_sentinel) sentinel).getName);
    try {
      return this.name;

    } finally {
      sentinel.leaving(((Feature_sentinel) sentinel).getName);
    }
  }

  public String getDescription() {

    sentinel.entering(((Feature_sentinel) sentinel).getDescription);
    try {
      return this.description;

    } finally {
      sentinel.leaving(((Feature_sentinel) sentinel).getDescription);
    }
  }

  public Number getValue() {

    sentinel.entering(((Feature_sentinel) sentinel).getValue);
    try {
      return this.value;

    } finally {
      sentinel.leaving(((Feature_sentinel) sentinel).getValue);
    }
  }

  public Feature() {

    sentinel = new Feature_sentinel(this);
  }

  public String toString() {

    return "Feature{"
        + "name := "
        + Utils.toString(name)
        + ", description := "
        + Utils.toString(description)
        + ", value := "
        + Utils.toString(value)
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
