package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Manufacturer implements EvaluatePP {

  public static class Manufacturer_sentinel extends Sentinel {
    public static final int Manufacturer = 0;
    public static final int getName = 1;
    public static final int toString = 2;
    public final int function_sum = 3;

    public Manufacturer_sentinel() {}

    public Manufacturer_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile String name = "";
  public volatile Sentinel sentinel;

  public void cg_init_Manufacturer_1(final String m_name) {

    sentinel = new Manufacturer_sentinel(this);
    name = m_name;
    return;
  }

  public Manufacturer(final String m_name) {

    cg_init_Manufacturer_1(m_name);
  }

  public String getName() {

    sentinel.entering(((Manufacturer_sentinel) sentinel).getName);
    try {
      return this.name;

    } finally {
      sentinel.leaving(((Manufacturer_sentinel) sentinel).getName);
    }
  }

  public Manufacturer() {

    sentinel = new Manufacturer_sentinel(this);
  }

  public String toString() {

    return "Manufacturer{" + "name := " + Utils.toString(name) + "}";
  }

  public Boolean evaluatePP(final Number fnr) {

    if (Utils.equals(fnr, 0L)) {
      return true;

    } else if (Utils.equals(fnr, 1L)) {
      return true;

    } else if (Utils.equals(fnr, 2L)) {
      return true;

    } else {
      return true;
    }
  }
}
