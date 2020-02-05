# 가변 매개변수 함수 생성

def print_n_times(n, *val):

    # val : tuple 타입고 , list 와 특징이 같다. 요소의 데이터는 변경이 불가
    list_args = val 
    #print(list_args)
    
    # n 번 반복
    for i in range(n):
        # 가변 매개변수의 데이터를 출력
        for v in val:
            print(v,'argValue',end='|', sep='_')
        print()
    

print_n_times(2, 'hi~', 'Python', 'bye~', '!!!!!!', '~~~~')



def make_str(*val):
    # 가변 매개변수의 데이터를 출력
    result = ''
    for v in val:
        result += v
        result += '|'
    
    return result
        
print(make_str('hi~', 'Python', 'bye~', '!!!!!!', '~~~~'))
    
