package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DeliveryOptions implements EvaluatePP {

  public static class DeliveryOptions_sentinel extends Sentinel {
    public static final int develiveryOptions = 0;
    public static final int getDeliveryOptions = 1;
    public static final int DeliveryOptions = 2;
    public static final int toString = 3;
    public final int function_sum = 4;

    public DeliveryOptions_sentinel() {}

    public DeliveryOptions_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  public volatile VDMSet deliveryOptions = SetUtil.set();
  public volatile Sentinel sentinel;

  public DeliveryOptions develiveryOptions() {

    sentinel.entering(((DeliveryOptions_sentinel) sentinel).develiveryOptions);
    try {
      return this;

    } finally {
      sentinel.leaving(((DeliveryOptions_sentinel) sentinel).develiveryOptions);
    }
  }

  public DeliveryOptions develiveryOptions(final VDMSet t_options) {

    sentinel.entering(((DeliveryOptions_sentinel) sentinel).develiveryOptions);
    try {
      deliveryOptions = Utils.copy(t_options);
      sentinel.stateChanged();

      return this;

    } finally {
      sentinel.leaving(((DeliveryOptions_sentinel) sentinel).develiveryOptions);
    }
  }

  public DeliveryOptions develiveryOptions(final Object t_option) {

    sentinel.entering(((DeliveryOptions_sentinel) sentinel).develiveryOptions);
    try {
      deliveryOptions = SetUtil.set(t_option);
      sentinel.stateChanged();

      return this;

    } finally {
      sentinel.leaving(((DeliveryOptions_sentinel) sentinel).develiveryOptions);
    }
  }

  public VDMSet getDeliveryOptions() {

    sentinel.entering(((DeliveryOptions_sentinel) sentinel).getDeliveryOptions);
    try {
      return this.deliveryOptions;

    } finally {
      sentinel.leaving(((DeliveryOptions_sentinel) sentinel).getDeliveryOptions);
    }
  }

  public DeliveryOptions() {

    sentinel = new DeliveryOptions_sentinel(this);
  }

  public String toString() {

    return "DeliveryOptions{" + "deliveryOptions := " + Utils.toString(deliveryOptions) + "}";
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
