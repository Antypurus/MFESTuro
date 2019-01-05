package Turo.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CUSTOM_LOCATIONQuote {
  private static int hc = 0;
  private static CUSTOM_LOCATIONQuote instance = null;

  public CUSTOM_LOCATIONQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static CUSTOM_LOCATIONQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new CUSTOM_LOCATIONQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof CUSTOM_LOCATIONQuote;
  }

  public String toString() {

    return "<CUSTOM_LOCATION>";
  }
}
