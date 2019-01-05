package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
abstract public class Car implements EvaluatePP {

  public static class Car_sentinel extends Sentinel {
    public static final int calculatePricePerDay = 0;
    public static final int getName = 1;
    public static final int getNumberOfDoors = 2;
    public static final int getNumberOfSeats = 3;
    public static final int getMilesPerGalon = 4;
    public static final int getPricePerDay = 5;
    public static final int getTripCount = 6;
    public static final int getManufactureYear = 7;
    public static final int getColor = 8;
    public static final int getFuelType = 9;
    public static final int getVehicleType = 10;
    public static final int getManufacturer = 11;
    public static final int getFeatures = 12;
    public static final int addFeatureSet = 13;
    public static final int addFeature = 14;
    public static final int Car = 15;
    public static final int toString = 16;
    public final int function_sum = 17;

    public Car_sentinel() {}

    public Car_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  protected volatile String name = "";
  protected volatile Number numberOfDoors = 0L;
  protected volatile Number numberOfSeats = 0L;
  protected volatile Number milesPerGalon = 0.0;
  protected volatile Number pricePerDay = 0.0;
  protected volatile Number tripCount = 0L;
  protected volatile Number manufactureYear = 0L;
  protected volatile String color = "";
  protected volatile Object fuelType = Turo2.quotes.DIESELQuote.getInstance();
  protected volatile Object vehicleType = Turo2.quotes.REGULARQuote.getInstance();
  protected volatile Manufacturer manufacturer;
  protected volatile VDMSet features = SetUtil.set();
  public volatile Sentinel sentinel;

  public abstract void calculatePricePerDay();

  public String getName() {

    sentinel.entering(((Car_sentinel) sentinel).getName);
    try {
      return this.name;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getName);
    }
  }

  public Number getNumberOfDoors() {

    sentinel.entering(((Car_sentinel) sentinel).getNumberOfDoors);
    try {
      return this.numberOfDoors;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getNumberOfDoors);
    }
  }

  public Number getNumberOfSeats() {

    sentinel.entering(((Car_sentinel) sentinel).getNumberOfSeats);
    try {
      return this.numberOfSeats;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getNumberOfSeats);
    }
  }

  public Number getMilesPerGalon() {

    sentinel.entering(((Car_sentinel) sentinel).getMilesPerGalon);
    try {
      return this.milesPerGalon;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getMilesPerGalon);
    }
  }

  public Number getPricePerDay() {

    sentinel.entering(((Car_sentinel) sentinel).getPricePerDay);
    try {
      return this.pricePerDay;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getPricePerDay);
    }
  }

  public Number getTripCount() {

    sentinel.entering(((Car_sentinel) sentinel).getTripCount);
    try {
      return this.tripCount;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getTripCount);
    }
  }

  public Number getManufactureYear() {

    sentinel.entering(((Car_sentinel) sentinel).getManufactureYear);
    try {
      return this.manufactureYear;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getManufactureYear);
    }
  }

  public String getColor() {

    sentinel.entering(((Car_sentinel) sentinel).getColor);
    try {
      return this.color;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getColor);
    }
  }

  public Object getFuelType() {

    sentinel.entering(((Car_sentinel) sentinel).getFuelType);
    try {
      return this.fuelType;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getFuelType);
    }
  }

  public Object getVehicleType() {

    sentinel.entering(((Car_sentinel) sentinel).getVehicleType);
    try {
      return this.vehicleType;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getVehicleType);
    }
  }

  public Manufacturer getManufacturer() {

    sentinel.entering(((Car_sentinel) sentinel).getManufacturer);
    try {
      return this.manufacturer;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getManufacturer);
    }
  }

  public VDMSet getFeatures() {

    sentinel.entering(((Car_sentinel) sentinel).getFeatures);
    try {
      return this.features;

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).getFeatures);
    }
  }

  public void addFeatureSet(final VDMSet m_features) {

    sentinel.entering(((Car_sentinel) sentinel).addFeatureSet);
    try {
      features = SetUtil.union(Utils.copy(features), Utils.copy(m_features));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).addFeatureSet);
    }
  }

  public void addFeature(final Feature m_feature) {

    sentinel.entering(((Car_sentinel) sentinel).addFeature);
    try {
      features = SetUtil.union(Utils.copy(features), SetUtil.set(m_feature));
      sentinel.stateChanged();

    } finally {
      sentinel.leaving(((Car_sentinel) sentinel).addFeature);
    }
  }

  public Car() {

    sentinel = new Car_sentinel(this);
  }

  public String toString() {

    return "Car{"
        + "name := "
        + Utils.toString(name)
        + ", numberOfDoors := "
        + Utils.toString(numberOfDoors)
        + ", numberOfSeats := "
        + Utils.toString(numberOfSeats)
        + ", milesPerGalon := "
        + Utils.toString(milesPerGalon)
        + ", pricePerDay := "
        + Utils.toString(pricePerDay)
        + ", tripCount := "
        + Utils.toString(tripCount)
        + ", manufactureYear := "
        + Utils.toString(manufactureYear)
        + ", color := "
        + Utils.toString(color)
        + ", fuelType := "
        + Utils.toString(fuelType)
        + ", vehicleType := "
        + Utils.toString(vehicleType)
        + ", manufacturer := "
        + Utils.toString(manufacturer)
        + ", features := "
        + Utils.toString(features)
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

    } else {
      return true;
    }
  }
}
