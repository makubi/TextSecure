package org.thoughtcrime.securesms.notifications;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

public class Bug130689NotificationFixBuilder extends NotificationCompat.Builder {

    public Bug130689NotificationFixBuilder(Context context) {
        super(context);

        setGroup(MultipleRecipientNotificationBuilder.NOTIFICATION_GROUP_KEY_MESSAGES);
        setGroupSummary(true);
        setContentTitle("Signal Android Wear");
        setContentText("Notification workaround");
        setSmallIcon(android.R.drawable.ic_menu_info_details);
        setPriority(NotificationCompat.PRIORITY_MIN);
        setOngoing(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setVisibility(Notification.VISIBILITY_SECRET);
        }
    }
}
