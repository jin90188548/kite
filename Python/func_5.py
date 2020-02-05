# 빈 list 선언
list_a = []

# 반복문을 이용해서 list_a에 데이터 추가
for i in range(0, 20, 2): # 0,2,4,6,8,10,12,14,16,18
    list_a.append(i*i)

# list_a 출력
print(list_a)

print()

list_b = [i*i for i in range(0,20,2)]
print(list_b)

print()

list_b = [i*i for i in range(0,20,2) if i > 10]
print(list_b)

print()

array = ['사과', '자두', '바나나', '체리','초콜릿' ]
output = [f for f in array if f != '초콜릿']
print(array)
print(output)


