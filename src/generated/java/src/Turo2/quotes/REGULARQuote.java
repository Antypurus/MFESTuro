package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class REGULARQuote {
  private static int hc = 0;
  private static REGULARQuote instance = null;

  public REGULARQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static REGULARQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new REGULARQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof REGULARQuote;
  }

  public String toString() {

    return "<REGULAR>";
  }
}
