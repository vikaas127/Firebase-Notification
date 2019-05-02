package com.example.dell.notification;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class Mynotificatinsevices extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
showNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }
    public void showNotification(String title,String message){
        NotificationCompat.Builder builder =new NotificationCompat.Builder(this,"mynotification")
        .setContentTitle(title)
                .setSmallIcon(R.drawable.ic_launcher_background)
        .setAutoCancel(true)
                .setContentText(message);
        NotificationManagerCompat manager= NotificationManagerCompat.from(this);
        manager.notify(99,builder.build());




    }
}
