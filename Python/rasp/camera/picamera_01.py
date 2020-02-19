# coding: utf-8

import picamera
import time
import datetime

# picamera Object 생성
with picamera.PiCamera() as camera:

    # 해상도 설정
    #camera.resolution = (320, 240)

    # 해상도 선택
    res = input('Resolution(1: 320x240, 2: 640x480, 3: 1024x768)')

    if res == '1':
        camera.resolution = (320, 240)
    elif res == '2':
        camera.resolution = (640, 480)
    else :
        camera.resolution = (1024, 768)

    file_name = input('파일 이름을 입력해주세요. >> ')
    
    camera.start_preview()

    time.sleep(1)

    camera.stop_preview()

    # 촬영 -> 저장   /home/pi/Desktop/rasp/camera/photo
    camera.capture('photo/'+file_name + '.jpg')











            
            