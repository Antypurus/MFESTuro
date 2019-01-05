package Turo.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DIESELQuote {
  private static int hc = 0;
  private static DIESELQuote instance = null;

  public DIESELQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static DIESELQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new DIESELQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof DIESELQuote;
  }

  public String toString() {

    return "<DIESEL>";
  }
}
