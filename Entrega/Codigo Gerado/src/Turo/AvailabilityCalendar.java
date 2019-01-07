package Turo;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class AvailabilityCalendar implements EvaluatePP {

  public static class AvailabilityCalendar_sentinel extends Sentinel {
    public static final int AvailabilityCalendar = 0;
    public static final int getDates = 1;
    public static final int isDateAvailable = 2;
    public static final int areDatesAvailable = 3;
    public static final int removeDate = 4;
    public static final int removeDates = 5;
    public static final int addDates = 6;
    public static final int availableThrough = 7;
    public static final int toString = 8;
    public final int function_sum = 9;

    public AvailabilityCalendar_sentinel() {}

    public AvailabilityCalendar_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile VDMSet availableDates = SetUtil.set();
  public volatile Sentinel sentinel;

  public void cg_init_AvailabilityCalendar_3(final Date t_date) {

    sentinel = new AvailabilityCalendar_sentinel(this);
    availableDates = SetUtil.set(t_date);
    return;
  }

  public void cg_init_AvailabilityCalendar_2(final VDMSet t_dates) {

    sentinel = new AvailabilityCalendar_sentinel(this);
    availableDates = Utils.copy(t_dates);
    return;
  }

  public void cg_init_AvailabilityCalendar_1() {

    sentinel = new AvailabilityCalendar_sentinel(this);
    return;
  }

  public AvailabilityCalendar() {

    cg_init_AvailabilityCalendar_1();
  }

  public AvailabilityCalendar(final VDMSet t_dates) {

    cg_init_AvailabilityCalendar_2(Utils.copy(t_dates));
  }

  public AvailabilityCalendar(final Date t_date) {

    cg_init_AvailabilityCalendar_3(t_date);
  }

  public VDMSet getDates() {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).getDates);
    try {
      return this.availableDates;

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).getDates);
    }
  }

  public Boolean isDateAvailable(final Date t_date) {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).isDateAvailable);
    try {
      return SetUtil.inSet(t_date, availableDates);

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).isDateAvailable);
    }
  }

  public Boolean areDatesAvailable(final VDMSet t_dates) {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).areDatesAvailable);
    try {
      return SetUtil.subset(t_dates, availableDates);

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).areDatesAvailable);
    }
  }

  public void removeDate(final Date t_date) {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).removeDate);
    try {
      availableDates = SetUtil.diff(Utils.copy(availableDates), SetUtil.set(t_date));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).removeDate);
    }
  }

  public void removeDates(final VDMSet t_dates) {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).removeDates);
    try {
      availableDates = SetUtil.diff(Utils.copy(availableDates), Utils.copy(t_dates));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).removeDates);
    }
  }

  public void addDates(final VDMSet t_dates) {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).addDates);
    try {
      availableDates = SetUtil.union(Utils.copy(availableDates), Utils.copy(t_dates));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).addDates);
    }
  }

  public Boolean availableThrough(final Date t_start_date, final Date t_end_date) {

    sentinel.entering(((AvailabilityCalendar_sentinel) sentinel).availableThrough);
    try {
      VDMSet wanted_dates = t_start_date.getDatesTo(t_end_date);
      return SetUtil.subset(wanted_dates, availableDates);

    } finally {
      sentinel.leaving(((AvailabilityCalendar_sentinel) sentinel).availableThrough);
    }
  }

  public String toString() {

    return "AvailabilityCalendar{" + "availableDates := " + Utils.toString(availableDates) + "}";
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

    } else if (Utils.equals(fnr, 7L)) {
      return true;

    } else if (Utils.equals(fnr, 8L)) {
      return true;

    } else {
      return true;
    }
  }
}
