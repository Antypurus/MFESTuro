package Menus;

import Turo.Lister;
import Turo.Notification;
import Turo.User;
import org.overture.codegen.runtime.VDMSet;

public class ViewNotificationsMenu
{

    private Lister lister = null;

    public ViewNotificationsMenu(User user)
    {
        lister = (Lister)user;
    }

    public void menu()
    {
        VDMSet notifications = this.lister.getInbox().viewNotifications();

        for(Object notification:notifications)
        {
            System.out.println(((Notification)notification));
        }
    }

}
