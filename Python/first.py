print("First Python")  # print 실행

# 기본 내장 함수 type
print("----- type() -----")
print(type(-1))
print(type("word"))
print(type([1,2,3,5,7,9]))

# 기본 내장 함수 range
print("----- range() -----")
numbers = range(0,10,2)
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

