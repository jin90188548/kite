# random module 사용
import random as r
from math import floor as f

print('# random module 사용')

# random() : 0.0 <= num < 1.0 float 데이터를 반환
print('random.random() : ', r.random(), f(r.random()))


# uniform(a, b) : a에서 b 범위의 float데이터를 반환
print('random.uniform(10, 20)', r.uniform(10, 20), f(r.uniform(10, 20)))

# randrange(a): 0~a-1 범위의 정수형 데이터를 반환
# randrange(a, b): a~b-1 범위의 정수형 데이터를 반환
print('random.randrange(10) : ', r.randrange(10))
print('random.randrange(5,10) : ', r.randrange(5,10))

member_num = [10,11,12,13,14,15,16,17,18,19]
print('random.choice(member_num) : ', r.choice(member_num))

# member_num2 = r.shuffle(member_num)
print('member_num : ',member_num)
r.shuffle(member_num)
print('random.shuffle(member_num) : ',member_num)

# sample(seq or list, k=개수) : 리스트중 개수만큼 요소를 축축해서 리스트로 반환
print(r.sample(member_num, k=3))