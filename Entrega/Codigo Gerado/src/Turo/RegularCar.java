package Turo;

import java.util.*;

import Turo.quotes.REGULARQuote;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class RegularCar extends Car implements EvaluatePP {

  public static class RegularCar_sentinel extends Car_sentinel {
    public static final int RegularCar = 0;
    public static final int calculatePricePerDay = 1;
    public static final int toString = 2;
    public static final int getName = 3;
    public static final int getNumberOfDoors = 4;
    public static final int getNumberOfSeats = 5;
    public static final int getMilesPerGalon = 6;
    public static final int getPricePerDay = 7;
    public static final int getTripCount = 8;
    public static final int getManufactureYear = 9;
    public static final int getColor = 10;
    public static final int getFuelType = 11;
    public static final int getVehicleType = 12;
    public static final int getManufacturer = 13;
    public static final int getFeatures = 14;
    public static final int addFeatureSet = 15;
    public static final int addFeature = 16;
    public static final int Car = 17;
    public final int function_sum = 18;

    public RegularCar_sentinel() {}

    public RegularCar_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final Number NUMBER_OF_DOORS = 4L;
  private static final Number NUMBER_OF_SEATS = 5L;
  private static final Number BASE_VALUE = 1.0;
  private static final Object CAR_TYPE = REGULARQuote.getInstance();
  public volatile Sentinel sentinel;

  public void cg_init_RegularCar_1(
      final String m_name,
      final Number m_milespergalon,
      final Number m_trip_count,
      final Number m_manufacture_year,
      final String m_color,
      final Object m_fuel_type,
      final Manufacturer m_manufacturer,
      final VDMSet m_features) {

    sentinel = new RegularCar_sentinel(this);
    name = m_name;
    milesPerGalon = m_milespergalon;
    tripCount = m_trip_count;
    manufactureYear = m_manufacture_year;
    color = m_color;
    fuelType = m_fuel_type;
    manufacturer = m_manufacturer;
    features = Utils.copy(m_features);
    numberOfDoors = RegularCar.NUMBER_OF_DOORS;
    numberOfSeats = RegularCar.NUMBER_OF_SEATS;
    vehicleType = RegularCar.CAR_TYPE;
    this.calculatePricePerDay();
    return;
  }

  public RegularCar(
      final String m_name,
      final Number m_milespergalon,
      final Number m_trip_count,
      final Number m_manufacture_year,
      final String m_color,
      final Object m_fuel_type,
      final Manufacturer m_manufacturer,
      final VDMSet m_features) {

    cg_init_RegularCar_1(
        m_name,
        m_milespergalon,
        m_trip_count,
        m_manufacture_year,
        m_color,
        m_fuel_type,
        m_manufacturer,
        Utils.copy(m_features));
  }

  public void calculatePricePerDay() {

    sentinel.entering(((RegularCar_sentinel) sentinel).calculatePricePerDay);
    try {
      Number dayPrice = RegularCar.BASE_VALUE;
      for (Iterator iterator_2 = features.iterator(); iterator_2.hasNext(); ) {
        Feature feature = (Feature) iterator_2.next();
        dayPrice = dayPrice.doubleValue() + feature.getValue().doubleValue();
      }
      pricePerDay = dayPrice;
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((RegularCar_sentinel) sentinel).calculatePricePerDay);
    }
  }

  public RegularCar() {

    sentinel = new RegularCar_sentinel(this);
  }

  public String toString() {

    return "RegularCar{"
        + "NUMBER_OF_DOORS = "
        + Utils.toString(NUMBER_OF_DOORS)
        + ", NUMBER_OF_SEATS = "
        + Utils.toString(NUMBER_OF_SEATS)
        + ", BASE_VALUE = "
        + Utils.toString(BASE_VALUE)
        + ", CAR_TYPE = "
        + Utils.toString(CAR_TYPE)
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

    } else if (Utils.equals(fnr, 6L)) {
      return true;

    } else if (Utils.equals(fnr, 7L)) {
      return true;

    } else if (Utils.equals(fnr, 8L)) {
      return true;

    } else if (Utils.equals(fnr, 9L)) {
      return true;

    } else if (Utils.equals(fnr, 10L)) {
      return true;

    } else if (Utils.equals(fnr, 11L)) {
      return true;

    } else if (Utils.equals(fnr, 12L)) {
      return true;

    } else if (Utils.equals(fnr, 13L)) {
      return true;

    } else if (Utils.equals(fnr, 14L)) {
      return true;

    } else if (Utils.equals(fnr, 15L)) {
      return true;

    } else if (Utils.equals(fnr, 16L)) {
      return true;

    } else if (Utils.equals(fnr, 17L)) {
      return true;

    } else if (Utils.equals(fnr, 18L)) {
      return true;

    } else {
      return true;
    }
  }
}
