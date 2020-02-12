import threading
import datetime

count = 0

# call back Function
def func_a():
    print('Timer expired')
    print('end time : ', datetime.datetime.now())

    global count   

    if count == 10 :
        return

    count += 1
    
    threading.Timer(3, func_a).start()



print('start time : ', datetime.datetime.now())

# 10초 후에 함수 실행
threading.Timer(3, func_a).start()