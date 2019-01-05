package Turo.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ELECTRICQuote {
  private static int hc = 0;
  private static ELECTRICQuote instance = null;

  public ELECTRICQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static ELECTRICQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new ELECTRICQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof ELECTRICQuote;
  }

  public String toString() {

    return "<ELECTRIC>";
  }
}
