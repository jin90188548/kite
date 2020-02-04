# list 선언
list_a = [1,2,3]

# list 에 요소 추가 append : 요소가 마지막 index 뒤로 추가
list_a.append(4)
print(list_a)
list_a.append(5)
print(list_a)


# list 요소 추가 insert : 특정 index의 위치에 요소가 추가
list_a.insert(0, 100)
print(list_a)
list_a.insert(2,300)
print(list_a)

# list 다른 list 요소를 추가 extend
list_a.extend([1000, 10000, 100000])
print(list_a)