import RPi.GPIO as GPIO

import time

LED=16
pir_s=25

GPIO.setmode(GPIO.BCM)
GPIO.setup(LED, GPIO.OUT)
GPIO.setup(pir_s, GPIO.IN)

try:
    
    while True:
        
        if GPIO.input(pir_s) == True:
            print('Sensor On!!')
            GPIO.output(LED, True)
            time.sleep(5)
        else:
            print('Sensor Off!!')
            GPIO.output(LED, False)
    
except KeyboardInterrupt:
    GPIO.cleanup()




