# coding: utf-8

# GPIO 
import RPi.GPIO as GPIO

import time


# GPIO 핀번호 할당
GPIO.setmode(GPIO.BOARD)

# pin 번호 chanel
LED = 11

# 밝기 목록  ( 0.0 ~ 100.0 )
dc = [0,1,2,3,4,5,6,7,8,9,10,12,13,15,20,30,50,70,100]

# 핀 설정
GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)

# PWM 객체 생성 : 11번 핀, 주파수 - 100Hz
p = GPIO.PWM(LED, 100)

# PWM 신호 출력
p.start(0)

while 1:
    
    for value in dc:
        # 듀티 변경
        p.ChangeDutyCycle(value)
        time.sleep(0.1)

        dc.reverse()
        time.sleep(0.1)








# PWM 정지
p.stop()

# GPIO 개방
GPIO.cleanup()
