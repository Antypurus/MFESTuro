package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TRUCKQuote {
  private static int hc = 0;
  private static TRUCKQuote instance = null;

  public TRUCKQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static TRUCKQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new TRUCKQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof TRUCKQuote;
  }

  public String toString() {

    return "<TRUCK>";
  }
}
