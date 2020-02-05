# list 선언
list_ex = ['요소1', '요소2', '요소3']

# index와 요소값을 같이 출력 - 1
print('index와 요소값을 같이 출력 - 1')
idx = 0
for val in list_ex:
    print('{}번째 요소는 {}입니다.'.format(idx, val))
    idx += 1

# index와 요소값을 같이 출력 - 2
print('index와 요소값을 같이 출력 - 2')
for index in range(len(list_ex)): # 반복의 횟수는 list 사이즈 만큼 반복 한다.
    print('{}번째 요소는 {}입니다.'.format(index, list_ex[index]))



# index와 요소값을 같이 출력 - 3 : enumerate
enum_list = enumerate(list_ex)
list_enum_list = list(enum_list)

print(enum_list)
print(list_enum_list)

for i, value in enumerate(list_ex):
    print('{}번째 요소는 {}입니다.'.format(i, value))