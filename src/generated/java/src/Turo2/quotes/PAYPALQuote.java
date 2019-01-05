package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PAYPALQuote {
  private static int hc = 0;
  private static PAYPALQuote instance = null;

  public PAYPALQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static PAYPALQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new PAYPALQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof PAYPALQuote;
  }

  public String toString() {

    return "<PAYPAL>";
  }
}
