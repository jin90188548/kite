import threading
import datetime

def on_timer(count):
    count += 1
    
    print(count)
    
    timer = threading.Timer(1, on_timer, args=[count])
    timer.start()

    if count==10:
        print('Canceling timer...')
        timer.cancel()


print('Sarting timer...')
on_timer(0)
