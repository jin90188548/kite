import Adafruit_DHT
import time

# Sensor
sensor = Adafruit_DHT.DHT11

pin = 4

try:
    while True:
        h,t = Adafruit_DHT.read_retry(sensor, pin)
        print(h)
        print(t)
        
        if h != None and t != None:
            print('{0:0.1f}\'C, {1:0.1f}%'.format(t, h))
        else:
            print('Read error')
        
        time.sleep(3)

except KeyboardInterrupt:
    print('exit')
    
finally:    
    print('exit')








