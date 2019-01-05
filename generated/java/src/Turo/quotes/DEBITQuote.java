package Turo.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DEBITQuote {
  private static int hc = 0;
  private static DEBITQuote instance = null;

  public DEBITQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static DEBITQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new DEBITQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof DEBITQuote;
  }

  public String toString() {

    return "<DEBIT>";
  }
}
