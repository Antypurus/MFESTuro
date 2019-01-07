package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CustomFeature extends Feature implements EvaluatePP {

  public static class CustomFeature_sentinel extends Feature_sentinel {
    public static final int CustomFeature = 0;
    public static final int toString = 1;
    public static final int getName = 2;
    public static final int getDescription = 3;
    public static final int getValue = 4;
    public static final int Feature = 5;
    public final int function_sum = 6;

    public CustomFeature_sentinel() {}

    public CustomFeature_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final Number VALUE = 1.0;
  public volatile Sentinel sentinel;

  public void cg_init_CustomFeature_1(final String m_name, final String m_desc) {

    sentinel = new CustomFeature_sentinel(this);
    name = m_name;
    description = m_desc;
    value = CustomFeature.VALUE;
    return;
  }

  public CustomFeature(final String m_name, final String m_desc) {

    cg_init_CustomFeature_1(m_name, m_desc);
  }

  public CustomFeature() {

    sentinel = new CustomFeature_sentinel(this);
  }

  public String toString() {

    return "CustomFeature{" + "VALUE = " + Utils.toString(VALUE) + "}";
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
