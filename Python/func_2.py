# list 선언
list_a = [1, 2, 3, 4, 5]
list_b = list(range(1,6))

#print(list_a)
#print(list_b)

# 리스트 역순으로 뒤집는다.
list_reversed = reversed(list_a)

print('list_reversed : ', list_reversed)

list_reversed = list(list_reversed)

# list 출력
print('list_a : ', list_a)
print('list(list_reversed) : ', list_reversed)


# for 문장을 이용해서 역순 참조
print(' for 문장을 이용해서 역순 참조 -----')
for i in reversed(list_a):
    print(i)