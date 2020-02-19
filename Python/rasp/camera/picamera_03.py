# coding: utf-8

import picamera
import time
import datetime

# picamera Object 생성
with picamera.PiCamera() as camera:

    # 해상도 설정
    camera.resolution = (320, 240)

    now = datetime.datetime.now()

    
    file_name = '{}{}{}{}{}{}{}.jpg'.format(
        now.year, now.month, now.day, now.hour, now.minute, now.second, now.microsecond
    )
    
    # 촬영 -> 저장   /home/pi/Desktop/rasp/camera/photo
    camera.capture('photo/'+file_name)











            
            