package Turo.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CREDITQuote {
  private static int hc = 0;
  private static CREDITQuote instance = null;

  public CREDITQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static CREDITQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new CREDITQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof CREDITQuote;
  }

  public String toString() {

    return "<CREDIT>";
  }
}
