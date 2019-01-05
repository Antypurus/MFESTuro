package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MINIVANQuote {
  private static int hc = 0;
  private static MINIVANQuote instance = null;

  public MINIVANQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static MINIVANQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new MINIVANQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof MINIVANQuote;
  }

  public String toString() {

    return "<MINIVAN>";
  }
}
