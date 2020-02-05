
with open('info.txt', 'r', encoding='utf-8') as file:

    # 라인 단위로 읽기
    for line in file:
        # line_info = line.strip().split(', ')
        # name = line_info[0]
        # weight = line_info[1]
        # height = line_info[2]

        (name, weight, height) = line.strip().split(', ')

        if not name or not weight or not height:
            continue

        # bmi 연산
        bmi = int(weight)*10000 / ( int(height) * int(height)  )

        result = ''
        if bmi >= 25:
            result = '과체중'
        elif bmi >= 18.5: # 18.5 <= bmi < 25
            result = '표준 체중'
        else:
            result = '저체중'

        print('\n 이름: {} \n 몸무게 : {}\n 키: {}\n BMI: {}\n 결과: {}\n'
        .format(name, weight, height, bmi, result))

