package br.com.rocketseat.service_notification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( "/" )
public class NotificationController {

    @PostMapping ( "/notification" )
    public ResponseEntity<Void> sendNotification ( @RequestBody NotificationRequest notificationRequest ) {
        System.out.println ( notificationRequest.message ( ) );
        return ResponseEntity.ok ( ).build ( );
    }
}
