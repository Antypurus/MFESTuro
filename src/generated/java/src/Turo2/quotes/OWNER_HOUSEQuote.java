package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class OWNER_HOUSEQuote {
  private static int hc = 0;
  private static OWNER_HOUSEQuote instance = null;

  public OWNER_HOUSEQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static OWNER_HOUSEQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new OWNER_HOUSEQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof OWNER_HOUSEQuote;
  }

  public String toString() {

    return "<OWNER_HOUSE>";
  }
}
