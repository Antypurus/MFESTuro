package Menus;

import Turo.Review;
import Turo.User;
import org.overture.codegen.runtime.VDMSet;

public class ViewReviews
{

    private User user = null;

    public ViewReviews(User user)
    {
        this.user = user;
    }

    public void menu()
    {
        VDMSet reviews = this.user.getReviews();

        for(Object review:reviews)
        {
            Review rev = (Review)review;

            System.out.println("From:"+rev.getReviewer().getName());
            System.out.println("Review:"+rev.getReview());
            System.out.println("Score:"+rev.getReviewScore());
            System.out.println();
        }
    }

}
