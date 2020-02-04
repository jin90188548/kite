
# 문자열을 다루는 기본함수

string_str = "Hello Python"

string_list = string_str.split(" ")
print(string_list)

string_str = "001|code1234|spaceA|15000"
string_list = string_str.split("|")
print("PK : " , string_list[0])
print("CODE : " , string_list[1])
print("Name : ", string_list[2])
print("Prince : ", int(string_list[3])*1.15)


print(string_str.upper())
print(string_str.lower())



string_a = "{}".format(20)

print(string_a)
print(type(string_a))

format_a = "{}만 원".format(5000)
format_b = "파이썬 열공해서 첫 연봉 {}만 원 만들기 ".format(5000)
format_c = "{}, {}, {}".format(3000, 4000, 5000)
format_d = "{} {} {}".format(1, '문자열', True)

print(format_a)
print(format_b)
print(format_c)
print(format_d)




# 사용자 데이터 입력

#age = input("나이를 입력해주세요.>>>")

#print(type(age))
#print(age)
#string_a = input("숫자를 입력해주세요 >>")
#string_b = input("다른 숫자를 입력해주세요 >>")

#int_a = int(string_a)
#int_b = int(string_b)

#print('문자열 연산 : ', string_a+string_b)
#print('숫자 연산   : ', int_a+int_b)




#숫자연산
print("----- 숫자 연산 ------")
print("5+7=",5+7)   # 12
print("7-5=",7-5)   # 2
print("5*7=",5*7)   # 35
print("7/5=",7/5)   # 1.4
print("7//5=",7//5) # 1
print("7%5=",7%5)   # 2

print("2**1", 2**1) # 2
print("2**2", 2**2) # 4
print("2**3", 2**3) # 8
print("2**4", 2**4) # 16



print("First Python")  # print 실행

ns = "안녕하세요"

print(len(ns))

print(ns[4])
print(ns[-5])
print(ns[1:3])
print(ns[:3])
print(ns[3:])




print("""\
안녕
하세요
저는
Python
입니다.\
""")
print("Python"*3)
print(5*"Python")


# 식별자 주의사항
# 키워드, 함수이름, 모듈이름, 클래스이름 과 동일하게 사용하면 안된다.
#  = 'astrbc'  # 기존의 str 함수가 변수 str 변경 : 오류가 아니다.
# print(str('abc')) # str 함수 호출 오류 발생


# 기본 내장 함수 type
print("----- type() -----")
print(type(-1))
print(type("word"))
print(type([1,2,3,5,7,9]))

# 기본 내장 함수 range
print("----- range() -----")
numbers = list(range(0,10,2))
numbers = list(range(3,10))
numbers = list(range(10))
print(numbers)

# 기본 내장 함수 str
print("----- str() -----")
print (str(97))
print (str([10,"hun",30,70]))
print (str("String"))

# 기본 내장 함수 chr
print("----- chr() -----")
print (chr(97))
print (chr(65))
print (chr(48))
print (chr(97+1))
print (chr(65+1))
print (chr(48+1))

# 기본 내장 함수 pow
print("----- pow() -----")
print(pow(2,2))
print(pow(3,3))
print(pow(2,-1))


# 기본 내장 함수 max
a = 10
b = 20
nums = [10, 40, 100, 60, 30]  # list
names = "python" # 문자열

print("----- max() -----")
print(max(a,b))  # 20
print(max(nums)) # 100
print(max(names)) # y


# 기본 내장 함수 min
print("----- min() -----")
print(min(a,b)) #10
print(min(nums)) #10
print(min(names)) #h





# 기본 내장 함수 abs
print("----- abs() -----")
print(abs(5))
print(abs(-5))

