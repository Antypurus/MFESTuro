package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class SUVQuote {
  private static int hc = 0;
  private static SUVQuote instance = null;

  public SUVQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static SUVQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new SUVQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof SUVQuote;
  }

  public String toString() {

    return "<SUV>";
  }
}
