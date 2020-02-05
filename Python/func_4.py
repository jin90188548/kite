# 딕셔너리 선언
dic_ex = {
    'key1':'value-01',
    'key2':'value-02'
}
dic_ex['key3']='value-03'

print(dic_ex)

for key in dic_ex:
    print("{} = {}".format(key, dic_ex[key]))
    #pass

# items() 함수를 이용한 출력
dic_ex_items = dic_ex.items()

print(dic_ex_items)

for k, v in dic_ex.items():
    print('dic_ex[{}] = {}'.format(k, v))