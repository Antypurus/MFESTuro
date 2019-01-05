package Turo.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class AIRPORTQuote {
  private static int hc = 0;
  private static AIRPORTQuote instance = null;

  public AIRPORTQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static AIRPORTQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new AIRPORTQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof AIRPORTQuote;
  }

  public String toString() {

    return "<AIRPORT>";
  }
}
