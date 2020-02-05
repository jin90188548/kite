
list_ex = ["52", "274", "100", "스파이", "102"]

list_result = []

for item in list_ex:
    try:
        float(item)
        #list_result.append(item)
    except Exception as e:
        #pass
        print('type(e) : ',type(e))
        print('Exception e : ', e)
    else:
        list_result.append(item)
    finally:
        print('한번의 반복 구문이 종료되었습니다.')

print(list_ex)
print(list_result)