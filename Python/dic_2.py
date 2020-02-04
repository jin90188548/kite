# 날짜/시간 관련 모듈 호출
import datetime

list_data = []

for i in range(5):
    key_name = str(datetime.datetime.now())
    ## 센서 데이터 가져오기
    dic_temp = {
        key_name:{'data1':'측정값'+str(i)}
        }

    #  측정 데이터 저장 ( list, DB, file, network )
    list_data.append(dic_temp)

    for k in range(100000):
        pass



for dic in list_data:
    print(dic)

