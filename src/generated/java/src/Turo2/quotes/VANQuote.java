package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class VANQuote {
  private static int hc = 0;
  private static VANQuote instance = null;

  public VANQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static VANQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new VANQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof VANQuote;
  }

  public String toString() {

    return "<VAN>";
  }
}
