package Turo;

import java.util.*;

import Turo.quotes.MINIVANQuote;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MiniVan extends Car implements EvaluatePP {

  public static class MiniVan_sentinel extends Car_sentinel {
    public static final int MiniVan = 0;
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

    public MiniVan_sentinel() {}

    public MiniVan_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private static final Number NUMBER_OF_DOORS = 4L;
  private static final Number NUMBER_OF_SEATS = 5L;
  private static final Number BASE_VALUE = 1.0;
  private static final Object CAR_TYPE = MINIVANQuote.getInstance();
  public volatile Sentinel sentinel;

  public void cg_init_MiniVan_1(
      final String m_name,
      final Number m_milespergalon,
      final Number m_trip_count,
      final Number m_manufacture_year,
      final String m_color,
      final Object m_fuel_type,
      final Manufacturer m_manufacturer,
      final VDMSet m_features) {

    sentinel = new MiniVan_sentinel(this);
    name = m_name;
    milesPerGalon = m_milespergalon;
    tripCount = m_trip_count;
    manufactureYear = m_manufacture_year;
    color = m_color;
    fuelType = m_fuel_type;
    manufacturer = m_manufacturer;
    features = Utils.copy(m_features);
    numberOfDoors = MiniVan.NUMBER_OF_DOORS;
    numberOfSeats = MiniVan.NUMBER_OF_SEATS;
    vehicleType = MiniVan.CAR_TYPE;
    this.calculatePricePerDay();
    return;
  }

  public MiniVan(
      final String m_name,
      final Number m_milespergalon,
      final Number m_trip_count,
      final Number m_manufacture_year,
      final String m_color,
      final Object m_fuel_type,
      final Manufacturer m_manufacturer,
      final VDMSet m_features) {

    cg_init_MiniVan_1(
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

    sentinel.entering(((MiniVan_sentinel) sentinel).calculatePricePerDay);
    try {
      Number dayPrice = MiniVan.BASE_VALUE;
      for (Iterator iterator_1 = features.iterator(); iterator_1.hasNext(); ) {
        Feature feature = (Feature) iterator_1.next();
        dayPrice = dayPrice.doubleValue() + feature.getValue().doubleValue();
      }
      pricePerDay = dayPrice;
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((MiniVan_sentinel) sentinel).calculatePricePerDay);
    }
  }

  public MiniVan() {

    sentinel = new MiniVan_sentinel(this);
  }

  public String toString() {

    return "MiniVan{"
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
