package Turo2.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class GASOLINEQuote {
  private static int hc = 0;
  private static GASOLINEQuote instance = null;

  public GASOLINEQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static GASOLINEQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new GASOLINEQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof GASOLINEQuote;
  }

  public String toString() {

    return "<GASOLINE>";
  }
}
