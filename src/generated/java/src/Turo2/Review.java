package Turo2;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Review implements EvaluatePP {

  public static class Review_sentinel extends Sentinel {
    public static final int Review = 0;
    public static final int getReviewer = 1;
    public static final int getReviewScore = 2;
    public static final int getReview = 3;
    public static final int toString = 4;
    public final int function_sum = 5;

    public Review_sentinel() {}

    public Review_sentinel(final EvaluatePP instance) {

      init(instance, function_sum);
    }
  }

  private volatile User reviewer;
  private volatile Number reviewScore = 0.0;
  private volatile String reviewDescription = "";
  public volatile Sentinel sentinel;

  public void cg_init_Review_1(final User t_reviewer, final Number t_score, final String t_review) {

    sentinel = new Review_sentinel(this);
    reviewer = t_reviewer;
    reviewScore = t_score;
    reviewDescription = t_review;
    return;
  }

  public Review(final User t_reviewer, final Number t_score, final String t_review) {

    cg_init_Review_1(t_reviewer, t_score, t_review);
  }

  public User getReviewer() {

    sentinel.entering(((Review_sentinel) sentinel).getReviewer);
    try {
      return this.reviewer;

    } finally {
      sentinel.leaving(((Review_sentinel) sentinel).getReviewer);
    }
  }

  public Number getReviewScore() {

    sentinel.entering(((Review_sentinel) sentinel).getReviewScore);
    try {
      return this.reviewScore;

    } finally {
      sentinel.leaving(((Review_sentinel) sentinel).getReviewScore);
    }
  }

  public String getReview() {

    sentinel.entering(((Review_sentinel) sentinel).getReview);
    try {
      return this.reviewDescription;

    } finally {
      sentinel.leaving(((Review_sentinel) sentinel).getReview);
    }
  }

  public Review() {

    sentinel = new Review_sentinel(this);
  }

  public String toString() {

    return "Review{"
        + "reviewer := "
        + Utils.toString(reviewer)
        + ", reviewScore := "
        + Utils.toString(reviewScore)
        + ", reviewDescription := "
        + Utils.toString(reviewDescription)
        + "}";
  }

  public Boolean evaluatePP(final Number fnr) {

    if (Utils.equals(fnr, 0L)) {
      return true;

    } else if (Utils.equals(fnr, 1L)) {
      return true;

    } else if (Utils.equals(fnr, 2L)) {
      return true;

    } else if (Utils.equals(fnr, 3L)) {
      return true;

    } else if (Utils.equals(fnr, 4L)) {
      return true;

    } else {
      return true;
    }
  }
}
