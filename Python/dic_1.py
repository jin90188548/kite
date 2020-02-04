# 딕셔너리 선언 { key:value, ....} 
# key => int , str, bool
# value => 숫자, 문자열, bool, list, dic

dic_a = {
    'name':'홍길동',
    'phoneNumber':'0107779999',
    'birthday':'20000101'
}


print('----- dic_a -----')
print(dic_a)

print('요소 추가 --------')
dic_a['age'] = 20

print('----- dic_a -----')
print(dic_a)

# 기존의 데이터 변경 : key 변경 X, value 값을 변경
print('----- 이름 데이터 변경 -----')
dic_a['name'] = '손흥민'

print('----- dic_a -----')
print(dic_a)


# 데이터 삭제 : del dic_name[key]
print('key:age 인 요소 삭제 ---------------')
del dic_a['age']

print('----- dic_a -----')
print(dic_a)



print('------------------')
print('이름 : ', dic_a['name'])
print('전화번호 : ', dic_a['phoneNumber'])
print('생일 : ', dic_a['birthday'])
#print('age : ', dic_a['age'])



# 사용자에게 key 값을 입력받는다.
key_name = input('찾고자 하는 KEY 이름을 입력해주세요. >> ')

get_value = dic_a.get(key_name)  # 키가 존재하지 않는다 -> None

#if key_name in dic_a:
if get_value : # None -> False
    #print(dic_a[key_name])
    print(get_value)
else:
    print('찾으시는 key가 존재하지 않습니다.')

print('\n\n\n')





for key in dic_a:
    print(key, ' : ' , dic_a.get(key))





print('\n\n\n')

name = '이름'
dic_b = {
    name : '7D 망고저림',
    'type' : '망고저림'
}

print(dic_b)





print('\n\n\n\n')